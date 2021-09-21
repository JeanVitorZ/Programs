create database if not exists trab1;

use trab1;

drop table if exists DadosColab;

CREATE TABLE `DadosColab` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(64) DEFAULT NULL,
  `email` varchar(64) DEFAULT NULL,
  `department` varchar(64) DEFAULT NULL,
  `contrato` varchar(64) DEFAULT NULL,
  `regime` DECIMAL(10) DEFAULT NULL,
  `salary` DECIMAL(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `DadosColab` (`id`,`Nome`,`email`, `department`, `contrato`,`regime`,`salary`) VALUES (1,'Doe John','john.doe@foo.com', 'HR', 'CLT', 220, 55000.00);
INSERT INTO `DadosColab` (`id`,`Nome`,`email`, `department`, `contrato`,`regime`,`salary`) VALUES (2,'Public Mary','mary.public@foo.com', 'Engineering', 'CLT', 200, 75000.00);
INSERT INTO `DadosColab` (`id`,`Nome`,`email`, `department`, `contrato`,`regime`,`salary`) VALUES (3,'Queue Susan','susan.queue@foo.com', 'Legal','PJ', 40, 130000.00);

INSERT INTO `DadosColab` (`id`,`Nome`,`email`, `department`, `contrato`,`regime`,`salary`) VALUES (4,'Williams David','david.williams@foo.com', 'HR', 'CLT', 220, 120000.00);
INSERT INTO `DadosColab` (`id`,`Nome`,`email`, `department`, `contrato`,`regime`,`salary`) VALUES (5,'Johnson Lisa','lisa.johnson@foo.com', 'Engineering','CLT', 200, 50000.00);
INSERT INTO `DadosColab` (`id`,`Nome`,`email`, `department`, `contrato`,`regime`,`salary`) VALUES (6,'Smith Paul','paul.smith@foo.com', 'Legal', 'PJ', 40, 100000.00);

INSERT INTO `DadosColab` (`id`,`Nome`,`email`, `department`, `contrato`,`regime`,`salary`) VALUES (7,'Adams Carl','carl.adams@foo.com', 'HR','CLT', 220, 50000.00);
INSERT INTO `DadosColab` (`id`,`Nome`,`email`, `department`, `contrato`,`regime`,`salary`) VALUES (8,'Brown Bill','bill.brown@foo.com', 'Engineering', 'CLT', 200, 50000.00);
INSERT INTO `DadosColab` (`id`,`Nome`,`email`, `department`, `contrato`,`regime`,`salary`) VALUES (9,'Thomas Susan','susan.thomas@foo.com', 'Legal', 'PJ', 40, 80000.00);

INSERT INTO `DadosColab` (`id`,`Nome`,`email`, `department`, `contrato`,`regime`,`salary`) VALUES (10,'Davis John','john.davis@foo.com', 'HR', 'CLT', 220, 45000.00);
INSERT INTO `DadosColab` (`id`,`Nome`,`email`, `department`, `contrato`,`regime`,`salary`) VALUES (11,'Fowler Mary','mary.fowler@foo.com', 'Engineering', 'CLT', 200, 65000.00);
INSERT INTO `DadosColab` (`id`,`Nome`,`email`, `department`, `contrato`,`regime`,`salary`) VALUES (12,'Waters David','david.waters@foo.com', 'Legal', 'PJ', 40, 90000.00);
