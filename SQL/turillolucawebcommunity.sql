-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Ott 28, 2023 alle 09:57
-- Versione del server: 10.4.27-MariaDB
-- Versione PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `turillolucawebcommunity`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `artista`
--

CREATE TABLE `artista` (
  `art_id` int(11) NOT NULL,
  `art_dex` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `artista`
--

INSERT INTO `artista` (`art_id`, `art_dex`) VALUES
(1, 'The Beatles'),
(2, 'Bob Dylan'),
(3, 'Elvis Presley'),
(4, 'The Rolling Stones'),
(5, 'Chuck Berry'),
(6, 'Jimi Hendrix'),
(7, 'James Brown'),
(8, 'Little Richard'),
(9, 'The Beatles'),
(10, 'Bob Dylan'),
(11, 'Elvis Presley'),
(12, 'The Rolling Stones'),
(13, 'Chuck Berry'),
(14, 'Jimi Hendrix'),
(15, 'James Brown'),
(16, 'Little Richard'),
(17, 'Michael Jackson'),
(18, 'Madonna'),
(19, 'Prince'),
(20, 'David Bowie'),
(21, 'Queen'),
(22, 'The Who'),
(23, 'Led Zeppelin'),
(24, 'Pink Floyd'),
(25, 'U2'),
(26, 'Nirvana'),
(27, 'The Rolling Stones'),
(28, 'Adele'),
(29, 'Eminem'),
(30, 'Ariana Grande'),
(31, 'Beyoncé'),
(32, 'Taylor Swift');

-- --------------------------------------------------------

--
-- Struttura della tabella `categoriaevento`
--

CREATE TABLE `categoriaevento` (
  `ctg_id` int(11) NOT NULL,
  `ctg_dex` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `categoriaevento`
--

INSERT INTO `categoriaevento` (`ctg_id`, `ctg_dex`) VALUES
(1, 'eventi culturali'),
(2, 'eventi artistici'),
(3, 'concerti'),
(4, 'mostre'),
(5, 'teatro'),
(6, 'sport'),
(7, 'conferenze'),
(8, 'feste'),
(9, 'festival'),
(10, 'convegni'),
(11, 'esibizioni'),
(12, 'seminari'),
(13, 'cinema');

-- --------------------------------------------------------

--
-- Struttura della tabella `evento`
--

CREATE TABLE `evento` (
  `evt_id` int(11) NOT NULL,
  `evt_luogo` varchar(50) DEFAULT NULL,
  `evt_data` date DEFAULT NULL,
  `evt_titolo` varchar(50) DEFAULT NULL,
  `fk_id_categoria` int(11) DEFAULT NULL,
  `fk_id_membro` int(11) DEFAULT NULL,
  `fk_id_provincia` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `evento`
--

INSERT INTO `evento` (`evt_id`, `evt_luogo`, `evt_data`, `evt_titolo`, `fk_id_categoria`, `fk_id_membro`, `fk_id_provincia`) VALUES
(1, 'Sasepolcro', '2023-10-31', 'Festa Salsiccia', 8, 21, 5),
(2, 'Firenze', '2023-11-15', 'Concerto Rock', 7, 15, 35),
(3, 'Roma', '2023-12-02', 'Mostra d arte contemporanea', 1, 9, 86),
(4, 'Milano', '2023-11-20', 'Partita di calcio', 6, 11, 58),
(5, 'Napoli', '2023-12-05', 'Conferenza su scienza', 12, 6, 61),
(6, 'Bari', '2023-11-25', 'Festa di compleanno', 8, 4, 9),
(7, 'Palermo', '2023-11-10', 'Spettacolo teatrale', 4, 16, 68),
(8, 'Genova', '2023-12-22', 'Concerto classico', 7, 8, 39),
(9, 'Bologna', '2023-11-12', 'Fiera gastronomica', 8, 20, 37),
(10, 'Venezia', '2023-12-18', 'Carnival di Venezia', 9, 3, 104),
(11, 'Torino', '2023-11-27', 'Esibizione artistica', 2, 19, 97),
(12, 'Verona', '2023-11-05', 'Seminario aziendale', 11, 10, 107),
(13, 'Catania', '2023-11-14', 'Festival musicale', 3, 13, 24),
(14, 'Matera', '2023-12-12', 'Mostra archeologica', 5, 14, 55),
(15, 'Cagliari', '2023-11-28', 'Festa tradizionale', 8, 17, 19),
(16, 'Turin', '2023-11-19', 'Convegno medico', 12, 2, 97),
(17, 'Pisa', '2023-12-07', 'Festa di Natale', 8, 18, 75),
(18, 'Rimini', '2023-11-26', 'Sfilata di moda', 10, 7, 85),
(19, 'Brescia', '2023-11-16', 'Esibizione sportiva', 6, 12, 17),
(20, 'Perugia', '2023-12-09', 'Concerto jazz', 7, 5, 71),
(21, 'Ancona', '2023-11-23', 'Mostra fotografica', 1, 1, 3);

-- --------------------------------------------------------

--
-- Struttura della tabella `interessi`
--

CREATE TABLE `interessi` (
  `fk_id_categoria` int(11) DEFAULT NULL,
  `fk_id_membro` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `interessi`
--

INSERT INTO `interessi` (`fk_id_categoria`, `fk_id_membro`) VALUES
(1, 2),
(3, 7),
(2, 10),
(5, 4),
(4, 13),
(6, 6),
(7, 11),
(8, 1),
(9, 18),
(10, 3),
(11, 15),
(12, 8),
(13, 20),
(1, 19),
(2, 12),
(3, 5),
(4, 9),
(5, 17),
(6, 14),
(7, 16);

-- --------------------------------------------------------

--
-- Struttura della tabella `membro`
--

CREATE TABLE `membro` (
  `mbr_id` int(11) NOT NULL,
  `mbr_nome` varchar(50) DEFAULT NULL,
  `mbr_cognome` varchar(50) DEFAULT NULL,
  `mbr_email` varchar(50) DEFAULT NULL,
  `mbr_nickname` varchar(50) DEFAULT NULL,
  `mbr_password` varchar(50) DEFAULT NULL,
  `fk_id_provincia` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `membro`
--

INSERT INTO `membro` (`mbr_id`, `mbr_nome`, `mbr_cognome`, `mbr_email`, `mbr_nickname`, `mbr_password`, `fk_id_provincia`) VALUES
(1, 'Luca', 'Turillo', 'turillo.luca@gmail.com', 'ComodinoLerci0', 'sussussus', 5),
(2, 'Mario', 'Rossi', 'mario.rossi@email.com', 'SuperMario', 'password1', 10),
(3, 'Anna', 'Verdi', 'anna.verdi@email.com', 'GreenAnna', 'password2', 20),
(4, 'Giovanni', 'Bianchi', 'giovanni.bianchi@email.com', 'JohnWhite', 'password3', 12),
(5, 'Luisa', 'Neri', 'luisa.neri@email.com', 'Luisa88', 'password4', 7),
(6, 'Alessio', 'Gallo', 'alessio.gallo@email.com', 'AllyG', 'password5', 15),
(7, 'Francesca', 'Russo', 'francesca.russo@email.com', 'FranR', 'password6', 8),
(8, 'Marco', 'Ferrari', 'marco.ferrari@email.com', 'FastMarco', 'password7', 1),
(9, 'Elena', 'Ricci', 'elena.ricci@email.com', 'Ellie', 'password8', 9),
(10, 'Paolo', 'Marini', 'paolo.marini@email.com', 'CoolPaolo', 'password9', 3),
(11, 'Giulia', 'Conti', 'giulia.conti@email.com', 'Giuli', 'password10', 6),
(12, 'Roberto', 'Mancini', 'roberto.mancini@email.com', 'RobM', 'password11', 18),
(13, 'Sara', 'Barone', 'sara.barone@email.com', 'Sarina', 'password12', 4),
(14, 'Davide', 'Costa', 'davide.costa@email.com', 'DaveC', 'password13', 11),
(15, 'Carla', 'Ferrara', 'carla.ferrara@email.com', 'Carla89', 'password14', 17),
(16, 'Andrea', 'Riva', 'andrea.riva@email.com', 'Andy', 'password15', 2),
(17, 'Laura', 'Baldi', 'laura.baldi@email.com', 'LauB', 'password16', 19),
(18, 'Riccardo', 'Greco', 'riccardo.greco@email.com', 'Richie', 'password17', 13),
(19, 'Chiara', 'Martini', 'chiara.martini@email.com', 'ChiMart', 'password18', 14),
(20, 'Enrico', 'Moretti', 'enrico.moretti@email.com', 'RickMore', 'password19', 16),
(21, 'Silvia', 'Gatti', 'silvia.gatti@email.com', 'SilvG', 'password20', 10);

-- --------------------------------------------------------

--
-- Struttura della tabella `parecipa`
--

CREATE TABLE `parecipa` (
  `fk_id_evento` int(11) DEFAULT NULL,
  `fk_id_artista` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `parecipa`
--

INSERT INTO `parecipa` (`fk_id_evento`, `fk_id_artista`) VALUES
(1, 5),
(2, 10),
(3, 15),
(4, 20),
(5, 25),
(6, 30),
(7, 3),
(8, 8),
(9, 13),
(10, 18),
(11, 24),
(12, 31),
(13, 4),
(14, 9),
(15, 14),
(16, 19),
(17, 23),
(18, 7),
(19, 11),
(20, 27);

-- --------------------------------------------------------

--
-- Struttura della tabella `post`
--

CREATE TABLE `post` (
  `pst_id` int(11) NOT NULL,
  `pst_commento` varchar(50) DEFAULT NULL,
  `pst_voto` int(11) DEFAULT NULL CHECK (`pst_voto` >= 0 and `pst_voto` <= 10),
  `fk_id_membro` int(11) DEFAULT NULL,
  `fk_id_evento` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `post`
--

INSERT INTO `post` (`pst_id`, `pst_commento`, `pst_voto`, `fk_id_membro`, `fk_id_evento`) VALUES
(1, 'Questo evento mi è piaciuto molto', 10, 21, 21),
(2, 'Grande esperienza', 9, 12, 17),
(3, 'Molto divertente, consiglio!', 8, 6, 8),
(4, 'Non mi è piaciuto', 4, 18, 14),
(5, 'Ottimo spettacolo', 10, 2, 13),
(6, 'Bello ma un po  troppo costoso', 7, 5, 1),
(7, 'Non vale la pena', 2, 11, 9),
(8, 'Evento straordinario', 10, 19, 6),
(9, 'Meh, non male ma neanche eccezionale', 6, 8, 3),
(10, 'Sicuramente da rifare!', 9, 3, 5),
(11, 'Mi aspettavo di più', 5, 9, 19),
(12, 'Fantastico', 10, 7, 10),
(13, 'Non posso lamentarmi', 8, 14, 18),
(14, 'Una serata indimenticabile!', 9, 16, 11),
(15, 'Non tornerò mai più', 3, 21, 7),
(16, 'Belle atmosfera e buon cibo', 7, 15, 16),
(17, 'Evento deludente', 4, 20, 20),
(18, 'Spettacolo emozionante', 9, 13, 15),
(19, 'Soddisfacente ma non eccezionale', 6, 4, 2),
(20, 'Un esperienza da ricordare', 9, 10, 12);

-- --------------------------------------------------------

--
-- Struttura della tabella `provincia`
--

CREATE TABLE `provincia` (
  `prv_id` int(11) NOT NULL,
  `prv_dex` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `provincia`
--

INSERT INTO `provincia` (`prv_id`, `prv_dex`) VALUES
(1, 'Agrigento'),
(2, 'Alessandria'),
(3, 'Ancona'),
(4, 'Aosta'),
(5, 'Arezzo'),
(6, 'Ascoli Piceno'),
(7, 'Asti'),
(8, 'Avellino'),
(9, 'Bari'),
(10, 'Barletta-Andria-Trani'),
(11, 'Belluno'),
(12, 'Benevento'),
(13, 'Bergamo'),
(14, 'Biella'),
(15, 'Bologna'),
(16, 'Bolzano'),
(17, 'Brescia'),
(18, 'Brindisi'),
(19, 'Cagliari'),
(20, 'Caltanissetta'),
(21, 'Campobasso'),
(22, 'Carbonia-Iglesias'),
(23, 'Caserta'),
(24, 'Catania'),
(25, 'Catanzaro'),
(26, 'Chieti'),
(27, 'Como'),
(28, 'Cosenza'),
(29, 'Cremona'),
(30, 'Crotone'),
(31, 'Cuneo'),
(32, 'Enna'),
(33, 'Fermo'),
(34, 'Ferrara'),
(35, 'Firenze'),
(36, 'Foggia'),
(37, 'Forlì-Cesena'),
(38, 'Frosinone'),
(39, 'Genova'),
(40, 'Gorizia'),
(41, 'Grosseto'),
(42, 'Imperia'),
(43, 'Isernia'),
(44, 'La Spezia'),
(45, 'L Aquila'),
(46, 'Latina'),
(47, 'Lecce'),
(48, 'Lecco'),
(49, 'Livorno'),
(50, 'Lodi'),
(51, 'Lucca'),
(52, 'Macerata'),
(53, 'Mantova'),
(54, 'Massa-Carrara'),
(55, 'Matera'),
(56, 'Medio Campidano'),
(57, 'Messina'),
(58, 'Milano'),
(59, 'Modena'),
(60, 'Monza e Brianza'),
(61, 'Napoli'),
(62, 'Novara'),
(63, 'Nuoro'),
(64, 'Ogliastra'),
(65, 'Olbia-Tempio'),
(66, 'Oristano'),
(67, 'Padova'),
(68, 'Palermo'),
(69, 'Parma'),
(70, 'Pavia'),
(71, 'Perugia'),
(72, 'Pesaro e Urbino'),
(73, 'Pescara'),
(74, 'Piacenza'),
(75, 'Pisa'),
(76, 'Pistoia'),
(77, 'Pordenone'),
(78, 'Potenza'),
(79, 'Prato'),
(80, 'Ragusa'),
(81, 'Ravenna'),
(82, 'Reggio Calabria'),
(83, 'Reggio Emilia'),
(84, 'Rieti'),
(85, 'Rimini'),
(86, 'Roma'),
(87, 'Rovigo'),
(88, 'Salerno'),
(89, 'Sassari'),
(90, 'Savona'),
(91, 'Siena'),
(92, 'Siracusa'),
(93, 'Sondrio'),
(94, 'Taranto'),
(95, 'Teramo'),
(96, 'Terni'),
(97, 'Torino'),
(98, 'Trapani'),
(99, 'Trento'),
(100, 'Treviso'),
(101, 'Trieste'),
(102, 'Udine'),
(103, 'Varese'),
(104, 'Venezia'),
(105, 'Verbano-Cusio-Ossola'),
(106, 'Vercelli'),
(107, 'Verona'),
(108, 'Vibo Valentia'),
(109, 'Vicenza'),
(110, 'Viterbo');

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `artista`
--
ALTER TABLE `artista`
  ADD PRIMARY KEY (`art_id`);

--
-- Indici per le tabelle `categoriaevento`
--
ALTER TABLE `categoriaevento`
  ADD PRIMARY KEY (`ctg_id`);

--
-- Indici per le tabelle `evento`
--
ALTER TABLE `evento`
  ADD PRIMARY KEY (`evt_id`),
  ADD KEY `fk_id_categoria` (`fk_id_categoria`),
  ADD KEY `fk_id_membro` (`fk_id_membro`),
  ADD KEY `fk_id_provincia` (`fk_id_provincia`);

--
-- Indici per le tabelle `interessi`
--
ALTER TABLE `interessi`
  ADD KEY `fk_id_categoria` (`fk_id_categoria`),
  ADD KEY `fk_id_membro` (`fk_id_membro`);

--
-- Indici per le tabelle `membro`
--
ALTER TABLE `membro`
  ADD PRIMARY KEY (`mbr_id`),
  ADD UNIQUE KEY `mbr_email` (`mbr_email`,`mbr_nickname`),
  ADD KEY `fk_id_provincia` (`fk_id_provincia`);

--
-- Indici per le tabelle `parecipa`
--
ALTER TABLE `parecipa`
  ADD KEY `fk_id_evento` (`fk_id_evento`),
  ADD KEY `fk_id_artista` (`fk_id_artista`);

--
-- Indici per le tabelle `post`
--
ALTER TABLE `post`
  ADD PRIMARY KEY (`pst_id`),
  ADD KEY `fk_id_membro` (`fk_id_membro`),
  ADD KEY `fk_id_evento` (`fk_id_evento`);

--
-- Indici per le tabelle `provincia`
--
ALTER TABLE `provincia`
  ADD PRIMARY KEY (`prv_id`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `artista`
--
ALTER TABLE `artista`
  MODIFY `art_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT per la tabella `categoriaevento`
--
ALTER TABLE `categoriaevento`
  MODIFY `ctg_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT per la tabella `evento`
--
ALTER TABLE `evento`
  MODIFY `evt_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT per la tabella `membro`
--
ALTER TABLE `membro`
  MODIFY `mbr_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT per la tabella `post`
--
ALTER TABLE `post`
  MODIFY `pst_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `evento`
--
ALTER TABLE `evento`
  ADD CONSTRAINT `evento_ibfk_1` FOREIGN KEY (`fk_id_categoria`) REFERENCES `categoriaevento` (`ctg_id`),
  ADD CONSTRAINT `evento_ibfk_2` FOREIGN KEY (`fk_id_membro`) REFERENCES `membro` (`mbr_id`),
  ADD CONSTRAINT `evento_ibfk_3` FOREIGN KEY (`fk_id_provincia`) REFERENCES `provincia` (`prv_id`);

--
-- Limiti per la tabella `interessi`
--
ALTER TABLE `interessi`
  ADD CONSTRAINT `interessi_ibfk_1` FOREIGN KEY (`fk_id_categoria`) REFERENCES `categoriaevento` (`ctg_id`),
  ADD CONSTRAINT `interessi_ibfk_2` FOREIGN KEY (`fk_id_membro`) REFERENCES `membro` (`mbr_id`);

--
-- Limiti per la tabella `membro`
--
ALTER TABLE `membro`
  ADD CONSTRAINT `membro_ibfk_1` FOREIGN KEY (`fk_id_provincia`) REFERENCES `provincia` (`prv_id`);

--
-- Limiti per la tabella `parecipa`
--
ALTER TABLE `parecipa`
  ADD CONSTRAINT `parecipa_ibfk_1` FOREIGN KEY (`fk_id_evento`) REFERENCES `evento` (`evt_id`),
  ADD CONSTRAINT `parecipa_ibfk_2` FOREIGN KEY (`fk_id_artista`) REFERENCES `artista` (`art_id`);

--
-- Limiti per la tabella `post`
--
ALTER TABLE `post`
  ADD CONSTRAINT `fk_id_evento` FOREIGN KEY (`fk_id_evento`) REFERENCES `evento` (`evt_id`),
  ADD CONSTRAINT `post_ibfk_1` FOREIGN KEY (`fk_id_membro`) REFERENCES `membro` (`mbr_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
