/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.41
 * Generated at: 2017-03-25 07:05:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t\t<title>StudentsBankOfIndia</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"./styles/index.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./styles/footer.css\"/>\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"./scripts/index.js\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--=========================================================================================================================-->\r\n");
      out.write("<!--=========================================================================================================================-->\r\n");
      out.write("<!--=========================================================================================================================-->\r\n");
      out.write("\r\n");
      out.write("<!--========================================================Bannner Starts============================================-->\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"hero\">\r\n");
      out.write("        <hgroup>\r\n");
      out.write("            <h1>Students Bank Of India</h1>        \r\n");
      out.write("            <h4><em>(India's First International Bank for Students)</em></h4>\r\n");
      out.write("        </hgroup>\r\n");
      out.write("        <br/><br/>\r\n");
      out.write("        <a href=\"#login\"><button class=\"btn btn-success btn-lg\" role=\"button\">Login</button></a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("  <!--=========================================================================================================================-->\r\n");
      out.write("  <!--=========================================================================================================================-->\r\n");
      out.write("  <!--=========================================================================================================================-->\r\n");
      out.write("  <!--=======================================LogIn Form Starts=========================================-->\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t<div class=\"row\" style=\"margin-top:20px\" id=\"login\">\r\n");
      out.write("\t    <div class=\"col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3\">\r\n");
      out.write("\t\t\t<form role=\"form\" action=\"LogIn\">\r\n");
      out.write("\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t<h2>Please Sign In</h2>\r\n");
      out.write("\t\t\t\t\t<hr class=\"colorgraph\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t                    <input type=\"username\" name=\"username\" id=\"username\" class=\"form-control input-lg\" placeholder=\"User Name\"  required>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t                    <input type=\"password\" name=\"password\" id=\"password\" class=\"form-control input-lg\" placeholder=\"Password\" required>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<span class=\"button-checkbox\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn\" data-color=\"info\">Remember Me</button>\r\n");
      out.write("\t                    <input type=\"checkbox\" name=\"remember_me\" id=\"remember_me\" checked=\"checked\" class=\"hidden\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"\" class=\"btn btn-link pull-right\">Forgot Password?</a>\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t<hr class=\"colorgraph\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xs-6 col-sm-6 col-md-6\">\r\n");
      out.write("\t                        <input type=\"submit\" class=\"btn btn-lg btn-success btn-block\" value=\"Sign In\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xs-6 col-sm-6 col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"Registration.html\" class=\"btn btn-lg btn-primary btn-block\">Register</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br/><br/>\r\n");
      out.write("  <!--=========================================================================================================================-->\r\n");
      out.write("  <!--=========================================================================================================================-->\r\n");
      out.write("  <!--=========================================================================================================================-->\r\n");
      out.write("  <!--============================================Footer Starts===============================================-->\r\n");
      out.write("  <!--footer start from here-->\r\n");
      out.write("\t<footer>\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col-md-4 col-sm-6 footerleft \">\r\n");
      out.write("        <div class=\"logofooter\"> Logo</div>\r\n");
      out.write("        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley.</p>\r\n");
      out.write("        <p><i class=\"fa fa-map-pin\"></i> 210, Aggarwal Tower, Rohini sec 9, New Delhi - Â Â Â Â Â Â Â 110085, INDIA</p>\r\n");
      out.write("        <p><i class=\"fa fa-phone\"></i> Phone (India) : +91 9999 878 398</p>\r\n");
      out.write("        <p><i class=\"fa fa-envelope\"></i> E-mail : info@webenlance.com</p>\r\n");
      out.write("        \r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-md-2 col-sm-6 paddingtop-bottom\">\r\n");
      out.write("        <h6 class=\"heading7\">GENERAL LINKS</h6>\r\n");
      out.write("        <ul class=\"footer-ul\">\r\n");
      out.write("          <li><a href=\"#\"> Career</a></li>\r\n");
      out.write("          <li><a href=\"#\"> Privacy Policy</a></li>\r\n");
      out.write("          <li><a href=\"#\"> Terms & Conditions</a></li>\r\n");
      out.write("          <li><a href=\"#\"> Client Gateway</a></li>\r\n");
      out.write("          <li><a href=\"#\"> Ranking</a></li>\r\n");
      out.write("          <li><a href=\"#\"> Case Studies</a></li>\r\n");
      out.write("          <li><a href=\"#\"> Frequently Ask Questions</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-md-3 col-sm-6 paddingtop-bottom\">\r\n");
      out.write("        <h6 class=\"heading7\">LATEST POST</h6>\r\n");
      out.write("        <div class=\"post\">\r\n");
      out.write("          <p>facebook crack the movie advertisment code:what it means for you <span>August 3,2015</span></p>\r\n");
      out.write("          <p>facebook crack the movie advertisment code:what it means for you <span>August 3,2015</span></p>\r\n");
      out.write("          <p>facebook crack the movie advertisment code:what it means for you <span>August 3,2015</span></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-md-3 col-sm-6 paddingtop-bottom\">\r\n");
      out.write("        <div class=\"fb-page\" data-href=\"https://www.facebook.com/facebook\" data-tabs=\"timeline\" data-height=\"300\" data-small-header=\"false\" style=\"margin-bottom:15px;\" data-adapt-container-width=\"true\" data-hide-cover=\"false\" data-show-facepile=\"true\">\r\n");
      out.write("          <div class=\"fb-xfbml-parse-ignore\">\r\n");
      out.write("            <blockquote cite=\"https://www.facebook.com/facebook\"><a href=\"https://www.facebook.com/facebook\">Facebook</a></blockquote>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"copyright\">\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"col-md-6\">\r\n");
      out.write("      <p>Â© 2016 - All Rights with Webenlance</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-md-6\">\r\n");
      out.write("      <ul class=\"bottom_ul\">\r\n");
      out.write("        <li><a href=\"#\">webenlance.com</a></li>\r\n");
      out.write("        <li><a href=\"#\">About us</a></li>\r\n");
      out.write("        <li><a href=\"#\">Blog</a></li>\r\n");
      out.write("        <li><a href=\"#\">Faq's</a></li>\r\n");
      out.write("        <li><a href=\"#\">Contact us</a></li>\r\n");
      out.write("        <li><a href=\"#\">Site Map</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
