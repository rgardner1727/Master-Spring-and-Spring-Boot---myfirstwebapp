<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
    <head>
        <title>List Todos Page</title>
    </head>

    <body>
        <h1>Welcome to in28minutes!</h1>
        <hr>
        <main>
        <h2>Your Todos</h2>
            <table>
                <thead>
                    <tr>
                        <th>id</th>
                        <th>Description</th>
                        <th>Target Date</th>
                        <th>Is Completed</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${todos}" var="todo">
                        <tr>
                            <td>${todo.id}</td>
                            <td>${todo.description}</td>
                            <td>${todo.targetDate}</td>
                            <td>${todo.isComplete()}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </main>
    </body>
</html>