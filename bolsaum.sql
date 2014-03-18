-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-03-2014 a las 04:11:21
-- Versión del servidor: 5.5.32
-- Versión de PHP: 5.4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bolsaum`
--
CREATE DATABASE IF NOT EXISTS `bolsaum` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish2_ci;
USE `bolsaum`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `folio` int(5) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(15) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `passwd` varchar(200) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `nombre` varchar(20) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `aPaterno` varchar(20) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `aMaterno` varchar(20) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `llave` varchar(200) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `ejercicio` varchar(10) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `fecha` varchar(10) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `medico` varchar(20) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `tipoUsuario` varchar(15) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `status` varchar(10) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `fechaIngreso` varchar(10) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `fechaSalida` varchar(10) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `horaIngreso` varchar(10) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `horaSalida` varchar(10) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `entidad` char(2) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `email` varchar(100) CHARACTER SET latin1 COLLATE latin1_spanish_ci NOT NULL,
  `language` varchar(10) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `ip` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `role` int(2) NOT NULL,
  PRIMARY KEY (`folio`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=415 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
