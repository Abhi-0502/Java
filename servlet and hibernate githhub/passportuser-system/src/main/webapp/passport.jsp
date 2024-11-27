<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Passport Seva</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background-image: url('passportseva.jpg'); /* Replace 'background.jpg' with your image file name */
            background-size: cover;
            background-repeat: no-repeat;
            background-position: center;
            color: #333;
        }
        header {
            background-color: rgba(0, 0, 0, 0.7);
            padding: 10px 20px;
            color: white;
            text-align: center;
        }
        h2 {
            margin: 20px 0;
            color: white;
            text-align: center;
        }
        form {
            background-color: rgba(255, 255, 255, 0.9);
            max-width: 500px;
            margin: 40px auto;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
        }
        form input {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        form input[type="submit"] {
            background-color: #007bff;
            color: white;
            border: none;
            cursor: pointer;
            padding: 12px;
            font-weight: bold;
        }
        form input[type="submit"]:hover {
            background-color: #0056b3;
        }
        nav {
            text-align: center;
            margin: 20px 0;
        }
        nav a {
            color: white;
            text-decoration: none;
            margin: 0 15px;
            font-weight: bold;
        }
        nav a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <header>
        <h1>Passport Seva</h1>
        <nav>
            <a href="home.html">Home</a>
            <a href="about.html">About</a>
            <a href="contact.html">Contact</a>
        </nav>
    </header>
    <h2>Passport Register</h2>
    <form action="passport" method="post">
        <label for="cprLocation">CprLocation:</label>
       <input type="text" name="cprLocation">

        <label for="dcdrLocation">DcdrLocation:</label>
        <input type="text" name="dcdrLocation">

        <label for="givenName">Given Name:</label>
        <input type="text" name="givenName">

        <label for="dob">Date of Birth:</label>
       <input type="date" name="dob">

        <label for="email">Email:</label>
       <input type="email" name="email">

        <label for="surName">Surname:</label>
       <input type="text" name="surName">

        <label for="isEmailLoginSame">Is Email Login Same:</label>
         <input type= name="isEmailLoginSame">

        <label for="loginId">Login ID:</label>
        <input type="number" name="loginId">

        <label for="pwd">Password:</label>
       <input type="password" name="pwd">

        <label for="confirmPwd">Confirm Password:</label>
         <input type="password" name="confirmPwd">

        <label for="hideAns">Hide Answer:</label>
       <input type="text" name="hideAns">

        <label for="captcha">Captcha:</label>
         <input type="text" name="captcha">

        <input type="submit" value="Register">
        <input type="reset" value="Cancel">
    </form>
</body>
</html>
