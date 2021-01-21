CREATE DATABASE IBMConfirming CHARACTER SET utf8mb4;
USE IBMConfirming;
 
CREATE TABLE PROVEEDOR (
    IDPROVEEDOR INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    IDCLIENTE INT NOT NULL ,
    NOMBRE VARCHAR(25) NOT NULL,
    FECHAALTA DATE NOT NULL,
    FOREIGN KEY (IDCLIENTE) REFERENCES CLIENTE(IDCLIENTE)
);

CREATE TABLE CLIENTE (
    IDCLIENTE INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    NOMBRE VARCHAR(25) NOT NULL
);