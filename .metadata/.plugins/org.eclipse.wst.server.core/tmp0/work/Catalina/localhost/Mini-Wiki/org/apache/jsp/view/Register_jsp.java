/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.4
 * Generated at: 2022-05-04 18:18:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.io.StringReader;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import jakarta.json.Json;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("file:/C:/Users/DELL/Desktop/New%20folder/Downloads/apache-tomee-plume-9.0.0-M7/lib/taglibs-shade-8.0.7.jar", Long.valueOf(1620049418000L));
    _jspx_dependants.put("jar:file:/C:/Users/DELL/Desktop/New%20folder/Downloads/apache-tomee-plume-9.0.0-M7/lib/taglibs-shade-8.0.7.jar!/META-INF/c.tld", Long.valueOf(1620053018000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.io.StringReader");
    _jspx_imports_classes.add("jakarta.json.JsonObject");
    _jspx_imports_classes.add("jakarta.json.JsonReader");
    _jspx_imports_classes.add("jakarta.json.Json");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "Les JSPs ne permettent que GET, POST ou HEAD. Jasper permet aussi OPTIONS");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Ubuntu\" rel=\"stylesheet\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"path/to/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  <title>Créer un compte --MiniWiki</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("   body {\r\n");
      out.write("        background-color: #F8F8FF;\r\n");
      out.write("        font-family: 'Ubuntu', sans-serif;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    .main {\r\n");
      out.write("        background-color: #FFFFFF;\r\n");
      out.write("        width: 400px;\r\n");
      out.write("        height: 400px;\r\n");
      out.write("        margin: 7em auto;\r\n");
      out.write("        border-radius: 1.5em;\r\n");
      out.write("        box-shadow: 0px 11px 35px 2px rgba(0, 0, 0, 0.14);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    .sign {\r\n");
      out.write("        padding-top: 40px;\r\n");
      out.write("        color: #696969;\r\n");
      out.write("        font-family: 'Ubuntu', sans-serif;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("        font-size: 23px;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    .un {\r\n");
      out.write("    width: 76%;\r\n");
      out.write("    color: rgb(38, 50, 56);\r\n");
      out.write("    font-weight: 700;\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    letter-spacing: 1px;\r\n");
      out.write("    background: rgba(136, 126, 126, 0.04);\r\n");
      out.write("    padding: 10px 20px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 20px;\r\n");
      out.write("    outline: none;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    border: 2px solid rgba(0, 0, 0, 0.02);\r\n");
      out.write("    margin-bottom: 50px;\r\n");
      out.write("    margin-left: 46px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    margin-bottom: 27px;\r\n");
      out.write("    font-family: 'Ubuntu', sans-serif;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    form.form1 {\r\n");
      out.write("        padding-top: 40px;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    .pass {\r\n");
      out.write("            width: 76%;\r\n");
      out.write("    color: rgb(38, 50, 56);\r\n");
      out.write("    font-weight: 700;\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    letter-spacing: 1px;\r\n");
      out.write("    background: rgba(136, 126, 126, 0.04);\r\n");
      out.write("    padding: 10px 20px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 20px;\r\n");
      out.write("    outline: none;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    border: 2px solid rgba(0, 0, 0, 0.02);\r\n");
      out.write("    margin-bottom: 50px;\r\n");
      out.write("    margin-left: 46px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    margin-bottom: 27px;\r\n");
      out.write("    font-family: 'Ubuntu', sans-serif;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("    .un:focus, .pass:focus {\r\n");
      out.write("        border: 2px solid rgba(0, 0, 0, 0.18) !important;\r\n");
      out.write("        \r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    .submit {\r\n");
      out.write("      cursor: pointer;\r\n");
      out.write("        border-radius: 5em;\r\n");
      out.write("        color: white;\r\n");
      out.write("        background: linear-gradient(to right, #1E90FF,#00BFFF);\r\n");
      out.write("        border: 0;\r\n");
      out.write("        padding-left: 40px;\r\n");
      out.write("        padding-right: 40px;\r\n");
      out.write("        padding-bottom: 10px;\r\n");
      out.write("        padding-top: 10px;\r\n");
      out.write("        font-family: 'Ubuntu', sans-serif;\r\n");
      out.write("        margin-left: 35%;\r\n");
      out.write("        font-size: 13px;\r\n");
      out.write("        box-shadow: 0 0 20px 1px rgba(0, 0, 0, 0.04);\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    .forgot {\r\n");
      out.write("        text-shadow: 0px 0px 3px rgba(117, 117, 117, 0.12);\r\n");
      out.write("        color: #FFD700;\r\n");
      out.write("        padding-top: 15px;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    a {\r\n");
      out.write("        text-shadow: 0px 0px 3px rgba(117, 117, 117, 0.12);\r\n");
      out.write("        color: #E1BEE7;\r\n");
      out.write("        text-decoration: none\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    @media (max-width: 600px) {\r\n");
      out.write("        .main {\r\n");
      out.write("            border-radius: 0px;\r\n");
      out.write("        }\r\n");
      out.write("        </style>\r\n");
      out.write("       \r\n");
      out.write("          ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  <div class=\"main\">\r\n");
      out.write("     <p class=\"sign\" align=\"center\">Créer un compte</p>\r\n");
      out.write("    <form action= \"register\"  method=\"post\">\r\n");
      out.write("      <input type=\"text\" placeholder=\"Username\" class=\"un\" name=\"username\" required=\"required\"/>\r\n");
      out.write("      <input class=\"un \" type=\"email\" align=\"center\" name=\"email\" placeholder=\"Email\" required=\"required\" >\r\n");
      out.write("      <input class=\"pass\" type=\"password\" align=\"center\" name=\"password\" placeholder=\"Password\" required=\"required\">\r\n");
      out.write("      <input type=\"submit\" class=\"submit\" align=\"center\" value=\"Register\">\r\n");
      out.write("    \r\n");
      out.write("      </form>      \r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fif_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /view/Register.jsp(130,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg !=null}", boolean.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("     \r\n");
          out.write("\t<svg xmlns=\"http://www.w3.org/2000/svg\" style=\"display: none;\">\r\n");
          out.write("    <symbol id=\"exclamation-triangle-fill\" fill=\"currentColor\" viewBox=\"0 0 16 16\">\r\n");
          out.write("    <path d=\"M8.982 1.566a1.13 1.13 0 0 0-1.96 0L.165 13.233c-.457.778.091 1.767.98 1.767h13.713c.889 0 1.438-.99.98-1.767L8.982 1.566zM8 5c.535 0 .954.462.9.995l-.35 3.507a.552.552 0 0 1-1.1 0L7.1 5.995A.905.905 0 0 1 8 5zm.002 6a1 1 0 1 1 0 2 1 1 0 0 1 0-2z\"/>\r\n");
          out.write("    </symbol>\r\n");
          out.write("    </svg>\r\n");
          out.write("\t\t\r\n");
          out.write("\r\n");
          out.write("\t<div class=\"alert alert-danger d-flex align-items-center\" role=\"alert\">\r\n");
          out.write("  \t\t<svg class=\"bi flex-shrink-0 me-2\" width=\"24\" height=\"24\" role=\"img\" aria-label=\"Danger:\"><use xlink:href=\"#exclamation-triangle-fill\"/></svg>\r\n");
          out.write("  \t\t<div>\r\n");
          out.write("   \t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("  </div>\r\n");
          out.write("</div>\r\n");
          out.write("\t\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}
