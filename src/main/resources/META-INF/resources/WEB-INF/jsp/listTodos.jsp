<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
    <%@ include file="common/header.jspf" %>
    <body>
        <%@ include file="common/nav.jspf" %>
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
            <%@ include file="common/scripts.jspf" %>
          </div>
    </body>
</html>