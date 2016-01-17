/*
 * ViewComments.java
 *
 * @version 1.0
 */

package tma02_q4_servlets;

import java.io.*;
import java.util.List;
import javax.ejb.EJB;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.*;
import tma02_q4_beans.CommentBean;
import tma02_q4_ejbs.PostedCommentsLocal;
import tma02_q4_ejbs.PostedCommentsBean;

/**
 *
 * @author m362
 * @version
 */
public class ViewComments extends HttpServlet
{
    @EJB
    private PostedCommentsLocal commentsBean;

   /* TODO (d) insert code here to:
   // Obtain reference to the PostedCommentsBean EJB
   // via its local interface, using dependency injection
    *

    *
   /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException
   {

      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
      out.println("<html>");
      out.println("<head>");
      out.println("<title>View Comments</title>");
      out.println("<style type=\"text/css\">");
      out.println("   body  {background:#EEEED0; color:#663300}");
      out.println("</style>");
      out.println("</head>");
      out.println("<body>");

      out.println("<h2>Comments on this entry</h2>");


        /* TODO (d) insert code here to:
         *
         *     Access the EJB PostedCommentsBean containing readers' comments
         *
         *     Store this EJB so that it is available to all components
         *     in the current session
         *
         *     invoke getAllComments() on the PostedCommentsBean
         *
         *     For each comment,  display the timestamp, then the name of its author,
         *     followed by the comment text, in a suitable format
         */
      
      HttpSession currentSession = request.getSession();
      currentSession.setAttribute("comments", commentsBean);
      List<CommentBean> allComments = commentsBean.getAllComments();

      
      for(CommentBean eachComment : allComments)
      {
          out.println("<br>" + eachComment.getTimeStamp().toString() + " "
          + eachComment.getName() + " said: <br>"
          + eachComment.getComment() + "<br>");
      }
      
      out.println("<a href=\"addcomment.jsp\">Add a comment</a> <br>");
      out.println("<a href=\"musicstoreblog.jsp\">Blog home page</a>");

      out.println("</body>");
      out.println("</html>");
      out.close();

   }

   // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
   /** Handles the HTTP <code>GET</code> method.
    * @param request servlet request
    * @param response servlet response
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException
   {
      processRequest(request, response);
   }

   /** Handles the HTTP <code>POST</code> method.
    * @param request servlet request
    * @param response servlet response
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException
   {
      processRequest(request, response);
   }

   /** Returns a short description of the servlet.
    */
   public String getServletInfo()
   {
      return "Short description";
   }
   // </editor-fold>
}
