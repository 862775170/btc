CREATE TABLE `found_blocks` (
`id` INT ( 11 ) NOT NULL AUTO_INCREMENT,#爆块的id号
`puid` INT ( 11 ) NOT NULL,# 爆块的用户id
`worker_id` BIGINT ( 20 ) NOT NULL,#  爆块的矿机矿工号
`worker_full_name` VARCHAR ( 50 ) NOT NULL,#  爆块的矿机矿工名
`job_id` BIGINT ( 20 ) UNSIGNED NOT NULL,#   工作id
`height` INT ( 11 ) NOT NULL,#                 区块高度
`is_orphaned` TINYINT ( 4 ) NOT NULL DEFAULT '0',#  是否是孤儿区块
`hash` CHAR ( 64 ) NOT NULL,#   爆块的hash值
`rewards` BIGINT ( 20 ) NOT NULL,#      爆块奖励
`size` INT ( 11 ) NOT NULL,#                爆块的大小
`prev_hash` CHAR ( 64 ) NOT NULL,#          前一个块的hash值
`bits` INT ( 10 ) UNSIGNED NOT NULL,#            难度
`version` INT ( 11 ) NOT NULL,#             投票版本
`created_at` datetime DEFAULT NULL,#       爆块时间
PRIMARY KEY ( `id` ),
UNIQUE KEY `hash` ( `hash` ),
KEY `height` ( `height` ) 
) ENGINE = INNODB DEFAULT CHARSET = utf8;

CREATE TABLE `mining_workers` (
`worker_id` BIGINT ( 20 ) NOT NULL,# 矿工id
`puid` INT ( 11 ) NOT NULL,#      用户id
`group_id` INT ( 11 ) NOT NULL,#     0断开连接
`worker_name` VARCHAR ( 20 ) DEFAULT NULL,#  矿工名
`accept_1m` BIGINT ( 20 ) NOT NULL DEFAULT '0',#  1分钟接收的share值（当前算力）
`accept_5m` BIGINT ( 20 ) NOT NULL DEFAULT '0',#  5分钟接收的share值  （5分钟算力）
`accept_15m` BIGINT ( 20 ) NOT NULL DEFAULT '0',#  15分钟接收的share值  （15分钟算力）
`reject_15m` BIGINT ( 20 ) NOT NULL DEFAULT '0',#    15分钟拒绝的share值
`accept_1h` BIGINT ( 20 ) NOT NULL DEFAULT '0',#    1小时接收的share值        （1小时算力）
`reject_1h` BIGINT ( 20 ) NOT NULL DEFAULT '0',#      1小时拒绝的share值
`accept_count` INT ( 11 ) NOT NULL DEFAULT '0',#     接收的总共的share
`last_share_ip` CHAR ( 16 ) NOT NULL DEFAULT '0.0.0.0',# 最近一次提交share的ip地址
`last_share_time` TIMESTAMP NOT NULL DEFAULT '1970-01-01 00:00:01',#最近一次提交share的时间
`miner_agent` VARCHAR ( 30 ) DEFAULT NULL,#使用的挖矿软件名
`created_at` TIMESTAMP NULL DEFAULT NULL,#这条记录创建时间
`updated_at` TIMESTAMP NULL DEFAULT NULL,#  这条记录更新的时间
UNIQUE KEY `puid_worker_id` ( `puid`, `worker_id` ),
KEY `puid_group_id` ( `puid`, `group_id` ) 
) ENGINE = INNODB DEFAULT CHARSET = utf8;

CREATE TABLE `stats_pool_day` (
`day` INT ( 11 ) NOT NULL,
`share_accept` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`share_reject` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`reject_rate` DOUBLE NOT NULL DEFAULT '0',
`score` DECIMAL ( 35, 25 ) NOT NULL DEFAULT '0.0000000000000000000000000',
`earn` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`lucky` DOUBLE NOT NULL DEFAULT '0',
`created_at` TIMESTAMP NULL DEFAULT NULL,
`updated_at` TIMESTAMP NULL DEFAULT NULL,
UNIQUE KEY `day` ( `day` ) 
) ENGINE = INNODB DEFAULT CHARSET = utf8;
CREATE TABLE `stats_pool_hour` (
`hour` INT ( 11 ) NOT NULL,
`share_accept` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`share_reject` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`reject_rate` DOUBLE NOT NULL DEFAULT '0',
`score` DECIMAL ( 35, 25 ) NOT NULL DEFAULT '0.0000000000000000000000000',
`earn` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`created_at` TIMESTAMP NULL DEFAULT NULL,
`updated_at` TIMESTAMP NULL DEFAULT NULL,
UNIQUE KEY `hour` ( `hour` ) 
) ENGINE = INNODB DEFAULT CHARSET = utf8;
CREATE TABLE `stats_pool_minute` (
`minute` BIGINT ( 13 ) NOT NULL,
`share_accept` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`share_reject` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`reject_rate` DOUBLE NOT NULL DEFAULT '0',
`score` DECIMAL ( 35, 25 ) NOT NULL DEFAULT '0.0000000000000000000000000',
`earn` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`created_at` TIMESTAMP NULL DEFAULT NULL,
`updated_at` TIMESTAMP NULL DEFAULT NULL,
UNIQUE KEY `minute` ( `minute` ) 
) ENGINE = INNODB DEFAULT CHARSET = utf8;
CREATE TABLE `stats_users_day` (
`puid` INT ( 11 ) NOT NULL,
`day` INT ( 11 ) NOT NULL,
`share_accept` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`share_reject` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`reject_rate` DOUBLE NOT NULL DEFAULT '0',
`score` DECIMAL ( 35, 25 ) NOT NULL DEFAULT '0.0000000000000000000000000',
`earn` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`created_at` TIMESTAMP NULL DEFAULT NULL,
`updated_at` TIMESTAMP NULL DEFAULT NULL,
UNIQUE KEY `puid_day` ( `puid`, `day` ) 
) ENGINE = INNODB DEFAULT CHARSET = utf8;
CREATE TABLE `stats_users_hour` (
`puid` INT ( 11 ) NOT NULL,
`hour` INT ( 11 ) NOT NULL,
`share_accept` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`share_reject` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`reject_rate` DOUBLE NOT NULL DEFAULT '0',
`score` DECIMAL ( 35, 25 ) NOT NULL DEFAULT '0.0000000000000000000000000',
`earn` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`created_at` TIMESTAMP NULL DEFAULT NULL,
`updated_at` TIMESTAMP NULL DEFAULT NULL,
UNIQUE KEY `puid_hour` ( `puid`, `hour` ),
KEY `hour` ( `hour` ) 
) ENGINE = INNODB DEFAULT CHARSET = utf8;
CREATE TABLE `stats_users_minute` (
`puid` INT ( 11 ) NOT NULL,
`minute` BIGINT ( 13 ) NOT NULL,
`share_accept` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`share_reject` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`reject_rate` DOUBLE NOT NULL DEFAULT '0',
`score` DECIMAL ( 35, 25 ) NOT NULL DEFAULT '0.0000000000000000000000000',
`earn` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`created_at` TIMESTAMP NULL DEFAULT NULL,
`updated_at` TIMESTAMP NULL DEFAULT NULL,
UNIQUE KEY `puid_minute` ( `puid`, `minute` ),
KEY `minute` ( `minute` ) 
) ENGINE = INNODB DEFAULT CHARSET = utf8;
CREATE TABLE `stats_workers_day` (
`puid` INT ( 11 ) NOT NULL,
`worker_id` BIGINT ( 20 ) NOT NULL,
`day` INT ( 11 ) NOT NULL,
`share_accept` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`share_reject` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`reject_rate` DOUBLE NOT NULL DEFAULT '0',
`score` DECIMAL ( 35, 25 ) NOT NULL DEFAULT '0.0000000000000000000000000',
`earn` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`created_at` TIMESTAMP NULL DEFAULT NULL,
`updated_at` TIMESTAMP NULL DEFAULT NULL,
UNIQUE KEY `puid_worker_id_day` ( `puid`, `worker_id`, `day` ),
KEY `day` ( `day` ) 
) ENGINE = INNODB DEFAULT CHARSET = utf8;
CREATE TABLE `stats_workers_hour` (
`puid` INT ( 11 ) NOT NULL,
`worker_id` BIGINT ( 20 ) NOT NULL,
`hour` INT ( 11 ) NOT NULL,
`share_accept` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`share_reject` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`reject_rate` DOUBLE NOT NULL DEFAULT '0',
`score` DECIMAL ( 35, 25 ) NOT NULL DEFAULT '0.0000000000000000000000000',
`earn` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`created_at` TIMESTAMP NULL DEFAULT NULL,
`updated_at` TIMESTAMP NULL DEFAULT NULL,
UNIQUE KEY `puid_worker_id_hour` ( `puid`, `worker_id`, `hour` ),
KEY `hour` ( `hour` ) 
) ENGINE = INNODB DEFAULT CHARSET = utf8;
CREATE TABLE `stats_workers_minute` (
`puid` INT ( 11 ) NOT NULL,
`worker_id` BIGINT ( 20 ) NOT NULL,
`minute` BIGINT ( 13 ) NOT NULL,
`share_accept` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`share_reject` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`reject_rate` DOUBLE NOT NULL DEFAULT '0',
`score` DECIMAL ( 35, 25 ) NOT NULL DEFAULT '0.0000000000000000000000000',
`earn` BIGINT ( 20 ) NOT NULL DEFAULT '0',
`created_at` TIMESTAMP NULL DEFAULT NULL,
`updated_at` TIMESTAMP NULL DEFAULT NULL,
UNIQUE KEY `puid_worker_id_minute` ( `puid`, `worker_id`, `minute` ),
KEY `minute` ( `minute` ) 
) ENGINE = INNODB DEFAULT CHARSET = utf8;

CREATE TABLE `transfer_record` (
`puid` INT ( 11 ) NOT NULL,#                 转账接收的用户id
`transfer_at` TIMESTAMP NULL DEFAULT NULL,#  转账时间
`transfer_sotashi` INT ( 11 ) NOT NULL,#           转账额度，单位聪sotashi   1btc = 1亿聪
`transfer_id` CHAR ( 64 ) NOT NULL,#          交易id    txid
UNIQUE KEY `puid_transfer_at` ( `puid`, `transfer_at` ),
KEY `puid` ( `puid` ) 
) ENGINE = INNODB DEFAULT CHARSET = utf8;

CREATE TABLE `btc_user` (
  `user_id` varchar(32) NOT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `mail` varchar(255) DEFAULT NULL,
  `update_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_by` varchar(32) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `user_name` (`user_name`(191)),
  KEY `mail` (`mail`(191))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;