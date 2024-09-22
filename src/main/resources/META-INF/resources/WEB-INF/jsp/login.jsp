<html>
    <%@ include file="common/header.jspf" %>
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
            <%@ include file="common/scripts.jspf" %>
        </div>
    </body>
</html>