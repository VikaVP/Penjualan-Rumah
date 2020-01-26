-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 26, 2020 at 03:31 AM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbmahasiswa`
--

-- --------------------------------------------------------

--
-- Table structure for table `nilai`
--

CREATE TABLE `nilai` (
  `nim` varchar(10) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `matkul` varchar(100) DEFAULT NULL,
  `nil1` varchar(10) DEFAULT NULL,
  `nil2` varchar(10) DEFAULT NULL,
  `rata` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nilai`
--

INSERT INTO `nilai` (`nim`, `nama`, `matkul`, `nil1`, `nil2`, `rata`) VALUES
('57458', 'Sarah Ayu', 'Pemrograman II', '80', '90', '85'),
('4648482', 'Asep Nurdin', 'Pemrograman II', '90', '90', '90'),
('62774', 'Wika Silo', 'Pemrograman II', '80', '70', '75'),
('251526', 'Sona Andra', 'Pemrograman II', '70', '70', '70'),
('421424', 'Sri Kartini', 'Pemrograman II', '90', '100', '95'),
('7687587', 'Hilbert', 'Pemrograman II', '100', '90', '95'),
('586156', 'Khusnul Khotimah', 'Pemrograman II', '80', '90', '85'),
('758757', 'Nurul Jannah', 'Pemrograman II', '90', '90', '90'),
('12424', 'Maemunah', 'Pemrograman II', '90', '70', '80'),
('42523', 'Chika Umani', 'Pemrograman II', '70', '80', '75');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
