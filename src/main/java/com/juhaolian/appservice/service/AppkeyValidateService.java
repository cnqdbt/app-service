package com.juhaolian.appservice.service;

import com.juhaolian.appservice.domain.KeyValidation;

/**
 * Created by bite on 18-8-15.
 */
public interface AppkeyValidateService {
    KeyValidation validate(String appkey, String appsecret);
}
