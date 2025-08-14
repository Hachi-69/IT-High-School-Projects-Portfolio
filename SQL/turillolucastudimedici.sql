-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Nov 16, 2023 alle 16:35
-- Versione del server: 10.4.28-MariaDB
-- Versione PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `turillolucastudimedici`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `ambulatorio`
--

CREATE TABLE `ambulatorio` (
  `amb_id` int(11) NOT NULL,
  `amb_indirizzo` varchar(30) NOT NULL,
  `amb_tel` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `ambulatorio`
--

INSERT INTO `ambulatorio` (`amb_id`, `amb_indirizzo`, `amb_tel`) VALUES
(1, 'Via Roma 10, Milano', '+39 02 1234567'),
(2, 'Corso Vittorio Emanuele 15, To', '+39 011 765432'),
(3, 'Viale della Libertà 22, Roma', '+39 06 2345678'),
(4, 'Piazza del Duomo 5, Firenze', '+39 055 876543'),
(5, 'Via Garibaldi 18, Genova', '+39 010 987654'),
(6, 'Corso Umberto I 7, Napoli', '+39 081 345678'),
(7, 'Piazza San Marco 3, Venezia', '+39 041 234567'),
(8, 'Via Nazionale 12, Palermo', '+39 091 876543'),
(9, 'Corso Mazzini 25, Bologna', '+39 051 654321'),
(10, 'Piazza Maggiore 8, Bari', '+39 080 432109');

-- --------------------------------------------------------

--
-- Struttura della tabella `collabora`
--

CREATE TABLE `collabora` (
  `col_id` int(11) NOT NULL,
  `fk_clb_id` int(11) DEFAULT NULL,
  `fk_spc_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `collabora`
--

INSERT INTO `collabora` (`col_id`, `fk_clb_id`, `fk_spc_id`) VALUES
(1, 5, 8),
(2, 2, 3),
(3, 7, 10),
(4, 3, 5),
(5, 9, 1),
(6, 1, 4),
(7, 8, 6),
(8, 4, 7),
(9, 6, 2),
(10, 10, 9);

-- --------------------------------------------------------

--
-- Struttura della tabella `collaboratore`
--

CREATE TABLE `collaboratore` (
  `clb_id` int(11) NOT NULL,
  `clb_nome` varchar(30) DEFAULT NULL,
  `clb_cognome` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `collaboratore`
--

INSERT INTO `collaboratore` (`clb_id`, `clb_nome`, `clb_cognome`) VALUES
(1, 'Marco', 'Rossi'),
(2, 'Anna', 'Bianchi'),
(3, 'Luca', 'Verdi'),
(4, 'Giovanna', 'Gallo'),
(5, 'Simone', 'Ferrari'),
(6, 'Francesca', 'Russo'),
(7, 'Paolo', 'Marini'),
(8, 'Elisa', 'Conti'),
(9, 'Davide', 'Moretti'),
(10, 'Sara', 'Greco');

-- --------------------------------------------------------

--
-- Struttura della tabella `necessita`
--

CREATE TABLE `necessita` (
  `ncs_id` int(11) NOT NULL,
  `fk_spc_id` int(11) DEFAULT NULL,
  `fk_str_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `necessita`
--

INSERT INTO `necessita` (`ncs_id`, `fk_spc_id`, `fk_str_id`) VALUES
(1, 8, 5),
(2, 3, 2),
(3, 10, 7),
(4, 5, 3),
(5, 1, 9),
(6, 4, 1),
(7, 6, 8),
(8, 7, 4),
(9, 2, 6),
(10, 9, 10);

-- --------------------------------------------------------

--
-- Struttura della tabella `opera`
--

CREATE TABLE `opera` (
  `ope_id` int(11) NOT NULL,
  `fk_vst_id` int(11) DEFAULT NULL,
  `fk_spc_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `opera`
--

INSERT INTO `opera` (`ope_id`, `fk_vst_id`, `fk_spc_id`) VALUES
(1, 5, 8),
(2, 2, 3),
(3, 7, 10),
(4, 3, 5),
(5, 9, 1),
(6, 1, 4),
(7, 8, 6),
(8, 4, 7),
(9, 6, 2),
(10, 10, 9);

-- --------------------------------------------------------

--
-- Struttura della tabella `specialista`
--

CREATE TABLE `specialista` (
  `spc_id` int(11) NOT NULL,
  `spc_specialita` varchar(30) DEFAULT NULL,
  `spc_nome` varchar(30) DEFAULT NULL,
  `spc_cognome` varchar(30) DEFAULT NULL,
  `spc_tel` varchar(14) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `specialista`
--

INSERT INTO `specialista` (`spc_id`, `spc_specialita`, `spc_nome`, `spc_cognome`, `spc_tel`) VALUES
(1, 'Cardiologo', 'Mario', 'Rossi', '+39 02 1234567'),
(2, 'Dermatologo', 'Anna', 'Bianchi', '+39 011 765432'),
(3, 'Ortopedico', 'Luca', 'Verdi', '+39 06 2345678'),
(4, 'Oculista', 'Giovanna', 'Gallo', '+39 055 876543'),
(5, 'Gastroenterologo', 'Simone', 'Ferrari', '+39 010 987654'),
(6, 'Neurologo', 'Francesca', 'Russo', '+39 081 345678'),
(7, 'Psichiatra', 'Paolo', 'Marini', '+39 041 234567'),
(8, 'Chirurgo Plastico', 'Elisa', 'Conti', '+39 091 876543'),
(9, 'Ginecologo', 'Davide', 'Moretti', '+39 051 654321'),
(10, 'Endocrinologo', 'Sara', 'Greco', '+39 080 432109');

-- --------------------------------------------------------

--
-- Struttura della tabella `strumento`
--

CREATE TABLE `strumento` (
  `str_id` int(11) NOT NULL,
  `str_dex` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `strumento`
--

INSERT INTO `strumento` (`str_id`, `str_dex`) VALUES
(1, 'Stetoscopio'),
(2, 'Termometro digitale'),
(3, 'Sfigmomanometro'),
(4, 'Elettrocardiografo'),
(5, 'Otoscopio'),
(6, 'Lampada frontale'),
(7, 'Flebo'),
(8, 'Bilancia pesapersone'),
(9, 'Microscopio'),
(10, 'Siringa e ago');

-- --------------------------------------------------------

--
-- Struttura della tabella `utilizza`
--

CREATE TABLE `utilizza` (
  `utl_id` int(11) NOT NULL,
  `fk_clb_id` int(11) DEFAULT NULL,
  `fk_str_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `utilizza`
--

INSERT INTO `utilizza` (`utl_id`, `fk_clb_id`, `fk_str_id`) VALUES
(1, 5, 8),
(2, 2, 3),
(3, 7, 10),
(4, 3, 5),
(5, 9, 1),
(6, 1, 4),
(7, 8, 6),
(8, 4, 7),
(9, 6, 2),
(10, 10, 9);

-- --------------------------------------------------------

--
-- Struttura della tabella `visita`
--

CREATE TABLE `visita` (
  `vst_id` int(11) NOT NULL,
  `vst_date_time` datetime DEFAULT NULL,
  `fk_amb_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `visita`
--

INSERT INTO `visita` (`vst_id`, `vst_date_time`, `fk_amb_id`) VALUES
(1, '2023-11-01 09:30:00', 1),
(2, '2023-11-02 14:45:00', 2),
(3, '2023-11-03 11:00:00', 3),
(4, '2023-11-04 16:20:00', 4),
(5, '2023-11-05 10:15:00', 5),
(6, '2023-11-06 13:30:00', 6),
(7, '2023-11-07 15:45:00', 7),
(8, '2023-11-08 12:10:00', 8),
(9, '2023-11-09 14:00:00', 9),
(10, '2023-11-10 08:45:00', 10);

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `ambulatorio`
--
ALTER TABLE `ambulatorio`
  ADD PRIMARY KEY (`amb_id`);

--
-- Indici per le tabelle `collabora`
--
ALTER TABLE `collabora`
  ADD PRIMARY KEY (`col_id`),
  ADD KEY `fk_clb_id` (`fk_clb_id`),
  ADD KEY `fk_spc_id` (`fk_spc_id`);

--
-- Indici per le tabelle `collaboratore`
--
ALTER TABLE `collaboratore`
  ADD PRIMARY KEY (`clb_id`);

--
-- Indici per le tabelle `necessita`
--
ALTER TABLE `necessita`
  ADD PRIMARY KEY (`ncs_id`),
  ADD KEY `fk_spc_id` (`fk_spc_id`),
  ADD KEY `fk_str_id` (`fk_str_id`);

--
-- Indici per le tabelle `opera`
--
ALTER TABLE `opera`
  ADD PRIMARY KEY (`ope_id`),
  ADD KEY `fk_vst_id` (`fk_vst_id`),
  ADD KEY `fk_spc_id` (`fk_spc_id`);

--
-- Indici per le tabelle `specialista`
--
ALTER TABLE `specialista`
  ADD PRIMARY KEY (`spc_id`);

--
-- Indici per le tabelle `strumento`
--
ALTER TABLE `strumento`
  ADD PRIMARY KEY (`str_id`);

--
-- Indici per le tabelle `utilizza`
--
ALTER TABLE `utilizza`
  ADD PRIMARY KEY (`utl_id`),
  ADD KEY `fk_clb_id` (`fk_clb_id`),
  ADD KEY `fk_str_id` (`fk_str_id`);

--
-- Indici per le tabelle `visita`
--
ALTER TABLE `visita`
  ADD PRIMARY KEY (`vst_id`),
  ADD KEY `fk_amb_id` (`fk_amb_id`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `ambulatorio`
--
ALTER TABLE `ambulatorio`
  MODIFY `amb_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT per la tabella `collabora`
--
ALTER TABLE `collabora`
  MODIFY `col_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT per la tabella `collaboratore`
--
ALTER TABLE `collaboratore`
  MODIFY `clb_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT per la tabella `necessita`
--
ALTER TABLE `necessita`
  MODIFY `ncs_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT per la tabella `opera`
--
ALTER TABLE `opera`
  MODIFY `ope_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT per la tabella `specialista`
--
ALTER TABLE `specialista`
  MODIFY `spc_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT per la tabella `strumento`
--
ALTER TABLE `strumento`
  MODIFY `str_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT per la tabella `utilizza`
--
ALTER TABLE `utilizza`
  MODIFY `utl_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT per la tabella `visita`
--
ALTER TABLE `visita`
  MODIFY `vst_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `collabora`
--
ALTER TABLE `collabora`
  ADD CONSTRAINT `collabora_ibfk_1` FOREIGN KEY (`fk_clb_id`) REFERENCES `collaboratore` (`clb_id`),
  ADD CONSTRAINT `collabora_ibfk_2` FOREIGN KEY (`fk_spc_id`) REFERENCES `specialista` (`spc_id`);

--
-- Limiti per la tabella `necessita`
--
ALTER TABLE `necessita`
  ADD CONSTRAINT `necessita_ibfk_1` FOREIGN KEY (`fk_spc_id`) REFERENCES `specialista` (`spc_id`),
  ADD CONSTRAINT `necessita_ibfk_2` FOREIGN KEY (`fk_str_id`) REFERENCES `strumento` (`str_id`);

--
-- Limiti per la tabella `opera`
--
ALTER TABLE `opera`
  ADD CONSTRAINT `opera_ibfk_1` FOREIGN KEY (`fk_vst_id`) REFERENCES `visita` (`vst_id`),
  ADD CONSTRAINT `opera_ibfk_2` FOREIGN KEY (`fk_spc_id`) REFERENCES `specialista` (`spc_id`);

--
-- Limiti per la tabella `utilizza`
--
ALTER TABLE `utilizza`
  ADD CONSTRAINT `utilizza_ibfk_1` FOREIGN KEY (`fk_clb_id`) REFERENCES `collaboratore` (`clb_id`),
  ADD CONSTRAINT `utilizza_ibfk_2` FOREIGN KEY (`fk_str_id`) REFERENCES `strumento` (`str_id`);

--
-- Limiti per la tabella `visita`
--
ALTER TABLE `visita`
  ADD CONSTRAINT `visita_ibfk_1` FOREIGN KEY (`fk_amb_id`) REFERENCES `ambulatorio` (`amb_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
