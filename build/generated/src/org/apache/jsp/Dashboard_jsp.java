package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import javax.servlet.http.*;
import myproject.TwitterSentimentAnalysis;
import myproject.getset;

public final class Dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title> Dashboard </title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <style>\n");
      out.write("    /* Set height of the grid so .sidenav can be 100% (adjust if needed) */\n");
      out.write("    .row.content {height: 1500px}\n");
      out.write("    \n");
      out.write("    /* Set gray background color and 100% height */\n");
      out.write("    .sidenav {\n");
      out.write("      background-color: #f1f1f1;\n");
      out.write("      height: 100%;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    /* Set black background color, white text and some padding */\n");
      out.write("    footer {\n");
      out.write("      background-color: #555;\n");
      out.write("      color: white;\n");
      out.write("      padding: 15px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    /* On small screens, set height to 'auto' for sidenav and grid */\n");
      out.write("    @media screen and (max-width: 767px) {\n");
      out.write("      .sidenav {\n");
      out.write("        height: auto;\n");
      out.write("        padding: 15px;\n");
      out.write("      }\n");
      out.write("      .row.content {height: auto;} \n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("  <div class=\"row content\">\n");
      out.write("      <div class=\"col-sm-3 sidenav\" style=\"height:200px;\">\n");
      out.write("      <h4>Welcome Admin</h4>\n");
      out.write("      <ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("        <li class=\"active\"><a href=\"index.html\">Home</a></li>\n");
      out.write("        \n");
      out.write("      </ul><br>\n");
      out.write("      <form action=\"getValue\">\n");
      out.write("      <div class=\"input-group\">\n");
      out.write("        <input type=\"text\" class=\"form-control\" placeholder=\"Search here...\" name=\"search_me\">\n");
      out.write("        <span class=\"input-group-btn\">\n");
      out.write("          <input class=\"btn btn-default\" type=\"submit\" value=\"ok\">\n");
      out.write("            <span class=\"glyphicon glyphicon-search\"></span>\n");
      out.write("          \n");
      out.write("        </span>\n");
      out.write("      </div>\n");
      out.write("          </form>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("      <h4>Searched Posts</h4>\n");
      out.write("      ");

          int countmy=0;
          String value=(String)request.getSession().getAttribute("data");
          //int cnt=(int)request.getSession().getAttribute("counte");
          //if(cnt>0)
          {
        
              
      out.write("\n");
      out.write("              <h2>You have selected : ");
      out.print((String)request.getSession().getAttribute("data") );
      out.write("\n");
      out.write("            \n");
      out.write("         </h2> \n");
      out.write("              ");
    
                  getset.setValue(value);
                  getset.callmain();
          }
     
      
      out.write("\n");
      out.write("              \n");
      out.write("      <hr>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("      ");

       if(myproject.TwitterSentimentAnalysis.status==1)
{
    ArrayList<String> tweets =myproject.TwitterSentimentAnalysis.getTweets(value);
    try
    {
         for(String args:tweets)
    {
      
      out.write("\n");
      out.write("      \n");
      out.write("          <table class=\"table\">\n");
      out.write("    <thead>\n");
      out.write("      <tr>\n");
      out.write("        <th>Tweet Number</th>\n");
      out.write("        <th>Tweets</th>\n");
      out.write("      </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("      <tr>\n");
      out.write("          <td>");
      out.print(countmy++);
      out.write("</td>\n");
      out.write("        <td>");
      out.print(args);
      out.write("</td>\n");
      out.write("        \n");
      out.write("      </tr>\n");
      out.write("    </tbody>\n");
      out.write("  </table>\n");
      out.write("    \n");
      out.write("      ");

      }
      }catch(Exception r){}
      }
       
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
