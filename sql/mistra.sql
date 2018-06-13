/*
 Navicat Premium Data Transfer

 Source Server         : mistra
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : 112.74.38.117:3306
 Source Schema         : springboot

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 13/06/2018 11:20:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for mistra
-- ----------------------------
DROP TABLE IF EXISTS `mistra`;
CREATE TABLE `mistra`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `sex` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `modifyTime` datetime(0) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of mistra
-- ----------------------------
INSERT INTO `mistra` VALUES ('1006716211454701569', '王瑞', '1', 1, NULL);

SET FOREIGN_KEY_CHECKS = 1;
