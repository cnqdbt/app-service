package com.juhaolian.appservice.controller;

import com.juhaolian.appservice.domain.VersionInfo;
import com.juhaolian.appservice.domain.Version;
import com.juhaolian.appservice.service.AppUpdateService;
import com.juhaolian.appservice.utils.RestAPIResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/app")
public class AppUpdateController {

    @Autowired
    AppUpdateService appUpdateService;

//    @RequestMapping(value = "/app-update", method = RequestMethod.POST)
//    public Version update(@RequestBody VersionInfo vi) {
//        return appUpdateService.getUpdateVersion(vi.getAppId(), vi.getVersionCode());
//    }

    @RequestMapping(value = "/app-update", method = RequestMethod.POST)
    public Version update(@RequestParam String appId, @RequestParam Integer versionCode) {
        return appUpdateService.getUpdateVersion(appId, versionCode);
    }
}