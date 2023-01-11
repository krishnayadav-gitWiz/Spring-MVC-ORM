package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class TestController {
	@RequestMapping("/one")
//	public String one() {
	    public RedirectView one() {
		System.out.println("this is one handler");
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("two");
//		return "redirect:/tow";
		return redirectView;
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("this is two handler");
		return "contact";
	}

}
