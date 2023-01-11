package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/main")
public class HomeController {
	@RequestMapping(path = "/home", method=RequestMethod.GET)
	public String home(Model model) {
		System.out.println("this is home page...");
		
		model.addAttribute("id",111);
		model.addAttribute("name","krishna yadav");
		
		List<String> frnds=new ArrayList<String>();
		frnds.add("Nilesh");
		frnds.add("cb");
		frnds.add("raksh");
		frnds.add("rohan");
		
		model.addAttribute("f", frnds);
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about page...");
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help page...");
		ModelAndView modelAndView=new ModelAndView();
		
		modelAndView.addObject("id",111);
		modelAndView.addObject("name","krishna yadav");
		LocalDateTime now= LocalDateTime.now();
		modelAndView.addObject("time",now);
		List<String> frnds=new ArrayList<String>();
		frnds.add("Nilesh");
		frnds.add("cb");
		frnds.add("raksh");
		frnds.add("rohan");
		modelAndView.addObject("f", frnds);
		
		modelAndView.setViewName("help");
		
		return modelAndView;
	}

}
