package com.juhaolian.appservice.domain;

/**
 * Created by bite on 18-8-20.
 */
public class Policy {

    private String appId;

    private Integer fromVersion;

    private Integer toVersion;

    private Integer forcedUpdate;

    public Integer getForcedUpdate() {
        return forcedUpdate;
    }

    public Integer getFromVersion() {
        return fromVersion;
    }

    public Integer getToVersion() {
        return toVersion;
    }

    public void setForcedUpdate(Integer forcedUpdate) {
        this.forcedUpdate = forcedUpdate;
    }

    public void setFromVersion(Integer fromVersion) {
        this.fromVersion = fromVersion;
    }

    public void setToVersion(Integer toVersion) {
        this.toVersion = toVersion;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppId() {
        return appId;
    }
}
