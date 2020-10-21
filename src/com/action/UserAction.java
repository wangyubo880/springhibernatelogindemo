package com.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bean.User;
import com.service.UserService;

@Controller
public class UserAction {
	@Autowired
	private UserService userService;
	@RequestMapping("/userlist")
	public String userlist(Model model) {
		List<User> list = userService.findAll();
		model.addAttribute("userlist",list);
		return "userlist";
	}
	@RequestMapping("/register")
	public String register(User user,Model model) {
		boolean result = userService.register(user);
		if(result) {
			return "redirect:userlist.do";
		}else {
			model.addAttribute("errormsg", "×¢²áÊ§°Ü");
			return "register";
		}
		
	}

}
