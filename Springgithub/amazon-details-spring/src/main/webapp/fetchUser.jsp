<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored = "false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="con" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Paytm Login Details</title>
    <style>
            /* General Styles */
            body {
                background-image: url('https://t4.ftcdn.net/jpg/06/27/00/35/240_F_627003539_rVIbhYAF2up1M4QhbLS0v8CGsTpsWt41.jpg');
                background-size: cover;
                background-repeat: no-repeat;
                background-attachment: fixed;
                font-family: Arial, sans-serif;
                margin: 0;
                padding: 0;
            }

            h2 {
                text-align: center;
                color: white;
                margin-top: 100px;
            }

            /* Header Styles */
            .header {
                width: 90%;
                background-color: rgba(0, 0, 0, 0.7);
                color: white;
                display: flex;
                justify-content: space-between;
                align-items: center;
                padding: 10px 30px;
                position: fixed;
                top: 0;
                z-index: 1000;
            }

            .header .logo {
                font-size: 20px;
                font-weight: bold;
            }

            .header .nav-links {
                display: flex;
                gap: 100px;
            }

            .header .nav-links a {
                text-decoration: none;
                color: white;
                font-size: 16px;
                font-weight: bold;
                transition: color 0.3s;
            }

            .header .nav-links a:hover {
                color: #4CAF50;
            }

            /* Form Styles */
            form {
                background: rgba(255, 255, 255, 0.8);
                padding: 20px;
                border-radius: 5px;
                max-width: 400px;
                margin: 20px auto;
                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            }

            input[type="text"], input[type="number"], input[type="submit"], input[type="datetime-local"] {
                width: 100%;
                padding: 10px;
                margin: 10px 0;
                border: 1px solid #ccc;
                border-radius: 5px;
            }

            input[type="submit"] {
                background-color: #4CAF50;
                color: white;
                cursor: pointer;
                font-weight: bold;
            }

            input[type="submit"]:hover {
                background-color: #45a049;
            }

            a {
                text-decoration: none;
                color: #4CAF50;
                font-weight: bold;
            }

            a:hover {
                text-decoration: underline;
            }
        </style>
    </head>
    <body>

    <!-- Header Section -->
    <div class="header">
        <div class="logo">Paytm Update Details</div>
        <div class="nav-links">
            <a href="index.jsp">Home</a>
            <a href="getAllUser">GetAll</a>

        </div>
    </div>

<!-- Main Content -->
<h2>Product Details</h2>
<form action="updateUser" method="post">
    <input type="text" hidden name="id" value="${users.id}">

    <label for="productName">Product Name:</label>
    <input type="text" id="productName" name="productName" placeholder="Enter  name" value="${users.productName}"required>>>

    <label for="productQuality">Product Quality:</label>
    <input type="text" id="productQuality" name="productQuality" placeholder="Enter  name productQuality " value="${users.productQuality}"required>>>

    <label for="productPrice">Product Price:</label>
    <input type="text" id="productPrice" name="productPrice" placeholder="Enter  productPrice" value="${users.productPrice}"required>>>

    <label for="productCategory">Product Category:</label>
    <input type="text" id="productCategory" name="productCategory" placeholder="Enter  productCategory" value="${users.productCategory}"required>>>

    <label for="productDescription">Product Description:</label>
    <input type="text" id="productDescription" name="productDescription" placeholder="Enter  productDescription" value="${users.productDescription}"required>>>

    <label for="productStock">Product Stock:</label>
    <input type="number" id="productStock" name="productStock" placeholder="Enter  productStock" value="${users.productStock}"required>>>

    <label for="productBrand">Product Brand:</label>
    <input type="text" id="productBrand" name="productBrand" placeholder="Enter  productBrand" value="${users.productBrand}"required>>>

    <label for="productWeight">Product Weight (kg):</label>
    <input type="number" id="productWeight" name="productWeight" step="0.01" placeholder="Enter  productWeight" value="${users.productWeight}"required>>>


    <input type="submit" value="Submit">
</form>

    <!-- Next Page Link -->
    <div class="getpaytmbyid.jsp">
        <a href="#">Next Page</a>
    </div>

</body>
</html>
