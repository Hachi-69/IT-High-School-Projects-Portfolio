-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 31, 2024 at 05:59 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `citta_nazione_continente`
--

-- --------------------------------------------------------

--
-- Table structure for table `citta`
--

CREATE TABLE `citta` (
  `cit_id` int(11) NOT NULL,
  `cit_nome` varchar(30) DEFAULT NULL,
  `cit_popolazione` int(11) DEFAULT NULL,
  `cit_capitale` tinyint(1) DEFAULT NULL,
  `fk_cit_naz_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `citta`
--

INSERT INTO `citta` (`cit_id`, `cit_nome`, `cit_popolazione`, `cit_capitale`, `fk_cit_naz_id`) VALUES
(1, 'Firenze', 382258, 0, 1),
(2, 'Abidjan', 1000000, 0, 5),
(3, 'Tokyo', 1500000, 1, 9),
(4, 'Sydney', 800000, 0, 10),
(5, 'Roma', 2000000, 1, 1),
(6, 'Washington D.C.', 1200000, 1, 13),
(7, 'Brasilia', 1100000, 1, 16),
(8, 'McMurdo Station', 5000, 0, 11),
(9, 'Lagos', 21000000, 0, 6),
(10, 'Shanghai', 24150000, 0, 7),
(11, 'Melbourne', 5078000, 0, 10),
(12, 'Parigi', 2148000, 1, 2),
(13, 'New York City', 8406000, 1, 13),
(14, 'San Paolo', 12180000, 1, 16),
(15, 'Scott Base', 150, 0, 13),
(16, 'Roma', 2872800, 1, 1),
(17, 'Parigi', 2148000, 1, 2),
(18, 'Berlino', 3769000, 1, 3),
(19, 'Lagos', 21000000, 1, 4),
(20, 'Città del Capo', 433688, 0, 5),
(21, 'Il Cairo', 9900000, 1, 6),
(22, 'Pechino', 21707000, 1, 7),
(23, 'Nuova Delhi', 21800000, 1, 8),
(24, 'Tokyo', 37833000, 1, 9),
(25, 'Sydney', 5312163, 0, 10),
(26, 'Wellington', 212700, 1, 11),
(27, 'Suva', 88271, 1, 12),
(28, 'Washington D.C.', 633427, 1, 13),
(29, 'Ottawa', 994837, 1, 14),
(30, 'Città del Messico', 8991861, 1, 15),
(31, 'Brasilia', 3015268, 1, 16),
(32, 'Buenos Aires', 2890151, 1, 17),
(33, 'Santiago del Cile', 4837295, 1, 18);

-- --------------------------------------------------------

--
-- Table structure for table `continenti`
--

CREATE TABLE `continenti` (
  `con_id` int(11) NOT NULL,
  `con_dex` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `continenti`
--

INSERT INTO `continenti` (`con_id`, `con_dex`) VALUES
(1, 'Africa'),
(2, 'Asia'),
(3, 'Australia'),
(4, 'Europa'),
(5, 'Nord America'),
(6, 'America del Sud'),
(7, 'Antartide');

-- --------------------------------------------------------

--
-- Table structure for table `nazioni`
--

CREATE TABLE `nazioni` (
  `naz_id` int(11) NOT NULL,
  `naz_nome` varchar(30) DEFAULT NULL,
  `fk_naz_con_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `nazioni`
--

INSERT INTO `nazioni` (`naz_id`, `naz_nome`, `fk_naz_con_id`) VALUES
(1, 'Italia', 4),
(2, 'Francia', 4),
(3, 'Germania', 4),
(4, 'Nigeria', 1),
(5, 'Sudafrica', 1),
(6, 'Egitto', 1),
(7, 'Cina', 2),
(8, 'India', 2),
(9, 'Giappone', 2),
(10, 'Australia', 3),
(11, 'Nuova Zelanda', 3),
(12, 'Fiji', 3),
(13, 'Stati Uniti', 5),
(14, 'Canada', 5),
(15, 'Messico', 5),
(16, 'Brasile', 6),
(17, 'Argentina', 6),
(18, 'Cile', 6);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `citta`
--
ALTER TABLE `citta`
  ADD PRIMARY KEY (`cit_id`),
  ADD KEY `fk_cit_naz_id` (`fk_cit_naz_id`);

--
-- Indexes for table `continenti`
--
ALTER TABLE `continenti`
  ADD PRIMARY KEY (`con_id`);

--
-- Indexes for table `nazioni`
--
ALTER TABLE `nazioni`
  ADD PRIMARY KEY (`naz_id`),
  ADD KEY `fk_naz_con_id` (`fk_naz_con_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `citta`
--
ALTER TABLE `citta`
  MODIFY `cit_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT for table `continenti`
--
ALTER TABLE `continenti`
  MODIFY `con_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `nazioni`
--
ALTER TABLE `nazioni`
  MODIFY `naz_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `citta`
--
ALTER TABLE `citta`
  ADD CONSTRAINT `citta_ibfk_1` FOREIGN KEY (`fk_cit_naz_id`) REFERENCES `nazioni` (`naz_id`);

--
-- Constraints for table `nazioni`
--
ALTER TABLE `nazioni`
  ADD CONSTRAINT `nazioni_ibfk_1` FOREIGN KEY (`fk_naz_con_id`) REFERENCES `continenti` (`con_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
