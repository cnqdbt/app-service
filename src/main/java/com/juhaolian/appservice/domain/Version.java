package com.juhaolian.appservice.domain;

/**
 * Created by bite on 18-8-15.
 */
public class Version {
    // 0: success
    private Integer resultCode = 0;

    private Integer versionCode;

    private Integer needUpdate;

    private String apkUrl;

    private String updateDescription;

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
    }

    public Integer getVersionCode() {
        return versionCode;
    }

    public void setNeedUpdate(Integer needUpdate) {
        this.needUpdate = needUpdate;
    }

    public Integer getNeedUpdate() {
        return needUpdate;
    }

    public void setApkUrl(String apkUrl) {
        this.apkUrl = apkUrl;
    }

    public String getApkUrl() {
        return apkUrl;
    }

    public void setUpdateDescription(String updateDescription) {
        this.updateDescription = updateDescription;
    }

    public String getUpdateDescription() {
        return updateDescription;
    }

}
