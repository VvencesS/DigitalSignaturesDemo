-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: digsigndemo
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Table structure for table `signedocument`
--

DROP TABLE IF EXISTS `signedocument`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `signedocument` (
  `id` int NOT NULL AUTO_INCREMENT,
  `document` int DEFAULT NULL,
  `signature` blob,
  PRIMARY KEY (`id`),
  KEY `fk_signedocument_wiretransfer103_idx` (`document`),
  CONSTRAINT `fk_signedocument_wiretransfer103` FOREIGN KEY (`document`) REFERENCES `wire_transfer_103` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `signedocument`
--

LOCK TABLES `signedocument` WRITE;
/*!40000 ALTER TABLE `signedocument` DISABLE KEYS */;
/*!40000 ALTER TABLE `signedocument` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wire_transfer_103`
--

DROP TABLE IF EXISTS `wire_transfer_103`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `wire_transfer_103` (
  `id` int NOT NULL AUTO_INCREMENT,
  `version` int DEFAULT NULL,
  `thongTinNguoiChuyen` varchar(45) DEFAULT NULL,
  `maDien` varchar(45) DEFAULT NULL,
  `hachToanTuDong` varchar(45) DEFAULT NULL,
  `soTienPhi` double DEFAULT NULL,
  `soGiaoDich` varchar(45) DEFAULT NULL,
  `nguoiKiemSoat` varchar(45) DEFAULT NULL,
  `xacThucGiaoDich` varchar(45) DEFAULT NULL,
  `kyHieuMatKeToan` varchar(45) DEFAULT NULL,
  `deleted` tinyint DEFAULT NULL,
  `ngayGiaTri` datetime DEFAULT NULL,
  `nganHangTrungGian` varchar(45) DEFAULT NULL,
  `wire_transfer_103col` varchar(45) DEFAULT NULL,
  `tenNguoiThuHuong` varchar(45) DEFAULT NULL,
  `taiKhoanThuHuong` varchar(45) DEFAULT NULL,
  `soThamChieuGiaoDich` varchar(45) DEFAULT NULL,
  `loaiTien` varchar(45) DEFAULT NULL,
  `ngayGioTaoLenh` datetime DEFAULT CURRENT_TIMESTAMP,
  `ngayGiaoDich` datetime DEFAULT CURRENT_TIMESTAMP,
  `soTienGiaoDich` double DEFAULT NULL,
  `tenNguoiChuyen` varchar(45) DEFAULT NULL,
  `taiKhoanNguoiChuyen` varchar(45) DEFAULT NULL,
  `donViGui` varchar(45) DEFAULT NULL,
  `noiDungThanhToan` varchar(45) DEFAULT NULL,
  `vat` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wire_transfer_103`
--

LOCK TABLES `wire_transfer_103` WRITE;
/*!40000 ALTER TABLE `wire_transfer_103` DISABLE KEYS */;
INSERT INTO `wire_transfer_103` VALUES (1,0,'Nguyễn Văn A','103','Đã hoạch toán',5000,'1','Nguyễn Vẵn S','Đã xác thực','KT985435',0,NULL,'MSB',NULL,'Nguyễn Văn P','5239529','q47327497','VND','2021-02-09 18:00:30','2021-02-09 18:00:30',1234000000,'Trần Văn S','573987592379','VDB','Chuyển tiền',2000000);
/*!40000 ALTER TABLE `wire_transfer_103` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'digsigndemo'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-17 16:24:30
