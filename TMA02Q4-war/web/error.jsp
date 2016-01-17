<%--
   JSP to generate web page to report an error during login
   Author:  M362
   Version: 1.0
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Error</title>
      <style type="text/css">
         body  {background:#EEEED0; color:#663300}
      </style>
   </head>
   <body>
      <%@ include file="WEB-INF/header.jspf" %>

      <h3>Sorry, an error occurred.</h3>


      <%-- TODO (b)
        Retrieve the error status message sent from the servlet.
        Display the message
        --%>
        <h2><%= request.getAttribute("status") %> </h2>

      <a href="addcomment.jsp">Back to Add Comment page</a><br>
      <a href="musicstoreblog.jsp">Blog home page</a>

      <%@ include file="WEB-INF/footer.jspf" %>
   </body>
</html>
