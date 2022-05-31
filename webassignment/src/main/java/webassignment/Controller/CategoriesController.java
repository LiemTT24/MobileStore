package webassignment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import webassignment.DTO.PaginatesDto;
import webassignment.Service.User.CategoryServiceImpl;
import webassignment.Service.User.PaginatesServiceImpl;

@Controller
public class CategoriesController extends BaseController{
	@Autowired
	private CategoryServiceImpl categoryService;
	@Autowired
	private PaginatesServiceImpl paginateService;
	
	private int totalProductsInPage = 3;
	
	@RequestMapping(value = "/product/{id}")
	public ModelAndView getProducts(@PathVariable String id) {
		mv.setViewName("products/categories");
		int totalData = categoryService.getAllProductsById(Integer.parseInt(id)).size();
		PaginatesDto paginateInfo = paginateService.getInfoPaginates(totalData, totalProductsInPage, 1);
		mv.addObject("idCategory", id);
		mv.addObject("paginateInfo", paginateInfo);
		mv.addObject("productsPaginate", categoryService.getDataProductsPaginate(Integer.parseInt(id), paginateInfo.getStart(), totalProductsInPage));
		return mv;
	}
	
	@RequestMapping(value = "/product/{id}/{currentPage}")
	public ModelAndView getProducts(@PathVariable String id, @PathVariable String currentPage) {
		mv.setViewName("products/categories");
		int totalData = categoryService.getAllProductsById(Integer.parseInt(id)).size();
		PaginatesDto paginateInfo = paginateService.getInfoPaginates(totalData, totalProductsInPage, Integer.parseInt(currentPage));
		mv.addObject("idCategory", id);
		mv.addObject("paginateInfo", paginateInfo);
		mv.addObject("productsPaginate", categoryService.getDataProductsPaginate(Integer.parseInt(id), paginateInfo.getStart(), totalProductsInPage));
		return mv;
	}
}
