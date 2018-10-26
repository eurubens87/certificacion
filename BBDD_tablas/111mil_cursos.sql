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
-- Table structure for table `cursos`
--

DROP TABLE IF EXISTS `cursos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `cursos` (
  `idCursos` int(11) NOT NULL AUTO_INCREMENT,
  `Duracion` varchar(45) DEFAULT NULL,
  `Carga_horaria` varchar(45) DEFAULT NULL,
  `Cupo` varchar(45) DEFAULT NULL,
  `Examen` varchar(2) NOT NULL,
  `Informe` varchar(45) DEFAULT NULL,
  `Materia` varchar(45) DEFAULT NULL,
  `Profesor_DNI` varchar(8) NOT NULL,
  `Aula_idAula` int(11) NOT NULL,
  `fecha_ini` varchar(45) DEFAULT NULL,
  `fecha_fin` varchar(45) DEFAULT NULL,
  `habilitado` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idCursos`,`Profesor_DNI`,`Aula_idAula`),
  KEY `fk_Cursos_Profesor1_idx` (`Profesor_DNI`),
  KEY `fk_Cursos_Aula1_idx` (`Aula_idAula`),
  CONSTRAINT `fk_Cursos_Aula1` FOREIGN KEY (`Aula_idAula`) REFERENCES `aula` (`idaula`),
  CONSTRAINT `fk_Cursos_Profesor1` FOREIGN KEY (`Profesor_DNI`) REFERENCES `profesor` (`dni`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cursos`
--

LOCK TABLES `cursos` WRITE;
/*!40000 ALTER TABLE `cursos` DISABLE KEYS */;
INSERT INTO `cursos` VALUES (8,'4','10','10','SI','no presentado','Dibujo','11111111',2,'01/01/2019','30/06/2019','deshabilitado');
/*!40000 ALTER TABLE `cursos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-25 20:03:33
