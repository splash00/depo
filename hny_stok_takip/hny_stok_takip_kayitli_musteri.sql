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
-- Table structure for table `kayitli_musteri`
--

DROP TABLE IF EXISTS `kayitli_musteri`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kayitli_musteri` (
  `musteri_no` int(11) NOT NULL AUTO_INCREMENT,
  `giris_kimlik` varchar(45) NOT NULL,
  `giris_sifre` varchar(45) NOT NULL,
  `musteri_ad` varchar(45) NOT NULL,
  `musteri_soyad` varchar(45) NOT NULL,
  `musteri_telefon` varchar(45) NOT NULL,
  `musteri_eposta` varchar(45) NOT NULL,
  PRIMARY KEY (`musteri_no`),
  UNIQUE KEY `giris_kimlik_UNIQUE` (`giris_kimlik`)
) ENGINE=InnoDB AUTO_INCREMENT=10011 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kayitli_musteri`
--

LOCK TABLES `kayitli_musteri` WRITE;
/*!40000 ALTER TABLE `kayitli_musteri` DISABLE KEYS */;
INSERT INTO `kayitli_musteri` VALUES (10001,'fazılsay','9874165','Fazıl ','Say','5563215624','say_fazil@gmail.com'),(10002,'nesin','1475369','Aziz','Nesin','5532169851','nesi_aziz@gmail.com'),(10003,'ranran','14789653','Nazım Hikmet ','Ran','5523216354','ran_nazim09@gmail.com'),(10004,'hurkus','3695147','Vecihi','Hürküş','5061289654','hurkus-54@gmail.com'),(10005,'karaca','741953','Cem ','Karaca','5074459632','karaca_cem@gmail.com'),(10006,'manco','1475963','Barış ','Manço','5067531264','manco-bey@gmail.com'),(10007,'pekkan','14863','Ajda','Pekkan','5094267512','pekkan-hanim@gmail.com'),(10008,'tufan','258789','Ozan ','Tufan','5556374529','tufan-ozan@gmail.com'),(10009,'shake','9875321','William ','Shakespeare','5584523698','wii-i-am@gmail.com'),(10010,'acunn','9875321','Şeyma','Subaşı','5089641528','acun_parasi@gmail.com');
/*!40000 ALTER TABLE `kayitli_musteri` ENABLE KEYS */;
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
