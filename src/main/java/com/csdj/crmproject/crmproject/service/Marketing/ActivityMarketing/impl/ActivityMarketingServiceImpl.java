package com.csdj.crmproject.crmproject.service.Marketing.ActivityMarketing.impl;

import com.csdj.crmproject.crmproject.dao.Marketing.ActivityMarketing.ActivityMarketingDao;
import com.csdj.crmproject.crmproject.entity.marketingactivity.MarketActivity;
import com.csdj.crmproject.crmproject.service.Marketing.ActivityMarketing.ActivityMarketingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("ActivityMarketingServiceImpl")
public class ActivityMarketingServiceImpl implements ActivityMarketingService {
    @Resource
    private ActivityMarketingDao ActivityMarketingDao;
    @Override
    public List<MarketActivity> activity() {
        return ActivityMarketingDao.activity();
    }
}
