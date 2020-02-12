package com.csdj.crmproject.crmproject.controller.Marketing.ActivityMarketing;

import com.alibaba.fastjson.JSON;
import com.csdj.crmproject.crmproject.entity.marketingactivity.MarketActivity;
import com.csdj.crmproject.crmproject.service.Marketing.ActivityMarketing.ActivityMarketingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
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

    @RequestMapping("/listrcvbl")
    @ResponseBody
    public String listCategory() throws Exception {
        List<MarketActivity> list=(List<MarketActivity>)redisTemplate.opsForValue().get("arc");
        if(list==null){
            list= service.activity();
            redisTemplate.opsForValue().set("arc",list);
        }
        String json = JSON.toJSONStringWithDateFormat(list,"yyyy-MM-dd");
        System.out.println("JSON："+json);
        return json;

    }
}
