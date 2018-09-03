package com.juhaolian.appservice.dao;

import org.apache.ibatis.annotations.Param;


/**
 * Created by bite on 18-8-15.
 */


public interface KeyValidationDao {
    int validate(@Param("appkey") String appkey, @Param("appsecret") String appsecret);
}
