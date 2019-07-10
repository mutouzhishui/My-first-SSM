package cn.edu.cuit.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.edu.cuit.ssm.service.GoodsService;
import cn.edu.cuit.ssm.service.UserService;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	@RequestMapping("/tologin")
	public String tologin() {
		return "login";
	}
	
	
	@RequestMapping("/login")
	public String login(String name,String password,Model model) {
		boolean res = userService.findUserByNameAndPwd(name,password);
		if (res == true) {
			return "success";
		}else {
			model.addAttribute("uname",name);
			model.addAttribute("msg","用户名或密码错误");
			return "login";
		}
	}

}
