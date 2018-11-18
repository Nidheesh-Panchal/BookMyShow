-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: bms
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cinemahall`
--

DROP TABLE IF EXISTS `cinemahall`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `cinemahall` (
  `challid` int(11) NOT NULL,
  `chname` varchar(45) NOT NULL,
  `chlocation` varchar(45) NOT NULL,
  PRIMARY KEY (`challid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cinemahall`
--

LOCK TABLES `cinemahall` WRITE;
/*!40000 ALTER TABLE `cinemahall` DISABLE KEYS */;
INSERT INTO `cinemahall` VALUES (1,'Raj Mandir','Jaipur'),(2,'WTP','Jaipur'),(3,'Triton Mega Mall','Jaipur'),(4,'Entertainment Paradise','Jaipur'),(5,'Spice Mall','Noida'),(6,'PVR GIP','Noida'),(7,'PVR MOI','Noida'),(8,'Waves CSM','Noida'),(9,'PVR ambience','Faridabad'),(10,'PVR MGF mall','Gurgaon');
/*!40000 ALTER TABLE `cinemahall` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `customer` (
  `username` varchar(25) NOT NULL,
  `password` varchar(45) NOT NULL,
  `emailid` varchar(50) NOT NULL,
  `firstname` varchar(45) NOT NULL,
  `lastname` varchar(45) NOT NULL,
  PRIMARY KEY (`username`),
  UNIQUE KEY `idusername_UNIQUE` (`username`),
  UNIQUE KEY `emailid_UNIQUE` (`emailid`),
  UNIQUE KEY `firstname_UNIQUE` (`firstname`),
  UNIQUE KEY `lastname_UNIQUE` (`lastname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('a','a','2016ume1022@gmail.com','Kushagra','Jajoo'),('Akshita','a','2016ucp1023@mnit.ac.in','Akshita','agrawal'),('f','f','2016ume1010@mnit.ac.in','Rohan','Badiger'),('Nidheesh','n','2016ucp1008@mnit.ac.in','Nidheesh','Panchal'),('Vandita','v','2016ucp1004@mnit.ac.in','Vandita','Goyal');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie`
--

DROP TABLE IF EXISTS `movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `movie` (
  `movieid` int(11) NOT NULL,
  `mname` varchar(45) NOT NULL,
  `mdescription` text NOT NULL,
  `genre` varchar(45) NOT NULL,
  `duration` int(5) NOT NULL,
  PRIMARY KEY (`movieid`),
  UNIQUE KEY `mname_UNIQUE` (`mname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie`
--

LOCK TABLES `movie` WRITE;
/*!40000 ALTER TABLE `movie` DISABLE KEYS */;
INSERT INTO `movie` VALUES (1,'the nun','When a young nun at a cloistered abbey in Romania takes her own life, a priest with a haunted past and a novitiate on the threshold of her final vows are sent by the Vatican to investigate. Together they uncover the order’s unholy secret. Risking not only their lives but their faith and their very souls, they confront a malevolent force in the form of the same demonic nun that first terrorized audiences in “The Conjuring 2,” as the abbey becomes a horrific battleground between the living and the damned.','horror',90),(2,'avengers:infinity war','As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.','action',150),(3,'deadpool 2','Wisecracking mercenary Deadpool battles the evil and powerful Cable and other bad guys to save a boy\'s life.','comedy',90),(4,'black panther','King T\'Challa returns home from America to the reclusive, technologically advanced African nation of Wakanda to serve as his country\'s new leader. However, T\'Challa soon finds that he is challenged for the throne by factions within his own country as well as without. Using powers reserved to Wakandan kings, T\'Challa assumes the Black Panther mantel to join with girlfriend Nakia, the queen-mother, his princess-kid sister, members of the Dora Milaje (the Wakandan \'special forces\') and an American secret agent, to prevent Wakanda from being dragged into a world war.','action',90),(5,'ocean\'s 8','Debbie Ocean, a criminal mastermind, gathers a crew of female thieves to pull off the heist of the century at New York\'s annual Met Gala.','comedy',120),(6,'thor ragnarok','Thor is on the other side of the universe and finds himself in a race against time to get back to Asgard to stop Ragnarok, the prophecy of destruction to his homeworld and the end of Asgardian civilization, at the hands of an all-powerful new threat, the ruthless Hela.','action',120),(7,'the first purge','To push the crime rate below one percent for the rest of the year, the New Founding Fathers of America test a sociological theory that vents aggression for one night in one isolated community. But when the violence of oppressors meets the rage of the others, the contagion will explode from the trial-city borders and spread across the nation.','horror',90),(8,'harry potter and the deathly hallows 2','Harry, Ron and Hermione continue their quest to vanquish the evil Voldemort once and for all. Just as things begin to look hopeless for the young wizards, Harry discovers a trio of magical objects that endow him with powers to rival Voldemort\'s formidable skills.','fantasy',150),(9,'guardians of the galaxy','Light years from Earth, 26 years after being abducted, Peter Quill finds himself the prime target of a manhunt after discovering an orb wanted by Ronan the Accuser.','action',90),(10,'mission impossible fallout','When an IMF mission ends badly, the world is faced with dire consequences. As Ethan Hunt takes it upon himself to fulfil his original briefing, the CIA begin to question his loyalty and his motives. The IMF team find themselves in a race against time, hunted by assassins while trying to prevent a global catastrophe.','action',90);
/*!40000 ALTER TABLE `movie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `payment` (
  `cardno` bigint(16) NOT NULL,
  `cvv` int(3) NOT NULL,
  `cardname` varchar(45) NOT NULL,
  `expirydate` date NOT NULL,
  PRIMARY KEY (`cardno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
INSERT INTO `payment` VALUES (1234567890123456,123,'nidheesh','2019-10-19'),(2345678901234567,234,'akshita','2019-10-19'),(9876543210987654,987,'vandita','2019-10-24');
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `screening`
--

DROP TABLE IF EXISTS `screening`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `screening` (
  `movieid` int(11) NOT NULL,
  `theatreid` int(11) NOT NULL,
  `challid` int(11) NOT NULL,
  `time` int(11) NOT NULL,
  `date` date NOT NULL,
  `noseatbooked` int(11) NOT NULL DEFAULT '0',
  `cost` int(11) NOT NULL,
  PRIMARY KEY (`theatreid`,`challid`,`time`,`date`),
  KEY `challid_idx` (`challid`,`theatreid`),
  KEY `movieidfk_idx` (`movieid`),
  CONSTRAINT `movieid` FOREIGN KEY (`movieid`) REFERENCES `movie` (`movieid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `theatreidfk` FOREIGN KEY (`theatreid`, `challid`) REFERENCES `theatre` (`theatreid`, `challid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `screening`
--

LOCK TABLES `screening` WRITE;
/*!40000 ALTER TABLE `screening` DISABLE KEYS */;
INSERT INTO `screening` VALUES (2,1,1,1200,'2018-10-26',0,350),(2,1,1,1700,'2018-10-23',0,400),(2,1,1,1700,'2018-11-19',0,300),(9,1,1,1800,'2018-11-19',0,120),(1,1,1,2100,'2018-10-01',33,150),(1,1,1,2100,'2018-10-23',0,150),(1,1,1,2100,'2018-10-26',0,150),(1,1,1,2100,'2018-10-28',0,150),(1,1,1,2100,'2018-10-29',1,250),(1,1,1,2100,'2018-11-19',0,150),(1,1,1,2200,'2018-10-01',4,600),(4,1,1,2200,'2018-11-19',0,250),(1,1,1,2300,'2018-10-01',0,250),(1,1,1,2300,'2018-10-23',0,250),(1,1,1,2300,'2018-10-26',0,250),(1,1,1,2300,'2018-10-29',0,150),(1,1,1,2300,'2018-11-19',0,250),(6,1,2,1700,'2018-11-19',0,450),(1,1,2,2000,'2018-11-19',0,150),(2,1,3,1600,'2018-10-26',0,350),(1,1,3,2200,'2018-11-19',0,250),(10,1,4,1700,'2018-11-19',0,200),(4,1,4,2100,'2018-11-19',0,250),(9,2,1,1700,'2018-11-19',0,100),(3,2,1,1800,'2018-11-19',0,350),(1,2,1,2200,'2018-11-19',0,250),(2,2,2,1300,'2018-10-26',0,400),(1,2,2,2100,'2018-10-23',0,150),(1,2,2,2100,'2018-10-26',0,150),(1,2,2,2200,'2018-10-29',0,200),(1,2,2,2300,'2018-10-01',0,250),(3,2,3,1700,'2018-11-19',0,400),(1,2,3,2000,'2018-11-19',0,300),(1,2,3,2100,'2018-10-29',0,180),(1,2,3,2300,'2018-10-29',0,180),(10,2,4,1800,'2018-11-19',0,280),(3,2,4,2000,'2018-11-19',0,450),(1,2,4,2300,'2018-11-19',0,400),(2,3,1,1600,'2018-11-19',0,350),(6,3,1,1800,'2018-11-19',0,300),(3,3,1,2100,'2018-11-19',0,400),(7,3,2,1600,'2018-11-19',0,160),(1,3,2,2000,'2018-10-01',0,150),(3,3,2,2000,'2018-11-19',0,400),(1,3,2,2200,'2018-10-01',0,250),(1,3,2,2300,'2018-10-29',0,200),(4,3,2,2300,'2018-11-19',0,100),(8,3,3,1500,'2018-11-19',0,300),(3,3,3,1600,'2018-11-19',0,350),(8,3,3,1800,'2018-11-19',0,400),(2,3,3,1900,'2018-11-19',0,350),(1,3,3,2000,'2018-10-01',0,150),(4,3,3,2000,'2018-11-19',0,200),(6,3,3,2100,'2018-11-19',0,200),(1,3,3,2200,'2018-10-01',0,250),(5,3,3,2300,'2018-11-19',0,140),(2,3,4,1900,'2018-11-19',0,200),(5,4,1,2100,'2018-11-19',0,130),(4,4,1,2300,'2018-11-19',0,190),(5,4,2,2000,'2018-11-19',0,120),(5,4,4,1600,'2018-11-19',0,180),(6,4,4,1800,'2018-11-19',0,500),(2,4,4,2100,'2018-11-19',0,400),(3,4,4,2200,'2018-11-19',0,300),(4,4,4,2300,'2018-11-19',0,120),(2,5,2,1800,'2018-11-19',0,300),(5,5,2,1930,'2018-11-19',0,120),(4,5,2,2000,'2018-11-19',0,100),(6,6,2,1900,'2018-11-19',0,450),(2,6,2,2000,'2018-11-19',0,200),(7,6,2,2200,'2018-11-19',0,700);
/*!40000 ALTER TABLE `screening` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `theatre`
--

DROP TABLE IF EXISTS `theatre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `theatre` (
  `theatreid` int(11) NOT NULL,
  `challid` int(11) NOT NULL,
  `noseats` int(11) NOT NULL DEFAULT '49',
  PRIMARY KEY (`theatreid`,`challid`),
  KEY `challid_idx` (`challid`),
  CONSTRAINT `challid` FOREIGN KEY (`challid`) REFERENCES `cinemahall` (`challid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `theatre`
--

LOCK TABLES `theatre` WRITE;
/*!40000 ALTER TABLE `theatre` DISABLE KEYS */;
INSERT INTO `theatre` VALUES (1,1,64),(1,2,64),(1,3,64),(1,4,64),(1,5,64),(1,6,64),(1,7,64),(1,8,64),(1,9,64),(1,10,64),(2,1,64),(2,2,64),(2,3,64),(2,4,64),(2,5,64),(2,6,64),(2,7,64),(2,8,64),(2,9,64),(2,10,64),(3,1,64),(3,2,64),(3,3,64),(3,4,64),(3,5,64),(3,6,64),(3,7,64),(3,8,64),(3,9,64),(3,10,64),(4,1,64),(4,2,64),(4,4,64),(4,5,64),(4,6,64),(4,7,64),(4,9,64),(4,10,64),(5,2,64),(5,4,64),(5,6,64),(5,9,64),(5,10,64),(6,2,64),(6,4,64),(6,6,64),(7,6,64);
/*!40000 ALTER TABLE `theatre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ticket` (
  `username` varchar(25) NOT NULL,
  `theatreid` int(11) NOT NULL,
  `challid` int(11) NOT NULL,
  `time` int(4) NOT NULL,
  `date` date NOT NULL,
  `seatno` varchar(2) NOT NULL,
  PRIMARY KEY (`theatreid`,`challid`,`time`,`date`,`seatno`),
  KEY `usernamefk_idx` (`username`),
  CONSTRAINT `theatreidfk1` FOREIGN KEY (`theatreid`, `challid`, `time`, `date`) REFERENCES `screening` (`theatreid`, `challid`, `time`, `date`),
  CONSTRAINT `usernamefk` FOREIGN KEY (`username`) REFERENCES `customer` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket`
--

LOCK TABLES `ticket` WRITE;
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
INSERT INTO `ticket` VALUES ('a',1,1,2100,'2018-10-01','a1'),('a',1,1,2100,'2018-10-01','a2'),('a',1,1,2100,'2018-10-01','a3'),('a',1,1,2100,'2018-10-01','a4'),('a',1,1,2100,'2018-10-01','a5'),('a',1,1,2100,'2018-10-01','a6'),('a',1,1,2100,'2018-10-01','a7'),('a',1,1,2100,'2018-10-01','a8'),('vandita',1,1,2100,'2018-10-29','a1');
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-19  0:12:57
