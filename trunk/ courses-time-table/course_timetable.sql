SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

CREATE SCHEMA IF NOT EXISTS `course_timetable` DEFAULT CHARACTER SET latin1 ;
USE `course_timetable` ;

-- -----------------------------------------------------
-- Table `course_timetable`.`classroom`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `course_timetable`.`classroom` (
  `ID` INT(6) NOT NULL COMMENT 'Class Room ID' ,
  `Deprtment_name` VARCHAR(50) NULL DEFAULT NULL COMMENT 'Class Room Department' ,
  PRIMARY KEY (`ID`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1, 
COMMENT = 'Class Room Table' ;


-- -----------------------------------------------------
-- Table `course_timetable`.`week_day`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `course_timetable`.`week_day` (
  `ID` INT(1) NOT NULL  COMMENT 'Day ID' ,
  `name` VARCHAR(20) NOT NULL COMMENT 'DayName' ,
  PRIMARY KEY USING BTREE (`ID`) ,
   UNIQUE INDEX `name` (`name` ASC) )
ENGINE = InnoDB

DEFAULT CHARACTER SET = latin1, 
COMMENT = 'This table contains the days in the week (read only).' ;


-- -----------------------------------------------------
-- Table `course_timetable`.`person`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `course_timetable`.`person` (
  `ID` INT(4) NOT NULL COMMENT 'person ID ' ,
  `first_name` VARCHAR(50) NULL DEFAULT NULL COMMENT ' first name' ,
  `last_name` VARCHAR(50) NULL DEFAULT NULL COMMENT ' last name' ,
  `password` INT(6) NOT NULL DEFAULT '123456' COMMENT 'Account password' ,
  `Gender` CHAR(1) NULL DEFAULT 'm' COMMENT 'person Gender' ,
  `Phone` INT(8) NULL DEFAULT NULL COMMENT 'Person phone' ,
  `Mobile` INT(11) NULL DEFAULT NULL COMMENT 'Person mobile' ,
  PRIMARY KEY (`ID`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1, 
COMMENT = 'Person data' ;


-- -----------------------------------------------------
-- Table `course_timetable`.`courses`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `course_timetable`.`courses` (
  `ID` INT(5) NOT NULL ,
  `name` VARCHAR(50) NULL DEFAULT NULL COMMENT 'Course Name' ,
  `Lab_HRs` INT(2) NULL DEFAULT '2' COMMENT 'Course laboratory Hours' ,
  `lec_HRs` INT(2) NOT NULL DEFAULT '2' COMMENT 'Course lecture Hours' ,
  `sec_HRs` INT(2) NOT NULL DEFAULT '2' COMMENT 'Course section HRs' ,
  `C_prof` INT(4) NULL DEFAULT NULL COMMENT 'professor ID that teach that course' ,
  `C_TA` INT(4) NULL DEFAULT NULL COMMENT 'TA ID that teach that course' ,

  `Year` YEAR NULL COMMENT 'course start year' ,
  PRIMARY KEY (`ID`) ,
   INDEX `prof` (`C_prof` ASC) ,

  
 CONSTRAINT `prof`
    FOREIGN KEY (`C_prof`  )
    REFERENCES `course_timetable`.`person` (`ID` )
    ON DELETE SET NULL
    ON UPDATE CASCADE,

  CONSTRAINT `TA`
    FOREIGN KEY (`C_TA` )
    REFERENCES `course_timetable`.`person` (`ID` )
    ON DELETE SET NULL
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1, 
COMMENT = 'Courses Table' ;






-- -----------------------------------------------------
-- Table `course_timetable`.`precourses`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `course_timetable`.`precourses` (
  `crs_ID` INT(5) NOT NULL COMMENT 'Course ID' ,
  `pre_ID` INT(5) NOT NULL COMMENT 'Pre-request course Name' ,
  PRIMARY KEY (`crs_ID`, `pre_ID`) ,
   
  CONSTRAINT `course_ID`
    FOREIGN KEY (`crs_ID` )
    REFERENCES `course_timetable`.`courses` (`ID` )
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `pre_ID`
    FOREIGN KEY (`pre_ID` )
    REFERENCES `course_timetable`.`courses` (`ID` )
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1, 
COMMENT = 'this table contains the pre-request courses for such a cours' ;


-- -----------------------------------------------------
-- Table `course_timetable`.`prof_day`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `course_timetable`.`prof_day` (
  `prof_ID` INT(4) NOT NULL COMMENT 'professor ID ' ,
  `day_ID` INT(1) NOT NULL COMMENT 'Day ID' ,
  PRIMARY KEY USING BTREE (`prof_ID`, `day_ID`) ,

  CONSTRAINT `day_id`
    FOREIGN KEY (`day_ID` )
    REFERENCES `course_timetable`.`week_day` (`ID` )
      ON DELETE CASCADE  
  ON UPDATE CASCADE,
  CONSTRAINT `ID`
    FOREIGN KEY (`prof_ID` )
    REFERENCES `course_timetable`.`person` (`ID` )
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1, 
COMMENT = 'this table has the relation between the professor and his av' ;


-- -----------------------------------------------------
-- Table `course_timetable`.`ta_day`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `course_timetable`.`ta_day` (
  `ta_ID` INT(4) NOT NULL COMMENT 'TA ID' ,
  `day_ID` INT(1) NOT NULL COMMENT 'Day ID' ,
  PRIMARY KEY USING BTREE (`ta_ID`, `day_ID`) ,
 
  CONSTRAINT `ID_day`
    FOREIGN KEY (`day_ID` )
    REFERENCES `course_timetable`.`week_day` (`ID` )
       ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `TA_ID`
    FOREIGN KEY (`ta_ID` )
    REFERENCES `course_timetable`.`person` (`ID` )
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1, 
COMMENT = 'this table has the relation between the TA and his available' ;


-- -----------------------------------------------------
-- Table `course_timetable`.`take_course`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `course_timetable`.`take_course` (
  `std_ID` INT(4) NOT NULL COMMENT 'Student ID' ,
  `crs_ID` INT(5) NOT NULL COMMENT 'Course ID' ,
  PRIMARY KEY (`std_ID`, `crs_ID`) ,
 
  CONSTRAINT `crouse`
    FOREIGN KEY (`crs_ID` )
    REFERENCES `course_timetable`.`courses` (`ID` )
   
    ON DELETE CASCADE 
   ON UPDATE CASCADE,
  CONSTRAINT `student`
    FOREIGN KEY (`std_ID` )
    REFERENCES `course_timetable`.`person` (`ID` )
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1, 
COMMENT = 'this table has the relation between the student and courses' ;


-- -----------------------------------------------------
-- Table `course_timetable`.`Exam`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `course_timetable`.`Exam` (
  `ID_Course` INT(5) NOT NULL COMMENT 'THE EXAM course id' ,
  `Date` DATE NULL ,
  `Time` TIME NULL ,
  `Class_ID` INT(5) NULL ,
  PRIMARY KEY (`ID_Course`) ,
  
  CONSTRAINT `courseID`
    FOREIGN KEY (`ID_Course` )
    REFERENCES `course_timetable`.`courses` (`ID` )
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `Class_ID`
    FOREIGN KEY (`Class_ID` )
    REFERENCES `course_timetable`.`classroom` (`ID` )
    ON DELETE SET NULL
    ON UPDATE CASCADE)
ENGINE = InnoDB

DEFAULT CHARACTER SET = latin1, 
COMMENT = 'This table contains the Data of the Exams of all courses.' ;


-- -----------------------------------------------------
-- Table `course_timetable`.`Undergraduate_students`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `course_timetable`.`Undergraduate_students` (
  `ID` INT(4) NOT NULL COMMENT 'student ID' ,
  `Year` YEAR NOT NULL COMMENT 'start year' ,
  PRIMARY KEY USING BTREE (`ID`) ,
  
CONSTRAINT `StudentID`
    FOREIGN KEY (`ID` )
    REFERENCES `course_timetable`.`person` (`ID` )
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB

DEFAULT CHARACTER SET = latin1, 
COMMENT = 'This table contains the undergraduate students' ;


-- -----------------------------------------------------
-- Table `course_timetable`.`Graduated_Students`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `course_timetable`.`Graduated_Students` (
  `ID` INT(4) NOT NULL COMMENT 'student ID' ,
  `Year` YEAR NOT NULL COMMENT 'Graduation year\n Name' ,
  PRIMARY KEY USING BTREE (`ID`) ,

  CONSTRAINT `Graduated_student_ID`
    FOREIGN KEY (`ID` )
    REFERENCES `course_timetable`.`person` (`ID` )
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1, 
COMMENT = 'This table contains the Graduated students' ;

-- -----------------------------------------------------
-- Table `course_timetable`.`timetable`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `course_timetable`.`timetable` (
  `Slot_ID` INT(3) NOT NULL COMMENT 'Slot ID refers to slot number' ,
  `day_slot_ID` INT(1) NOT NULL COMMENT 'day slot' ,
  `class_ID1` INT(6) NOT NULL COMMENT 'room ID' ,
  `Course_ID1` INT(5) NOT NULL COMMENT 'course ID' ,
  PRIMARY KEY (`Slot_ID`, `day_slot_ID`, `class_ID1`) ,
CONSTRAINT `1`
    FOREIGN KEY (`day_slot_ID` )
    REFERENCES `course_timetable`.`week_day` (`ID` )
    ON DELETE CASCADE 
   ON UPDATE CASCADE,
  CONSTRAINT `2`
    FOREIGN KEY (`class_ID1` )
    REFERENCES `course_timetable`.`classroom` (`ID` )
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `3`
    FOREIGN KEY (`Course_ID1` )
    REFERENCES `course_timetable`.`courses` (`ID` )
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1, 
COMMENT = 'the timetable' ;




SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
