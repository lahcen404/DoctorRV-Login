/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.36
 * Generated at: 2025-02-27 10:29:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class Register_002dPatient_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Register</title>\r\n");
      out.write("    <script src=\"https://cdn.tailwindcss.com\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"bg-blue-100 flex items-center justify-center min-h-screen\">\r\n");
      out.write("<div class=\"container mx-auto flex items-center justify-center\">\r\n");
      out.write("    <div class=\"bg-white shadow-xl rounded-lg p-8 w-full max-w-md\">\r\n");
      out.write("        <div class=\"flex items-center space-x-4 mb-6\">\r\n");
      out.write("            <img src=\"./imgs/DoctorRV.png\" alt=\"Logo\" class=\"w-12 h-12\">\r\n");
      out.write("            <h2 class=\"text-3xl font-bold text-green-700\">Register Patient</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("        <form class=\"space-y-4\" action=\"patientRegister\" method=\"post\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <label class=\"block text-green-800 font-semibold mb-1 text-left\">Username</label>\r\n");
      out.write("                <input type=\"text\" name=\"name\" class=\"w-full px-4 py-2 border border-green-400 rounded-lg focus:outline-none focus:ring-2 focus:ring-green-600 bg-green-50\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <label class=\"block text-green-800 font-semibold mb-1 text-left\">Email</label>\r\n");
      out.write("                <input type=\"email\" name=\"email\" class=\"w-full px-4 py-2 border border-green-400 rounded-lg focus:outline-none focus:ring-2 focus:ring-green-600 bg-green-50\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <label class=\"block text-green-800 font-semibold mb-1 text-left\">Telephone</label>\r\n");
      out.write("                <input type=\"tel\" name=\"phone\" class=\"w-full px-4 py-2 border border-green-400 rounded-lg focus:outline-none focus:ring-2 focus:ring-green-600 bg-green-50\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <label class=\"block text-green-800 font-semibold mb-1 text-left\">Password</label>\r\n");
      out.write("                <input type=\"password\" name=\"password\" class=\"w-full px-4 py-2 border border-green-400 rounded-lg focus:outline-none focus:ring-2 focus:ring-green-600 bg-green-50\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("            <button type=\"submit\" class=\"w-full py-3 rounded-lg font-semibold text-white bg-gradient-to-r from-green-500 to-green-600 hover:from-green-600 hover:to-green-700 transition transform hover:scale-105 shadow-md\">Register</button>\r\n");
      out.write("            <a href=\"login.jsp\" class=\"w-full text-center block border-2 border-blue-700 text-blue-700 py-3 rounded-lg font-semibold hover:bg-blue-700 hover:text-white transition\">Login</a>\r\n");
      out.write("            <a href=\"Home.jsp\" class=\"w-full text-center block border-2 border-gray-700 text-gray-700 py-3 rounded-lg font-semibold hover:bg-gray-700 hover:text-white transition\">Back</a>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
