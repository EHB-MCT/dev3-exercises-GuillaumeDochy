/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

CREATE TABLE `cities` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` text CHARACTER SET utf8,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

CREATE TABLE `passengers` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` text CHARACTER SET utf8,
  `ride` int(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

CREATE TABLE `rides` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `departure time` datetime DEFAULT CURRENT_TIMESTAMP,
  `departure_city` text NOT NULL,
  `destination` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

CREATE TABLE `trains` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `type` text CHARACTER SET utf8,
  `max_speed` int(255) unsigned DEFAULT NULL,
  `max_passengers` int(255) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

INSERT INTO `cities` (`id`, `name`) VALUES
(1, 'Antwerp');
INSERT INTO `cities` (`id`, `name`) VALUES
(2, 'Mechelen');
INSERT INTO `cities` (`id`, `name`) VALUES
(3, 'Brussels');
INSERT INTO `cities` (`id`, `name`) VALUES
(4, 'Leuven');

INSERT INTO `passengers` (`id`, `name`, `ride`) VALUES
(1, 'rayan', 1);


INSERT INTO `rides` (`id`, `departure time`, `departure_city`, `destination`) VALUES
(1, '2021-11-09 13:00:00', '3', '1');
INSERT INTO `rides` (`id`, `departure time`, `departure_city`, `destination`) VALUES
(2, '2021-11-09 14:00:00', '3', '2');


INSERT INTO `trains` (`id`, `type`, `max_speed`, `max_passengers`) VALUES
(1, 'tgv', 200, 100);
INSERT INTO `trains` (`id`, `type`, `max_speed`, `max_passengers`) VALUES
(2, 'vervoer', 100, 10);
INSERT INTO `trains` (`id`, `type`, `max_speed`, `max_passengers`) VALUES
(3, 'circus', 150, 50);
INSERT INTO `trains` (`id`, `type`, `max_speed`, `max_passengers`) VALUES
(4, 'ic trein', 80, 60);


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;