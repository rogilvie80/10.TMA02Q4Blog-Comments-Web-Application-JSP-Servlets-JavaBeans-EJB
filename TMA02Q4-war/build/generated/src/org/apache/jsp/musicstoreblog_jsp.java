package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import tma02_q4_beans.CommentBean;
import java.util.Date;

public final class musicstoreblog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/WEB-INF/header.jspf");
    _jspx_dependants.add("/WEB-INF/footer.jspf");
  }

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("\"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("      <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("      <title>Music Store Blog Home</title>\n");
      out.write("      <style type=\"text/css\">\n");
      out.write("         body  {background:#EEEED0; color:#663300}\n");
      out.write("      </style>\n");
      out.write("   </head>\n");
      out.write("\n");
      out.write("   <body>\n");
      out.write("      ");
      out.write("<img src= \"images/guitar.jpg\" height=\"160\"> \n");
      out.write("<h1>The Music Store Blog</h1>\n");
      out.write("<hr>");
      out.write("\n");
      out.write("\n");
      out.write("      ");
 Date timeStamp = new Date(); 
      out.write("\n");
      out.write("\n");
      out.write("       <h4>The Truth about John Lennon's Piano</h4>\n");
      out.write("       <h5>Posted ");
      out.print( timeStamp );
      out.write(" </h5>\n");
      out.write("       <textarea name=\"comments\" rows=\"5\" cols=\"70\" wrap=\"virtual\"\n");
      out.write("             readonly=\"true\">Today it finally came to light that John Lennon's famous white piano, featured in the video for his hit Imagine, was in fact stolen from a piano shop in Huddersfield.\n");
      out.write("According to new information, from a source close to the former Beatle, John was completely unaware of this and the theft was carried out by one of his roadies, Neil Andprey, who died recently.  \"Because Neil is sadly no longer with us, I can now speak about this\", said the source.\n");
      out.write("West Yorkshire police have re-opened the file on the piano theft after 40 years, and found it was very dusty.\n");
      out.write("The Music Store has a number of pianos in stock, some of which are white.\n");
      out.write("        </textarea><br>\n");
      out.write("\n");
      out.write("      ");
      out.write("\n");
      out.write("      <a href=\"ViewComments\">View comments on this post</a>\n");
      out.write("      ");
      out.write("\n");
      out.write("<hr>\n");
      out.write("<u>Privacy Policy</u> &#124; <u>Terms and Conditions</u> &#124; \n");
      out.write("<u>Contact Us</u> &#124; <u>Site Map</u>\n");
      out.write("\n");
      out.write("\n");
      out.write("   </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
