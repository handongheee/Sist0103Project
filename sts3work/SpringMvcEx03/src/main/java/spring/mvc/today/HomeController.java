package spring.mvc.today;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping (value="/")
	public String home(Model model) {
		// request에 저장
		model.addAttribute("msg", "HomeController 로부터 포워드됨");
		model.addAttribute("today", new Date());
		
		return "home"; // WEB-INF/day0502/home.jsp
		
	}
	
	@GetMapping ("apple/list") // 확장자를 생략해도 알아서 맵핑됨. 스프링 고유의 url만을 찾기 때문에 충돌위험이 없다!
	public String appleList(Model model) {
		model.addAttribute("stuName", "변우석");
		model.addAttribute("stuLoc", "4강의장");
		
		return "stuResult01";
	}
	
	@GetMapping ("/banana/insert")
	public ModelAndView banana() {
		// ModelAndView는 request에 저장하기 위한 model과 포워드를 위한 view를 합쳐놓은 클래스
		ModelAndView mview=new ModelAndView();
		
		// request에 저장
		mview.addObject("java", 88);
		mview.addObject("mySql", 72);
		
		// 포워드할 jsp 지정
		mview.setViewName("scoreResult");
		
		return mview;
	}
	
	@GetMapping("/orange/select")
	public String orange(Model model, HttpSession session) {
		// request에 저장
		model.addAttribute("s_msg", "스프링 맵핑 연습중!!");
		
		// session에 저장
		session.setAttribute("myid", "admin");
		
		return "orangeResult";
	}
	
	@GetMapping("/shop/detail") // today/shop/detail
	public String resShop() {
		return "resResult";
	}
}
