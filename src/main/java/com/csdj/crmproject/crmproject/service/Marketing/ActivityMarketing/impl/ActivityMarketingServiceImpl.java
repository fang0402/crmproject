package com.csdj.crmproject.crmproject.service.Marketing.ActivityMarketing.impl;

import com.csdj.crmproject.crmproject.dao.Marketing.ActivityMarketing.ActivityMarketingMapper;
import com.csdj.crmproject.crmproject.entity.marketingactivity.MarketActivity;
import com.csdj.crmproject.crmproject.service.Marketing.ActivityMarketing.ActivityMarketingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("ActivityMarketingServiceImpl")
public class ActivityMarketingServiceImpl implements ActivityMarketingService {
    @Resource
    private ActivityMarketingMapper ActivityMarketingMapper;

    @Override
    public List<MarketActivity> activi() {
        return ActivityMarketingMapper.activi();
    }
}
