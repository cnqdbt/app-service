package com.juhaolian.appservice.service.impl;

import com.juhaolian.appservice.dao.KeyValidationDao;
import com.juhaolian.appservice.domain.KeyValidation;
import com.juhaolian.appservice.service.AppkeyValidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by bite on 18-8-15.
 */

@Service
public class AppkeyValidateServiceImpl implements AppkeyValidateService {

    @Autowired
    KeyValidationDao keyValidationDao;

    private static final int NOT_VALID = 0;
    private static final int VALID = 1;

    private static final int SUCCESS = 0;
    private static final int FAILED = 1;


    public KeyValidation validate(String appkey, String appsecret) {
        KeyValidation kv = new KeyValidation();

        if (keyValidationDao.validate(appkey, appsecret) == 1) {
            kv.setResultCode(SUCCESS);
            kv.setIsValid(VALID);
        } else {
            kv.setResultCode(FAILED);
            kv.setIsValid(NOT_VALID);
        }

        return kv;

    }
}
