/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.88
 * Generated at: 2024-05-01 03:43:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&display=swap\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.7.0.js\"></script>\r\n");
      out.write("<title>푸터영역</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#footer {\r\n");
      out.write("	padding: 15px 0 25px;\r\n");
      out.write("	background-color: #f5f5f5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer {\r\n");
      out.write("	display: block;\r\n");
      out.write("	unicode-bidi: isolate;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#footer .content {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	max-width: 1586px;\r\n");
      out.write("	padding: 0 20px;\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("	margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("html, body, div, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6, pre,\r\n");
      out.write("	code, form, fieldset, legend, input, textarea, p, blockquote, th, td,\r\n");
      out.write("	img {\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("	color: #353535;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div {\r\n");
      out.write("	display: block;\r\n");
      out.write("	unicode-bidi: isolate;\r\n");
      out.write("}\r\n");
      out.write(".copyright {\r\n");
      out.write("    padding: 20px 20px 0;\r\n");
      out.write("    border-top: 1px solid #ececec;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    font-size: 12px;\r\n");
      out.write("    color: #666;\r\n");
      out.write("}\r\n");
      out.write("#footer .content .info_list {\r\n");
      out.write("    display: grid;\r\n");
      out.write("    grid-template-columns: repeat(6, max-content);\r\n");
      out.write("    gap: 20px;\r\n");
      out.write("    padding: 20px 0;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("}\r\n");
      out.write("* {\r\n");
      out.write("    outline: none;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("#footer .content .info_list .item .drop_cont .drop_item .info_cont {\r\n");
      out.write("    line-height: 18px;\r\n");
      out.write("}\r\n");
      out.write("#footer .content .info_list .item .title {\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    font-weight: 700;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h3 {\r\n");
      out.write("    display: block;\r\n");
      out.write("    font-size: 1.17em;\r\n");
      out.write("    margin-block-start: 1em;\r\n");
      out.write("    margin-block-end: 1em;\r\n");
      out.write("    margin-inline-start: 0px;\r\n");
      out.write("    margin-inline-end: 0px;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    unicode-bidi: isolate;\r\n");
      out.write("}\r\n");
      out.write("li {\r\n");
      out.write("    list-style: none;\r\n");
      out.write("    list-style-position: initial;\r\n");
      out.write("    list-style-image: initial;\r\n");
      out.write("    list-style-type: none;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<footer id=\"footer\"\r\n");
      out.write("		class=\"xans-element- xans-layout xans-layout-footer \">\r\n");
      out.write("		<div class=\"content\">\r\n");
      out.write("			<ul class=\"info_list\">\r\n");
      out.write("				<li class=\"item cs_center\">\r\n");
      out.write("					<h3 class=\"title\">\r\n");
      out.write("						CS CENTER\r\n");
      out.write("						<path d=\"M8 10.9998L3 5.9998L3.7 5.2998L8 9.5998L12.3 5.2998L13 5.9998L8 10.9998Z\" fill=\"#161616\"></path>\r\n");
      out.write("					</h3>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"drop_cont\">\r\n");
      out.write("						<ul class=\"drop_item\">\r\n");
      out.write("							<li class=\"info_item\">\r\n");
      out.write("								<p class=\"info_cont\">\r\n");
      out.write("									02-3482-4632<br> 월-금 09:00 - 18:00<br>\r\n");
      out.write("								</p>\r\n");
      out.write("							</li>\r\n");
      out.write("\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"item bank\">\r\n");
      out.write("					<h3 class=\"title\">\r\n");
      out.write("						BANK\r\n");
      out.write("							<path d=\"M8 10.9998L3 5.9998L3.7 5.2998L8 9.5998L12.3 5.2998L13 5.9998L8 10.9998Z\" fill=\"#161616\"></path>\r\n");
      out.write("					</h3>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"drop_cont\">\r\n");
      out.write("						<div class=\"drop_item\">\r\n");
      out.write("							<span>모지은행: 123456-78-901234 </span> <br>\r\n");
      out.write("							<span>예금주: 모지홈</span>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"item contact\">\r\n");
      out.write("					<h3 class=\"title\">\r\n");
      out.write("						CONTACT\r\n");
      out.write("							<path d=\"M8 10.9998L3 5.9998L3.7 5.2998L8 9.5998L12.3 5.2998L13 5.9998L8 10.9998Z\" fill=\"#161616\"></path>\r\n");
      out.write("					</h3>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"drop_cont\">\r\n");
      out.write("						<ul class=\"drop_item\">\r\n");
      out.write("							<li class=\"info_item\">\r\n");
      out.write("								<p class=\"info_cont\">mozyhome@mozyhome.com</p>\r\n");
      out.write("							</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"item sns\">\r\n");
      out.write("					<h3 class=\"title\">\r\n");
      out.write("						SNS\r\n");
      out.write("							<path d=\"M8 10.9998L3 5.9998L3.7 5.2998L8 9.5998L12.3 5.2998L13 5.9998L8 10.9998Z\" fill=\"#161616\"></path>\r\n");
      out.write("					</h3>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"drop_cont\">\r\n");
      out.write("						<ul class=\"drop_item\">\r\n");
      out.write("							<li class=\"info_item\"><a href=\"https://www.instagram.com\" target=\"_blank\" style=\"text-decoration: none; color: #353535;;\"><i class=\"bi bi-instagram\"></i>&nbsp;mozyhome</a></li>\r\n");
      out.write("\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"item info\">\r\n");
      out.write("					<h3 class=\"title\">\r\n");
      out.write("						INFO\r\n");
      out.write("							<path d=\"M8 10.9998L3 5.9998L3.7 5.2998L8 9.5998L12.3 5.2998L13 5.9998L8 10.9998Z\" fill=\"#161616\"></path>\r\n");
      out.write("					</h3>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"drop_cont\">\r\n");
      out.write("						<ul class=\"drop_item\">\r\n");
      out.write("							<li class=\"info_item\">STORE</li>\r\n");
      out.write("							<li class=\"info_item\">ABOUT</li>\r\n");
      out.write("							<li class=\"info_item\">FAQ</li>\r\n");
      out.write("							<li class=\"info_item\">NOTICE</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li> \r\n");
      out.write("				<li class=\"item company\">\r\n");
      out.write("					<h3 class=\"title\">\r\n");
      out.write("						Team INFO\r\n");
      out.write("							<path d=\"M8 10.9998L3 5.9998L3.7 5.2998L8 9.5998L12.3 5.2998L13 5.9998L8 10.9998Z\" fill=\"#161616\"></path>\r\n");
      out.write("					</h3>\r\n");
      out.write("					<div class=\"drop_cont\">\r\n");
      out.write("						<ul class=\"drop_item\">\r\n");
      out.write("							<li class=\"info_item\">김우찬</li>\r\n");
      out.write("							<li class=\"info_item\">김태윤</li>\r\n");
      out.write("							<li class=\"info_item\">박범수</li>\r\n");
      out.write("							<li class=\"info_item\">우예은</li>\r\n");
      out.write("							<li class=\"info_item\">한동희</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<div class=\"copyright\">© 2024 MOZYHOME</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("	</footer>\r\n");
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
