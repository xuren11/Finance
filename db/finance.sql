CREATE DATABASE IF NOT EXISTS `finance` DEFAULT CHARACTER SET utf8 ;

use `finance`;

DROP TABLE IF EXISTS `finance_product`;

CREATE TABLE  IF NOT EXISTS  finance_product (
id INT  PRIMARY KEY NOT NULL  AUTO_INCREMENT  COMMENT '产品编号',
name VARCHAR(50) NOT NULL COMMENT '产品名称',
threshold_amount DECIMAL(15,3) NOT NULL  DEFAULT 0  COMMENT '起投金额',
step_amount DECIMAL(15,3) NOT NULL  DEFAULT 0 COMMENT '投资步长',
lock_term INT NOT NULL DEFAULT 0 COMMENT '锁定期(天)',
reward_rate DECIMAL(5,3)  NOT NULL COMMENT '收益率(百分比)',
status VARCHAR(20)  NOT NULL DEFAULT 'AUDINTING' COMMENT '状态,AUDINTING:审核中,IN_SELL:销售中,LOCKED:暂停销售,FINISHED:已结束',
memo VARCHAR(200) COMMENT '备注',
create_time datetime COMMENT '创建时间',
create_user VARCHAR(20) COMMENT '创建人',
update_time datetime COMMENT '更新时间',
update_user VARCHAR(20) COMMENT '更新人'
)ENGINE = INNODB charset=utf8 COMMENT '金融产品表';


DROP TABLE IF EXISTS `sale_order`;

CREATE TABLE `sale_order` (
  `order_id` int AUTO_INCREMENT COLLATE utf8_unicode_ci NOT NULL COMMENT '订单编号',
  `chan_id` varchar(50)  NOT NULL COMMENT '渠道编号',
  `product_id` varchar(50)  NOT NULL COMMENT '产品编号',
  `chan_user_id` varchar(50)  NOT NULL COMMENT '渠道用户编号',
  `order_type` varchar(50)  NOT NULL COMMENT '类型,APPLY:申购,REDEEM:赎回',
  `order_status` varchar(50)  NOT NULL COMMENT '状态,INIT:初始化,PROCESS:处理中,SUCESS:成功,FAIL:失败',
  `outer_order_id` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '外部订单编号',
  `amount` decimal(15,3) NOT NULL COMMENT '金额',
  `memo` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '备注',
  `create_at` datetime DEFAULT NULL COMMENT '创建时间',
  `update_at` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
