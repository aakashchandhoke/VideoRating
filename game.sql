-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Mar 10, 2016 at 08:05 AM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `game_review`
--
CREATE DATABASE `game_review` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `game_review`;

-- --------------------------------------------------------

--
-- Table structure for table `tblcomment`
--

CREATE TABLE IF NOT EXISTS `tblcomment` (
  `userid` varchar(10) NOT NULL,
  `gameid` varchar(10) NOT NULL,
  `comment` varchar(200) NOT NULL,
  `rdate` date NOT NULL,
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `rating` varchar(5) NOT NULL,
  PRIMARY KEY (`cid`),
  UNIQUE KEY `userid` (`userid`,`gameid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;

--
-- Dumping data for table `tblcomment`
--

INSERT INTO `tblcomment` (`userid`, `gameid`, `comment`, `rdate`, `cid`, `rating`) VALUES
('2', '1', 'very good game', '2016-03-09', 1, '3'),
('2', '3', 'Not a good product', '2016-03-09', 10, '4'),
('4', '3', 'Very good product dear', '2016-03-09', 11, '5'),
('4', '2', 'hii hello', '2016-03-09', 12, '3'),
('4', '4', 'a lovely game', '2016-03-09', 13, '5'),
('2', '2', 'zvvxvsf', '2016-03-10', 15, '5');

-- --------------------------------------------------------

--
-- Table structure for table `tblgames`
--

CREATE TABLE IF NOT EXISTS `tblgames` (
  `gameid` int(11) NOT NULL AUTO_INCREMENT,
  `gname` varchar(30) NOT NULL,
  `gdesc` varchar(700) NOT NULL,
  `gimage` varchar(25) NOT NULL,
  `gcategory` varchar(30) NOT NULL,
  `rdate` date NOT NULL,
  PRIMARY KEY (`gameid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `tblgames`
--

INSERT INTO `tblgames` (`gameid`, `gname`, `gdesc`, `gimage`, `gcategory`, `rdate`) VALUES
(1, 'jjjjj', 'sfsf', '2016_03_08_06_05_30.jpg', 'sports', '2016-03-08'),
(2, 'clash of clans', 'dfsdfsg', '2016_03_08_11_37_14.jpg', 'sports', '2016-03-08'),
(3, 'penguinses', 'dsdfsfs', '2016_03_08_11_39_26.jpg', 'sports', '2016-03-08'),
(4, 'Animated', 'anind ', '2016_03_09_07_57_27.jpg', 'animation', '2016-03-09'),
(5, 'hydra', 'asdsdlfjlsfd', '2016_03_09_07_58_33.jpg', 'b', '2016-03-09'),
(6, 'new game', 'sdflsdjlf\r\ndsflsdf', '2016_03_10_01_19_20.jpg', 'animation', '2016-03-10'),
(7, 'ksdnkad asdkasjd a', 'hi \r\najad sajdjasld\r\njajd', '2016_03_10_01_27_58.jpg', 'sports', '2016-03-10');

-- --------------------------------------------------------

--
-- Table structure for table `tbluser`
--

CREATE TABLE IF NOT EXISTS `tbluser` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(20) NOT NULL,
  `mname` varchar(20) NOT NULL,
  `lname` varchar(20) NOT NULL,
  `emailid` varchar(30) DEFAULT NULL,
  `password` varchar(20) NOT NULL,
  `rdate` varchar(20) NOT NULL,
  `mobile` varchar(10) NOT NULL,
  `address` varchar(50) NOT NULL,
  `usertype` varchar(10) NOT NULL,
  `status` varchar(6) NOT NULL,
  PRIMARY KEY (`userid`),
  UNIQUE KEY `emailid` (`emailid`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `tbluser`
--

INSERT INTO `tbluser` (`userid`, `fname`, `mname`, `lname`, `emailid`, `password`, `rdate`, `mobile`, `address`, `usertype`, `status`) VALUES
(4, 'Durgesh', 'Kumar', 'G', 'abc@gmail.com', 'asdfgh', '09/03/2016', '9199199191', 'ZXCZLK', 'user', 'True'),
(2, 'Durgesh', '', 'Kumar', 'colthurling@gmail.com', 'asdfgh', '25/02/2016', '0780840884', 'At-Katsa, Po', 'user', 'True'),
(3, 'Admin', '', '', 'admin@gmail.com', 'asdfgh', '2015-10-27 21:29:34', '3333333333', '', 'admin', 'True');
