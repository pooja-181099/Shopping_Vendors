DROP DATABASE IF EXISTS springbootdb;
CREATE DATABASE springbootdb; 
USE springbootdb;

DROP TABLE IF EXISTS ShoppingVendor;

CREATE TABLE IF NOT EXISTS ShoppingVendor (
  vendorId varchar(11) NOT NULL ,
  vendorName varchar(20) DEFAULT NULL,
  vendorAddress varchar(30) DEFAULT NULL,
  vendorPhoneNumber varchar(10),
  PRIMARY KEY (vendorId)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

INSERT INTO ShoppingVendor (vendorId, vendorName,vendorAddress, vendorPhoneNumber) VALUES
	('1001', 'MSD'   ,'101' , '100000'),
	('1002', 'James' ,'101' , '56700'),
	('1003', 'Rocky' ,'102' , '100000');
commit;