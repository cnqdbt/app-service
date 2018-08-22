package com.juhaolian.appservice.domain;

/**
 * Created by bite on 18-8-16.
 */
public class VersionInfo {
    private Integer versionCode;

    private String appId;

    public void setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
    }

    public Integer getVersionCode() {
        return versionCode;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
