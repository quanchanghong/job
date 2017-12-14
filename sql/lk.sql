/*
Navicat MySQL Data Transfer

Source Server         : hello
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : lk

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2017-12-14 16:28:23
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
-- Table structure for project
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `projId` int(11) NOT NULL,
  `projName` varchar(255) NOT NULL,
  `projCode` varchar(255) NOT NULL,
  `projStartDate` varchar(255) NOT NULL,
  `projEndDate` varchar(255) NOT NULL,
  `projCreatorId` int(11) NOT NULL,
  `projCreateDate` varchar(255) NOT NULL,
  `projShortName` varchar(100) NOT NULL,
  `projRemark` varchar(255) DEFAULT NULL,
  `projState` int(11) NOT NULL,
  `projPMId` int(11) NOT NULL,
  `projSMId` int(11) NOT NULL,
  `projIsSafer` int(11) DEFAULT NULL,
  `projPDId` int(11) DEFAULT NULL,
  `projMainSaferId` int(11) DEFAULT NULL,
  PRIMARY KEY (`projId`)
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
