<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <link href="webjars\bootstrap\5.1.3\css\bootstrap.min.css" rel="stylesheet">
        <title>Add Todo Page</title>
    </head>
    <body>
          <div class="container">
            <h1>Enter Todo Details</h1>
            <hr>
                <form:form method="post" modelAttribute="todo">
                    <label for="description">Description:</label>
                    <form:input type="text" path="description" required="required"/>
                    <form:errors path="description" cssClass="text-warning"/>
                    <form:input type="hidden" path="id"/>
                    <form:input type="hidden" path="isComplete"/>
                    <input type="submit" value="Submit" class="btn btn-success"/>
                </form:form>
            </main>
            <script>src="webjars\bootstrap\5.1.3\js\bootstrap.min.js"</script>
            <script>src="webjars\jquery\3.6.0\jquery.min.js"</script>
          </div>
    </body>
</html>