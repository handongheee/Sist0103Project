/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.88
 * Generated at: 2024-05-01 03:48:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.order;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import data.dto.ProductDto;
import data.dao.ProductDao;
import data.dto.OrderDetailDto;
import data.dao.OrderDetailDao;
import data.dto.MemberDto;
import data.dao.MemberDao;
import java.text.SimpleDateFormat;
import data.dto.OrderDto;
import java.util.List;
import data.dao.OrderDao;

public final class orderList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(10);
    _jspx_imports_classes.add("data.dto.OrderDto");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("data.dto.OrderDetailDto");
    _jspx_imports_classes.add("data.dao.MemberDao");
    _jspx_imports_classes.add("data.dao.ProductDao");
    _jspx_imports_classes.add("data.dao.OrderDetailDao");
    _jspx_imports_classes.add("data.dao.OrderDao");
    _jspx_imports_classes.add("data.dto.MemberDto");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.7.0.js\"></script>\r\n");
      out.write("<title>주문 목록</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".sub_container {\r\n");
      out.write("    max-width: 800px;\r\n");
      out.write("    padding: 0 20px;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write(".displaynone {\r\n");
      out.write("    display: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".center {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order_list {\r\n");
      out.write("    padding: 40px 16px 0;\r\n");
      out.write("    background: transparent;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order_table {\r\n");
      out.write("    display: block;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order_tbody {\r\n");
      out.write("    row-gap: 20px;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order_tr {\r\n");
      out.write("    display: block;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order_td {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order_top {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    margin-bottom: 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order_top .order_date {\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    font-weight: 700;\r\n");
      out.write("    line-height: 17px;\r\n");
      out.write("    color: #141414;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order_top .order_detail {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    column-gap: 4px;\r\n");
      out.write("    font-size: 12px;\r\n");
      out.write("    font-weight: 500;\r\n");
      out.write("    line-height: 14px;\r\n");
      out.write("    color: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order_top .order_detail > span {\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    margin-top: 2px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order_body {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("    align-items: flex-start;\r\n");
      out.write("    justify-content: flex-start;\r\n");
      out.write("    padding: 4px 16px;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    border: 1px solid #ECECEC;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    background: white;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order_body .order_id {\r\n");
      out.write("    font-size: 12px;\r\n");
      out.write("    line-height: 14px;\r\n");
      out.write("    color: #333;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    padding: 12px 0;\r\n");
      out.write("    text-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order_body .body_main {\r\n");
      out.write("    border-bottom: 1px solid #ECECEC;\r\n");
      out.write("    border-top: 1px solid #ECECEC;\r\n");
      out.write("    column-gap: 16px;\r\n");
      out.write("    padding: 12px 0;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    align-items: flex-start;\r\n");
      out.write("    justify-content: flex-start;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order_body .body_main img {\r\n");
      out.write("    width: 76px;\r\n");
      out.write("    height: 76px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order_body .body_main .info {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("    flex: 1 1 0%;\r\n");
      out.write("    align-items: flex-start;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    text-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".body_main .info .product_name {\r\n");
      out.write("    font-size: 13px;\r\n");
      out.write("    font-weight: 400;\r\n");
      out.write("    line-height: 21px;\r\n");
      out.write("    color: #333;\r\n");
      out.write("    margin-bottom: 4px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".body_main .info .product_option {\r\n");
      out.write("    width: 70%;\r\n");
      out.write("    font-size: 12px;\r\n");
      out.write("    line-height: 14px;\r\n");
      out.write("    color: #929292;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    text-overflow: ellipsis;\r\n");
      out.write("    white-space: nowrap;\r\n");
      out.write("    padding-bottom: 12px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".body_main .info .price {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    justify-content: flex-start;\r\n");
      out.write("    column-gap: 21px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".body_main .info .price p {\r\n");
      out.write("    position: relative;\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    font-weight: 500;\r\n");
      out.write("    line-height: 17px;\r\n");
      out.write("    color: #616161;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".body_main .info .price p:first-child::after {\r\n");
      out.write("    content: '';\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    display: block;\r\n");
      out.write("    width: 1px;\r\n");
      out.write("    height: 12px;\r\n");
      out.write("    top: 2px;\r\n");
      out.write("    right: -10px;\r\n");
      out.write("    background: #C7C7C7;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order_foot {\r\n");
      out.write("    padding: 13px 0;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order_foot .order_status {\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    font-weight: 600;\r\n");
      out.write("    line-height: 17px;\r\n");
      out.write("    color: #EA6000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order_foot .order_update {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    justify-content: flex-end;\r\n");
      out.write("    column-gap: 12px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".order_foot .order_update a {\r\n");
      out.write("    font-size: 12px;\r\n");
      out.write("    line-height: 14px;\r\n");
      out.write("    color: #929292;\r\n");
      out.write("    text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("page-title {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    font-size: 24px;\r\n");
      out.write("    font-weight: 700;\r\n");
      out.write("    letter-spacing: 5px;\r\n");
      out.write("    color: #222;\r\n");
      out.write("    line-height: 27px;\r\n");
      out.write("    padding-top: 75px;\r\n");
      out.write("    padding-bottom: 60px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"body\">\r\n");
      out.write("	<div id=\"body-begin\"></div>\r\n");
      out.write("	<div class=\"sub_container\">\r\n");
      out.write("		<h1 class=\"page-title\">ORDER LIST</h1>\r\n");
      out.write("		<div class=\"order_history\">\r\n");
      out.write("			<section class=\"orders_wrap\">\r\n");
      out.write("				<div class=\"xans-element- xans-myshop xans-myshop-orderhistorylistitem ec-base-table typeList\">\r\n");
      out.write("					<div class=\"order_list \">\r\n");
      out.write("						<table class=\"order_table\">\r\n");
      out.write("							<thead style=\"display: none;\">\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th scope=\"col\">주문일자<br>[주문번호]</th>\r\n");
      out.write("						            <th scope=\"col\">이미지</th>\r\n");
      out.write("						            <th scope=\"col\">상품정보</th>\r\n");
      out.write("						            <th scope=\"col\">수량</th>\r\n");
      out.write("						            <th scope=\"col\">상품구매금액</th>\r\n");
      out.write("						            <th scope=\"col\">주문처리상태</th>\r\n");
      out.write("						            <th scope=\"col\">취소/교환/반품</th>\r\n");
      out.write("					       		</tr>\r\n");
      out.write("					       	</thead>\r\n");
      out.write("					       	<tbody class=\"center order_tbody \">\r\n");
      out.write("					       		");
 
						            String mem_id = (String) session.getAttribute("myid"); 
					       			
						       		MemberDao memberDao = new MemberDao();
						       		MemberDto memberDto = memberDao.getMemberInfo(mem_id);
					       			System.out.println(mem_id);
						       		String mem_num = memberDto.getMem_num();
						       		System.out.println("회원번호: "+mem_num);
					                // 주문 목록을 가져오는 부분
					                OrderDao orderDao = new OrderDao();
					                List<OrderDto> orderList = orderDao.getOrdersByMember(mem_num);
					                
					                
					                
					                // 각 주문을 테이블에 표시
					                for (OrderDto order : orderList) {
					                	
					                	String order_num = order.getOrder_num();
					                	
					                	OrderDetailDao orderDetailDao = new OrderDetailDao();
					                	OrderDetailDto orderDetailDto = orderDetailDao.getOrderDetailsByMember(order_num);
					                	String pro_num = orderDetailDto.getPro_num();
	
					                	ProductDao pDao = new ProductDao();
					                	ProductDto pDto = pDao.getProduct(pro_num);
					                	
					            
      out.write("\r\n");
      out.write("					       		<tr class=\"order_tr xans-record-\">\r\n");
      out.write("									<td class=\"order_td\">\r\n");
      out.write("				                    	<div class=\"order_top\">\r\n");
      out.write("				                                    <p class=\"order_date\">");
      out.print( new SimpleDateFormat("yyyy-MM-dd").format(order.getOrder_date()) );
      out.write("</p>\r\n");
      out.write("				                                    <a href=\"index.jsp?main=order/orderDetail.jsp?order_num=");
      out.print(order_num );
      out.write("\" class=\"order_detail\">\r\n");
      out.write("				                                        <span>상세보기</span>\r\n");
      out.write("				                                        <svg width=\"18\" height=\"18\" viewbox=\"0 0 18 18\" fill=\"none\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M7.05002 12.95L6.52502 12.425L9.97502 8.975L6.52502 5.525L7.05002 5L11.025 8.975L7.05002 12.95Z\" fill=\"black\"></path></svg></a>\r\n");
      out.write("				                        </div>\r\n");
      out.write("				                        <div class=\"order_body\">\r\n");
      out.write("				                            <a href=\"#\" class=\"order_id\">주문번호 : ");
      out.print( order_num );
      out.write("</a>\r\n");
      out.write("				                            <div class=\"body_main\">\r\n");
      out.write("				                                <a href=\"/product/detail.html?product_no=14801&cate_no=1\"><img src=\"");
      out.print(pDto.getPro_main_img());
      out.write("\" onerror=\"this.src='//img.echosting.cafe24.com/thumb/img_product_small.gif';\" alt=\"\"></a>\r\n");
      out.write("				                                <div class=\"info\">\r\n");
      out.write("				                                    <p class=\"product_name\">");
      out.print( pDto.getPro_name() );
      out.write("</p>\r\n");
      out.write("				                                    <p class=\"product_option\">[");
      out.print( orderDetailDto.getOrder_color() );
      out.write(' ');
      out.write(':');
      out.write(' ');
      out.print( orderDetailDto.getOrder_detail_su() );
      out.write("개]</p>\r\n");
      out.write("				                                    <div class=\"price\">\r\n");
      out.write("				                                        <p>&#8361;");
      out.print( order.getOrder_total_payment() );
      out.write("</p>\r\n");
      out.write("				                                        <p>");
      out.print( orderDetailDto.getOrder_detail_su());
      out.write("개</p>\r\n");
      out.write("				                                    </div>\r\n");
      out.write("				                                </div>\r\n");
      out.write("				                            </div>\r\n");
      out.write("				                            <div class=\"order_foot\">\r\n");
      out.write("				                                <p class=\"order_status\">");
      out.print( order.getOrder_status() );
      out.write("</p>\r\n");
      out.write("				                                <div class=\"order_update \">\r\n");
      out.write("				                                	");
 
					                                    if (order.getOrder_status().equals("입금대기")) { 
					                                
      out.write("\r\n");
      out.write("				                                		<a href=\"#\" class=\"btnNormal\">취소신청</a>\r\n");
      out.write("				                                	");
 } else if (order.getOrder_status().equals("배송중")) { 
      out.write("	\r\n");
      out.write("				                                		<a href=\"#\" class=\"btnNormal\">배송조회</a>\r\n");
      out.write("				                                	");
 } else if (order.getOrder_status().equals("배송완료")) { 
      out.write("\r\n");
      out.write("					                                	<a href=\"#\" class=\"btnNormal\">구매후기</a>\r\n");
      out.write("	                                				");
 } 
      out.write("\r\n");
      out.write("				                                </div>\r\n");
      out.write("				                            </div>\r\n");
      out.write("				                        </div>\r\n");
      out.write("				                    </td>\r\n");
      out.write("				            	</tr>\r\n");
      out.write("				            	");
 } 
      out.write("\r\n");
      out.write("					       	</tbody>\r\n");
      out.write("						</table>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</section>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div id=\"body-end\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
