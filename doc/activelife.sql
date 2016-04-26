/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50537
Source Host           : localhost:3306
Source Database       : activelife

Target Server Type    : MYSQL
Target Server Version : 50537
File Encoding         : 65001

Date: 2015-07-11 21:54:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `top_base_area_code`
-- ----------------------------
DROP TABLE IF EXISTS `top_base_area_code`;
CREATE TABLE `top_base_area_code` (
  `area_code_id` char(36) NOT NULL COMMENT '主键',
  `area_code` varchar(50) DEFAULT NULL COMMENT '地区编号',
  `area_name` varchar(100) DEFAULT NULL COMMENT '地区名称',
  `create_by` varchar(10) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(50) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL COMMENT '修改日期',
  `delete_by` varchar(50) DEFAULT NULL COMMENT '删除人',
  `delete_time` datetime DEFAULT NULL COMMENT '删除日期',
  PRIMARY KEY (`area_code_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='区号信息';

-- ----------------------------
-- Records of top_base_area_code
-- ----------------------------

-- ----------------------------
-- Table structure for `top_base_city`
-- ----------------------------
DROP TABLE IF EXISTS `top_base_city`;
CREATE TABLE `top_base_city` (
  `city_code` varchar(50) NOT NULL COMMENT '市级编号',
  `city_name` varchar(50) DEFAULT NULL COMMENT '市级名称',
  `en_name` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `status` char(1) DEFAULT NULL COMMENT '状态',
  `province_name` varchar(50) DEFAULT NULL COMMENT '所属省名称',
  `province_code` varchar(50) DEFAULT NULL COMMENT '所属省级编号',
  PRIMARY KEY (`city_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='市级信息';

-- ----------------------------
-- Records of top_base_city
-- ----------------------------

-- ----------------------------
-- Table structure for `top_base_country`
-- ----------------------------
DROP TABLE IF EXISTS `top_base_country`;
CREATE TABLE `top_base_country` (
  `country_code` varchar(50) NOT NULL COMMENT '国家编号',
  `country_name` varchar(350) DEFAULT NULL COMMENT '国家名称',
  `en_name` varchar(80) DEFAULT NULL COMMENT '英文名称',
  `status` char(1) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`country_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='国家信息';

-- ----------------------------
-- Records of top_base_country
-- ----------------------------
INSERT INTO `top_base_country` VALUES ('1', '中国', 'Zhongguo', 'N');
INSERT INTO `top_base_country` VALUES ('2', '韩国', 'Hanguo', 'Y');

-- ----------------------------
-- Table structure for `top_base_county`
-- ----------------------------
DROP TABLE IF EXISTS `top_base_county`;
CREATE TABLE `top_base_county` (
  `county_code` varchar(50) NOT NULL COMMENT '县级编号',
  `county_name` varchar(80) DEFAULT NULL COMMENT '县级名称',
  `en_name` varchar(80) DEFAULT NULL COMMENT '英文名称',
  `status` char(1) DEFAULT NULL COMMENT '状态',
  `city_name` varchar(50) DEFAULT NULL COMMENT '所属市名称',
  `city_code` varchar(50) DEFAULT NULL COMMENT '所属市编号',
  PRIMARY KEY (`county_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='县级信息';

-- ----------------------------
-- Records of top_base_county
-- ----------------------------

-- ----------------------------
-- Table structure for `top_base_province`
-- ----------------------------
DROP TABLE IF EXISTS `top_base_province`;
CREATE TABLE `top_base_province` (
  `province_code` varchar(50) NOT NULL COMMENT '编号',
  `province_name` varchar(50) DEFAULT NULL COMMENT '省名称',
  `en_name` varchar(50) DEFAULT NULL COMMENT '英文名称',
  `status` char(1) DEFAULT NULL COMMENT '状态',
  `country_name` varchar(50) DEFAULT NULL COMMENT '所属国家名称',
  `country_code` varchar(50) DEFAULT NULL COMMENT '所属国家编号',
  PRIMARY KEY (`province_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='省级信息';

-- ----------------------------
-- Records of top_base_province
-- ----------------------------
INSERT INTO `top_base_province` VALUES ('111', '111', '111', 'Y', '韩国', '2');

-- ----------------------------
-- Table structure for `top_deal_bought`
-- ----------------------------
DROP TABLE IF EXISTS `top_deal_bought`;
CREATE TABLE `top_deal_bought` (
  `bought_id` char(36) NOT NULL COMMENT '主键',
  `bought_code` varchar(50) DEFAULT NULL COMMENT '购买编号',
  `bought_trade` varchar(50) DEFAULT NULL COMMENT '交易状态',
  `bought_amt` decimal(4,2) DEFAULT NULL COMMENT '交易金额',
  `bought_number` int(11) DEFAULT NULL COMMENT '购买数量',
  `bought_time` datetime DEFAULT NULL COMMENT '交易日期',
  `product_id` char(36) DEFAULT NULL COMMENT '产品ID',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(50) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL COMMENT '修改日期',
  `delete_by` varchar(50) DEFAULT NULL COMMENT '删除人',
  `delete_time` datetime DEFAULT NULL COMMENT '删除日期',
  PRIMARY KEY (`bought_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='已购商品信息';

-- ----------------------------
-- Records of top_deal_bought
-- ----------------------------

-- ----------------------------
-- Table structure for `top_deal_browse`
-- ----------------------------
DROP TABLE IF EXISTS `top_deal_browse`;
CREATE TABLE `top_deal_browse` (
  `browse_id` char(36) NOT NULL COMMENT '主键',
  `browse_code` varchar(50) DEFAULT NULL COMMENT '浏览编号',
  `product_id` char(36) DEFAULT NULL COMMENT '浏览商品ID',
  `user_id` char(36) DEFAULT NULL COMMENT '用户ID',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(50) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL COMMENT '修改日期',
  `delete_by` varchar(50) DEFAULT NULL COMMENT '删除人',
  `delete_time` datetime DEFAULT NULL COMMENT '删除日期',
  PRIMARY KEY (`browse_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='浏览记录';

-- ----------------------------
-- Records of top_deal_browse
-- ----------------------------

-- ----------------------------
-- Table structure for `top_deal_order`
-- ----------------------------
DROP TABLE IF EXISTS `top_deal_order`;
CREATE TABLE `top_deal_order` (
  `order_id` char(36) NOT NULL COMMENT '主键',
  `order_code` varchar(50) DEFAULT NULL COMMENT '订单编号',
  `user_id` char(36) DEFAULT NULL COMMENT '用户ID',
  `status` varchar(50) DEFAULT NULL COMMENT '订单状态',
  `payment_status` varchar(50) DEFAULT NULL COMMENT '订单支付状态',
  `price` decimal(8,2) DEFAULT NULL COMMENT '订单金额',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(50) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL COMMENT '修改日期',
  `delete_by` varchar(50) DEFAULT NULL COMMENT '删除人',
  `delete_time` datetime DEFAULT NULL COMMENT '删除日期',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

-- ----------------------------
-- Records of top_deal_order
-- ----------------------------

-- ----------------------------
-- Table structure for `top_deal_trxn`
-- ----------------------------
DROP TABLE IF EXISTS `top_deal_trxn`;
CREATE TABLE `top_deal_trxn` (
  `trxn_id` char(36) NOT NULL COMMENT '主键',
  `trxn_amt` decimal(8,2) DEFAULT NULL COMMENT '交易金额',
  `product_id` char(36) DEFAULT NULL COMMENT '产品ID',
  `end_time` datetime DEFAULT NULL COMMENT '交易结束时间',
  `start_time` datetime DEFAULT NULL COMMENT '交易开始时间',
  `user_id` char(36) DEFAULT NULL COMMENT '客户ID',
  PRIMARY KEY (`trxn_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of top_deal_trxn
-- ----------------------------

-- ----------------------------
-- Table structure for `top_logistics`
-- ----------------------------
DROP TABLE IF EXISTS `top_logistics`;
CREATE TABLE `top_logistics` (
  `logistics_id` char(36) NOT NULL COMMENT '主键',
  `company_id` char(36) NOT NULL COMMENT '物流公司ID',
  `company_name` varchar(100) DEFAULT NULL COMMENT '物流公司名称',
  `logistics_code` varchar(50) DEFAULT NULL COMMENT '运单号',
  `order_id` char(36) DEFAULT NULL COMMENT '订单ID',
  `status` varchar(50) DEFAULT NULL COMMENT '物流状态',
  `comment` varchar(1000) DEFAULT NULL COMMENT '物流撤回原因',
  `price` decimal(8,2) DEFAULT NULL COMMENT '运费',
  `principal` varchar(50) DEFAULT NULL COMMENT '运货人',
  `cellphone` char(11) NOT NULL COMMENT '运货人手机',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(50) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL COMMENT '修改日期',
  PRIMARY KEY (`logistics_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='物流信息';

-- ----------------------------
-- Records of top_logistics
-- ----------------------------

-- ----------------------------
-- Table structure for `top_logistics_company`
-- ----------------------------
DROP TABLE IF EXISTS `top_logistics_company`;
CREATE TABLE `top_logistics_company` (
  `company_id` char(36) NOT NULL COMMENT '物流公司ID',
  `company_name` varchar(100) DEFAULT NULL COMMENT '物流公司名称',
  `company_phone` varchar(50) DEFAULT NULL COMMENT '物流公司电话',
  `principal` varchar(50) DEFAULT NULL COMMENT '物流公司负责人',
  `telephone` varchar(50) NOT NULL COMMENT '负责人电话',
  `cellphone` char(11) NOT NULL COMMENT '负责人手机',
  `status` char(1) DEFAULT NULL COMMENT '物流公司状态',
  PRIMARY KEY (`company_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='物流公司信息';

-- ----------------------------
-- Records of top_logistics_company
-- ----------------------------

-- ----------------------------
-- Table structure for `top_operate_user_log`
-- ----------------------------
DROP TABLE IF EXISTS `top_operate_user_log`;
CREATE TABLE `top_operate_user_log` (
  `top_operate_user_log_id` char(36) NOT NULL COMMENT '主键',
  `top_operate_user_log_code` varchar(50) DEFAULT NULL COMMENT '操作编号',
  `operate_user_id` char(36) DEFAULT NULL COMMENT '操作员ID',
  `operate_time` datetime DEFAULT NULL COMMENT '操作日期',
  `operate_contents` varchar(1000) DEFAULT NULL COMMENT '主要操作内容',
  PRIMARY KEY (`top_operate_user_log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统用户操作记录表';

-- ----------------------------
-- Records of top_operate_user_log
-- ----------------------------

-- ----------------------------
-- Table structure for `top_pro_classfily`
-- ----------------------------
DROP TABLE IF EXISTS `top_pro_classfily`;
CREATE TABLE `top_pro_classfily` (
  `top_pro_classfily_id` char(36) NOT NULL COMMENT '商品分类信息',
  `top_pro_classfily_code` varchar(50) DEFAULT NULL,
  `top_pro_classfily_name` varchar(100) DEFAULT NULL,
  `top_pro_classfily_parent_id` char(36) DEFAULT NULL,
  PRIMARY KEY (`top_pro_classfily_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of top_pro_classfily
-- ----------------------------

-- ----------------------------
-- Table structure for `top_pro_department`
-- ----------------------------
DROP TABLE IF EXISTS `top_pro_department`;
CREATE TABLE `top_pro_department` (
  `department_id` varchar(36) NOT NULL COMMENT '主键',
  `department_code` varchar(50) DEFAULT NULL COMMENT '部门编号',
  `department_name` varchar(100) DEFAULT NULL COMMENT '部门名称',
  `department_level` char(1) DEFAULT NULL COMMENT '部门等级',
  PRIMARY KEY (`department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门信息';

-- ----------------------------
-- Records of top_pro_department
-- ----------------------------

-- ----------------------------
-- Table structure for `top_pro_farm`
-- ----------------------------
DROP TABLE IF EXISTS `top_pro_farm`;
CREATE TABLE `top_pro_farm` (
  `farm_id` char(36) NOT NULL COMMENT '主键',
  `farm_code` varchar(50) DEFAULT NULL COMMENT '农场编号',
  `farm_name` varchar(50) DEFAULT NULL COMMENT '农场名称',
  `farm_description` varchar(500) DEFAULT NULL COMMENT '农场描述',
  `farm_size` double(6,2) DEFAULT NULL COMMENT '农场面积',
  `farm_station` varchar(50) DEFAULT NULL COMMENT '农场位置',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(50) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL COMMENT '修改日期',
  `delete_by` varchar(50) DEFAULT NULL COMMENT '删除人',
  `delete_time` datetime DEFAULT NULL COMMENT '删除日期',
  PRIMARY KEY (`farm_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='农场信息';

-- ----------------------------
-- Records of top_pro_farm
-- ----------------------------

-- ----------------------------
-- Table structure for `top_pro_farmers`
-- ----------------------------
DROP TABLE IF EXISTS `top_pro_farmers`;
CREATE TABLE `top_pro_farmers` (
  `farmers_id` char(36) NOT NULL COMMENT '主键',
  `farmer_code` varchar(50) DEFAULT NULL COMMENT '农场主编号',
  `farmer_name` varchar(50) DEFAULT NULL COMMENT '农场主名称',
  `farm_id` char(36) DEFAULT NULL COMMENT '农场ID',
  `gender` char(2) DEFAULT NULL COMMENT '性别',
  `cellphone` char(11) DEFAULT NULL COMMENT '农场主手机',
  `telephone` varchar(11) DEFAULT NULL COMMENT '农场主座机',
  `country_id` char(36) DEFAULT NULL COMMENT '农场主国家',
  `province_id` char(36) DEFAULT NULL COMMENT '农场主省份',
  `town_id` char(36) DEFAULT NULL COMMENT '农场主所属市',
  `county_id` char(36) DEFAULT NULL COMMENT '农场主所属县城',
  `address` varchar(500) DEFAULT NULL COMMENT '农场主地址',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(50) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL COMMENT '修改日期',
  `delete_by` varchar(50) DEFAULT NULL COMMENT '删除人',
  `delete_time` datetime DEFAULT NULL COMMENT '删除日期',
  PRIMARY KEY (`farmers_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='农场主信息';

-- ----------------------------
-- Records of top_pro_farmers
-- ----------------------------

-- ----------------------------
-- Table structure for `top_pro_farm_product_rel`
-- ----------------------------
DROP TABLE IF EXISTS `top_pro_farm_product_rel`;
CREATE TABLE `top_pro_farm_product_rel` (
  `farm_product_rel` varchar(32) NOT NULL COMMENT '主键',
  `farm_product_rel_code` varchar(50) DEFAULT NULL COMMENT '关联编号',
  `farmers_id` char(36) DEFAULT NULL COMMENT '农场主ID',
  `product_id` char(36) DEFAULT NULL COMMENT '产品ID',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(50) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL COMMENT '修改日期',
  `delete_by` varchar(50) DEFAULT NULL COMMENT '删除人',
  `delete_time` datetime DEFAULT NULL COMMENT '删除日期',
  PRIMARY KEY (`farm_product_rel`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='农场产品关联信息';

-- ----------------------------
-- Records of top_pro_farm_product_rel
-- ----------------------------

-- ----------------------------
-- Table structure for `top_pro_images`
-- ----------------------------
DROP TABLE IF EXISTS `top_pro_images`;
CREATE TABLE `top_pro_images` (
  `image_id` varchar(36) NOT NULL COMMENT '主键',
  `image_type` varchar(100) DEFAULT NULL COMMENT '图片使用目的',
  `image_url` varchar(1000) DEFAULT NULL COMMENT '图片URL',
  `status` varchar(50) DEFAULT NULL COMMENT '图片状态',
  `product_id` varchar(36) DEFAULT NULL COMMENT '产品id',
  PRIMARY KEY (`image_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='图片信息';

-- ----------------------------
-- Records of top_pro_images
-- ----------------------------

-- ----------------------------
-- Table structure for `top_pro_position`
-- ----------------------------
DROP TABLE IF EXISTS `top_pro_position`;
CREATE TABLE `top_pro_position` (
  `position_id` varchar(36) NOT NULL COMMENT '主键',
  `position_code` varchar(50) DEFAULT NULL COMMENT '岗位编号',
  `position_name` varchar(100) DEFAULT NULL COMMENT '岗位名称',
  `position_level` char(1) DEFAULT NULL COMMENT '岗位等级',
  PRIMARY KEY (`position_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='职务信息';

-- ----------------------------
-- Records of top_pro_position
-- ----------------------------

-- ----------------------------
-- Table structure for `top_pro_product`
-- ----------------------------
DROP TABLE IF EXISTS `top_pro_product`;
CREATE TABLE `top_pro_product` (
  `product_id` char(36) NOT NULL COMMENT '主键',
  `product_code` varchar(50) DEFAULT NULL COMMENT '产品编号',
  `product_name` varchar(50) DEFAULT NULL COMMENT '产品名称',
  `country_code` varchar(50) DEFAULT NULL COMMENT '产品国家ID',
  `province_code` varchar(50) DEFAULT NULL COMMENT '产品省份ID',
  `city_code` varchar(50) DEFAULT NULL COMMENT '产品所属市ID',
  `county_code` varchar(50) DEFAULT NULL COMMENT '产品所属县ID',
  `price` decimal(8,2) DEFAULT NULL COMMENT '产品新单价',
  `old_price` decimal(8,2) DEFAULT NULL COMMENT '产品原始价格',
  `address` varchar(500) DEFAULT NULL COMMENT '产品地址',
  `stock` decimal(8,2) DEFAULT NULL COMMENT '产品库存',
  `status` varchar(50) DEFAULT NULL COMMENT '产品审核状态',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(50) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL COMMENT '修改日期',
  `delete_by` varchar(50) DEFAULT NULL COMMENT '删除人',
  `delete_time` datetime DEFAULT NULL COMMENT '删除日期',
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品信息';

-- ----------------------------
-- Records of top_pro_product
-- ----------------------------

-- ----------------------------
-- Table structure for `top_pro_product_nutrition`
-- ----------------------------
DROP TABLE IF EXISTS `top_pro_product_nutrition`;
CREATE TABLE `top_pro_product_nutrition` (
  `nutrition_id` char(36) NOT NULL COMMENT '主键',
  `nutrition_double` int(11) DEFAULT NULL COMMENT '营养剂量',
  `nutrition_code` varchar(32) DEFAULT NULL COMMENT '此类营养编号',
  `nutrition_name` varchar(32) DEFAULT NULL COMMENT '营养名称',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(50) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL COMMENT '修改日期',
  `delete_by` varchar(50) DEFAULT NULL COMMENT '删除人',
  `delete_time` datetime DEFAULT NULL COMMENT '删除日期',
  PRIMARY KEY (`nutrition_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品营养信息';

-- ----------------------------
-- Records of top_pro_product_nutrition
-- ----------------------------

-- ----------------------------
-- Table structure for `top_pro_tenant`
-- ----------------------------
DROP TABLE IF EXISTS `top_pro_tenant`;
CREATE TABLE `top_pro_tenant` (
  `tenant_id` char(36) NOT NULL COMMENT '主键',
  `tenant_code` varchar(50) DEFAULT NULL COMMENT '商户编号',
  `tenant_postcode` char(6) DEFAULT NULL COMMENT '商户邮编',
  `tenant_phone` char(11) DEFAULT NULL COMMENT '商户电话',
  `tenant_address` varchar(300) DEFAULT NULL COMMENT '商户地址',
  `tenant_first_name` varchar(50) DEFAULT NULL COMMENT '商户姓名',
  `password` varchar(50) DEFAULT NULL COMMENT '商户密码',
  `tenant_name` varchar(50) DEFAULT NULL COMMENT '商户名称',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(50) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL COMMENT '修改日期',
  `delete_by` varchar(50) DEFAULT NULL COMMENT '删除人',
  `delete_time` datetime DEFAULT NULL COMMENT '删除日期',
  PRIMARY KEY (`tenant_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商户信息';

-- ----------------------------
-- Records of top_pro_tenant
-- ----------------------------

-- ----------------------------
-- Table structure for `top_pro_tenant_product_rel`
-- ----------------------------
DROP TABLE IF EXISTS `top_pro_tenant_product_rel`;
CREATE TABLE `top_pro_tenant_product_rel` (
  `tenant_product_rel_id` char(36) NOT NULL COMMENT '主键',
  `tenant_product_rel_code` varchar(50) DEFAULT NULL COMMENT '管理编号',
  `tenant_id` char(36) DEFAULT NULL COMMENT '商户ID',
  `product_id` char(36) DEFAULT NULL COMMENT '产品ID',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(50) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL COMMENT '修改日期',
  `delete_by` varchar(50) DEFAULT NULL COMMENT '删除人',
  `delete_time` datetime DEFAULT NULL COMMENT '删除日期',
  PRIMARY KEY (`tenant_product_rel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商户产品关联信息';

-- ----------------------------
-- Records of top_pro_tenant_product_rel
-- ----------------------------

-- ----------------------------
-- Table structure for `top_shipping_address`
-- ----------------------------
DROP TABLE IF EXISTS `top_shipping_address`;
CREATE TABLE `top_shipping_address` (
  `address_id` char(36) NOT NULL COMMENT '主键',
  `consignee` varchar(50) DEFAULT NULL COMMENT '收件人',
  `cellphone` char(11) DEFAULT NULL COMMENT '收件人电话',
  `address` varchar(1000) DEFAULT NULL COMMENT '收件地址',
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `user_id` char(36) DEFAULT NULL COMMENT '用户ID',
  PRIMARY KEY (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收货地址信息';

-- ----------------------------
-- Records of top_shipping_address
-- ----------------------------

-- ----------------------------
-- Table structure for `top_user_customer`
-- ----------------------------
DROP TABLE IF EXISTS `top_user_customer`;
CREATE TABLE `top_user_customer` (
  `customer_id` char(36) NOT NULL,
  `first_name` varchar(50) DEFAULT NULL,
  `second_name` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `head_photo` varchar(500) DEFAULT NULL COMMENT '头像',
  `qq_number` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `address` varchar(300) DEFAULT NULL,
  `country_code` char(36) DEFAULT NULL,
  `province_code` char(36) DEFAULT NULL,
  `city_code` char(36) DEFAULT NULL,
  `county_code` char(36) DEFAULT NULL,
  `ismrried` char(255) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `id_card` varchar(50) DEFAULT NULL,
  `cellphone` char(11) DEFAULT NULL COMMENT '手机',
  `telephone` varchar(11) DEFAULT NULL COMMENT '座机',
  `gender` char(2) DEFAULT NULL,
  `status` char(1) DEFAULT NULL COMMENT '状态',
  `address_id` char(36) DEFAULT NULL COMMENT '默认收件地址ID',
  `company_name` varchar(100) DEFAULT NULL,
  `company_address` varchar(200) DEFAULT NULL,
  `delete_by` varchar(50) DEFAULT NULL COMMENT '删除人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改日期',
  `delete_time` datetime DEFAULT NULL COMMENT '删除日期',
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户信息表';

-- ----------------------------
-- Records of top_user_customer
-- ----------------------------

-- ----------------------------
-- Table structure for `top_user_permission`
-- ----------------------------
DROP TABLE IF EXISTS `top_user_permission`;
CREATE TABLE `top_user_permission` (
  `permission_id` char(36) NOT NULL COMMENT '主键',
  `permission_name` varchar(50) DEFAULT NULL COMMENT '权限名称',
  `permission_level` char(2) DEFAULT NULL COMMENT '权限等级',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(50) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL COMMENT '修改日期',
  `delete_by` varchar(50) DEFAULT NULL COMMENT '删除人',
  `delete_time` datetime DEFAULT NULL COMMENT '删除日期',
  PRIMARY KEY (`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限信息';

-- ----------------------------
-- Records of top_user_permission
-- ----------------------------

-- ----------------------------
-- Table structure for `top_user_shop_cart`
-- ----------------------------
DROP TABLE IF EXISTS `top_user_shop_cart`;
CREATE TABLE `top_user_shop_cart` (
  `cart_id` varchar(36) NOT NULL COMMENT '购物车',
  `cart_code` varchar(50) DEFAULT NULL,
  `user_id` varchar(36) DEFAULT NULL COMMENT '用户id',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户名',
  `product_id` varchar(36) DEFAULT NULL COMMENT '产品id',
  `product_amt` decimal(8,2) DEFAULT NULL COMMENT '商品总价',
  `product_price` decimal(8,2) DEFAULT NULL COMMENT '单价',
  `product_name` varchar(50) DEFAULT NULL COMMENT '产品名称',
  `product_specify` varchar(100) DEFAULT NULL COMMENT '产品规格',
  `product_quantity` int(11) DEFAULT NULL COMMENT '购买数量',
  `create_by` varchar(50) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`cart_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='购物车';

-- ----------------------------
-- Records of top_user_shop_cart
-- ----------------------------

-- ----------------------------
-- Table structure for `top_user_system_user`
-- ----------------------------
DROP TABLE IF EXISTS `top_user_system_user`;
CREATE TABLE `top_user_system_user` (
  `user_id` char(36) NOT NULL COMMENT '主键',
  `user_code` varchar(50) DEFAULT NULL COMMENT '用户编号',
  `user_name` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `permission_id` char(36) DEFAULT NULL COMMENT '用户权限ID',
  `gender` char(2) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `status` char(1) DEFAULT NULL COMMENT '状态',
  `user_photo` varchar(500) DEFAULT NULL COMMENT '头像',
  `cellphone` char(11) DEFAULT NULL COMMENT '手机',
  `telephone` varchar(11) DEFAULT NULL COMMENT '座机',
  `create_by` varchar(50) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(50) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL COMMENT '修改日期',
  `delete_by` varchar(50) DEFAULT NULL COMMENT '删除人',
  `delete_time` datetime DEFAULT NULL COMMENT '删除日期',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统用户信息';

-- ----------------------------
-- Records of top_user_system_user
-- ----------------------------
INSERT INTO `top_user_system_user` VALUES ('2854282b-19bc-11e5-93a4-60d819b0786a', null, 'admin', '21232F297A57A5A743894A0E4A801FC3', null, null, null, null, null, null, null, null, '2015-06-23 23:26:02', null, null, null, null);
