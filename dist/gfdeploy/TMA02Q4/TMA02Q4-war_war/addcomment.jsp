<%--
   JSP to generate Login web page
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
      <title>Add a comment</title>
      <style type="text/css">
          body  {background:#EEEED0; color:#663300}
      </style>
   </head>

   <body>
      <%-- Includes the jspf which provides the standard Music Store page header.--%>
      <jsp:include page = "WEB-INF/header.jspf" />

      <h3>Add a comment</h3>

      <p>
      <form name="details" form method=post action="Handler"
       onReset="return confirm('Do you really want to clear the form and start again?')">
          <p>Name:
             <input type="text" name="name" size="25">
          </p>
          <p>Comment:<br>
             <textarea name="comment" rows="3" cols="50" wrap="virtual"></textarea>
          </p>
          <p>
             <input type="submit" value="Submit" name="login">
             <input type="reset" value="Clear" >
          </p>
      </form>

      <%-- Includes the jspf which provides the standard Music Store page footer.--%>
      <jsp:include page = "WEB-INF/footer.jspf" />

   </body>
</html>
