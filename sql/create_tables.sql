 CREATE TABLE `apk_update_policy` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `app_id` varchar(45) NOT NULL,
  `from_version` int(11) NOT NULL,
  `to_version` int(11) NOT NULL,
  `forced_update` tinyint(4) NOT NULL DEFAULT '0',
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_appid_fv` (`app_id`,`from_version`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


CREATE TABLE `apk_versions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `app_id` varchar(45) NOT NULL,
  `version_code` int(11) NOT NULL,
  `url` varchar(100) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_appid_vc` (`app_id`,`version_code`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;