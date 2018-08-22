package com.juhaolian.appservice.controller;

import com.juhaolian.appservice.domain.VersionInfo;
import com.juhaolian.appservice.domain.Version;
import com.juhaolian.appservice.service.AppUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/app")
public class AppUpdateController {

    @Autowired
    AppUpdateService appUpdateService;

    @GetMapping("/key-validation")
    public String keyValidation(@RequestParam String appkey, @RequestParam String appsecret) {
        if (!appkey.isEmpty() && appkey.equals(appsecret)) {
            return "true";
        } else {
            return "false";
        }

    }

//    @RequestMapping(value = "/app-update", method = {RequestMethod.GET, RequestMethod.POST})
//    public Version update(String customerId, Integer versionCode) {
//        return appUpdateService.getUpdateVersion(versionCode);
//    }

    @RequestMapping(value = "/app-update", method = RequestMethod.POST)
    public Version update(@RequestBody VersionInfo vi) {
        return appUpdateService.getUpdateVersion(vi.getAppId(), vi.getVersionCode());
    }
}