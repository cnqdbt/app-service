package com.juhaolian.appservice.service;

import com.juhaolian.appservice.domain.Version;

/**
 * Created by bite on 18-8-15.
 */
public interface AppUpdateService {
    Version getUpdateVersion(String appId, Integer versionCode);
}
