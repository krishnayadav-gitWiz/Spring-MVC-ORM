package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller

public class ContactController {
	
	@Autowired
	private UserService userService;
	

	@RequestMapping(path = "/contact", method=RequestMethod.GET)
	public String showContact(Model model) {
		return "contact";
	}
	
//	//using model class
//	@RequestMapping(path = "/formSubmit", method = RequestMethod.POST)
//	public String handler(Model model ,@RequestParam("email") String userEmail,
//			@RequestParam("username") String userName,@RequestParam("password") String userPassword) {
//		
//		User user=new User();
//		
//		user.setUsername(userName);
//		user.setEmail(userEmail);
//		user.setPassword(userPassword);
//		System.out.println(user);
//		
//		
//		System.out.println("email "+ userEmail);
//		System.out.println("userName "+userName);
//		System.out.println("password "+userPassword);
//		
////		model.addAttribute("name", userName);
////		model.addAttribute("email", userEmail);
////		model.addAttribute("pass", userPassword);
//		
//		model.addAttribute("user",user);
//		return "success";
//	}
	
	
	//using model attribute class
		@RequestMapping(path = "/formSubmit", method = RequestMethod.POST)
		public String handler(@ModelAttribute("user") User user,Model model) {
			System.out.println(user);
//			this.userService.createUser(user);
//			int createUser= this.userService.createUser(user);
//			model.addAttribute("msg","User created with id "+createUser);
			return "success";
		}
		
		//this method will run 1st
		@ModelAttribute
		public void commonDataForModel(Model model) {
			model.addAttribute("Header","Registration");
			model.addAttribute("Description","this is for signup");
		}

}
