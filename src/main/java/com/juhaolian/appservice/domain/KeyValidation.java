package com.juhaolian.appservice.domain;

/**
 * Created by bite on 18-8-15.
 */
public class KeyValidation {
    // 0: success
    private Integer resultCode = 0;

    private Integer isValid;

    private Integer platformId;

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public Integer getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Integer platformId) {
        this.platformId = platformId;
    }
}
