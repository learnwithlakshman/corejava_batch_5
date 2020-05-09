DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `empno` int(11) NOT NULL DEFAULT '0',
  `ename` varchar(100) DEFAULT NULL,
  `dname` varchar(100) DEFAULT NULL,
  `salary` float DEFAULT NULL
) ;
INSERT INTO `employee` VALUES (1,'Krish','DEV',89000),
(2,'Naresh','QA',61600),
(3,'Manoj','DEV',76000),
(4,'Sai','QA',50600),
(5,'Mahesh','QA',61600),
(6,'Rajesh','SALES',76000),
(7,'Rani','SALES',46000),
(8,'Tanvi','SALES',58000),
(9,'Pradeep','DEV',90000),
(10,'Chandu','QA',61600),
(11,'Charan','SALES',76000),
(12,'Rajani','SALES',46000);
