CREATE TABLE costumers (
login VARCHAR(50) PRIMARY KEY,
firstName VARCHAR(50),
lastName VARCHAR(50),
dateOfBirth DATE,
country VARCHAR(50),
sex ENUM ('Male','Female')
);