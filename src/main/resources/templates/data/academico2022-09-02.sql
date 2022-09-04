-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 03-09-2022 a las 05:05:13
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `academico`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

CREATE TABLE `estudiante` (
  `ide_estu` int(11) NOT NULL COMMENT 'Identificación',
  `nom_estu` varchar(60) NOT NULL COMMENT 'Nombre',
  `fna_estu` date NOT NULL COMMENT 'Fecha nacimiento',
  `gen_estu` varchar(1) NOT NULL COMMENT 'Genero',
  `dir_estu` varchar(100) NOT NULL COMMENT 'Direccion',
  `tel_estu` varchar(15) DEFAULT NULL COMMENT 'Teléfono'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `estudiante`
--

INSERT INTO `estudiante` (`ide_estu`, `nom_estu`, `fna_estu`, `gen_estu`, `dir_estu`, `tel_estu`) VALUES
(23658, 'Alberto Alvarado', '2022-08-23', 'M', 'Cll 50 Cr 45 Bogota', '30022325'),
(123456, 'Luis Saurith', '1978-06-21', 'M', 'Calle 20 # 30-40 Bucaramanga', '300223'),
(362514, 'Pedro Perez', '2022-09-01', 'M', 'Calle 50-56 Barranquilla', '3002232559'),
(1234564, 'Maria Elena', '1978-06-21', 'M', 'Calle 20 # 30-40 Bucaramanga', '300223');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `cod_mate` varchar(5) NOT NULL COMMENT 'Código',
  `nom_mate` varchar(50) NOT NULL COMMENT 'Nombre',
  `des_mate` varchar(255) NOT NULL COMMENT 'Descripción'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`cod_mate`, `nom_mate`, `des_mate`) VALUES
('M1', 'Matematicas', 'Calculo operaciones'),
('M2', 'Sociales', 'Historia '),
('M3', 'Ingles', 'Ingles'),
('M4', 'Naturales', 'Naturales');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nota`
--

CREATE TABLE `nota` (
  `cod_nota` int(11) NOT NULL COMMENT 'Código',
  `est_nota` int(11) NOT NULL COMMENT 'Estudiante',
  `mat_nota` varchar(5) NOT NULL COMMENT 'Materia',
  `cal_nota` float NOT NULL COMMENT 'Calificación',
  `fec_nota` date NOT NULL COMMENT 'Fecha'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `nota`
--

INSERT INTO `nota` (`cod_nota`, `est_nota`, `mat_nota`, `cal_nota`, `fec_nota`) VALUES
(1, 23658, 'M1', 4.5, '2022-08-23'),
(2, 23658, 'M2', 5, '2022-08-23'),
(3, 23658, 'M1', 3, '2022-08-23'),
(4, 123456, 'M2', 3, '2022-08-23');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `teacher`
--

CREATE TABLE `teacher` (
  `code` int(11) NOT NULL COMMENT 'Código',
  `name` varchar(50) NOT NULL COMMENT 'Nombre',
  `phone` varchar(20) NOT NULL COMMENT 'Teléfono',
  `email` varchar(50) NOT NULL COMMENT 'Correo'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `teacher`
--

INSERT INTO `teacher` (`code`, `name`, `phone`, `email`) VALUES
(1, 'Luis Alberto', '3002232559', 'alberto@gmail.com'),
(2, 'Pedro Perez', '3172590499', 'pedro@gmail.com'),
(3, 'Maria Elena', '3172590498', 'maria@gmail.com');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD PRIMARY KEY (`ide_estu`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`cod_mate`);

--
-- Indices de la tabla `nota`
--
ALTER TABLE `nota`
  ADD PRIMARY KEY (`cod_nota`),
  ADD KEY `est_nota` (`est_nota`),
  ADD KEY `mat_nota` (`mat_nota`);

--
-- Indices de la tabla `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`code`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `nota`
--
ALTER TABLE `nota`
  MODIFY `cod_nota` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Código', AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `teacher`
--
ALTER TABLE `teacher`
  MODIFY `code` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Código', AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `nota`
--
ALTER TABLE `nota`
  ADD CONSTRAINT `nota_ibfk_1` FOREIGN KEY (`est_nota`) REFERENCES `estudiante` (`ide_estu`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `nota_ibfk_2` FOREIGN KEY (`mat_nota`) REFERENCES `materia` (`cod_mate`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
