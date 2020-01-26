-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 26, 2020 at 03:32 AM
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
-- Database: `penjualan_rumah`
--

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `id` int(8) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `harga_tanah` varchar(100) DEFAULT NULL,
  `area` varchar(100) DEFAULT NULL,
  `harga_bangunan` varchar(100) DEFAULT NULL,
  `tipe_rumah` varchar(10) DEFAULT NULL,
  `luas_tanah_asli` varchar(100) DEFAULT NULL,
  `luas_tanah_tersedia` varchar(100) DEFAULT NULL,
  `harga_sebelum_pajak` varchar(100) DEFAULT NULL,
  `harga_dp` varchar(100) DEFAULT NULL,
  `lama_cicilan` varchar(100) DEFAULT NULL,
  `pajak` varchar(100) DEFAULT NULL,
  `cicilan_bulanan` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`id`, `nama`, `harga_tanah`, `area`, `harga_bangunan`, `tipe_rumah`, `luas_tanah_asli`, `luas_tanah_tersedia`, `harga_sebelum_pajak`, `harga_dp`, `lama_cicilan`, `pajak`, `cicilan_bulanan`) VALUES
(2, 'Widi', '500000', 'Bogenvile', '90000000', 'Type-45', '90', '90', '135000000', '13500000', '36', '13500000', '3750000'),
(3, 'Sarah Putri', '700000', 'Flamboyan', '150000000', 'Type-54', '140', '140', '248000000', '24800000', '36', '24800000', '6888888');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `penjualan`
--
ALTER TABLE `penjualan`
  MODIFY `id` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
