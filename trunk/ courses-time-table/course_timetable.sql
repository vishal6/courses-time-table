-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 03, 2011 at 11:00 AM
-- Server version: 5.1.56
-- PHP Version: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

create database course_timetable;
use course_timetable;
--
-- Database: `course_timetable`
--

-- --------------------------------------------------------

--
-- Table structure for table `classroom`
--

CREATE TABLE IF NOT EXISTS `classroom` (
  `ID` int(6) NOT NULL COMMENT 'Class Room ID',
  `Deprtment_name` varchar(50) DEFAULT NULL COMMENT 'Class Room Department',
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
  `ID` int(5) NOT NULL,
  `name` varchar(50) DEFAULT NULL COMMENT 'Course Name',
  `Lab_HRs` int(2) DEFAULT '2' COMMENT 'Course laboratory Hours',
  `lec_HRs` int(2) NOT NULL DEFAULT '2' COMMENT 'Course lecture Hours',
  `sec_HRs` int(2) NOT NULL DEFAULT '2' COMMENT 'Course section HRs',
  `C_prof` int(4) DEFAULT NULL COMMENT 'professor ID that teach that course',
  `Year` year(4) DEFAULT NULL COMMENT 'course start year',
  PRIMARY KEY (`ID`),
  KEY `prof` (`C_prof`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Courses Table';

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`ID`, `name`, `Lab_HRs`, `lec_HRs`, `sec_HRs`, `C_prof`, `Year`) VALUES
(11111, 'software', 10, 14, 12, 1111, 1995),
(12345, 'algorithm', 10, 14, 12, 1234, 1995);

-- --------------------------------------------------------

--
-- Table structure for table `course_ta`
--

CREATE TABLE IF NOT EXISTS `course_ta` (
  `ID` int(5) NOT NULL COMMENT 'student ID',
  `TA_ID` int(4) NOT NULL COMMENT 'start year',
  PRIMARY KEY (`ID`) USING BTREE,
  KEY `TA_ID` (`TA_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='This table contains the course TA';

--
-- Dumping data for table `course_ta`
--

INSERT INTO `course_ta` (`ID`, `TA_ID`) VALUES
(11111, 2001),
(12345, 2210);

-- --------------------------------------------------------

--
-- Table structure for table `exam`
--

CREATE TABLE IF NOT EXISTS `exam` (
  `ID_Course` int(5) NOT NULL COMMENT 'THE EXAM course id',
  `Date` date DEFAULT NULL,
  `Time` time DEFAULT NULL,
  `Class_ID` int(5) DEFAULT NULL,
  PRIMARY KEY (`ID_Course`),
  KEY `Class_ID` (`Class_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='This table contains the Data of the Exams of all courses.';

-- --------------------------------------------------------

--
-- Table structure for table `graduated_students`
--

CREATE TABLE IF NOT EXISTS `graduated_students` (
  `ID` int(4) NOT NULL COMMENT 'student ID',
  `Year` year(4) NOT NULL COMMENT 'Graduation year\n Name',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='This table contains the Graduated students';

--
-- Dumping data for table `graduated_students`
--

INSERT INTO `graduated_students` (`ID`, `Year`) VALUES
(3001, 1998),
(3002, 2003);

-- --------------------------------------------------------

--
-- Table structure for table `person`
--

CREATE TABLE IF NOT EXISTS `person` (
  `ID` int(4) NOT NULL COMMENT 'person ID ',
  `first_name` varchar(50) DEFAULT NULL COMMENT ' first name',
  `last_name` varchar(50) DEFAULT NULL COMMENT ' last name',
  `password` int(6) NOT NULL DEFAULT '123456' COMMENT 'Account password',
  `Gender` char(1) DEFAULT 'm' COMMENT 'person Gender',
  `Phone` int(8) DEFAULT NULL COMMENT 'Person phone',
  `Mobile` int(11) DEFAULT NULL COMMENT 'Person mobile',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Person data';

--
-- Dumping data for table `person`
--

INSERT INTO `person` (`ID`, `first_name`, `last_name`, `password`, `Gender`, `Phone`, `Mobile`) VALUES
(1001, 'Mahmoud', 'Shokr', 123456, 'm', 22038938, 1115348800),
(1111, 'mohsen', 'ahmed', 111111, 'm', 87654321, 1022541963),
(1234, 'rabie', 'ramdan', 123456, 'm', 12345678, NULL),
(2001, 'Tarek', 'Osama', 123456, 'm', 12345678, 1114269031),
(2210, 'mahmoud', 'hmed', 111111, 'm', 33333333, NULL),
(3001, 'Mahmoud', 'Nabil', 123456, 'm', 12345678, 1271118424),
(3002, 'Mohamad', 'Nour', 123456, 'm', 33043098, 1220302926),
(3003, 'ahmed', 'fathy', 123456, 'm', NULL, NULL),
(3004, 'hossam', 'zaki', 123456, 'm', NULL, NULL),
(9000, 'Ahmad', 'Mostafa', 123456, m, 12345678, 01008765994);

-- --------------------------------------------------------

--
-- Table structure for table `precourses`
--

CREATE TABLE IF NOT EXISTS `precourses` (
  `crs_ID` int(5) NOT NULL COMMENT 'Course ID',
  `pre_ID` int(5) NOT NULL COMMENT 'Pre-request course Name',
  PRIMARY KEY (`crs_ID`,`pre_ID`),
  KEY `pre_ID` (`pre_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='this table contains the pre-request courses for such a cours';

--
-- Dumping data for table `precourses`
--

INSERT INTO `precourses` (`crs_ID`, `pre_ID`) VALUES
(12345, 11111);

-- --------------------------------------------------------

--
-- Table structure for table `prof_day`
--

CREATE TABLE IF NOT EXISTS `prof_day` (
  `prof_ID` int(4) NOT NULL COMMENT 'professor ID ',
  `day_ID` int(1) NOT NULL COMMENT 'Day ID',
  PRIMARY KEY (`prof_ID`,`day_ID`) USING BTREE,
  KEY `day_id` (`day_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='this table has the relation between the professor and his av';

--
-- Dumping data for table `prof_day`
--

INSERT INTO `prof_day` (`prof_ID`, `day_ID`) VALUES
(1234, 1),
(1234, 3),
(1111, 6);

-- --------------------------------------------------------

--
-- Table structure for table `take_course`
--

CREATE TABLE IF NOT EXISTS `take_course` (
  `std_ID` int(4) NOT NULL COMMENT 'Student ID',
  `crs_ID` int(5) NOT NULL COMMENT 'Course ID',
  PRIMARY KEY (`std_ID`,`crs_ID`),
  KEY `crouse` (`crs_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='this table has the relation between the student and courses';

--
-- Dumping data for table `take_course`
--

INSERT INTO `take_course` (`std_ID`, `crs_ID`) VALUES
(3002, 11111),
(3001, 12345);

-- --------------------------------------------------------

--
-- Table structure for table `ta_day`
--

CREATE TABLE IF NOT EXISTS `ta_day` (
  `ta_ID` int(4) NOT NULL COMMENT 'TA ID',
  `day_ID` int(1) NOT NULL COMMENT 'Day ID',
  PRIMARY KEY (`ta_ID`,`day_ID`) USING BTREE,
  KEY `ID_day` (`day_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='this table has the relation between the TA and his available';

--
-- Dumping data for table `ta_day`
--

INSERT INTO `ta_day` (`ta_ID`, `day_ID`) VALUES
(2210, 4),
(2001, 5);

-- --------------------------------------------------------

--
-- Table structure for table `timetable`
--

CREATE TABLE IF NOT EXISTS `timetable` (
  `Slot_ID` int(3) NOT NULL COMMENT 'Slot ID refers to slot number',
  `day_slot_ID` int(1) NOT NULL COMMENT 'day slot',
  `class_ID1` int(6) NOT NULL COMMENT 'room ID',
  `Course_ID1` int(5) NOT NULL COMMENT 'course ID',
  PRIMARY KEY (`Slot_ID`,`day_slot_ID`,`class_ID1`),
  KEY `1` (`day_slot_ID`),
  KEY `2` (`class_ID1`),
  KEY `3` (`Course_ID1`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='the timetable';

--
-- Dumping data for table `timetable`
--

INSERT INTO `timetable` (`Slot_ID`, `day_slot_ID`, `class_ID1`, `Course_ID1`) VALUES
(3, 1, 307701, 11111),
(4, 1, 207701, 11111),
(5, 1, 207701, 11111),
(6, 1, 207701, 11111),
(1, 1, 307701, 12345),
(2, 1, 307701, 12345);

-- --------------------------------------------------------

--
-- Table structure for table `undergraduate_students`
--

CREATE TABLE IF NOT EXISTS `undergraduate_students` (
  `ID` int(4) NOT NULL COMMENT 'student ID',
  `Year` year(4) NOT NULL COMMENT 'start year',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='This table contains the undergraduate students';

--
-- Dumping data for table `undergraduate_students`
--

INSERT INTO `undergraduate_students` (`ID`, `Year`) VALUES
(3003, 2010),
(3004, 2011);

-- --------------------------------------------------------

--
-- Table structure for table `week_day`
--

CREATE TABLE IF NOT EXISTS `week_day` (
  `ID` int(1) NOT NULL COMMENT 'Day ID',
  `name` varchar(20) NOT NULL COMMENT 'DayName',
  PRIMARY KEY (`ID`) USING BTREE,
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='This table contains the days in the week (read only).';

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
  ADD CONSTRAINT `prof` FOREIGN KEY (`C_prof`) REFERENCES `person` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Constraints for table `course_ta`
--
ALTER TABLE `course_ta`
  ADD CONSTRAINT `Course_ID2` FOREIGN KEY (`ID`) REFERENCES `courses` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `TA_ID2` FOREIGN KEY (`TA_ID`) REFERENCES `person` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `exam`
--
ALTER TABLE `exam`
  ADD CONSTRAINT `courseID` FOREIGN KEY (`ID_Course`) REFERENCES `courses` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Class_ID` FOREIGN KEY (`Class_ID`) REFERENCES `classroom` (`ID`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Constraints for table `graduated_students`
--
ALTER TABLE `graduated_students`
  ADD CONSTRAINT `Graduated_student_ID` FOREIGN KEY (`ID`) REFERENCES `person` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

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
  ADD CONSTRAINT `day_id` FOREIGN KEY (`day_ID`) REFERENCES `week_day` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ID` FOREIGN KEY (`prof_ID`) REFERENCES `person` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `take_course`
--
ALTER TABLE `take_course`
  ADD CONSTRAINT `crouse` FOREIGN KEY (`crs_ID`) REFERENCES `courses` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `student` FOREIGN KEY (`std_ID`) REFERENCES `person` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `ta_day`
--
ALTER TABLE `ta_day`
  ADD CONSTRAINT `ID_day` FOREIGN KEY (`day_ID`) REFERENCES `week_day` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `TA_ID` FOREIGN KEY (`ta_ID`) REFERENCES `person` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `timetable`
--
ALTER TABLE `timetable`
  ADD CONSTRAINT `1` FOREIGN KEY (`day_slot_ID`) REFERENCES `week_day` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `2` FOREIGN KEY (`class_ID1`) REFERENCES `classroom` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `3` FOREIGN KEY (`Course_ID1`) REFERENCES `courses` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `undergraduate_students`
--
ALTER TABLE `undergraduate_students`
  ADD CONSTRAINT `StudentID` FOREIGN KEY (`ID`) REFERENCES `person` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
