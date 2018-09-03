package com.juhaolian.appservice.controller;

import com.juhaolian.appservice.domain.KeyValidation;
import com.juhaolian.appservice.domain.Version;
import com.juhaolian.appservice.service.AppUpdateService;
import com.juhaolian.appservice.service.AppkeyValidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    AppUpdateService appUpdateService;

    @Autowired
    AppkeyValidateService appkeyValidateService;

//    @RequestMapping(value = "/app-update", method = RequestMethod.POST)
//    public Version update(@RequestBody VersionInfo vi) {
//        return appUpdateService.getUpdateVersion(vi.getAppId(), vi.getVersionCode());
//    }

    @RequestMapping(value = "/app-update", method = RequestMethod.POST)
    public Version update(@RequestParam String appId, @RequestParam Integer versionCode) {
        return appUpdateService.getUpdateVersion(appId, versionCode);
    }

    @RequestMapping(value = "/appkey-validation", method = RequestMethod.POST)
    public KeyValidation update(@RequestParam String appkey, @RequestParam String appsecret) {
        return appkeyValidateService.validate(appkey, appsecret);
    }
}