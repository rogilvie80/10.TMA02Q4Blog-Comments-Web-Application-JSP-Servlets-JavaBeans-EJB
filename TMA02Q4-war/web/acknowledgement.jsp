<%--
   JSP to generate web page to acknowledge a comment on a blog entry
   Author:  M362
   Version: 1.0
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%--
Import for CommentBean already added to provided code.
--%>
<%@ page import = "tma02_q4_beans.CommentBean" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Acknowledge Comment</title>
      <style type="text/css">
         body  {background:#EEEED0; color:#663300}
      </style>
   </head>

   <body>
      <%@ include file="WEB-INF/header.jspf" %>

      <%--
      TODO (c)
      Retrieve the JavaBean from the request object and
      use it to display the customer's name and comments.
      --%>
      <% CommentBean bean = (CommentBean) request.getAttribute("user");%>

      <h2><%= bean.getName() %>: <%= bean.getComment() %></h2>

      <br><br>
      <%--
      Links to other servlets or JSP pages
      --%>
      <a href="ViewComments">View all comments on this post</a><br>
      <a href="musicstoreblog.jsp">Blog home page</a>
      <%@ include file="WEB-INF/footer.jspf" %>
   </body>
</html>
