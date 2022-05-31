package webassignment.Controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import webassignment.Service.User.HomeServiceImpl;
@Controller
public class BaseController {
	@Autowired
	HomeServiceImpl _homeService;
	public ModelAndView mv = new ModelAndView();
	@PostConstruct
	public ModelAndView Init () {
		mv.addObject("menu", _homeService.getDataMenu());
		return mv;
	}
}
