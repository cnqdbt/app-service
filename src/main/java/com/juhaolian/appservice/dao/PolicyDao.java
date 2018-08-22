package com.juhaolian.appservice.dao;

import com.juhaolian.appservice.domain.Policy;
import org.apache.ibatis.annotations.Param;


/**
 * Created by bite on 18-8-15.
 */


public interface PolicyDao {
    Policy getPolicy(@Param("appId") String appId, @Param("versionCode") Integer versionCode);

    Policy getAllToPolicy(String appId);
}
