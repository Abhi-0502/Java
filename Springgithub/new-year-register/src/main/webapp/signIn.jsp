<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Happy New Year - Sign In</title>
    <style>
        /* Global styles */
        body {
            font-family: 'Roboto', sans-serif;
            background: linear-gradient(rgba(0, 0, 0, 0.6), rgba(0, 0, 0, 0.6)),
                        url('https://bsmedia.business-standard.com/_media/bs/img/article/2024-12/31/full/1735642589-2835.jpg?im=FitAndFill=(826,465.jpg') no-repeat center center;
            background-size: cover;
            height: 100vh;
            margin: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            color: #ffffff;
        }

        header {
            position: absolute;
            top: 0;
            width: 100%;
            background: rgba(0, 0, 0, 0.5);
            padding: 10px 20px;
            text-align: left;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }

        header a {
            color: #ffffff;
            text-decoration: none;
            font-weight: bold;
            font-size: 16px;
        }

        header a:hover {
            text-decoration: underline;
        }

        .form-container {
            background: url('https://cdn.pixabay.com/photo/2023/01/01/12/12/happy-new-year-2023-7699325_960_720.jpg') no-repeat center center;
            background-size: cover;
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0 8px 15px rgba(0, 0, 0, 0.2);
            width: 350px;
            text-align: center;
            animation: fadeIn 1.5s ease-in-out;
        }

        @keyframes fadeIn {
            from {
                opacity: 0;
                transform: translateY(20px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }

        h2 {
            color: #ff6f61;
            font-size: 24px;
            margin-bottom: 20px;
            letter-spacing: 1px;
        }

        .form-group {
            margin-bottom: 20px;
            text-align: left;
        }

        .form-group label {
            font-weight: bold;
            color: #fff; /* Updated for contrast with the form background */
            display: block;
            margin-bottom: 5px;
            font-size: 14px;
        }

        .form-group input {
            width: 100%;
            padding: 10px;
            font-size: 16px;
            border: 1px solid #ddd;
            border-radius: 5px;
            transition: all 0.3s;
        }

        .form-group input:focus {
            border-color: #ff6f61;
            outline: none;
        }

        .form-buttons {
            display: flex;
            justify-content: space-between;
            margin-top: 20px;
        }

        .form-buttons input {
            width: 48%;
            padding: 10px;
            font-size: 16px;
            font-weight: bold;
            border: none;
            border-radius: 5px;
            background-color: #ff6f61;
            color: white;
            cursor: pointer;
            transition: all 0.3s;
        }

        .form-buttons input:hover {
            background-color: #e25550;
        }

        .forgot-password {
            margin-top: 10px;
            font-size: 14px;
        }

        .forgot-password a {
            color: #ff6f61;
            text-decoration: none;
        }

        .forgot-password a:hover {
            text-decoration: underline;
        }

        #error-message {
            color: red;
            font-size: 14px;
            margin-top: 10px;
        }

        .response-message h2 {
            color: #333;
        }

        footer {
            position: absolute;
            bottom: 10px;
            font-size: 14px;
            color: #ffffff;
            letter-spacing: 0.5px;
        }
    </style>
</head>
<body>

    <!-- Header -->
    <header>
        <a href="index.jsp">Home</a>
    </header>

    <!-- Sign In Form -->
    <div class="form-container">
        <h2>Welcome 2025 </h2>
        <form id="signinForm" action="signIn" method = "post" onsubmit="return validateForm()">

            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required placeholder="Enter your email">
            </div>

            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required placeholder="Enter your password">
            </div>
        <div class="form-buttons">
    <input type="submit" value="Sign In">
    <input type="button" value="Back" onclick="goBack()">
      </div>

        </form>

        <div class="forgot-password">
            <a href="forgetpassword.jsp">Forgot Password?</a>
        </div>

        <div id="error-message"></div>

        <div class="response-message">
            <h2>${message}</h2>
        </div>
    </div>

    <footer>
        © 2025 - Cheers to New Beginnings!
    </footer>

    <script>
        function goBack() {
            window.location.href = 'form.jsp';
        }
    </script>

</body>
</html>
