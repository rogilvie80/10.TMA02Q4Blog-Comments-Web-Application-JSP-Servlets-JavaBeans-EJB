/*
 * Handler.java
 *
 * @author M362
 * @version 1.0
 */
package tma02_q4_servlets;


import javax.ejb.EJB;
import javax.servlet.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import tma02_q4_beans.CommentBean;
import tma02_q4_ejbs.PostedCommentsLocal;

public class Handler extends HttpServlet
{

   // Obtains reference needed using dependency injection
   //@EJB
   private PostedCommentsLocal postedCommentsBean;

   public Handler()
   {
   }

   public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
   {

      // Get name and comment values from the request object
      String name =   req.getParameter("name");
      String comment = req.getParameter("comment");
      String statusMessage = null;  // Message to pass to the Error JSP
      

      // Initial code that always passes control to the error page
      // TODO (a) comment out the following three lines of code
      //RequestDispatcher error = req.getRequestDispatcher("error.jsp");
      //req.setAttribute("status", statusMessage);
      //error.forward(req, resp);

      /* TODO (a) add code to pass control to error page only if name and/or
       * comment are empty, otherwise pass control to acknowledgement page
       */
      
      if (name.isEmpty() || comment.isEmpty())
      {
          RequestDispatcher error = req.getRequestDispatcher("error.jsp");
          statusMessage = "Please enter both of the required fields";
          req.setAttribute("status", statusMessage);
          error.forward(req, resp);
      }
      else
      {
          CommentBean commentBean = new CommentBean();
          commentBean.setName(name);
          commentBean.setComment(comment);
          req.setAttribute("user", commentBean);
          RequestDispatcher acknowledgement = req.getRequestDispatcher("acknowledgement.jsp");
          HttpSession currentSession = req.getSession();
          postedCommentsBean = (PostedCommentsLocal) currentSession.getAttribute("comments");
          postedCommentsBean.postComment(commentBean);
          acknowledgement.forward(req, resp);
          return;
      }
      /* TODO (b) add code to pass status message to error page
       */

      /* TODO (c) add code to create a JavaBean of type CommentBean,
       * containing the customer’s name, comment and timestamp,
       * and store it in the request object, before passing control to
       * the acknowledgement page
       */

      /*  TODO (e) add code to:
       *
       *    Retrieve the EJB PostedCommentsBean which was previously stored
       *    so as to be available to other components of the application
       *    during the current session
       *
       *    Invoke postComment to add the CommentBean to the EJB PostedCommentsBean
       *    before passing control to the acknowledgement page
       */
      
   }

}