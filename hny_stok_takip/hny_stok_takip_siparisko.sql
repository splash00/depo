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
-- Table structure for table `siparisko`
--

DROP TABLE IF EXISTS `siparisko`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `siparisko` (
  `siparis_no` int(11) NOT NULL AUTO_INCREMENT,
  `siparis_tarihi` varchar(15) NOT NULL,
  `musteri_no` int(11) NOT NULL,
  `musteri_ad` varchar(45) NOT NULL,
  `musteri_soyad` varchar(45) NOT NULL,
  `barkod_no` int(11) NOT NULL,
  `urun_ad` varchar(100) NOT NULL,
  `ali_adet` int(11) NOT NULL,
  `tutar` double NOT NULL,
  PRIMARY KEY (`siparis_no`)
) ENGINE=InnoDB AUTO_INCREMENT=112244 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `siparisko`
--

LOCK TABLES `siparisko` WRITE;
/*!40000 ALTER TABLE `siparisko` DISABLE KEYS */;
INSERT INTO `siparisko` VALUES (112233,'29/12/2019',10001,'Fazıl ','Say',220103,'HNY incirli meyveki kek',310,387.5),(112234,'29/12/2019',10002,'Aziz','Nesin',110302,'HNY bonbon meyve aromalı draje',160,400),(112235,'29/12/2019',10003,'Nazım Hikmet ','Ran',220301,'HNY yoldaş üzümlü 1 dilim kek',40,40),(112236,'29/12/2019',10004,'Vecihi','Hürküş',330102,'HNY buz burger sütlü',20,35),(112237,'29/12/2019',10005,'Cem ','Karaca',110402,'HNY ailemix cam kavanoz sür. çikolata',60,1074),(112238,'29/12/2019',10006,'Barış ','Manço',110101,'HNY antep fıstıklı kalıp çikolata ',200,800),(112239,'29/12/2019',10007,'Ajda','Pekkan',110203,'HNY kaçak-kat çikolatalı gofret',90,247.5),(112240,'29/12/2019',10008,'Ozan ','Tufan',220402,'HNY canım anam paket kurabiye',70,276.5),(112241,'29/12/2019',10009,'William ','Shakespeare',220602,'HNY olley marhmellowlu  bisküvi',150,225),(112243,'29/12/2019',10053,'Şeyma','Subaşı',110202,'HNY hawai çikolatalı gofret',70,126);
/*!40000 ALTER TABLE `siparisko` ENABLE KEYS */;
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
