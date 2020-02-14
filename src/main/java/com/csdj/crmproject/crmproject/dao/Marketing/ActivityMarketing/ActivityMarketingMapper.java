package com.csdj.crmproject.crmproject.dao.Marketing.ActivityMarketing;

import com.csdj.crmproject.crmproject.entity.marketingactivity.MarketActivity;
import org.springframework.stereotype.Repository;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface ActivityMarketingMapper {
    List<MarketActivity> activi();
}
