<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
    <head>
        <link href="webjars\bootstrap\5.1.3\css\bootstrap.min.css" rel="stylesheet">
        <title>List Todos Page</title>
    </head>

    <body>
          <div class="container">
            <h1>Welcome to in28minutes!</h1>
            <hr>
            <main>
            <h2>Your Todos</h2>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Description</th>
                            <th>Target Date</th>
                            <th>Is Completed</th>
                            <th></th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${todos}" var="todo">
                            <tr>
                                <td>${todo.description}</td>
                                <td>${todo.targetDate}</td>
                                <td>${todo.getIsComplete()}</td>
                                <td><a href="/delete-todo?id=${todo.id}" class="btn btn-danger">Delete</a></td>
                                <td><a href="/update-todo?id=${todo.id}" class="btn btn-warning">Update</a><td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
                <a href="/add-todo" class="btn btn-success">Add Todo</a>
            </main>
            <script>src="webjars\bootstrap\5.1.3\js\bootstrap.min.js"</script>
            <script>src="webjars\jquery\3.6.0\jquery.min.js"</script>
          </div>
    </body>
</html>