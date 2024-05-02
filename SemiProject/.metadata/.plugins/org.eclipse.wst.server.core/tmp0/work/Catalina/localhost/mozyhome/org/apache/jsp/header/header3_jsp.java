/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.88
 * Generated at: 2024-05-01 03:43:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.header;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Dropdown Menu</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./header/header.css\" />\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	\r\n");
      out.write("/* 검색 토글창 디자인 시작 */\r\n");
      out.write("	body {\r\n");
      out.write("		font-family: 'Noto Sans KR';\r\n");
      out.write("		text-decoration: none;\r\n");
      out.write("		font-size: 14px;\r\n");
      out.write("	}\r\n");
      out.write("	#shopify-section-header > header > div > ul > li > a, \r\n");
      out.write("	#shopify-section-header > header > div > ul > li > a,\r\n");
      out.write("	#shopify-section-header > header > div > ul > li > div > div > div.header-nav__sub-nav-links > div > a,\r\n");
      out.write("	#shopify-section-header > header > div > ul > li > div > div > div.header-nav__sub-nav-images > a{\r\n");
      out.write("		text-decoration: none;	\r\n");
      out.write("		color: black;\r\n");
      out.write("	}	\r\n");
      out.write("	\r\n");
      out.write("	#search {\r\n");
      out.write("	    width: 100%;\r\n");
      out.write("	    height: 20rem;\r\n");
      out.write("	    position: absolute;\r\n");
      out.write("	    display: none;\r\n");
      out.write("	    background:rgb(249, 248, 246);\r\n");
      out.write("	    z-index: 1000;\r\n");
      out.write("	    justify-content: center; /* 수평 가운데 정렬 */\r\n");
      out.write("	    align-items: center; /* 수직 가운데 정렬 */\r\n");
      out.write("	    display: flex; /* 부모 요소를 플렉스 박스로 설정합니다. */    \r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	#search input {\r\n");
      out.write("	    width: 30%;\r\n");
      out.write("	    height: 30px;\r\n");
      out.write("	    font-size: 15px;\r\n");
      out.write("	    border: none;\r\n");
      out.write("	    outline: none;\r\n");
      out.write("	    background:rgba(249, 248, 246, 0);\r\n");
      out.write("	    border-bottom: 1px black solid;\r\n");
      out.write("	    margin-bottom: 10px;\r\n");
      out.write("	    flex-direction: column;\r\n");
      out.write("	    text-indent: 3px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	#enter {\r\n");
      out.write("	    font-size: 18px;\r\n");
      out.write("	    border: none;   \r\n");
      out.write("	    width: 50px;\r\n");
      out.write("	    height: 30px;\r\n");
      out.write("	    border-radius: 15px;\r\n");
      out.write("	    background:rgba(249, 248, 246, 0);\r\n");
      out.write("	    color: black;\r\n");
      out.write("	    cursor: pointer;\r\n");
      out.write("	    margin-bottom: 10px;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	#close {\r\n");
      out.write("	    position: absolute;\r\n");
      out.write("	    top: 0;\r\n");
      out.write("	    right: 0;\r\n");
      out.write("	    margin: 10px;\r\n");
      out.write("	    color: black;\r\n");
      out.write("	}\r\n");
      out.write("/* 검색 토글창 디자인 끝 */\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	// 검색 기능\r\n");
      out.write("	$(function() {\r\n");
      out.write("		$(\"#search\").hide();\r\n");
      out.write("		\r\n");
      out.write("		$(\"#searchIcon\").click(function() {\r\n");
      out.write("			var keyword = $(\"#keyword\").val();\r\n");
      out.write("			//alert(keyword);\r\n");
      out.write("			if(keyword==\"\"){\r\n");
      out.write("				alert(\"검색어를 입력해주세요\");\r\n");
      out.write("			} else{\r\n");
      out.write("				location.href=\"index.jsp?main=search/searchList.jsp?search=\"+keyword;\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("\r\n");
      out.write("		document.getElementById('keyword').addEventListener('keypress',function(event) {\r\n");
      out.write("			// 엔터 키가 눌렸는지 확인\r\n");
      out.write("			if (event.keyCode === 13) {\r\n");
      out.write("				event.preventDefault(); // 폼 제출을 방지\r\n");
      out.write("				document.getElementById('searchIcon').click(); // '사이즈 추가' 버튼 클릭 이벤트 발생\r\n");
      out.write("			}\r\n");
      out.write("		});	\r\n");
      out.write("		\r\n");
      out.write("		$(\"#close\").click(function(){\r\n");
      out.write("			//alert(\"click\");\r\n");
      out.write("			$(\"#search\").hide();\r\n");
      out.write("		})\r\n");
      out.write("		\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	function openSetting(){\r\n");
      out.write("	    /* if(document.getElementById('search').style.display==='block'){\r\n");
      out.write("	        document.getElementById('search').style.display='none';\r\n");
      out.write("	    }else{\r\n");
      out.write("	        document.getElementById('search').style.display='block';\r\n");
      out.write("	    } */\r\n");
      out.write("	    \r\n");
      out.write("	    $(\"#search\").slideToggle(225);\r\n");
      out.write("	}\r\n");
      out.write("	// 검색 기능 끝\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div id=\"shopify-section-header\" class=\"shopify-section\">\r\n");
      out.write("		<header class=\"header js-header\" role=\"banner\" style=\"width: 100%;\">\r\n");
      out.write("			<div class=\"header__top\">\r\n");
      out.write("\r\n");
      out.write("				<ul class=\"header__nav\"\r\n");
      out.write("					style=\"padding-right: 40px; padding-left: 0px;\">\r\n");
      out.write("\r\n");
      out.write("					<li\r\n");
      out.write("						class=\"header__nav-top-level header__nav-top-level--has-children\">\r\n");
      out.write("						<a href=\"index.jsp?main=product/productList.jsp?cate_num=1\"\r\n");
      out.write("						class=\"header__nav-top-level-link\" data-name=\"Living\">Living</a>\r\n");
      out.write("						<div class=\"header-nav__sub-nav\">\r\n");
      out.write("							<div class=\"header-nav__sub-nav-inner\">\r\n");
      out.write("								<div class=\"header-nav__sub-nav-links\">\r\n");
      out.write("									<div class=\"header-nav__column\"></div>\r\n");
      out.write("									<div class=\"header-nav__column\">\r\n");
      out.write("\r\n");
      out.write("										<a class=\"header-nav__sub-nav-link\" \r\n");
      out.write("										href=\"index.jsp?main=product/productList.jsp?cate_num=11\">소파</a>\r\n");
      out.write("\r\n");
      out.write("										<a class=\"header-nav__sub-nav-link\"\r\n");
      out.write("											href=\"index.jsp?main=product/productList.jsp?cate_num=12\">테이블</a>\r\n");
      out.write("\r\n");
      out.write("									</div>\r\n");
      out.write("\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"header-nav__sub-nav-images\">\r\n");
      out.write("									<a href=\"index.jsp?main=product/productList.jsp?cate_num=1\"> <img\r\n");
      out.write("										src=\"./image/staticImage/sofaBanner1.png\"\r\n");
      out.write("										alt=\"\"\r\n");
      out.write("										width=\"330\" height=\"248\">\r\n");
      out.write("										<p>Shop All Living</p>\r\n");
      out.write("									</a><a\r\n");
      out.write("										href=\"index.jsp?main=product/productList.jsp?cate_num=12\">\r\n");
      out.write("										<img\r\n");
      out.write("										src=\"//maidenhome.com/cdn/shop/files/02_The_Ella_Table_Top_Nav.jpg?v=1710959897&amp;width=330\"\r\n");
      out.write("										alt=\"\"\r\n");
      out.write("										width=\"330\" height=\"248\">\r\n");
      out.write("										<p>Coffee Table</p>\r\n");
      out.write("									</a>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<li\r\n");
      out.write("						class=\"header__nav-top-level header__nav-top-level--has-children\">\r\n");
      out.write("						<a href=\"index.jsp?main=product/productList.jsp?cate_num=2\"\r\n");
      out.write("						class=\"header__nav-top-level-link\" data-name=\"Dining\">Dining</a>\r\n");
      out.write("						<div class=\"header-nav__sub-nav\">\r\n");
      out.write("							<div class=\"header-nav__sub-nav-inner\">\r\n");
      out.write("								<div class=\"header-nav__sub-nav-links\">\r\n");
      out.write("									<div class=\"header-nav__column\">\r\n");
      out.write("										<a class=\"header-nav__sub-nav-link\"\r\n");
      out.write("											href=\"index.jsp?main=product/productList.jsp?cate_num=21\">식탁</a> <a\r\n");
      out.write("											class=\"header-nav__sub-nav-link\"\r\n");
      out.write("											href=\"index.jsp?main=product/productList.jsp?cate_num=22\">의자</a>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"header-nav__sub-nav-images\">\r\n");
      out.write("									<a href=\"index.jsp?main=product/productList.jsp?cate_num=2\"> <img\r\n");
      out.write("										src=\"./image/staticImage/diningBanner.png\"\r\n");
      out.write("										alt=\"\"\r\n");
      out.write("										width=\"330\" height=\"248\">\r\n");
      out.write("										<p>Shop All Dining</p>\r\n");
      out.write("									</a><a\r\n");
      out.write("										href=\"index.jsp?main=product/productList.jsp?cate_num=22\">\r\n");
      out.write("										<img\r\n");
      out.write("										src=\"./image/staticImage/dchairBanner.png\"\r\n");
      out.write("										alt=\"\"				\r\n");
      out.write("										width=\"330\" height=\"248\">\r\n");
      out.write("										<p>Dining Chair</p>\r\n");
      out.write("									</a>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<li\r\n");
      out.write("						class=\"header__nav-top-level header__nav-top-level--has-children\">\r\n");
      out.write("						<a href=\"index.jsp?main=product/productList.jsp?cate_num=3\"\r\n");
      out.write("						class=\"header__nav-top-level-link\" data-name=\"Bedroom\">Bedroom</a>\r\n");
      out.write("						<div class=\"header-nav__sub-nav\">\r\n");
      out.write("							<div class=\"header-nav__sub-nav-inner\">\r\n");
      out.write("								<div class=\"header-nav__sub-nav-links\">\r\n");
      out.write("									<div class=\"header-nav__column\">\r\n");
      out.write("										<a class=\"header-nav__sub-nav-link\"\r\n");
      out.write("											href=\"index.jsp?main=product/productList.jsp?cate_num=31\">침대</a> <a\r\n");
      out.write("											class=\"header-nav__sub-nav-link\"\r\n");
      out.write("											href=\"index.jsp?main=product/productList.jsp?cate_num=32\">수납</a>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"header-nav__sub-nav-images\">\r\n");
      out.write("									<a href=\"index.jsp?main=product/productList.jsp?cate_num=3\"> <img\r\n");
      out.write("										src=\"./image/staticImage/bedBanner.png\"\r\n");
      out.write("										alt=\"\"\r\n");
      out.write("										width=\"330\" height=\"248\">\r\n");
      out.write("										<p>Shop All Bedroom</p>\r\n");
      out.write("									</a><a\r\n");
      out.write("										href=\"index.jsp?main=product/productList.jsp?cate_num=32\">\r\n");
      out.write("										<img\r\n");
      out.write("										src=\"//maidenhome.com/cdn/shop/files/06_The_Marais_Dresser_Top_Nav.jpg?v=1710959896&amp;width=330\"\r\n");
      out.write("										alt=\"\"\r\n");
      out.write("										srcset=\"//maidenhome.com/cdn/shop/files/06_The_Marais_Dresser_Top_Nav.jpg?v=1710959896&amp;width=330 330w\"\r\n");
      out.write("										width=\"330\" height=\"248\">\r\n");
      out.write("										<p>Dresser</p>\r\n");
      out.write("									</a>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</li>\r\n");
      out.write("\r\n");
      out.write("					<li\r\n");
      out.write("						class=\"header__nav-top-level header__nav-top-level--has-children\">\r\n");
      out.write("						<a href=\"index.jsp?main=product/productList.jsp?cate_num=4\"\r\n");
      out.write("						class=\"header__nav-top-level-link\" data-name=\"Lamp\">Lamp</a>\r\n");
      out.write("						<div class=\"header-nav__sub-nav\">\r\n");
      out.write("							<div class=\"header-nav__sub-nav-inner\">\r\n");
      out.write("								<div class=\"header-nav__sub-nav-links\">\r\n");
      out.write("									<div class=\"header-nav__column\">\r\n");
      out.write("										<a class=\"header-nav__sub-nav-link\"\r\n");
      out.write("											href=\"index.jsp?main=product/productList.jsp?cate_num=42\">장스탠드</a>\r\n");
      out.write("										<a class=\"header-nav__sub-nav-link\"\r\n");
      out.write("											href=\"index.jsp?main=product/productList.jsp?cate_num=41\">단스탠드</a>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"header-nav__sub-nav-images\">\r\n");
      out.write("									<a\r\n");
      out.write("										href=\"index.jsp?main=product/productList.jsp?cate_num=4\">\r\n");
      out.write("										<img src=\"./image/staticImage/lampBanner.png\" alt=\"\" width=\"330\" height=\"248\">\r\n");
      out.write("										<p>ALL LAMPS</p>\r\n");
      out.write("									</a>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<li\r\n");
      out.write("						class=\"header__nav-top-level header__nav-top-level--has-children\">\r\n");
      out.write("						<a href=\"index.jsp?main=product/productList.jsp?cate_num=5\"\r\n");
      out.write("						class=\"header__nav-top-level-link\" data-name=\"ETC\">ETC</a>\r\n");
      out.write("						<div class=\"header-nav__sub-nav\">\r\n");
      out.write("							<div class=\"header-nav__sub-nav-inner\">\r\n");
      out.write("								<div class=\"header-nav__sub-nav-links\">\r\n");
      out.write("									<div class=\"header-nav__column\">\r\n");
      out.write("										<a class=\"header-nav__sub-nav-link\"\r\n");
      out.write("											href=\"index.jsp?main=product/productList.jsp?cate_num=51\">ETC</a>\r\n");
      out.write("\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"header-nav__sub-nav-images\">\r\n");
      out.write("									<a href=\"index.jsp?main=product/productList.jsp?cate_num=5\"> <img\r\n");
      out.write("										src=\"./image/staticImage/etcBanner.png\"\r\n");
      out.write("										alt=\"\"\r\n");
      out.write("										width=\"330\" height=\"248\">\r\n");
      out.write("										<p>etc..</p>\r\n");
      out.write("									</a>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</li>\r\n");
      out.write("				</ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<div class=\"header__logo\">\r\n");
      out.write("					<h1 class=\"site-header__logo\" itemscope=\"\"\r\n");
      out.write("						itemtype=\"http://schema.org/Organization\">\r\n");
      out.write("						<a href=\"index.jsp\" itemprop=\"url\" class=\"site-header__logo-link\"> <img\r\n");
      out.write("							width=\"216\" height=\"36\" class=\"text-logo\"\r\n");
      out.write("							src=\"./image/staticImage/logo.png\" alt=\"Maiden Home\"\r\n");
      out.write("							itemprop=\"logo\">\r\n");
      out.write("						</a>\r\n");
      out.write("					</h1>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<ul class=\"header__nav\">\r\n");
      out.write("					<li\r\n");
      out.write("						class=\"header__nav-top-level header__nav-top-level--has-children\">\r\n");
      out.write("						<a onclick=\"openSetting()\"\r\n");
      out.write("						class=\"header__nav-top-level-link\" data-name=\" \"> <img\r\n");
      out.write("						src=\"./image/staticImage/searchicon_bs.png\"></a>\r\n");
      out.write("					</li>\r\n");
      out.write("\r\n");
      out.write("					");

					// 세션에 로그인 정보가 있는지 확인
					String loginStatus = (String) session.getAttribute("loginok");
					String myid = (String) session.getAttribute("myid");

					// 로그인 상태 확인
					boolean isLoggedIn = "yes".equals(loginStatus);

					if (isLoggedIn) {
						// 로그인 상태인 경우 처리
					
      out.write("\r\n");
      out.write("					<li\r\n");
      out.write("						class=\"header__nav-top-level header__nav-top-level--has-children\">\r\n");
      out.write("						<a href=\"SemiLogin/logoutAction.jsp\"\r\n");
      out.write("						class=\"header__nav-top-level-link\" data-name=\"Logout\">Logout</a>\r\n");
      out.write("					</li>\r\n");
      out.write("					");

					} else {
					// 로그인 상태가 아닌 경우 처리
					
      out.write("\r\n");
      out.write("					<li\r\n");
      out.write("						class=\"header__nav-top-level header__nav-top-level--has-children\">\r\n");
      out.write("						<a href=\"index.jsp?main=SemiLogin/Login.jsp\"\r\n");
      out.write("						class=\"header__nav-top-level-link\" data-name=\"Login\">Login</a>\r\n");
      out.write("					</li>\r\n");
      out.write("					");

					}
					
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<li\r\n");
      out.write("						class=\"header__nav-top-level header__nav-top-level--has-children\">\r\n");
      out.write("						<a href=\"index.jsp?main=wishlist/wishlist.jsp\"\r\n");
      out.write("						class=\"header__nav-top-level-link\" data-name=\"\"> <img\r\n");
      out.write("						src=\"./image/staticImage/hearticon_bs.png\"></a>\r\n");
      out.write("					</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<li\r\n");
      out.write("						class=\"header__nav-top-level header__nav-top-level--has-children\">\r\n");
      out.write("						<a href=\"index.jsp?main=cart/mycart.jsp\"\r\n");
      out.write("						class=\"header__nav-top-level-link\" data-name=\"\"> <img\r\n");
      out.write("						src=\"./image/staticImage/shoppingbag_bs.png\"></a>\r\n");
      out.write("					</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<li\r\n");
      out.write("						class=\"header__nav-top-level header__nav-top-level--has-children\">\r\n");
      out.write("						<a href=\"index.jsp?main=member/mypage.jsp\"\r\n");
      out.write("						class=\"header__nav-top-level-link\" data-name=\"MyPage\">MyPage</a>\r\n");
      out.write("					</li>\r\n");
      out.write("				</ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</header>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	<div id=\"search\">\r\n");
      out.write("        <input type=\"text\" id=\"keyword\" placeholder=\"SEARCH\">\r\n");
      out.write("        <button type=\"button\" id=\"enter\">\r\n");
      out.write("        	<img alt=\"\" src=\"./image/staticImage/serachicon_bs.png\" id=\"searchIcon\" width=\"22px\">\r\n");
      out.write("        </button>\r\n");
      out.write("        \r\n");
      out.write("        <span id=\"close\"><i class=\"bi bi-x-lg\"></i></span>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("	<script src=\"./header/header.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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