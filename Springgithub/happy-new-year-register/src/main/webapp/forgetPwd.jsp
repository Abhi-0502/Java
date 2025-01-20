<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Reset Password</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        h2 {
            color: #333;
        }
        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 300px;
        }
        label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
        }
        input {
            width: 100%;
            padding: 8px;
            margin-bottom: 16px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        button {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }
        button:hover {
            background-color: #45a049;
        }
        p {
            text-align: center;
            margin-top: 10px;
        }
        p.error {
            color: red;
        }
        p.success {
            color: green;
        }
        .sign-in {
            margin-top: 15px;
            text-align: center;
        }
        .sign-in a {
            color: #4CAF50;
            text-decoration: none;
            font-weight: bold;
        }
        .sign-in a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <form action="resetPassword" method="post">
        <h2>Reset Password</h2>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>

        <label for="newPassword">New Password:</label>
        <input type="password" id="newPassword" name="newPassword" required>

        <label for="confirmPassword">Confirm Password:</label>
        <input type="password" id="confirmPassword" name="confirmPassword" required>

        <button type="submit">Reset Password</button>
        <p class="error">${errorMessage}</p>
        <p class="success">${successMessage}</p>
        <div class="sign-in">
            <p>Remembered your password? <a href="signIn.jsp">Sign In</a></p>
        </div>
    </form>
</body>
</html>
