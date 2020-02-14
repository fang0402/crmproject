package com.csdj.crmproject.crmproject.controller.Marketing.ActivityMarketing;

import com.alibaba.fastjson.JSON;
import com.csdj.crmproject.crmproject.entity.marketingactivity.MarketActivity;
import com.csdj.crmproject.crmproject.service.Marketing.ActivityMarketing.ActivityMarketingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/ActivityMarketing")
public class ActivityMarketingController {

    @Autowired
    ActivityMarketingService service;
    @Resource
    private RedisTemplate redisTemplate;
    //打开页面
    @RequestMapping("/marketing")
    public String selShow(){
        return "/Marketing/ActivityMarketing/ActivityMarketingHTML";
    }

    @RequestMapping("/add")
    public String seladd(){
        return "/Marketing/ActivityMarketing/addActivityMarketingHTML";
    }
    @RequestMapping("/skipPage")
    @ResponseBody
    public String skipShow(){
        List<MarketActivity> list= service.activi();
        System.out.println("JSON："+list);
        String json = JSON.toJSONString(list);
        System.out.println("JSON："+json);
        return json;
    }

}
