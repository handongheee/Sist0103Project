/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.88
 * Generated at: 2024-05-01 03:48:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.order;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import data.dto.OrderDetailDto;
import data.dao.OrderDetailDao;
import data.dto.ProductDto;
import data.dao.ProductDao;
import data.dto.OrderDto;
import data.dao.OrderDao;
import data.dto.MemberDto;
import data.dao.MemberDao;

public final class orderDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(9);
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("data.dto.OrderDto");
    _jspx_imports_classes.add("data.dto.OrderDetailDto");
    _jspx_imports_classes.add("data.dao.MemberDao");
    _jspx_imports_classes.add("data.dao.OrderDetailDao");
    _jspx_imports_classes.add("data.dao.ProductDao");
    _jspx_imports_classes.add("data.dao.OrderDao");
    _jspx_imports_classes.add("data.dto.MemberDto");
    _jspx_imports_classes.add("data.dto.ProductDto");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#body {\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#body-begin {\r\n");
      out.write("    clear: both;\r\n");
      out.write("    height: 1px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#body-end {\r\n");
      out.write("    clear: both;\r\n");
      out.write("    height: 200px;\r\n");
      out.write("}\r\n");
      out.write(".sub_container {\r\n");
      out.write("    max-width: 800px;\r\n");
      out.write("    padding: 0 20px;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("h1.page-title {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    font-size: 24px;\r\n");
      out.write("    font-weight: 700;\r\n");
      out.write("    letter-spacing: 5px;\r\n");
      out.write("    color: #222;\r\n");
      out.write("    line-height: 27px;\r\n");
      out.write("    padding-top: 75px;\r\n");
      out.write("    padding-bottom: 60px;\r\n");
      out.write("}\r\n");
      out.write(".xans-myshop-orderhistorydetail .orderArea:first-child .title {\r\n");
      out.write("    margin-top: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".boardView {\r\n");
      out.write("    border-top: 1px solid #616161;\r\n");
      out.write("    border-bottom: 1px solid #616161;\r\n");
      out.write("}\r\n");
      out.write(".boardView table {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    table-layout: fixed;\r\n");
      out.write("    color: #353535;\r\n");
      out.write("    line-height: 1.5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".boardView tr {\r\n");
      out.write("    display: flex;\r\n");
      out.write("}\r\n");
      out.write(".boardView th {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("\r\n");
      out.write("    color: #616161;\r\n");
      out.write("    width: 97px;\r\n");
      out.write("    padding: 12px 0 12px 10px;\r\n");
      out.write("    font-weight: 500;\r\n");
      out.write("    text-align: left;\r\n");
      out.write("    border-top: 1px solid #e9e9e9;\r\n");
      out.write("    background-color: #F5F5F5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".boardView td {\r\n");
      out.write("\r\n");
      out.write("    color: #616161;\r\n");
      out.write("    flex: 1;\r\n");
      out.write("    padding: 12px;\r\n");
      out.write("    border-top: 1px solid #e9e9e9;\r\n");
      out.write("}\r\n");
      out.write(".boardView tbody tr:first-child th, .boardView tbody tr:first-child td {\r\n");
      out.write("    border-top: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".boardView img {\r\n");
      out.write("    vertical-align: middle;\r\n");
      out.write("}\r\n");
      out.write(".ec-base-table .message {\r\n");
      out.write("    padding: 7rem 0;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    font-size: 1.4rem;\r\n");
      out.write("    font-weight: 400;\r\n");
      out.write("    color: #616161;\r\n");
      out.write("    margin: 16px;\r\n");
      out.write("    background-color: #F5F5F5;\r\n");
      out.write("    border-radius: 8px;\r\n");
      out.write("}\r\n");
      out.write(".typeList {\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    border: 1px solid #D8D8D8;\r\n");
      out.write("}\r\n");
      out.write(".order_title {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    padding: 16px;\r\n");
      out.write("    background-color: #F5F5F5;\r\n");
      out.write("    border-radius: 4px 4px 0 0;\r\n");
      out.write("    font-size: 12px;\r\n");
      out.write("    font-weight: 400;\r\n");
      out.write("    color: #929292;\r\n");
      out.write("}\r\n");
      out.write(".order_title > p:nth-child(2) {\r\n");
      out.write("    color: #141414;\r\n");
      out.write("}\r\n");
      out.write(".boardList {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    table-layout: fixed;\r\n");
      out.write("    margin: 0 0 1px;\r\n");
      out.write("    color: #353535;\r\n");
      out.write("    line-height: 1.5;\r\n");
      out.write("}\r\n");
      out.write(".boardList th {\r\n");
      out.write("    padding: 11px 0 9px;\r\n");
      out.write("    border-left: 1px solid #e9e9e9;\r\n");
      out.write("    font-weight: normal;\r\n");
      out.write("    background: #fbfafa;\r\n");
      out.write("}\r\n");
      out.write(".boardList th:first-child {\r\n");
      out.write("    border-left: 0;\r\n");
      out.write("}\r\n");
      out.write(".boardList td {\r\n");
      out.write("    text-align: left;\r\n");
      out.write("    vertical-align: middle;\r\n");
      out.write("    word-wrap: break-word;\r\n");
      out.write("}\r\n");
      out.write(".boardList .name {\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    font-weight: 500;\r\n");
      out.write("    color: #333;\r\n");
      out.write("}\r\n");
      out.write(".boardList .option {\r\n");
      out.write("    margin-top: 4px;\r\n");
      out.write("    font-size: 12px;\r\n");
      out.write("    font-weight: 400;\r\n");
      out.write("    color: #929292;\r\n");
      out.write("}\r\n");
      out.write(".boardList .price_info {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    gap: 20px;\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    font-weight: 500;\r\n");
      out.write("    color: #616161;\r\n");
      out.write("    margin-top: 12px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".boardList .price_info > li {\r\n");
      out.write("    position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".boardList .price_info > li::after {\r\n");
      out.write("    content: \"\";\r\n");
      out.write("    display: block;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 50%;\r\n");
      out.write("    right: -10px;\r\n");
      out.write("    transform: translate(0,-50%);\r\n");
      out.write("    width: 1px;\r\n");
      out.write("    height: 75%;\r\n");
      out.write("    background-color: #C7C7C7;\r\n");
      out.write("}\r\n");
      out.write(".boardList tbody tr {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    padding: 16px;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    gap: 16px;\r\n");
      out.write("    border-bottom: 1px solid #D8D8D8;\r\n");
      out.write("}\r\n");
      out.write(".center {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write(".left {\r\n");
      out.write("    text-align: left;\r\n");
      out.write("}\r\n");
      out.write(".boardList .thumb {\r\n");
      out.write("    width: 92px;\r\n");
      out.write("}\r\n");
      out.write(".xans-myshop-orderhistorydetail {\r\n");
      out.write("    padding: 0 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".xans-myshop-orderhistorydetail .title {\r\n");
      out.write("    margin: 28px 0 12px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".xans-myshop-orderhistorydetail .title h3 {\r\n");
      out.write("    font-size: 1.6rem;\r\n");
      out.write("    font-weight: 700;\r\n");
      out.write("    color: #141414;\r\n");
      out.write("}\r\n");
      out.write("html,body,div,dl,dt,dd,ul,ol,li,h1,h2,h3,h4,h5,h6,pre,code,form,fieldset,legend,input,textarea,p,blockquote,th,td,img {\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    color: #353535;\r\n");
      out.write("}\r\n");
      out.write("div {\r\n");
      out.write("    display: block;\r\n");
      out.write("    unicode-bidi: isolate;\r\n");
      out.write("}\r\n");
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
      out.write("</style>\r\n");
 
	String mem_id = (String) session.getAttribute("myid");
	MemberDao mdao = new MemberDao();
	MemberDto mdto = mdao.getMemberInfo(mem_id);	       			
	
	String order_num = request.getParameter("order_num");
	OrderDao odao = new OrderDao();
	OrderDto odto = odao.getOneData(order_num);
	
    
	OrderDetailDao odtdao = new OrderDetailDao();
	OrderDetailDto odtdto = odtdao.getOrderDetailsByMember(order_num);
	String pro_num = odtdto.getPro_num();	
	ProductDao productDao = new ProductDao();
	ProductDto pdto = productDao.getProduct(pro_num);
	// ProductDao 인스턴스 생성
    

    // getProduct 메서드를 사용하여 상품 정보 가져오기

      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"body\">\r\n");
      out.write("<div id=\"body-begin\"></div>\r\n");
      out.write("<div class=\"sub_container\">\r\n");
      out.write("	<h1 class=\"page-title\">주문정보</h1>\r\n");
      out.write("	<form id=\"detailForm\" name=\"detailForm\" action=\"#\" method=\"POST\">\r\n");
      out.write("	<div class=\"xans-myshop-orderhistorydetail\">\r\n");
      out.write("	<!-- 주문정보 -->\r\n");
      out.write("	<div class=\"orderArea\">\r\n");
      out.write("		<div class=\"title\">\r\n");
      out.write("        	\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("       <div class=\"boardView\">\r\n");
      out.write("           <table border=\"0\">\r\n");
      out.write("               <tbody>\r\n");
      out.write("						<tr>\r\n");
      out.write("						<th scope=\"row\">주문번호</th>\r\n");
      out.write("							<td>");
      out.print(odto.getOrder_num() );
      out.write("</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						\r\n");
      out.write("						<tr>\r\n");
      out.write("						<th scope=\"row\">주문일자</th>\r\n");
      out.write("							<td>");
      out.print(odto.getOrder_date());
      out.write("</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						                        \r\n");
      out.write("						<tr>\r\n");
      out.write("						<th scope=\"row\">주문자</th>\r\n");
      out.write("							<td><span class=\"authssl_order_name\">");
      out.print(mdto.getMem_name() );
      out.write("</span></td>\r\n");
      out.write("						</tr>\r\n");
      out.write("				\r\n");
      out.write("						<tr>\r\n");
      out.write("						<th scope=\"row\">주문처리상태</th>\r\n");
      out.write("							<td>");
      out.print(odto.getOrder_status());
      out.write("</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("				</tbody>\r\n");
      out.write("			</table>\r\n");
      out.write("		</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <!-- 주문 상품 정보 -->\r\n");
      out.write("	<div class=\"orderArea order_item\">\r\n");
      out.write("    	<div class=\"title\">\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"ec-base-table typeList\">\r\n");
      out.write("            <div class=\"order_title\">\r\n");
      out.write("                <p>주문번호: ");
      out.print(odto.getOrder_num() );
      out.write("</p>\r\n");
      out.write("                <p>");
      out.print(odto.getOrder_status());
      out.write("</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <table border=\"0\" class=\" boardList\">\r\n");
      out.write("            ");

            
         	// OrderDetailDao 인스턴스 생성
            OrderDetailDao orderDetailDao = new OrderDetailDao();
            
         	// getOrderDetails 메서드를 사용하여 주문 목록 가져오기
            List<OrderDetailDto> orderDetails = orderDetailDao.getOrderDetails(order_num);
            
         	// 주문 목록을 화면에 출력
            if (orderDetails != null && !orderDetails.isEmpty()) {
            	for (OrderDetailDto orderDetail : orderDetails) {
            		
            		// 각 주문 상세 정보에서 상품 번호를 가져옴
                    String p_num = orderDetail.getPro_num();
            		//System.out.println("상품 번호: " + p_num);
            		
            		// ProductDao 인스턴스 생성
                    ProductDao pDao = new ProductDao();

                    // getProduct 메서드를 사용하여 상품 정보 가져오기
                    ProductDto pDto = pDao.getProduct(p_num);
                    
                    //System.out.println("상품 번호: " + p_num + "상품명: " + pDto.getPro_name()+"상품 가격: "+ pDto.getPro_price());
            
      out.write("\r\n");
      out.write("            	<rowsgroup><row style=\"width: 79px\"></row><row style=\"width: auto\"></row></rowsgroup>\r\n");
      out.write("				<tbody class=\"center\">\r\n");
      out.write("				<tr class=\"xans-record-\">\r\n");
      out.write("					<td class=\"thumb\">\r\n");
      out.write("						<a href=\"index.jsp?main=product/detailpage.jsp?pro_num=");
      out.print(p_num );
      out.write("\"><img src=\"");
      out.print(pDto.getPro_main_img());
      out.write("\"></a>\r\n");
      out.write("		            </td>\r\n");
      out.write("					<td class=\"left\">\r\n");
      out.write("					    <strong class=\"name\">");
      out.print( pDto.getPro_name() );
      out.write("</strong>\r\n");
      out.write("					    <div class=\"option \">[옵션: ");
      out.print(orderDetail.getOrder_color());
      out.write(':');
      out.write(' ');
      out.print(orderDetail.getOrder_size());
      out.write("]</div>\r\n");
      out.write("						<ul class=\"price_info\">\r\n");
      out.write("							<li class=\"\"><strong>&#8361;");
      out.print(pDto.getPro_price());
      out.write("</strong></li>\r\n");
      out.write("							<li>");
      out.print(orderDetail.getOrder_detail_su());
      out.write("개</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				</tbody>\r\n");
      out.write("				");

            	}
            }
            
      out.write("\r\n");
      out.write("            <!--  \r\n");
      out.write("				<rowsgroup><row style=\"width: 79px\"></row><row style=\"width: auto\"></row></rowsgroup>\r\n");
      out.write("				<tbody class=\"center\">\r\n");
      out.write("				<tr class=\"xans-record-\">\r\n");
      out.write("					<td class=\"thumb\">\r\n");
      out.write("						<a href=\"index.jsp?main=product/detailpage.jsp?pro_num=");
      out.print(pro_num );
      out.write("\"><img src=\"");
      out.print(pdto.getPro_main_img());
      out.write("\"></a>\r\n");
      out.write("		            </td>\r\n");
      out.write("					<td class=\"left\">\r\n");
      out.write("					    <strong class=\"name\">");
      out.print( pdto.getPro_name() );
      out.write("</strong>\r\n");
      out.write("					    <div class=\"option \">[옵션: ");
      out.print(odtdto.getOrder_color());
      out.write(':');
      out.write(' ');
      out.print(odtdto.getOrder_size());
      out.write("]</div>\r\n");
      out.write("						<ul class=\"price_info\">\r\n");
      out.write("							<li class=\"\"><strong>&#8361;");
      out.print(pdto.getPro_price());
      out.write("</strong></li>\r\n");
      out.write("							<li>");
      out.print(odtdto.getOrder_detail_su());
      out.write("개</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				</tbody>\r\n");
      out.write("				-->\r\n");
      out.write("			</table>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- 배송지정보 -->\r\n");
      out.write("<div class=\"orderArea\">\r\n");
      out.write("            <div class=\"title\">\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"boardView\">\r\n");
      out.write("                <table border=\"0\">\r\n");
      out.write("                    <tbody>\r\n");
      out.write("<tr>\r\n");
      out.write("<th scope=\"row\">받으시는분</th>\r\n");
      out.write("                            <td><span class=\"authssl_delivery_name\">");
      out.print(odto.getOrder_name() );
      out.write("</span></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<th scope=\"row\">배송지</th>\r\n");
      out.write("                            <td><span class=\"authssl_delivery_rzipcode\">");
      out.print(odto.getOrder_addr() );
      out.write("</span></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<tr>\r\n");
      out.write("<th scope=\"row\">휴대전화</th>\r\n");
      out.write("                            <td><span class=\"authssl_delivery_rphone_2\">");
      out.print(odto.getOrder_hp() );
      out.write("</span></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<th scope=\"row\">배송메시지</th>\r\n");
      out.write("                            <td><span class=\"authssl_delivery_message\">");
      out.print(odto.getOrder_delivery_request() );
      out.write("</span></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("	</form>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"body-end\"></div>\r\n");
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
