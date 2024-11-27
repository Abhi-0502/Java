<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Passport Register</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background-image: url('passport.jpg'); /* Replace 'background.jpg' with your image file name */
            background-size: cover;
            background-repeat: no-repeat;
            background-position: center;
            color: red;
        }
        header {
            background-color: rgba(0, 0, 0, 0.8);
            padding: 15px;
            text-align: center;
        }
        header h1 {
            margin: 0;
            color: #fff;
            font-size: 2em;
        }
        nav {
            text-align: center;
            margin-top: 10px;
        }
        nav a {
            text-decoration: none;
            color: #fff;
            margin: 0 15px;
            font-size: 1.2em;
            font-weight: bold;
        }
        nav a:hover {
            text-decoration: underline;
        }
        main {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: calc(100vh - 80px); /* Adjust to exclude header height */
        }
        h2 {
            font-size: 2em;
            margin-bottom: 20px;
            text-shadow: 2px 2px 5px rgba(0, 0, 0, 0.7);
        }
        a.button {
            display: inline-block;
            text-decoration: none;
            background-color: #007bff;
            color: white;
            padding: 15px 25px;
            font-size: 1.2em;
            font-weight: bold;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.3);
            transition: all 0.3s ease;
        }
        a.button:hover {
            background-color: #0056b3;
            transform: translateY(-3px);
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
    <main>
        <h2>Passport Register</h2>
        <a href="passport.jsp" class="button">Open Register</a>
    </main>
</body>
</html>


