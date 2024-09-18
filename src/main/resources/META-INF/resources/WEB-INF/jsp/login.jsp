<html>
    <head>
        <title>Login Page</title>
    </head>
    <body>
        <h1>Welcome to the login page!</h1>

        <pre>${errorMessage}</pre>
        <form method="post">
            <label for="name">Name</label>
            <input type="text" id="name" name="name"><br>
            <label for="password">Password</label>
            <input type="password" id="password" name="password"><br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>