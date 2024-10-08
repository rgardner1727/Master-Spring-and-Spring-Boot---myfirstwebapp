<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <link href="webjars\bootstrap\5.1.3\css\bootstrap.min.css" rel="stylesheet">
        <link href="webjars\bootstrap-datepicker\1.9.0\css\bootstrap-datepicker.standalone.min.css" rel="stylesheet">
        <title>Add Todo Page</title>
    </head>
    <body>
        <%@ include file="common/nav.jspf" %>
          <div class="container">
            <h1>Enter Todo Details</h1>
            <hr>
            <main>
                <form:form method="post" modelAttribute="todo">
                    <fieldset class="mb-3">
                        <form:label path="description">Description:</form:label>
                        <form:input type="text" path="description" required="required"/>
                        <form:errors path="description" cssClass="text-warning"/>
                    </fieldset>

                    <fieldset class="mb-3">
                        <form:label path="targetDate">Target Date:</form:label>
                        <form:input type="date" path="targetDate" required="required"/>
                        <form:errors path="targetDate" cssClass="text-warning"/>
                    </fieldset>

                    <form:input type="hidden" path="id"/>

                    <form:input type="hidden" path="isComplete"/>

                    <input type="submit" value="Submit" class="btn btn-success"/>
                </form:form>
            </main>
          </div>
          <%@ include file="common/scripts.jspf" %>
    </body>
</html>