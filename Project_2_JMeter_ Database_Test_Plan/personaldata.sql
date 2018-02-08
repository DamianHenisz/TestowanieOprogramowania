-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Czas generowania: 05 Lut 2018, 17:24
-- Wersja serwera: 10.1.21-MariaDB
-- Wersja PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `mysql`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `personaldata`
--

CREATE TABLE `personaldata` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `surname` varchar(50) NOT NULL,
  `dateBirth` date NOT NULL,
  `pesel` char(11) NOT NULL,
  `telephoneNumber` char(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Zrzut danych tabeli `personaldata`
--

INSERT INTO `personaldata` (`id`, `name`, `surname`, `dateBirth`, `pesel`, `telephoneNumber`) VALUES
(1, 'Damian', 'Henisz', '1993-01-12', '93011248706', '737528870'),
(2, 'Martyna', 'Slifirska', '1993-10-19', '93101993412', '666427306'),
(3, 'Robert', 'Wozniak', '1952-12-12', '52121211209', '881639250'),
(4, 'Tadeusz', 'Szymanski', '1920-03-25', '20032592119', '789864943'),
(5, 'Teresa', 'Kowalska', '1987-09-17', '87091769005', '572353241'),
(6, 'Zofia', 'Raban', '1939-10-30', '39103049704', '699203354'),
(7, 'Renata', 'Berent', '2013-01-05', '13210551107', '508812864'),
(8, 'Halina', 'Lubaczewska', '1999-12-24', '99122447806', '729440737'),
(9, 'Bozena', 'Wobak', '1977-07-29', '77072990205', '603446995'),
(10, 'Stanislaw', 'Jager', '1955-05-06', '55050608913', '782594905'),
(11, 'Krzysztof', 'Obaczynski', '1988-08-03', '88080354013', '536793618');

--
-- Indeksy dla zrzutów tabel
--

--
-- Indexes for table `personaldata`
--
ALTER TABLE `personaldata`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT dla tabeli `personaldata`
--
ALTER TABLE `personaldata`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
