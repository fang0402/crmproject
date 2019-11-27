package com.csdj.crmproject.crmproject.util;

import com.csdj.activiti.activiti.entity.Leave;
import com.csdj.activiti.activiti.service.ActivitiService;
import com.csdj.activiti.activiti.service.UserManagerService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: activiti
 * @BelongsPackage: com.csdj.activiti.activiti.util
 * @Author: aida
 * @CreateTime: 2019-11-25 16:35
 * @Description:
 */
@Service
public class LeaveService {
    @Autowired
    private ActivitiService activitiService;

    @Autowired
    private UserManagerService userManagerService;
    //修改状态
    //#{leaveService.changeStatus(execution,'2')}
    public void changeStatus(DelegateExecution execution,String status){
        //获得请假单id
        String processInstanceBusinessKey= execution.getProcessInstanceBusinessKey();
        //查询请假单
        Leave leave= activitiService.selectLeve(Integer.parseInt(processInstanceBusinessKey));
        //修改状态
        if (leave!=null){
            leave.setStatc(status);
        }
        activitiService.updateLeave(leave);
    }

    //查询项目经理
    //${leaveService.findProjectManager(execution)}
    public List<String> findProjectManager(DelegateExecution execution){
        //String processInstanceBusinessKey= execution.getProcessInstanceBusinessKey();
        //正常情况下返回用户id
        return userManagerService.selectProject();
    }

    //查询人事
    //${leaveService.findHrManager(execution)}
    public List<String> findHrManager(DelegateExecution execution){
        return userManagerService.selectHr();
    }

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;

    //启动流程
    public void startProcesses(String bizKey){
        ProcessInstance processInstance=runtimeService.startProcessInstanceByKey("LeaveProcess",bizKey);
        System.out.println("startProcesses"+processInstance);
    }

    //根据用户ID查询此用户的代办列表（项目经理可以查询到下属的申请）
    public List<Task> findTaskUserId(String userId){
        List<Task> list=taskService.createTaskQuery().processDefinitionKey("LeaveProcess").taskCandidateOrAssigned(userId).list();
        return list;
    }

    //审批
    //aduitUserId审批人
    //taskId任务id
    //aduit审批意见（1，2，0）
    public void completeTask(String aduitUserId,String taskId,String audit){
        //拾取任务
        taskService.claim(taskId,aduitUserId);
        Map<String,Object> map=new HashMap<>();
        map.put("audit",audit);
        taskService.complete(taskId,map);
    }

}
