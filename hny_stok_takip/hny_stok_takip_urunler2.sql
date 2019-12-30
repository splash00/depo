-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: hny_stok_takip
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `urunler2`
--

DROP TABLE IF EXISTS `urunler2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `urunler2` (
  `sira_no` int(11) NOT NULL AUTO_INCREMENT,
  `kategori` varchar(100) DEFAULT NULL,
  `barkod_no` int(11) NOT NULL,
  `urun_ad` varchar(100) DEFAULT NULL,
  `urun_ut` varchar(100) DEFAULT NULL,
  `urun_stt` varchar(100) DEFAULT NULL,
  `urun_gramaj` varchar(100) DEFAULT NULL,
  `satis_fiyati` varchar(100) DEFAULT NULL,
  `urun_adeti` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`barkod_no`),
  UNIQUE KEY `sira_no_UNIQUE` (`sira_no`),
  UNIQUE KEY `barkod_no_UNIQUE` (`barkod_no`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `urunler2`
--

LOCK TABLES `urunler2` WRITE;
/*!40000 ALTER TABLE `urunler2` DISABLE KEYS */;
INSERT INTO `urunler2` VALUES (1,'1- Çikolata',110101,'HNY antep fıstıklı kalıp çikolata ',' 02/11/2019 ',' 02/04/2020 ','80 gr ','4.00','600'),(2,'1- Çikolata',110102,'HNY  fındıklı kalıp çikolata','02/11/2019','02/04/2020','80 gr','3.75','750'),(3,'1- Çikolata',110103,'HNY  sütlü kalıp çikolata','02/11/2019','02/04/2020','80 gr','3.00','500'),(4,'1- Çikolata',110104,'HNY  bitter kalıp çikolata','02/11/2019','02/04/2020','80 gr','3.00','900'),(5,'1- Çikolata',110201,'HNY çokolobbadanak gofret','02/11/2019','02/04/2020','35 gr','1.29','360'),(6,'1- Çikolata',110202,'HNY hawai çikolatalı gofret','02/11/2019','02/04/2020','48 gr','1.80','10'),(7,'1- Çikolata',110203,'HNY kaçak-kat çikolatalı gofret','02/11/2019','02/04/2020','65 gr','2.75','460'),(8,'1- Çikolata',110204,'HNY lezzet küpü kakaolu gofret','02/11/2019','02/04/2020','120 gr','3.25','180'),(9,'1- Çikolata',110301,'HNY minimisket draje çikolata','02/11/2019','02/04/2020','100 gr','4.25','250'),(10,'1- Çikolata',110302,'HNY bonbon meyve aromalı draje','02/11/2019','02/04/2020','90 gr','2.50','400'),(11,'1- Çikolata',110303,'HNY çokotop ahududu draje','02/11/2019','02/04/2020','60 gr','3.25','400'),(12,'1- Çikolata',110304,'HNY çokotop portakal draje','02/11/2019','02/04/2020','60 gr','3.25','300'),(13,'1- Çikolata',110401,'HNY sür-ye x6 sür. çikolata','02/11/2019','02/04/2020','120 gr','5.00','90'),(14,'1- Çikolata',110402,'HNY ailemix cam kavanoz sür. çikolata','02/11/2019','02/04/2020','650 gr','17.90','130'),(15,'2- Kek / Bisküvi',220101,'HNY portakallı meyveli kek','02/11/2019','02/04/2020','50 gr','1.25','740'),(16,'2- Kek / Bisküvi',220102,'HNY üzümlü meyveli kek','02/11/2019','02/04/2020','50 gr','1.25','500'),(17,'2- Kek / Bisküvi',220103,'HNY incirli meyveki kek','02/11/2019','02/04/2020','50 gr','1.25','590'),(18,'2- Kek / Bisküvi',220201,'HNY lop kek çikolatalı','02/11/2019','02/04/2020','70 gr','2.00','250'),(19,'2- Kek / Bisküvi',220202,'HNY lop kek muzlu','02/11/2019','02/04/2020','70 gr','2.00','250'),(20,'2- Kek / Bisküvi',220203,'HNY lop kek vişneli','02/11/2019','02/04/2020','70 gr','2.00','200'),(21,'2- Kek / Bisküvi',220301,'HNY yoldaş üzümlü 1 dilim kek','02/11/2019','02/04/2020','25 gr','1.00','60'),(22,'2- Kek / Bisküvi',220302,'HNY yoldaş sade 1 dilim kek','02/11/2019','02/04/2020','25 gr','1.00','100'),(23,'2- Kek / Bisküvi',220303,'HNY yoldaş çat kapı 10 dilim paket','02/11/2019','02/04/2020','200 gr','4.95','177'),(24,'2- Kek / Bisküvi',220401,'HNY nam-nam çokodamla kurabiye','02/11/2019','02/04/2020','95 gr','2.25','250'),(25,'2- Kek / Bisküvi',220402,'HNY canım anam paket kurabiye','02/11/2019','02/04/2020','140 gr','3.95','180'),(26,'2- Kek / Bisküvi',220501,'HNY pettie beurre sütlü bisküvi x5','02/11/2019','02/04/2020','1000 gr','6.00','400'),(27,'2- Kek / Bisküvi',220502,'HNY pettie beurre kakaolu  bisküvi x5','02/11/2019','02/04/2020','1000 gr','6.00','400'),(30,'2- Kek / Bisküvi',220601,'HNY kedipati portakal jolelli bisküvi','02/11/2019','02/04/2020','45 gr','1.25','320'),(31,'2- Kek / Bisküvi',220602,'HNY olley marhmellowlu  bisküvi','02/11/2019','02/04/2020','40 gr','1.50','150'),(32,'3- Soğuk Gıda',330101,'HNY buz burger çikolatalı','02/11/2019','02/04/2020','60 gr','1.75','50'),(34,'3- Soğuk Gıda',330102,'HNY buz burger sütlü','02/11/2019','02/04/2020','60 gr','1.75','80'),(35,'3- Soğuk Gıda',330201,'HNY kayısı meyveli yoğurt','02/11/2019','02/04/2020','300 gr','4.50','180'),(36,'3- Soğuk Gıda',330202,'HNY orman meyveli yoğurt','02/11/2019','02/04/2020','300 gr','4.50','180'),(38,'3- Soğuk Gıda',330203,'HNY çilekli meyveli yoğurt','02/11/2019','02/04/2020','300 gr','4.50','180'),(39,'3- Soğuk Gıda',330301,'HNY yaz rüyası vanilya külah dondurma','02/11/2019','02/04/2020','90 ml','3.75','10'),(40,'3- Soğuk Gıda',330302,'HNY yaz rüyası vişne külah dondurma','02/11/2019','02/04/2020','90 ml','3.75','10'),(41,'3- Soğuk Gıda',330303,'HNY yaz rüyası kakao külah dondurma','02/11/2019','02/04/2020','90 ml','3.75','10'),(42,'3- Soğuk Gıda',330401,'HNY nice yaşlara 5 kişilik kakaolu pasta','02/11/2019','02/04/2020','700 gr','16.50','120'),(43,'3- Soğuk Gıda',330402,'HNY nice yaşlara 5 kişilik meyveli pasta','02/11/2019','02/04/2020','700 gr','16.50','120'),(44,'4- Kraker',440101,'HNY çıtırdak tuzlu çubuk kraker','02/11/2019','02/04/2020','70 gr','1.75','500'),(45,'4- Kraker',440102,'HNY çıtırdak peynirli çubuk kraker','02/11/2019','02/04/2020','70 gr','1.75','500'),(46,'4- Kraker',440103,'HNY çıtırdak acılı çubuk kraker','02/11/2019','02/04/2020','70 gr','1.75','500'),(47,'4- Kraker',440104,'HNY çıtırdak baharatlı çubuk kraker','02/11/2019','02/04/2020','70 gr','1.75','500');
/*!40000 ALTER TABLE `urunler2` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-30 16:45:31
