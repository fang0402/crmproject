package com.csdj.crmproject.crmproject.dao.Marketing.ActivityMarketing;

import com.csdj.crmproject.crmproject.entity.marketingactivity.MarketActivity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityMarketingDao {
    List<MarketActivity> activity();
}
