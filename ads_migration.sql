USE adlister_db;
id INT UNSIGNED NOT NULL AUTO_INCREMENT,
user_id FOREIGN KEY,
title VARCHAR(50) NOT NULL,
description VARCHAR(100)
);