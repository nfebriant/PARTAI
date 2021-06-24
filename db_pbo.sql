-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 24 Jun 2021 pada 07.04
-- Versi server: 10.4.17-MariaDB
-- Versi PHP: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_pbo`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `partai`
--

CREATE TABLE `partai` (
  `No` int(11) NOT NULL,
  `Komoditas` varchar(30) DEFAULT NULL,
  `Daerah` varchar(30) DEFAULT NULL,
  `Harga` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `partai`
--

INSERT INTO `partai` (`No`, `Komoditas`, `Daerah`, `Harga`) VALUES
(1, 'Padi', 'Jawa Tengah', 8750),
(2, 'Padi', 'Jawa Barat', 9500),
(4, 'Padi', 'Jawa Timur', 8500),
(8, 'kelapa', 'Aceh', 15000),
(9, 'Cengkeh', 'Sulawesi Selatan', 60000),
(10, 'jagung', 'Sulawesi Tengah', 15000),
(11, 'Jagung', 'Jawa Tengah', 15000);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `partai`
--
ALTER TABLE `partai`
  ADD PRIMARY KEY (`No`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `partai`
--
ALTER TABLE `partai`
  MODIFY `No` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
