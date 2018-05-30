package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<title>Kuii Wallet</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"loginStyle.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\">\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color: #212121\">\n");
      out.write("\t\n");
      out.write("\t<div class=\"container\" style=\"margin-top: 30px\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col\" style=\"background-color: #FDD835\">\n");
      out.write("\t\t\t\t<h1 class=\"text-center\">\n");
      out.write("\t\t\t\t\tBienvenido a Kuii Wallet\n");
      out.write("\t\t\t\t</h1>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<hr>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<form action=\"Login\" method=\"POST\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-4 offset-md-4\" style=\"background-color: #FDD835\">\n");
      out.write("\t\t\t\t\t<label for=\"idUsuario\">\n");
      out.write("\t\t\t\t\t<b>\n");
      out.write("\t\t\t\t\t\tID de Usuario\n");
      out.write("\t\t\t\t\t</b>\t\t\t\t\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" placeholder=\"Ingresa tu ID de usuario\" name=\"idUsuario\" required>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"col-md-4 offset-md-4\" style=\"background-color: #FDD835\">\n");
      out.write("\t\t\t\t\t<label for=\"psw\">\n");
      out.write("\t\t\t\t\t<b>\n");
      out.write("\t\t\t\t\t\tContraseña\n");
      out.write("\t\t\t\t\t</b>\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t<input type=\"password\" placeholder=\"Ingresa tu Contraseña\" name=\"psw\" required>\n");
      out.write("\t\t\t\t</div>\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"col-md-4 offset-md-4\">\n");
      out.write("\t\t\t\t\t<div class=\"text-center\">\n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-outline-warning\">\n");
      out.write("\t\t\t\t\t\tEntrar\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-md-4 offset-md-4\">\n");
      out.write("\t\t\t\t\t<div class=\"text-center\">\n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t<figure>\n");
      out.write("        \t\t\t\t\t<img src=\"imagenes/kuii.png\" class=\"img-fluid\" alt=\"Responsive image\">\n");
      out.write("        \t\t\t\t</figure>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("</html>");
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
