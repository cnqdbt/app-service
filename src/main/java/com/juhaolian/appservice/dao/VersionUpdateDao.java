package com.juhaolian.appservice.dao;

import com.juhaolian.appservice.domain.Version;
import org.apache.ibatis.annotations.Param;


/**
 * Created by bite on 18-8-15.
 */


public interface VersionUpdateDao {
    Version getUpdateVersion(@Param("appId") String appId, @Param("versionCode") Integer versionCode);
}
