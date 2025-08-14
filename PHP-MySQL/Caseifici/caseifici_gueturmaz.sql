-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Mag 03, 2024 alle 21:00
-- Versione del server: 10.4.28-MariaDB
-- Versione PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `caseifici_gueturmaz`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `attivita_giornaliere`
--

CREATE TABLE `attivita_giornaliere` (
  `atg_id` int(11) NOT NULL,
  `atg_latte_lavorato` float NOT NULL,
  `atg_latte_formaggio` float NOT NULL,
  `atg_forme_prodotte` int(11) NOT NULL,
  `atg_forme_vendute` int(11) NOT NULL,
  `atg_csf_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `attivita_giornaliere`
--

INSERT INTO `attivita_giornaliere` (`atg_id`, `atg_latte_lavorato`, `atg_latte_formaggio`, `atg_forme_prodotte`, `atg_forme_vendute`, `atg_csf_id`) VALUES
(11, 1500, 1000, 20, 10, 1);

-- --------------------------------------------------------

--
-- Struttura della tabella `caseifici`
--

CREATE TABLE `caseifici` (
  `csf_id` int(11) NOT NULL,
  `csf_nome` varchar(50) NOT NULL,
  `csf_mail` varchar(50) NOT NULL,
  `csf_num_tel` varchar(13) NOT NULL,
  `csf_link_posizione` varchar(255) NOT NULL,
  `csf_via` varchar(50) NOT NULL,
  `csf_citta` varchar(50) NOT NULL,
  `csf_num_civico` varchar(50) NOT NULL,
  `csf_cap` varchar(50) NOT NULL,
  `csf_prv_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `caseifici`
--

INSERT INTO `caseifici` (`csf_id`, `csf_nome`, `csf_mail`, `csf_num_tel`, `csf_link_posizione`, `csf_via`, `csf_citta`, `csf_num_civico`, `csf_cap`, `csf_prv_id`) VALUES
(1, 'Caseificio del Monte', 'info@caseificiomonte.com', '+390112223344', 'https://maps.google.com/caseificiomonte', 'Via Roma', 'Torino', '123', '10100', 1),
(2, 'Formaggi d\'Italia', 'info@formaggiditalia.com', '+390212223344', 'https://maps.google.com/formaggiditalia', 'Via Milano', 'Milano', '456', '20100', 1),
(3, 'La Bottega del Latte', 'info@bottegadellatte.com', '+390312223344', 'https://maps.google.com/bottegadellatte', 'Corso Umberto', 'Roma', '789', '00100', 2),
(4, 'Caseificio Buon Gusto', 'info@buongustocaseificio.com', '+390412223344', 'https://maps.google.com/buongustocaseificio', 'Via Garibaldi', 'Napoli', '1011', '80100', 3),
(5, 'Formaggi Felici', 'info@formaggifelici.com', '+390512223344', 'https://maps.google.com/formaggifelici', 'Piazza Duomo', 'Firenze', '1213', '50100', 4),
(6, 'Caseificio Bella Vista', 'info@caseificiobellavista.com', '+390612223344', 'https://maps.google.com/caseificiobellavista', 'Via Dante', 'Bologna', '1415', '40100', 5),
(7, 'Mozzarella di Casa', 'info@mozzarelladicasa.com', '+390712223344', 'https://maps.google.com/mozzarelladicasa', 'Corso Vittorio Emanuele', 'Palermo', '1617', '90100', 6),
(8, 'Caseificio del Gusto', 'info@caseificiodelgusto.com', '+390812223344', 'https://maps.google.com/caseificiodelgusto', 'Via Veneto', 'Genova', '1819', '16100', 7),
(9, 'Formaggi della Nonna', 'info@formaggidellanonna.com', '+390912223344', 'https://maps.google.com/formaggidellanonna', 'Piazza Navona', 'Verona', '2021', '37100', 8),
(10, 'Caseificio del Borgo', 'info@caseificiodelborgo.com', '+391012223344', 'https://maps.google.com/caseificiodelborgo', 'Via Mazzini', 'Bari', '2223', '70100', 9),
(11, 'Latte Fresco', 'info@lattefresco.com', '+391112223344', 'https://maps.google.com/lattefresco', 'Corso Italia', 'Catania', '2425', '95100', 10),
(12, 'Formaggi Italiani', 'info@formaggiitaliani.com', '+391212223344', 'https://maps.google.com/formaggiitaliani', 'Via Garibaldi', 'Messina', '2627', '98100', 11),
(13, 'Caseificio del Sole', 'info@caseificiodelsole.com', '+391312223344', 'https://maps.google.com/caseificiodelsole', 'Corso Vittorio Emanuele II', 'Padova', '2829', '35100', 12),
(14, 'La Casetta del Formaggio', 'info@casettaformaggio.com', '+391412223344', 'https://maps.google.com/casettaformaggio', 'Piazza del Popolo', 'Trieste', '3031', '34100', 13),
(15, 'Formaggi di Montagna', 'info@formaggidimontagna.com', '+391512223344', 'https://maps.google.com/formaggidimontagna', 'Corso Cavour', 'Perugia', '3233', '06100', 14),
(16, 'Caseificio del Sud', 'info@caseificiodelsud.com', '+391612223344', 'https://maps.google.com/caseificiodelsud', 'Piazza Dante', 'Taranto', '3435', '74100', 15),
(17, 'Gusti d\'Abruzzo', 'info@gustidabruzzo.com', '+391712223344', 'https://maps.google.com/gustidabruzzo', 'Via Roma', 'Reggio Calabria', '3637', '89100', 16),
(18, 'Formaggi di Sicilia', 'info@formaggisicilia.com', '+391812223344', 'https://maps.google.com/formaggisicilia', 'Corso Garibaldi', 'Cagliari', '3839', '09100', 17),
(19, 'Caseificio del Centro', 'info@caseificiocentro.com', '+391912223344', 'https://maps.google.com/caseificiocentro', 'Via Mazzini', 'Foggia', '4041', '71100', 18),
(20, 'La Latteria', 'info@lalatteria.com', '+392012223344', 'https://maps.google.com/lalatteria', 'Piazza San Marco', 'Salerno', '4243', '84100', 19),
(21, 'Formaggi del Lago', 'info@formaggidellago.com', '+392112223344', 'https://maps.google.com/formaggidellago', 'Corso Vittorio Veneto', 'Ravenna', '4445', '48100', 20),
(22, 'Caseificio del Mare', 'info@caseificiodelmare.com', '+392212223344', 'https://maps.google.com/caseificiodelmare', 'Via Garibaldi', 'Bergamo', '4647', '24100', 21),
(23, 'Mozzarella e Ricotta', 'info@mozzarellericotta.com', '+392312223344', 'https://maps.google.com/mozzarellericotta', 'Corso Matteotti', 'Rimini', '4849', '47900', 22),
(24, 'Formaggi del Piemonte', 'info@formaggidelpiemonte.com', '+392412223344', 'https://maps.google.com/formaggidelpiemonte', 'Piazza Castello', 'Livorno', '5051', '57100', 23),
(25, 'Caseificio del Nord', 'info@caseificiodelnord.com', '+392512223344', 'https://maps.google.com/caseificiodelnord', 'Via Roma', 'Siracusa', '5253', '96100', 24),
(26, 'Gusto Toscano', 'info@gustotoscano.com', '+392612223344', 'https://maps.google.com/gustotoscano', 'Corso Italia', 'Pisa', '5455', '56100', 25),
(27, 'Formaggi Veneti', 'info@formaggiveneti.com', '+392712223344', 'https://maps.google.com/formaggiveneti', 'Via Mazzini', 'Cesena', '5657', '47500', 26),
(28, 'Caseificio del Sud Est', 'info@caseificiosudest.com', '+392812223344', 'https://maps.google.com/caseificiosudest', 'Piazza Vittorio', 'Pordenone', '5859', '33170', 27),
(29, 'Latte Fresco della Valle', 'info@lattedellavalle.com', '+392912223344', 'https://maps.google.com/lattedellavalle', 'Corso Umberto', 'Ancona', '6061', '60100', 28),
(30, 'Formaggi del Trentino', 'info@formaggideltrentino.com', '+393012223344', 'https://maps.google.com/formaggideltrentino', 'Via Garibaldi', 'Udine', '6263', '33100', 29);

-- --------------------------------------------------------

--
-- Struttura della tabella `clienti`
--

CREATE TABLE `clienti` (
  `cln_id` int(11) NOT NULL,
  `cln_nome` varchar(50) NOT NULL,
  `cln_cognome` varchar(50) NOT NULL,
  `cln_mail` varchar(50) NOT NULL,
  `cln_num_tel` varchar(13) NOT NULL,
  `cln_cod_fiscale` varchar(20) NOT NULL,
  `cln_partita_iva` varchar(11) NOT NULL,
  `cln_via` varchar(50) NOT NULL,
  `cln_num_civico` varchar(50) NOT NULL,
  `cln_citta` varchar(50) NOT NULL,
  `cln_cap` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `clienti`
--

INSERT INTO `clienti` (`cln_id`, `cln_nome`, `cln_cognome`, `cln_mail`, `cln_num_tel`, `cln_cod_fiscale`, `cln_partita_iva`, `cln_via`, `cln_num_civico`, `cln_citta`, `cln_cap`) VALUES
(1, 'Giuseppe', 'Rossi', 'giuseppe.rossi@email.com', '+390112223344', 'RSSGPP80A01H501A', '01234567890', 'Via Roma', '1', 'Milano', '20100'),
(2, 'Anna', 'Bianchi', 'anna.bianchi@email.com', '+390212223344', 'BNNNNA85A41H123B', '98765432101', 'Corso Italia', '2', 'Roma', '00100'),
(3, 'Marco', 'Verdi', 'marco.verdi@email.com', '+390312223344', 'VRDMRC80A01H501C', '01234567891', 'Via Garibaldi', '3', 'Napoli', '80100'),
(4, 'Laura', 'Ferrari', 'laura.ferrari@email.com', '+390412223344', 'FRRLRA75A41H123D', '98765432102', 'Viale Milano', '4', 'Torino', '10100'),
(5, 'Sara', 'Russo', 'sara.russo@email.com', '+390512223344', 'RSSSRA80A01H501E', '01234567893', 'Via Dante', '5', 'Palermo', '90100'),
(6, 'Luca', 'Galli', 'luca.galli@email.com', '+390612223344', 'GLLLCA85A41H123F', '98765432104', 'Corso Vittorio Emanuele', '6', 'Bologna', '40100'),
(7, 'Paolo', 'Moretti', 'paolo.moretti@email.com', '+390712223344', 'MRTPAO80A01H501G', '01234567895', 'Via Garibaldi', '7', 'Firenze', '50100'),
(8, 'Chiara', 'Conti', 'chiara.conti@email.com', '+390812223344', 'CNTCHR85A41H123H', '98765432106', 'Via Roma', '8', 'Genova', '16100'),
(9, 'Alessandro', 'Barbieri', 'alessandro.barbieri@email.com', '+390912223344', 'BRBLSS80A01H501I', '01234567897', 'Piazza San Marco', '9', 'Bari', '70100'),
(10, 'Elena', 'Greco', 'elena.greco@email.com', '+391012223344', 'GRCLEN85A41H123L', '98765432108', 'Corso Umberto', '10', 'Catania', '95100'),
(11, 'Francesca', 'Lombardi', 'francesca.lombardi@email.com', '+391112223344', 'LMBFNC80A01H501M', '01234567899', 'Piazza Garibaldi', '11', 'Messina', '98100'),
(12, 'Davide', 'Martini', 'davide.martini@email.com', '+391212223344', 'MRTDVD85A41H123N', '98765432110', 'Via Milano', '12', 'Padova', '35100'),
(13, 'Roberta', 'Ricci', 'roberta.ricci@email.com', '+391312223344', 'RCCRTB80A01H501O', '01234567901', 'Corso Vittorio Emanuele II', '13', 'Trieste', '34100'),
(14, 'Simone', 'Morelli', 'simone.morelli@email.com', '+391412223344', 'MRLSMN85A41H123P', '98765432112', 'Piazza del Popolo', '14', 'Perugia', '06100'),
(15, 'Marta', 'Santini', 'marta.santini@email.com', '+391512223344', 'SNTMRT80A01H501Q', '01234567903', 'Corso Cavour', '15', 'Taranto', '74100'),
(16, 'Giovanni', 'Ferrara', 'giovanni.ferrara@email.com', '+391612223344', 'FRRGNN85A41H123R', '98765432114', 'Via Roma', '16', 'Reggio Calabria', '89100'),
(17, 'Elisa', 'Marini', 'elisa.marini@email.com', '+391712223344', 'MRNLSA80A01H501S', '01234567905', 'Corso Garibaldi', '17', 'Cagliari', '09100'),
(18, 'Andrea', 'Leoni', 'andrea.leoni@email.com', '+391812223344', 'LNNDRX85A41H123T', '98765432116', 'Via Mazzini', '18', 'Foggia', '71100'),
(19, 'Serena', 'Testa', 'serena.testa@email.com', '+391912223344', 'TSTSRN80A01H501U', '01234567907', 'Piazza San Marco', '19', 'Salerno', '84100'),
(20, 'Fabio', 'Vitale', 'fabio.vitale@email.com', '+392012223344', 'VTLFBI85A41H123V', '98765432118', 'Corso Vittorio Veneto', '20', 'Ravenna', '48100'),
(21, 'Alessia', 'De Luca', 'alessia.deluca@email.com', '+392112223344', 'DLCSSA80A01H501W', '01234567909', 'Via Garibaldi', '21', 'Bergamo', '24100'),
(22, 'Riccardo', 'Rizzo', 'riccardo.rizzo@email.com', '+392212223344', 'RZZRCC85A41H123X', '98765432120', 'Corso Matteotti', '22', 'Rimini', '47900'),
(23, 'Giulia', 'Fiore', 'giulia.fiore@email.com', '+392312223344', 'FRGLIA80A01H501Y', '01234567911', 'Piazza Castello', '23', 'Livorno', '57100'),
(24, 'Lorenzo', 'Barone', 'lorenzo.barone@email.com', '+392412223344', 'BRNLNZ85A41H123Z', '98765432122', 'Via Roma', '24', 'Siracusa', '96100'),
(25, 'Valentina', 'Caruso', 'valentina.caruso@email.com', '+392512223344', 'CRSVDL80A01H501A', '01234567913', 'Corso Italia', '25', 'Pisa', '56100'),
(26, 'Massimo', 'Gallo', 'massimo.gallo@email.com', '+392612223344', 'GLLMSS85A41H123B', '98765432124', 'Via Mazzini', '26', 'Cesena', '47500'),
(27, 'Martina', 'Silvestri', 'martina.silvestri@email.com', '+392712223344', 'SLVMRT80A01H501C', '01234567915', 'Piazza Vittorio', '27', 'Pordenone', '33170'),
(28, 'Luigi', 'Monti', 'luigi.monti@email.com', '+392812223344', 'MNTLGI85A41H123D', '98765432126', 'Corso Umberto', '28', 'Ancona', '60100'),
(29, 'Silvia', 'Orlando', 'silvia.orlando@email.com', '+392912223344', 'RLNSLV80A01H501E', '01234567917', 'Via Garibaldi', '29', 'Udine', '33100'),
(30, 'Giacomo', 'Caputo', 'giacomo.caputo@email.com', '+393012223344', 'CPTGCM85A41H123F', '98765432128', 'Corso Cavour', '30', 'Potenza', '85100');

-- --------------------------------------------------------

--
-- Struttura della tabella `forme`
--

CREATE TABLE `forme` (
  `frm_id` int(11) NOT NULL,
  `frm_stagionatura` enum('12','24','30','36') NOT NULL,
  `frm_prima_scelta` tinyint(1) NOT NULL,
  `frm_data_produzione` date NOT NULL,
  `frm_progressivo_mese` int(11) NOT NULL,
  `frm_cln_id` int(11) DEFAULT NULL,
  `frm_csf_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `forme`
--

INSERT INTO `forme` (`frm_id`, `frm_stagionatura`, `frm_prima_scelta`, `frm_data_produzione`, `frm_progressivo_mese`, `frm_cln_id`, `frm_csf_id`) VALUES
(49, '24', 1, '2024-05-01', 1, NULL, 1),
(50, '12', 1, '2024-05-01', 2, NULL, 1),
(51, '12', 1, '2024-05-01', 3, NULL, 1),
(52, '12', 1, '2024-05-01', 4, NULL, 1),
(53, '12', 1, '2024-05-01', 5, NULL, 1),
(54, '12', 1, '2024-05-01', 6, NULL, 1),
(55, '12', 1, '2024-05-01', 7, NULL, 1),
(56, '12', 1, '2024-05-01', 8, NULL, 1),
(57, '12', 1, '2024-05-01', 9, NULL, 1);

-- --------------------------------------------------------

--
-- Struttura della tabella `fotografie`
--

CREATE TABLE `fotografie` (
  `ftg_id` int(11) NOT NULL,
  `ftg_dex` varchar(255) NOT NULL,
  `ftg_csf_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `fotografie`
--

INSERT INTO `fotografie` (`ftg_id`, `ftg_dex`, `ftg_csf_id`) VALUES
(1, 'https://example.com/foto1.jpg', 1),
(2, 'https://example.com/foto2.jpg', 2),
(3, 'https://example.com/foto3.jpg', 3),
(4, 'https://example.com/foto4.jpg', 4),
(5, 'https://example.com/foto5.jpg', 5),
(6, 'https://example.com/foto6.jpg', 6),
(7, 'https://example.com/foto7.jpg', 7),
(8, 'https://example.com/foto8.jpg', 8),
(9, 'https://example.com/foto9.jpg', 9),
(10, 'https://example.com/foto10.jpg', 10),
(11, 'https://example.com/foto11.jpg', 11),
(12, 'https://example.com/foto12.jpg', 12),
(13, 'https://example.com/foto13.jpg', 13),
(14, 'https://example.com/foto14.jpg', 14),
(15, 'https://example.com/foto15.jpg', 15),
(16, 'https://example.com/foto16.jpg', 16),
(17, 'https://example.com/foto17.jpg', 17),
(18, 'https://example.com/foto18.jpg', 18),
(19, 'https://example.com/foto19.jpg', 19),
(20, 'https://example.com/foto20.jpg', 20),
(21, 'https://example.com/foto21.jpg', 21),
(22, 'https://example.com/foto22.jpg', 22),
(23, 'https://example.com/foto23.jpg', 23),
(24, 'https://example.com/foto24.jpg', 24),
(25, 'https://example.com/foto25.jpg', 25),
(26, 'https://example.com/foto26.jpg', 26),
(27, 'https://example.com/foto27.jpg', 27),
(28, 'https://example.com/foto28.jpg', 28),
(29, 'https://example.com/foto29.jpg', 29),
(30, 'https://example.com/foto30.jpg', 30);

-- --------------------------------------------------------

--
-- Struttura della tabella `province`
--

CREATE TABLE `province` (
  `prv_id` int(11) NOT NULL,
  `prv_dex` varchar(50) NOT NULL,
  `prv_sigla` char(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `province`
--

INSERT INTO `province` (`prv_id`, `prv_dex`, `prv_sigla`) VALUES
(1, 'Agrigento', 'AG'),
(2, 'Alessandria', 'AL'),
(3, 'Ancona', 'AN'),
(4, 'Aosta', 'AO'),
(5, 'Arezzo', 'AR'),
(6, 'Ascoli Piceno', 'AP'),
(7, 'Asti', 'AT'),
(8, 'Avellino', 'AV'),
(9, 'Bari', 'BA'),
(10, 'Barletta-Andria-Trani', 'BT'),
(11, 'Belluno', 'BL'),
(12, 'Benevento', 'BN'),
(13, 'Bergamo', 'BG'),
(14, 'Biella', 'BI'),
(15, 'Bologna', 'BO'),
(16, 'Bolzano', 'BZ'),
(17, 'Brescia', 'BS'),
(18, 'Brindisi', 'BR'),
(19, 'Cagliari', 'CA'),
(20, 'Caltanissetta', 'CL'),
(21, 'Campobasso', 'CB'),
(22, 'Carbonia-Iglesias', 'CI'),
(23, 'Caserta', 'CE'),
(24, 'Catania', 'CT'),
(25, 'Catanzaro', 'CZ'),
(26, 'Chieti', 'CH'),
(27, 'Como', 'CO'),
(28, 'Cosenza', 'CS'),
(29, 'Cremona', 'CR'),
(30, 'Crotone', 'KR'),
(31, 'Cuneo', 'CN'),
(32, 'Enna', 'EN'),
(33, 'Fermo', 'FM'),
(34, 'Ferrara', 'FE'),
(35, 'Firenze', 'FI'),
(36, 'Foggia', 'FG'),
(37, 'Forlì-Cesena', 'FC'),
(38, 'Frosinone', 'FR'),
(39, 'Genova', 'GE'),
(40, 'Gorizia', 'GO'),
(41, 'Grosseto', 'GR'),
(42, 'Imperia', 'IM'),
(43, 'Isernia', 'IS'),
(44, 'La Spezia', 'SP'),
(45, 'L\'Aquila', 'AQ'),
(46, 'Latina', 'LT'),
(47, 'Lecce', 'LE'),
(48, 'Lecco', 'LC'),
(49, 'Livorno', 'LI'),
(50, 'Lodi', 'LO'),
(51, 'Lucca', 'LU'),
(52, 'Macerata', 'MC'),
(53, 'Mantova', 'MN'),
(54, 'Massa-Carrara', 'MS'),
(55, 'Matera', 'MT'),
(56, 'Medio Campidano', 'VS'),
(57, 'Messina', 'ME'),
(58, 'Milano', 'MI'),
(59, 'Modena', 'MO'),
(60, 'Monza e della Brianza', 'MB'),
(61, 'Napoli', 'NA'),
(62, 'Novara', 'NO'),
(63, 'Nuoro', 'NU'),
(64, 'Ogliastra', 'OG'),
(65, 'Olbia-Tempio', 'OT'),
(66, 'Oristano', 'OR'),
(67, 'Padova', 'PD'),
(68, 'Palermo', 'PA'),
(69, 'Parma', 'PR'),
(70, 'Pavia', 'PV'),
(71, 'Perugia', 'PG'),
(72, 'Pesaro e Urbino', 'PU'),
(73, 'Pescara', 'PE'),
(74, 'Piacenza', 'PC'),
(75, 'Pisa', 'PI'),
(76, 'Pistoia', 'PT'),
(77, 'Pordenone', 'PN'),
(78, 'Potenza', 'PZ'),
(79, 'Prato', 'PO'),
(80, 'Ragusa', 'RG'),
(81, 'Ravenna', 'RA'),
(82, 'Reggio Calabria', 'RC'),
(83, 'Reggio Emilia', 'RE'),
(84, 'Rieti', 'RI'),
(85, 'Rimini', 'RN'),
(86, 'Roma', 'RM'),
(87, 'Rovigo', 'RO'),
(88, 'Salerno', 'SA'),
(89, 'Sassari', 'SS'),
(90, 'Savona', 'SV'),
(91, 'Siena', 'SI'),
(92, 'Siracusa', 'SR'),
(93, 'Sondrio', 'SO'),
(94, 'Taranto', 'TA'),
(95, 'Teramo', 'TE'),
(96, 'Terni', 'TR'),
(97, 'Torino', 'TO'),
(98, 'Trapani', 'TP'),
(99, 'Trento', 'TN'),
(100, 'Treviso', 'TV'),
(101, 'Trieste', 'TS'),
(102, 'Udine', 'UD'),
(103, 'Varese', 'VA'),
(104, 'Venezia', 'VE'),
(105, 'Verbano-Cusio-Ossola', 'VB'),
(106, 'Vercelli', 'VC'),
(107, 'Verona', 'VR'),
(108, 'Vibo Valentia', 'VV'),
(109, 'Vicenza', 'VI'),
(110, 'Viterbo', 'VT');

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `attivita_giornaliere`
--
ALTER TABLE `attivita_giornaliere`
  ADD PRIMARY KEY (`atg_id`),
  ADD KEY `atg_csf_id` (`atg_csf_id`);

--
-- Indici per le tabelle `caseifici`
--
ALTER TABLE `caseifici`
  ADD PRIMARY KEY (`csf_id`),
  ADD KEY `csf_prv_id` (`csf_prv_id`);

--
-- Indici per le tabelle `clienti`
--
ALTER TABLE `clienti`
  ADD PRIMARY KEY (`cln_id`);

--
-- Indici per le tabelle `forme`
--
ALTER TABLE `forme`
  ADD PRIMARY KEY (`frm_id`),
  ADD KEY `frm_cln_id` (`frm_cln_id`),
  ADD KEY `frm_csf_id` (`frm_csf_id`);

--
-- Indici per le tabelle `fotografie`
--
ALTER TABLE `fotografie`
  ADD PRIMARY KEY (`ftg_id`),
  ADD KEY `ftg_csf_id` (`ftg_csf_id`);

--
-- Indici per le tabelle `province`
--
ALTER TABLE `province`
  ADD PRIMARY KEY (`prv_id`),
  ADD UNIQUE KEY `prv_dex` (`prv_dex`),
  ADD UNIQUE KEY `prv_sigla` (`prv_sigla`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `attivita_giornaliere`
--
ALTER TABLE `attivita_giornaliere`
  MODIFY `atg_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT per la tabella `caseifici`
--
ALTER TABLE `caseifici`
  MODIFY `csf_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT per la tabella `clienti`
--
ALTER TABLE `clienti`
  MODIFY `cln_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT per la tabella `forme`
--
ALTER TABLE `forme`
  MODIFY `frm_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=59;

--
-- AUTO_INCREMENT per la tabella `fotografie`
--
ALTER TABLE `fotografie`
  MODIFY `ftg_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT per la tabella `province`
--
ALTER TABLE `province`
  MODIFY `prv_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=111;

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `attivita_giornaliere`
--
ALTER TABLE `attivita_giornaliere`
  ADD CONSTRAINT `attivita_giornaliere_ibfk_1` FOREIGN KEY (`atg_csf_id`) REFERENCES `caseifici` (`csf_id`);

--
-- Limiti per la tabella `caseifici`
--
ALTER TABLE `caseifici`
  ADD CONSTRAINT `caseifici_ibfk_1` FOREIGN KEY (`csf_prv_id`) REFERENCES `province` (`prv_id`);

--
-- Limiti per la tabella `forme`
--
ALTER TABLE `forme`
  ADD CONSTRAINT `forme_ibfk_1` FOREIGN KEY (`frm_cln_id`) REFERENCES `clienti` (`cln_id`),
  ADD CONSTRAINT `forme_ibfk_2` FOREIGN KEY (`frm_csf_id`) REFERENCES `caseifici` (`csf_id`);

--
-- Limiti per la tabella `fotografie`
--
ALTER TABLE `fotografie`
  ADD CONSTRAINT `fotografie_ibfk_1` FOREIGN KEY (`ftg_csf_id`) REFERENCES `caseifici` (`csf_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
