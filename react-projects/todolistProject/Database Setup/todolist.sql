-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 29, 2018 at 07:37 AM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `todolist`
--

-- --------------------------------------------------------

--
-- Table structure for table `task`
--

CREATE TABLE `task` (
  `id` int(11) NOT NULL,
  `userid` int(11) NOT NULL,
  `task` varchar(1500) NOT NULL,
  `priority` varchar(6) NOT NULL,
  `date` date NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `task`
--

INSERT INTO `task` (`id`, `userid`, `task`, `priority`, `date`, `status`) VALUES
(1, 1, '234', 'HIGH', '2018-10-25', 'DONE'),
(2, 1, 'Todo Python Learning', 'LOW', '2018-10-25', 'TODO'),
(3, 1, '34', 'HIGH', '2018-10-25', 'DONE'),
(4, 1, '34', 'HIGH', '2018-10-25', 'FINISHED'),
(5, 1, '343244234', 'LOW', '2018-10-25', 'TODO'),
(6, 1, '2313', 'HIGH', '2018-10-25', 'FINISHED'),
(7, 1, '234234', 'HIGH', '2018-10-25', 'TODO'),
(8, 1, 'Tost Wala Done', 'MID', '2018-10-25', 'FINISHED'),
(9, 1, 'TODO DONE I THINK', 'MID', '2018-10-25', 'DONE'),
(10, 1, 'TODO REDIRECT DONE', 'LOW', '2018-10-25', 'TODO'),
(11, 1, 'TESTING', 'HIGH', '2018-10-25', 'TODO'),
(12, 1, 'HELLO WORLD', 'MID', '2018-10-25', 'TODO'),
(13, 1, 'Hello Testing', 'HIGH', '2018-10-25', 'TODO'),
(14, 1, '3453454', 'HIGH', '2018-10-25', 'TODO'),
(15, 1, 'Hello', 'LOW', '2018-10-25', 'TODO'),
(16, 1, '345345', 'MID', '2018-10-25', 'TODO'),
(17, 1, '345345345435', 'LOW', '2018-10-25', 'TODO'),
(18, 1, 'Done All', 'HIGH', '2018-10-25', 'TODO'),
(19, 1, 'wqewqewqewqewqewqewqwqewqewqewqeqwewewqewqewqewqewewqeqwewqewqewqewqeqwewqewqewqewqewq', 'HIGH', '2018-10-26', 'DONE'),
(20, 1, '3234324234234234234234234234234', 'MID', '2018-10-26', 'DONE'),
(21, 1, 'hey', 'HIGH', '2018-10-26', 'FINISHED'),
(22, 1, '5151616164141154151', 'HIGH', '2018-10-26', 'TODO'),
(23, 1, 'ewrwer', 'HIGH', '2018-10-29', 'DONE'),
(24, 1, '345345', 'HIGH', '2018-10-29', 'TODO'),
(25, 1, 'Hello World', 'LOW', '2018-10-29', 'TODO'),
(26, 1, '5878715', 'HIGH', '2018-10-29', 'TODO');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `task`
--
ALTER TABLE `task`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `task`
--
ALTER TABLE `task`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
