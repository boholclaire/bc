-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 06, 2025 at 02:51 AM
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
-- Database: `birthingcenter`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_logs`
--

CREATE TABLE `tbl_logs` (
  `u_id` int(11) NOT NULL,
  `u_username` varchar(255) NOT NULL,
  `action_time` timestamp NOT NULL DEFAULT current_timestamp(),
  `log_action` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_patient`
--

CREATE TABLE `tbl_patient` (
  `p_id` int(11) NOT NULL,
  `p_firstname` varchar(255) NOT NULL,
  `p_lastname` varchar(255) NOT NULL,
  `p_age` text NOT NULL,
  `p_dob` text NOT NULL,
  `p_address` text NOT NULL,
  `p_contactNumber` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_patient`
--

INSERT INTO `tbl_patient` (`p_id`, `p_firstname`, `p_lastname`, `p_age`, `p_dob`, `p_address`, `p_contactNumber`) VALUES
(1, 'clara', 'bohol', '20', '01/24/2005', 'jaclupan,talisay city', '09279324540'),
(2, 'honey', 'cabrillos', '20', '01/24/2005', 'linao,talisay city', '09152536527');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `u_id` int(20) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_phoneNumber` varchar(50) NOT NULL,
  `u_password` varchar(150) NOT NULL,
  `u_type` varchar(50) NOT NULL,
  `u_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_fname`, `u_lname`, `u_username`, `u_email`, `u_phoneNumber`, `u_password`, `u_type`, `u_status`) VALUES
(1, 'klaire', 'bohol', 'klaire', 'klaire@gmail.com', '09279324540', 'klaire20', 'MANAGER', 'active'),
(3, 'michelle', 'jaberina', 'mich', 'mich@gmail.com', '09162748554', '8c6TF3EPmG0H1SpZ9ZvKWgiXocTzJtvRBs0l/eBRCHY=', 'MANAGER', 'Active'),
(4, 'kler', 'cabrillos', 'klerr', 'klerr@gmail.com', '09173648232', 'XezVTQGHwkr3U47XPATKbRDXA1uNHCJYtT63Mp+E1t8=', 'NURSE', 'Active'),
(8, 'kai', 'cab', 'kai', 'kai@gmail.com', '09172634332', '5/dfwkW+Rs3ENrPkYzY7TWWRXsUGfLgTbCyPqIeBZtE=', 'MANAGER', 'Active'),
(9, 'honey', 'cabrillos', 'honey', 'honey@gmail.com', '09163547238', '1xjUqssUvaeT84ZVQPjPnnHkpfAyKkhAvnbuzeJOxec=', 'MANAGER', 'active'),
(10, 'lyka', 'bonghanoy', 'lyka', 'lyka@gmail.com', '09175678912', 'd5VWD8bwStKl9dNf9MBP8WNwNLU9ENvaqaqZjBs8dsg=', 'NURSE', 'active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  ADD PRIMARY KEY (`u_id`);

--
-- Indexes for table `tbl_patient`
--
ALTER TABLE `tbl_patient`
  ADD PRIMARY KEY (`p_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  MODIFY `u_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_patient`
--
ALTER TABLE `tbl_patient`
  MODIFY `p_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
