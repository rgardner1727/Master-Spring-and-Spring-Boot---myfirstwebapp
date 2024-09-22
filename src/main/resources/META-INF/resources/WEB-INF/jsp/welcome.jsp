<html>
    <%@ include file="common/header.jspf" %>
    <body>
        <%@ include file="common/nav.jspf" %>
        <div class="container">
            <h1>Welcome to in28minutes ${name}!</h1>
            <hr>
            <h2><a href="list-todos">Manage your todos</a></h2>
            <%@ include file="common/scripts.jspf" %>
        </div>
    </body>
</html>