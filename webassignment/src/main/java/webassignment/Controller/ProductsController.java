package webassignment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import webassignment.Service.User.ProductsServiceImpl;

@Controller
public class ProductsController extends BaseController {
	
	@Autowired
	private ProductsServiceImpl _productService;
	
	
	@RequestMapping(value = {"product-detail/{id}"})
	public ModelAndView getProduct(@PathVariable long id) {
		mv.setViewName("products/product");
		mv.addObject("product",  _productService.getProductBy(id));
		return mv;
	}
}
