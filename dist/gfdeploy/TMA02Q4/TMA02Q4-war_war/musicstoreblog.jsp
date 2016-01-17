<%--
   JSP to display blog entries
   Author:  M362
   Version: 1.0
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%--
Import for CommentBean already added to provided code.
--%>
<%@ page import = "tma02_q4_beans.CommentBean" %>
<%@ page import = "java.util.Date" %>
<%--
The taglib directive below imports the JSTL library. If you uncomment it,
you must also add the JSTL library to the project. The Add Library... action
on Libraries node in Projects view can be used to add the JSTL 1.1 library.
--%>
<%--
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Music Store Blog Home</title>
      <style type="text/css">
         body  {background:#EEEED0; color:#663300}
      </style>
   </head>

   <body>
      <%@ include file="WEB-INF/header.jspf" %>

      <% Date timeStamp = new Date(); %>

       <h4>The Truth about John Lennon's Piano</h4>
       <h5>Posted <%= timeStamp %> </h5>
       <textarea name="comments" rows="5" cols="70" wrap="virtual"
             readonly="true">Today it finally came to light that John Lennon's famous white piano, featured in the video for his hit Imagine, was in fact stolen from a piano shop in Huddersfield.
According to new information, from a source close to the former Beatle, John was completely unaware of this and the theft was carried out by one of his roadies, Neil Andprey, who died recently.  "Because Neil is sadly no longer with us, I can now speak about this", said the source.
West Yorkshire police have re-opened the file on the piano theft after 40 years, and found it was very dusty.
The Music Store has a number of pianos in stock, some of which are white.
        </textarea><br>

      <%--
      Link to ViewComments Servlet already added to provided code
      --%>
      <a href="ViewComments">View comments on this post</a>
      <%@ include file="WEB-INF/footer.jspf" %>
   </body>
</html>