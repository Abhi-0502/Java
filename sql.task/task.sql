show databases;
CREATE DATABASE jun_o3;
USE jun_03;
CREATE DATABASE Employee;
use employee;
/* Syntax for creating table 
CREATE TABLE table_name(column_name datatype, column_name datatypes,...);*/


CREATE TABLE employee( id int,emp_name varchar(20),emp_Sal bigint,is_Active boolean,is_CreatedBy varchar(20),emp_Phone bigint,emp_address varchar(20));
CREATE database AM;
USE AM;
CREATE TABLE employee( id int,emp_name varchar(20),emp_Sal bigint,is_Active boolean,is_CreatedBy varchar(20),emp_Phone bigint,emp_address varchar(20));
USE AM;
CREATE TABLE student(id int,stu_name varchar(20),stu_Phone bigint,stu_address varchar(20));

use AM;
/*DESC table_name;*/
use am;
desc student;
CREATE TABLE student(id int,stu_name varchar(20),stu_Phone bigint,stu_address varchar(20));

SELECT *from student;
FROM : CLAUSE;
SELECT * FROM student;
/* Syntax for adding new column to existing system
ALTER TABLE table_name ADD COLUMN column_name datatypes;*/

ALTER TABLE student ADD COLUMN email varchar(20);
ALTER TABLE student ADD COLUMN branch varchar(20);


/*Syntax for removing  column to existing system
ALTER TABLE table_name DROP COLUMN column_name datatypes;*/

ALTER TABLE student Drop column email ;
ALTER TABLE student Drop column branch;

/*Syntax for rename column to existing system
ALTER TABLE name RENAME COLUMN existing_column To new_column;*/


CREATE DATABASE TASK;
USE task;
-- Create the first table
CREATE TABLE Employees (EmployeeID INT,FirstName VARCHAR(50),LastName VARCHAR(50),Department VARCHAR(50),HireDate DATE);

-- Create the second table
CREATE TABLE Departments (DepartmentID INT,DepartmentName VARCHAR(50),Location VARCHAR(50),Budget DECIMAL(10, 2),ManagerID INT);

 /*---ADD columns to the Employees table*/
ALTER TABLE Employees
ADD COLUMN Email VARCHAR(100),
ADD COLUMN PhoneNumber VARCHAR(15),
ADD COLUMN Address VARCHAR(255),
ADD COLUMN BirthDate DATE,
ADD COLUMN Salary DECIMAL(10, 2);

-- Add columns to the Departments table
ALTER TABLE Departments
ADD COLUMN EstablishedDate DATE,
ADD COLUMN NumberOfEmployees INT,
ADD COLUMN FloorNumber INT,
ADD COLUMN Building VARCHAR(50),
ADD COLUMN ContactPerson VARCHAR(100);

-- Remove columns from the Employees table
ALTER TABLE Employees
DROP COLUMN Address,
DROP COLUMN BirthDate;

-- Remove columns from the Departments table
ALTER TABLE Departments
DROP COLUMN FloorNumber,
DROP COLUMN Building;

-- Rename columns in the Employees table
ALTER TABLE Employees
RENAME COLUMN FirstName TO GivenName,
RENAME COLUMN LastName TO Surname,
RENAME COLUMN Department TO Dept,
RENAME COLUMN HireDate TO EmploymentDate;

-- Rename columns in the Departments table
ALTER TABLE Departments
RENAME COLUMN DepartmentID TO DeptID,
RENAME COLUMN DepartmentName TO DeptName,
RENAME COLUMN Location TO DeptLocation,
RENAME COLUMN Budget TO DeptBudget;

-- Modify columns in the Employees table
ALTER TABLE Employees
MODIFY COLUMN Email VARCHAR(150) NOT NULL,
MODIFY COLUMN PhoneNumber VARCHAR(20),
MODIFY COLUMN Salary DECIMAL(12, 2);

-- Modify columns in the Departments table
ALTER TABLE Departments
MODIFY COLUMN DeptName VARCHAR(100) NOT NULL,
MODIFY COLUMN EstablishedDate YEAR,
MODIFY COLUMN NumberOfEmployees INT DEFAULT 0;

-- Insert data into the Employees table
INSERT INTO Employees (EmployeeID, GivenName, Surname, Dept, EmploymentDate, Email, PhoneNumber, Salary)
VALUES
(1, 'John', 'Doe', 'HR', '2020-01-15', 'john.doe@example.com', '123-456-7890', 60000.00),
(2, 'Jane', 'Smith', 'Finance', '2021-02-20', 'jane.smith@example.com', '123-456-7891', 65000.00),
(3, 'Robert', 'Brown', 'IT', '2019-03-25', 'robert.brown@example.com', '123-456-7892', 70000.00),
(4, 'Emily', 'Davis', 'Marketing', '2022-04-30', 'emily.davis@example.com', '123-456-7893', 55000.00),
(5, 'Michael', 'Wilson', 'Sales', '2018-05-15', 'michael.wilson@example.com', '123-456-7894', 75000.00),
(6, 'Sarah', 'Johnson', 'HR', '2023-06-10', 'sarah.johnson@example.com', '123-456-7895', 62000.00),
(7, 'David', 'Lee', 'Finance', '2022-07-20', 'david.lee@example.com', '123-456-7896', 68000.00),
(8, 'Laura', 'Martinez', 'IT', '2019-08-25', 'laura.martinez@example.com', '123-456-7897', 71000.00),
(9, 'James', 'Taylor', 'Marketing', '2021-09-30', 'james.taylor@example.com', '123-456-7898', 56000.00),
(10, 'Olivia', 'Anderson', 'Sales', '2023-10-15', 'olivia.anderson@example.com', '123-456-7899', 76000.00);


-- Insert data into the Departments table
INSERT INTO Departments (DeptID, DeptName, DeptLocation, DeptBudget, ManagerID, EstablishedDate, NumberOfEmployees)
VALUES
(1, 'HR', 'New York', 500000.00, 1, 2010, 15),
(2, 'Finance', 'San Francisco', 700000.00, 2, 2012, 20),
(3, 'IT', 'Seattle', 800000.00, 3, 2015, 25),
(4, 'Marketing', 'Los Angeles', 600000.00, 4, 2018, 18),
(5, 'Sales', 'Chicago', 750000.00, 5, 2019, 22),
(6, 'Operations', 'Dallas', 650000.00, 6, 2020, 30),
(7, 'Legal', 'Houston', 550000.00, 7, 2021, 10),
(8, 'R&D', 'Austin', 900000.00, 8, 2022, 12),
(9, 'Customer Service', 'Miami', 450000.00, 9, 2023, 25),
(10, 'Logistics', 'Atlanta', 500000.00, 10, 2024, 17);