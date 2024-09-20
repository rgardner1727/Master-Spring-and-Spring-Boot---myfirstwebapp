<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
    <head>
        <link href="webjars\bootstrap\5.1.3\css\bootstrap.min.css" rel="stylesheet">
        <title>Add Todo Page</title>
    </head>
    <body>
          <div class="container">
            <h1>Enter Todo Details</h1>
            <hr>
                <form method="post">
                    <label for="description">Description:</label>
                    <input type="text" id="description" name="description">
                    <input type="submit" value="Submit" class="btn btn-success">
            </main>
            <script>src="webjars\bootstrap\5.1.3\js\bootstrap.min.js"</script>
            <script>src="webjars\jquery\3.6.0\jquery.min.js"</script>
          </div>
    </body>
</html>