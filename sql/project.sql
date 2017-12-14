/*
Navicat MySQL Data Transfer

Source Server         : hello
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : lk

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2017-12-14 16:27:13
*/

SET FOREIGN_KEY_CHECKS=0;

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
