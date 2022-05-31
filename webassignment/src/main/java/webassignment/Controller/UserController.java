package webassignment.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import webassignment.Model.User;
import webassignment.Service.User.AccountsServiceImpl;

@Controller
public class UserController extends BaseController {
	@Autowired
	AccountsServiceImpl accountService = new AccountsServiceImpl();
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView Login(HttpSession session, @ModelAttribute("user") User user) {
		user = accountService.CheckAccount(user);
		if(user != null) {
			mv.setViewName("redirect:home-page");
			session.setAttribute("user_Login", user);
		}else {
			mv.addObject("statusLogin", "Login failed!");
		}
		return mv;
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String Logout(HttpSession session, HttpServletRequest request) {
		session.removeAttribute("user_Login");
		return "redirect:"+request.getHeader("Referer");
	}
}
