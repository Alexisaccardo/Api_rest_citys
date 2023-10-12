-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 12-10-2023 a las 20:36:33
-- Versión del servidor: 8.0.31
-- Versión de PHP: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `crud_joption`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citys`
--

DROP TABLE IF EXISTS `citys`;
CREATE TABLE IF NOT EXISTS `citys` (
  `code_city` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `name` varchar(30) NOT NULL,
  `population` varchar(30) NOT NULL,
  `department` varchar(30) NOT NULL,
  PRIMARY KEY (`code_city`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `citys`
--

INSERT INTO `citys` (`code_city`, `name`, `population`, `department`) VALUES
('1234', 'Medellin', '100000', 'Antioquia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `population`
--

DROP TABLE IF EXISTS `population`;
CREATE TABLE IF NOT EXISTS `population` (
  `document` varchar(30) NOT NULL,
  `cellphone` varchar(30) NOT NULL,
  `code_residence` varchar(30) NOT NULL,
  `code_city` varchar(30) NOT NULL,
  `address` varchar(30) NOT NULL,
  PRIMARY KEY (`document`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
