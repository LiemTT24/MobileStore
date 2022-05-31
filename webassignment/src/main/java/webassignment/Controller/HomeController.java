package webassignment.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController {
	@RequestMapping(value = {"/", "/home-page"})
	public ModelAndView getIndex() {
		mv.addObject("slides", _homeService.getDataSlides());
		mv.addObject("categories", _homeService.getDataCategory());
		mv.addObject("products", _homeService.getDataProducts());
		mv.setViewName("index");
		return mv;
	}	
}
