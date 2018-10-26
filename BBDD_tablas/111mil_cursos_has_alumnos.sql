-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: 111mil
-- ------------------------------------------------------
-- Server version	8.0.11

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
-- Table structure for table `cursos_has_alumnos`
--

DROP TABLE IF EXISTS `cursos_has_alumnos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `cursos_has_alumnos` (
  `Cursos_idCursos` int(11) NOT NULL,
  `Alumnos_DNI` varchar(8) NOT NULL,
  `Nota` varchar(45) DEFAULT NULL,
  `Num_inscripcion` varchar(45) DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Cursos_idCursos`,`Alumnos_DNI`),
  KEY `fk_Cursos_has_Alumnos_Alumnos1_idx` (`Alumnos_DNI`),
  KEY `fk_Cursos_has_Alumnos_Cursos_idx` (`Cursos_idCursos`),
  CONSTRAINT `fk_Cursos_has_Alumnos_Alumnos1` FOREIGN KEY (`Alumnos_DNI`) REFERENCES `alumnos` (`dni`),
  CONSTRAINT `fk_Cursos_has_Alumnos_Cursos` FOREIGN KEY (`Cursos_idCursos`) REFERENCES `cursos` (`idcursos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cursos_has_alumnos`
--

LOCK TABLES `cursos_has_alumnos` WRITE;
/*!40000 ALTER TABLE `cursos_has_alumnos` DISABLE KEYS */;
/*!40000 ALTER TABLE `cursos_has_alumnos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-25 20:03:34
