package com.juhaolian.appservice.service.impl;

import com.juhaolian.appservice.dao.PolicyDao;
import com.juhaolian.appservice.dao.VersionUpdateDao;
import com.juhaolian.appservice.domain.Policy;
import com.juhaolian.appservice.domain.Version;
import com.juhaolian.appservice.service.AppUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by bite on 18-8-15.
 */

@Service
public class AppUpdateServiceImpl implements AppUpdateService {

    @Autowired
    VersionUpdateDao versionUpdateDao;

    @Autowired
    PolicyDao policyDao;

    private static final int NO_NEED = 0;
    private static final int FORCED_UPDATE = 1;
    private static final int OPTIONAL_UPDATE = 2;


    public Version getUpdateVersion(String appId, Integer versionCode) {
        Policy policy = policyDao.getPolicy(appId, versionCode);
        if (policy == null) {
            policy = policyDao.getAllToPolicy(appId);
        }

        if (versionCode >= policy.getToVersion() ) {
            Version noUpVersion = new Version();
            noUpVersion.setNeedUpdate(NO_NEED);
            return noUpVersion;
        }

        Version targetVersion = versionUpdateDao.getUpdateVersion(appId, policy.getToVersion());

        if (policy.getForcedUpdate() == 1) {
            targetVersion.setNeedUpdate(FORCED_UPDATE);
        } else {
            targetVersion.setNeedUpdate(OPTIONAL_UPDATE);
        }

        return targetVersion;
    }
}
