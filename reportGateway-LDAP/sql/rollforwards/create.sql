

CREATE TABLE ebuxx.`admin_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(20) NOT NULL unique,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8$$;


CREATE TABLE ebuxx.`admin_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(25) NOT NULL,
	`last_name` varchar(25) NOT NULL,
  `email_id` varchar(45) NOT NULL,
  `password` varchar(64) NOT NULL,
    `admin_role_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_id_UNIQUE` (`email_id`),
  KEY `admin_user_ibfk_1_idx` (`admin_role_id`),
  CONSTRAINT `admin_user_ibfk_1` FOREIGN KEY (`admin_role_id`) REFERENCES `admin_role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8$$

