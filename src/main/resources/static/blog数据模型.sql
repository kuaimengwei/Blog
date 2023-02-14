/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80025
 Source Host           : localhost:3306
 Source Schema         : blog

 Target Server Type    : MySQL
 Target Server Version : 80025
 File Encoding         : 65001

 Date: 05/02/2023 14:22:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article`  (
  `article_id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '博文ID',
  `push_data` datetime(0) NULL DEFAULT NULL COMMENT '发布日期',
  `article_user` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '发表用户',
  `title` varchar(1024) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '博文标题',
  `like_count` int(0) NULL DEFAULT NULL COMMENT '点赞数',
  `comment_count` int(0) NULL DEFAULT NULL COMMENT '评论数',
  `read_count` int(0) NULL DEFAULT NULL COMMENT '浏览量',
  `top_flag` varchar(1) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '是否置顶',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `article_summary` varchar(1024) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '文章摘要',
  PRIMARY KEY (`article_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '文章 ' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of article
-- ----------------------------

-- ----------------------------
-- Table structure for article_category_referenced
-- ----------------------------
DROP TABLE IF EXISTS `article_category_referenced`;
CREATE TABLE `article_category_referenced`  (
  `acr_id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '引用id',
  `article_id` bigint(0) NULL DEFAULT NULL COMMENT '文章id',
  `category_id` bigint(0) NULL DEFAULT NULL COMMENT '类目id',
  PRIMARY KEY (`acr_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '文章分类 ' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of article_category_referenced
-- ----------------------------

-- ----------------------------
-- Table structure for article_detail
-- ----------------------------
DROP TABLE IF EXISTS `article_detail`;
CREATE TABLE `article_detail`  (
  `article_detail_id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '文章详情id',
  `content_md` text CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '文章markdown内容',
  `content_html` text CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '文章html内容',
  `article_id` bigint(0) NULL DEFAULT NULL COMMENT '文章id',
  PRIMARY KEY (`article_detail_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '文章详情 ' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of article_detail
-- ----------------------------

-- ----------------------------
-- Table structure for article_tag_referenced
-- ----------------------------
DROP TABLE IF EXISTS `article_tag_referenced`;
CREATE TABLE `article_tag_referenced`  (
  `atr_Id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '引用id',
  `article_id` bigint(0) NULL DEFAULT NULL COMMENT '文章id',
  `tag_id` bigint(0) NULL DEFAULT NULL COMMENT '标签id',
  PRIMARY KEY (`atr_Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '文章标签 ' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of article_tag_referenced
-- ----------------------------

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category`  (
  `category_id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '分类ID',
  `category_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '分类名称',
  `alias_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '分类别名',
  `description` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '分类描述',
  `parennt_id` bigint(0) NULL DEFAULT NULL COMMENT '父分类ID',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`category_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '分类 ' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of category
-- ----------------------------

-- ----------------------------
-- Table structure for discuss
-- ----------------------------
DROP TABLE IF EXISTS `discuss`;
CREATE TABLE `discuss`  (
  `discuss_id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '评论ID',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '评论日期',
  `like_count` int(0) NULL DEFAULT NULL COMMENT '点赞数',
  `discuss_user` bigint(0) NULL DEFAULT NULL COMMENT '发表用户',
  `article_id` bigint(0) NULL DEFAULT NULL COMMENT '评论文章ID',
  `content` varchar(3072) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '评论内容',
  `parent_id` bigint(0) NULL DEFAULT NULL COMMENT '父评论ID',
  PRIMARY KEY (`discuss_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '评论 ' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of discuss
-- ----------------------------

-- ----------------------------
-- Table structure for tag
-- ----------------------------
DROP TABLE IF EXISTS `tag`;
CREATE TABLE `tag`  (
  `tag_id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '标签ID',
  `tag_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '标签名称',
  `alias_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '标签别名',
  `description` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '标签描述',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`tag_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '标签 ' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tag
-- ----------------------------

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `user_Id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `user_name` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户名',
  `user_nickname` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户昵称',
  `pwd` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户密码',
  `email` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户邮箱',
  `avatar` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户头像',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '注册时间',
  `birthday` date NULL DEFAULT NULL COMMENT '用户生日',
  `age` int(0) NULL DEFAULT NULL COMMENT '用户年龄',
  `moble_phone` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户手机号',
  PRIMARY KEY (`user_Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '用户 ' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
