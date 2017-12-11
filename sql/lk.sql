/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : lk

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2017-12-11 22:10:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `departmentId` int(11) NOT NULL,
  `departmentName` varchar(255) DEFAULT NULL,
  `departmentLeaderId` int(11) DEFAULT NULL,
  `departmentDesc` varchar(255) DEFAULT NULL,
  `departmentPosition` varchar(255) DEFAULT NULL,
  `isEnd` int(11) DEFAULT NULL,
  `isStart` int(11) DEFAULT NULL,
  `topDepartmentId` int(11) DEFAULT NULL,
  `nextDepartmentId` int(11) DEFAULT NULL,
  PRIMARY KEY (`departmentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL,
  `userName` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `IDNumber` varchar(50) DEFAULT NULL,
  `headImageUrl` varchar(50) DEFAULT NULL,
  `departmentId` int(11) DEFAULT NULL,
  `roleId` int(11) DEFAULT NULL,
  `birthday` varchar(50) DEFAULT NULL,
  `qq` varchar(20) DEFAULT NULL,
  `wechart` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
