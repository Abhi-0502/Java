<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calendar Event System</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-image: url('background.jpg'); /* Replace 'background.jpg' with your image path */
            background-size: cover;
            color: #fff;
            margin: 0;
            padding: 0;
        }
        header {
            background-color: rgba(0, 0, 0, 0.7);
            padding: 20px;
            text-align: center;
        }
        form {
            background-color: rgba(255, 255, 255, 0.8);
            border-radius: 10px;
            padding: 20px;
            max-width: 400px;
            margin: 20px auto;
            color: #000;
        }
        input, select {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border-radius: 5px;
            border: 1px solid #ccc;
        }
        input[type="submit"] {
            background-color: #007BFF;
            color: #fff;
            cursor: pointer;
            border: none;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
        .link {
            text-align: center;
            margin-top: 10px;
        }
        .link a {
            color: #fff;
            text-decoration: none;
        }
        .link a:hover {
            text-decoration: underline;
        }
    </style>
</head>

<body>
    <header>
        <h1>Calendar Event System</h1>
    </header>

    <form action="login" method="post">
        <label for="eventType">Event Type:</label>
        <select id="eventType" name="eventType">
            <option value="Leave">Leave</option>
            <option value="Travel">Travel</option>
            <option value="Holiday">Holiday</option>
            <option value="BirthDay">BirthDay</option>
        </select>

        <label for="planner">Planner:</label>
        <input type="text" id="planner" name="planner" required>

        <label for="startDate">Start Date:</label>
        <input type="date" id="startDate" name="startDate" required>

        <label for="endDate">End Date:</label>
        <input type="date" id="endDate" name="endDate" required>

        <label for="description">Description:</label>
        <input type="text" id="description" name="description">

        <p>Is All Day Event:</p>
        <input type="radio" id="isAllDayEventYes" name="isAllDayEvent" value="yes">
        <label for="isAllDayEventYes">Yes</label>
        <input type="radio" id="isAllDayEventNo" name="isAllDayEvent" value="no">
        <label for="isAllDayEventNo">No</label>

        <input type="submit" name="Submit" value="Submit">
    </form>
 <div class="link">
        <a href="nextpage.jsp">Click to open the next page</a>
    </div>
</body>

</html>
