<html>
    <head>
        <link href="webjars\bootstrap\5.1.3\css\bootstrap.min.css" rel="stylesheet">
        <title>Login Page</title>
    </head>
    <body>
        <div class="container">
            <h1>Welcome to the login page!</h1>

            <pre>${errorMessage}</pre>
            <form method="post">
                <label for="name">Name</label>
                <input type="text" id="name" name="name"><br>
                <label for="password">Password</label>
                <input type="password" id="password" name="password"><br>
                <input type="submit" value="Submit">
            </form>
            <script>src="webjars\bootstrap\5.1.3\js\bootstrap.min.js"</script>
            <script>src="webjars\jquery\3.6.0\jquery.min.js"</script>
        </div>
    </body>
</html>