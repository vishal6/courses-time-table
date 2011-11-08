-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 08, 2011 at 11:27 PM
-- Server version: 5.5.8
-- PHP Version: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `course_timetable`
--

-- --------------------------------------------------------

--
-- Table structure for table `classroom`
--

CREATE TABLE IF NOT EXISTS `classroom` (
  `ID` int(6) NOT NULL COMMENT 'Class Room''s ID',
  `Deprtment_name` varchar(50) DEFAULT NULL COMMENT 'Class Room''s Department',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Class Room Table';

--
-- Dumping data for table `classroom`
--

INSERT INTO `classroom` (`ID`, `Deprtment_name`) VALUES
(207701, 'computer'),
(307701, 'architecture\r');

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE IF NOT EXISTS `courses` (
  `ID` int(5) NOT NULL COMMENT 'Course''s ID',
  `name` varchar(50) DEFAULT NULL COMMENT 'Course''s Name',
  `Lab_HRs` int(2) DEFAULT '2' COMMENT 'Course''s laboratory Hours',
  `lec_HRs` int(2) NOT NULL DEFAULT '2' COMMENT 'Course''s lecture Hours',
  `sec_HRs` int(2) NOT NULL DEFAULT '2' COMMENT 'Course''s section HRs',
  `exam_day_ID` int(1) DEFAULT NULL COMMENT 'the ID''s day that student will take the exam in',
  `C_prof` int(4) DEFAULT NULL COMMENT 'professor''s ID that teach that course',
  `C_TA` int(4) DEFAULT NULL COMMENT 'TA''s ID that teach that course',
  `Class_ID` int(6) DEFAULT NULL COMMENT 'Class room where the course is teached',
  PRIMARY KEY (`ID`),
  KEY `exam_day_ID` (`exam_day_ID`),
  KEY `prof` (`C_prof`),
  KEY `class` (`Class_ID`),
  KEY `TA` (`C_TA`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Courses Table';

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`ID`, `name`, `Lab_HRs`, `lec_HRs`, `sec_HRs`, `exam_day_ID`, `C_prof`, `C_TA`, `Class_ID`) VALUES
(11111, 'huminities', NULL, 14, 12, NULL, 1111, 2210, 307701),
(12345, 'algorithm', 10, 14, 12, NULL, 1234, 2001, 207701);

-- --------------------------------------------------------

--
-- Table structure for table `course_day`
--

CREATE TABLE IF NOT EXISTS `course_day` (
  `crs_ID` int(5) NOT NULL COMMENT 'Course''s ID',
  `day_ID` int(1) NOT NULL COMMENT 'Day''s ID',
  PRIMARY KEY (`crs_ID`) USING BTREE,
  KEY `course_day` (`day_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='course is taken is a specified day.';

--
-- Dumping data for table `course_day`
--

INSERT INTO `course_day` (`crs_ID`, `day_ID`) VALUES
(12345, 1),
(11111, 2);

-- --------------------------------------------------------

--
-- Table structure for table `precourses`
--

CREATE TABLE IF NOT EXISTS `precourses` (
  `crs_ID` int(5) NOT NULL COMMENT 'Course''s ID',
  `pre_ID` int(5) DEFAULT NULL COMMENT 'Pre-request course''s Name',
  PRIMARY KEY (`crs_ID`),
  KEY `pre_ID` (`pre_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='this table contains the pre-request courses for such a course.';

--
-- Dumping data for table `precourses`
--

INSERT INTO `precourses` (`crs_ID`, `pre_ID`) VALUES
(12345, 11111);

-- --------------------------------------------------------

--
-- Table structure for table `prof`
--

CREATE TABLE IF NOT EXISTS `prof` (
  `ID` int(4) NOT NULL COMMENT 'professor''s ID ',
  `first_name` varchar(50) DEFAULT NULL COMMENT 'Professor''s first name',
  `last_name` varchar(50) DEFAULT NULL COMMENT 'Professor''s last name',
  `password` int(6) NOT NULL DEFAULT '123456' COMMENT 'Account password',
  `Gender` char(1) DEFAULT 'm' COMMENT 'Professor''s Gender',
  `Phone` int(8) DEFAULT NULL COMMENT 'Professor''s phone',
  `Mobile` int(11) DEFAULT NULL COMMENT 'professor''s mobile',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Professor''s data';

--
-- Dumping data for table `prof`
--

INSERT INTO `prof` (`ID`, `first_name`, `last_name`, `password`, `Gender`, `Phone`, `Mobile`) VALUES
(1111, 'mohsen', 'ahmed', 111111, 'm', 87654321, 1022541963),
(1234, 'rabie', 'ramdan', 123456, 'm', 12345678, 1001345671);

-- --------------------------------------------------------

--
-- Table structure for table `prof_day`
--

CREATE TABLE IF NOT EXISTS `prof_day` (
  `prof_ID` int(4) NOT NULL COMMENT 'professor''s ID ',
  `day_ID` int(1) NOT NULL COMMENT 'Day''s ID',
  PRIMARY KEY (`prof_ID`) USING BTREE,
  KEY `day_id` (`day_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='this table has the relation between the professor and his available days';

--
-- Dumping data for table `prof_day`
--

INSERT INTO `prof_day` (`prof_ID`, `day_ID`) VALUES
(1234, 1),
(1111, 6);

-- --------------------------------------------------------

--
-- Table structure for table `slots`
--

CREATE TABLE IF NOT EXISTS `slots` (
  `ID` int(3) NOT NULL COMMENT 'Slot''s ID refers to day''s number and slot''s number',
  `time` time NOT NULL DEFAULT '00:00:00' COMMENT 'slot''s time',
  `day_slot_ID` int(1) NOT NULL COMMENT 'day''s slot',
  PRIMARY KEY (`ID`),
  KEY `day ID` (`day_slot_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Slot table that contains the Slots in each day.';

--
-- Dumping data for table `slots`
--


-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `ID` int(4) NOT NULL COMMENT 'Student''s ID',
  `first_name` varchar(50) DEFAULT NULL COMMENT 'Student''s first name',
  `last_name` varchar(50) DEFAULT NULL COMMENT 'Student''s last name',
  `password` int(6) NOT NULL DEFAULT '123456' COMMENT 'Account password',
  `Gender` char(1) DEFAULT 'm' COMMENT 'Student''s Gender',
  `Phone` int(8) DEFAULT NULL COMMENT 'Student''s phone',
  `Mobile` int(11) DEFAULT NULL COMMENT 'Student''s mobile',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`ID`, `first_name`, `last_name`, `password`, `Gender`, `Phone`, `Mobile`) VALUES
(3225, 'tarek', 'osama', 222222, 'm', 1114269031, 12345678),
(3421, 'mohamad', 'nour', 123456, 'm', 1220302926, 33043098),
(3561, 'mahmoud', 'shokr', 111111, 'm', 1115348800, 22038938),
(3652, 'mahmoud', 'nabil', 333333, 'm', 1271118424, 12345667);

-- --------------------------------------------------------

--
-- Table structure for table `ta`
--

CREATE TABLE IF NOT EXISTS `ta` (
  `ID` int(4) NOT NULL COMMENT 'TA''s ID',
  `first_name` varchar(50) DEFAULT NULL COMMENT 'TA''s first name',
  `last_name` varchar(50) DEFAULT NULL COMMENT 'TA''s last name',
  `password` int(6) NOT NULL DEFAULT '123456' COMMENT 'Account password',
  `Gender` char(1) DEFAULT 'm' COMMENT 'TA''s Gender',
  `Phone` int(8) DEFAULT NULL COMMENT 'TA''s phone',
  `Mobile` int(11) DEFAULT NULL COMMENT 'TA''s mobile',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ta`
--

INSERT INTO `ta` (`ID`, `first_name`, `last_name`, `password`, `Gender`, `Phone`, `Mobile`) VALUES
(2001, 'mostafa', 'mohamad', 123456, 'm', 1001234567, 12345678),
(2210, 'mahmoud', 'hmed', 111111, 'm', 1062258963, 33333333);

-- --------------------------------------------------------

--
-- Table structure for table `take_course`
--

CREATE TABLE IF NOT EXISTS `take_course` (
  `std_ID` int(4) NOT NULL COMMENT 'Student''s ID',
  `crs_ID` int(5) NOT NULL COMMENT 'Course''s ID',
  PRIMARY KEY (`std_ID`,`crs_ID`),
  KEY `crouse` (`crs_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='this table has the relation between the student and courses';

--
-- Dumping data for table `take_course`
--

INSERT INTO `take_course` (`std_ID`, `crs_ID`) VALUES
(3225, 11111),
(3561, 11111),
(3421, 12345),
(3652, 12345);

-- --------------------------------------------------------

--
-- Table structure for table `ta_day`
--

CREATE TABLE IF NOT EXISTS `ta_day` (
  `ta_ID` int(4) NOT NULL COMMENT 'TA''s ID',
  `day_ID` int(1) NOT NULL COMMENT 'Day''s ID',
  PRIMARY KEY (`ta_ID`,`day_ID`) USING BTREE,
  KEY `ID_day` (`day_ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='this table has the relation between the TA and his available days';

--
-- Dumping data for table `ta_day`
--

INSERT INTO `ta_day` (`ta_ID`, `day_ID`) VALUES
(2210, 4),
(2001, 5);

-- --------------------------------------------------------

--
-- Table structure for table `week_day`
--

CREATE TABLE IF NOT EXISTS `week_day` (
  `ID` int(1) NOT NULL AUTO_INCREMENT COMMENT 'Day''s ID',
  `name` varchar(20) NOT NULL COMMENT 'Day''s Name',
  PRIMARY KEY (`ID`) USING BTREE,
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 COMMENT='This table contains the days in the week (read only).' AUTO_INCREMENT=7 ;

--
-- Dumping data for table `week_day`
--

INSERT INTO `week_day` (`ID`, `name`) VALUES
(3, 'Monday\r'),
(1, 'Saturday\r'),
(2, 'Sunday\r'),
(6, 'thursday'),
(4, 'Tuesday\r'),
(5, 'Wednesday\r');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `courses`
--
ALTER TABLE `courses`
  ADD CONSTRAINT `class` FOREIGN KEY (`Class_ID`) REFERENCES `classroom` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `exam_day_ID` FOREIGN KEY (`exam_day_ID`) REFERENCES `slots` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `prof` FOREIGN KEY (`C_prof`) REFERENCES `prof` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `TA` FOREIGN KEY (`C_TA`) REFERENCES `ta` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Constraints for table `course_day`
--
ALTER TABLE `course_day`
  ADD CONSTRAINT `course_day` FOREIGN KEY (`day_ID`) REFERENCES `week_day` (`ID`) ON UPDATE CASCADE,
  ADD CONSTRAINT `ID_course` FOREIGN KEY (`crs_ID`) REFERENCES `courses` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `precourses`
--
ALTER TABLE `precourses`
  ADD CONSTRAINT `course_ID` FOREIGN KEY (`crs_ID`) REFERENCES `courses` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `pre_ID` FOREIGN KEY (`pre_ID`) REFERENCES `courses` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `prof_day`
--
ALTER TABLE `prof_day`
  ADD CONSTRAINT `day_id` FOREIGN KEY (`day_ID`) REFERENCES `week_day` (`ID`) ON UPDATE CASCADE,
  ADD CONSTRAINT `ID` FOREIGN KEY (`prof_ID`) REFERENCES `prof` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `slots`
--
ALTER TABLE `slots`
  ADD CONSTRAINT `day ID` FOREIGN KEY (`day_slot_ID`) REFERENCES `week_day` (`ID`) ON UPDATE CASCADE;

--
-- Constraints for table `take_course`
--
ALTER TABLE `take_course`
  ADD CONSTRAINT `crouse` FOREIGN KEY (`crs_ID`) REFERENCES `courses` (`ID`) ON UPDATE CASCADE,
  ADD CONSTRAINT `student` FOREIGN KEY (`std_ID`) REFERENCES `student` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `ta_day`
--
ALTER TABLE `ta_day`
  ADD CONSTRAINT `ID_day` FOREIGN KEY (`day_ID`) REFERENCES `week_day` (`ID`) ON UPDATE CASCADE,
  ADD CONSTRAINT `TA_ID` FOREIGN KEY (`ta_ID`) REFERENCES `ta` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;
