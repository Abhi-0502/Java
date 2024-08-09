CREATE DATABASE product;
USE product;

CREATE TABLE product_info (product_id INT PRIMARY KEY,product_name VARCHAR(100) NOT NULL,category VARCHAR(50),price DECIMAL(10, 2),
    stock_quantity INT CHECK (stock_quantity >= 0),supplier_name VARCHAR(100),date_added DATE);
    
    SELECT *from product_info;
    
    CREATE TABLE order_info (order_id INT PRIMARY KEY,customer_id INT NOT NULL,order_date DATE NOT NULL,
    product_id INT,quantity INT CHECK (quantity > 0),total_amount DECIMAL(10, 2),
    status VARCHAR(50) CHECK (status IN ('Pending', 'Shipped', 'Delivered', 'Cancelled')));
    
    SELECT *from order_info;
    
    INSERT INTO product_info (product_id, product_name, category, price, stock_quantity, supplier_name, date_added) VALUES
(1, 'Laptop', 'Electronics', 999.99, 50, 'TechSupply Inc.', '2024-01-10'),
(2, 'Smartphone', 'Electronics', 499.99, 150, 'GadgetWorld Ltd.', '2024-01-15'),
(3, 'Headphones', 'Electronics', 199.99, 200, 'AudioExpert Co.', '2024-01-20'),
(4, 'Desk Chair', 'Furniture', 149.99, 75, 'HomeComforts LLC', '2024-01-25'),
(5, 'Office Desk', 'Furniture', 299.99, 60, 'HomeComforts LLC', '2024-01-30'),
(6, 'Coffee Maker', 'Appliances', 89.99, 100, 'KitchenMasters', '2024-02-05'),
(7, 'Blender', 'Appliances', 59.99, 120, 'KitchenMasters', '2024-02-10'),
(8, 'Smartwatch', 'Electronics', 249.99, 80, 'TechSupply Inc.', '2024-02-15'),
(9, 'Printer', 'Electronics', 129.99, 40, 'OfficeGear', '2024-02-20'),
(10, 'Monitor', 'Electronics', 219.99, 90, 'TechSupply Inc.', '2024-02-25'),
(11, 'Bookcase', 'Furniture', 179.99, 55, 'FurnitureWorks', '2024-03-01'),
(12, 'Lamp', 'Furniture', 49.99, 130, 'HomeComforts LLC', '2024-03-05'),
(13, 'Toaster', 'Appliances', 39.99, 150, 'KitchenMasters', '2024-03-10'),
(14, 'Microwave', 'Appliances', 119.99, 80, 'KitchenMasters', '2024-03-15'),
(15, 'Desk Lamp', 'Furniture', 29.99, 200, 'FurnitureWorks', '2024-03-20');

SELECT * from product_info;

INSERT INTO order_info (order_id, customer_id, order_date, product_id, quantity, total_amount, status) VALUES
(1, 101, '2024-01-12', 1, 1, 999.99, 'Shipped'),
(2, 102, '2024-01-16', 2, 2, 999.98, 'Delivered'),
(3, 103, '2024-01-22', 3, 3, 599.97, 'Pending'),
(4, 104, '2024-01-27', 4, 1, 149.99, 'Cancelled'),
(5, 105, '2024-02-01', 5, 1, 299.99, 'Shipped'),
(6, 106, '2024-02-06', 6, 1, 89.99, 'Delivered'),
(7, 107, '2024-02-11', 7, 2, 119.98, 'Shipped'),
(8, 108, '2024-02-16', 8, 1, 249.99, 'Pending'),
(9, 109, '2024-02-21', 9, 1, 129.99, 'Delivered'),
(10, 110, '2024-02-26', 10, 1, 219.99, 'Cancelled'),
(11, 111, '2024-03-03', 11, 1, 179.99, 'Shipped'),
(12, 112, '2024-03-07', 12, 2, 99.98, 'Pending'),
(13, 113, '2024-03-12', 13, 1, 39.99, 'Delivered'),
(14, 114, '2024-03-17', 14, 1, 119.99, 'Shipped'),
(15, 115, '2024-03-22', 15, 1, 29.99, 'Pending');

SELECT *from order_info;

ALTER TABLE product_info
MODIFY category VARCHAR(50) NOT NULL;

SELECT * from product_info;

ALTER TABLE product_info
MODIFY price DECIMAL(10, 2) NOT NULL;

SELECT * from product_info;

ALTER TABLE product_info
MODIFY date_added DATE NOT NULL;

SELECT * from product_info;

ALTER TABLE order_info
MODIFY total_amount DECIMAL(10, 2) NOT NULL;

SELECT *from order_info;

ALTER TABLE order_info
MODIFY status VARCHAR(50) NOT NULL;

SELECT *from order_info;

ALTER TABLE product_info
ADD CONSTRAINT unique_product_name UNIQUE (product_name);

SELECT *from product_info;

ALTER TABLE order_info
ADD CONSTRAINT unique_order_customer_product UNIQUE (customer_id, product_id);

SELECT *from  order_info;


