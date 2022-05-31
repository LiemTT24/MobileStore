package webassignment.Controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import webassignment.DTO.CartDto;
import webassignment.Service.User.CartServiceImpl;

@Controller
public class CartController extends BaseController {
	@Autowired
	private CartServiceImpl cartService = new CartServiceImpl();
	
	@RequestMapping(value = "/list-cart")
	public ModelAndView getListCart() {
		mv.addObject("slides", _homeService.getDataSlides());
		mv.addObject("categories", _homeService.getDataCategory());
		mv.addObject("products", _homeService.getDataProducts());
		mv.setViewName("cart/listcart");
		return mv;
	}
	
	@RequestMapping(value = "AddCart/{id}")
	public String AddCart(HttpServletRequest request, HttpSession session, @PathVariable long id) {
		HashMap<Long, CartDto> cart = (HashMap<Long, CartDto>)session.getAttribute("Cart");
		if(cart == null) {
			cart = new HashMap<Long, CartDto>();
		}
		cart = cartService.AddToCard(id, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("totalQuantityCart", cartService.totalQuantity(cart));
		session.setAttribute("totalPriceCart", cartService.totalPrice(cart));
		return "redirect:"+request.getHeader("Referer");
	}
	
	@RequestMapping(value = "EditCart/{id}/{quantity}")
	public String EditCart(HttpServletRequest request, HttpSession session, @PathVariable long id, @PathVariable int quantity) {
		HashMap<Long, CartDto> cart = (HashMap<Long, CartDto>)session.getAttribute("Cart");
		if(cart == null) {
			cart = new HashMap<Long, CartDto>();
		}
		cart = cartService.EditToCard(id, quantity, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("totalQuantityCart", cartService.totalQuantity(cart));
		session.setAttribute("totalPriceCart", cartService.totalPrice(cart));
		return "redirect:"+request.getHeader("Referer");
	}
	
	
	@RequestMapping(value = "DeleteCart/{id}")
	public String DeleteCart(HttpServletRequest request, HttpSession session, @PathVariable long id) {
		HashMap<Long, CartDto> cart = (HashMap<Long, CartDto>)session.getAttribute("Cart");
		if(cart == null) {
			cart = new HashMap<Long, CartDto>();
		}
		cart = cartService.DeleteToCard(id, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("totalQuantityCart", cartService.totalQuantity(cart));
		session.setAttribute("totalPriceCart", cartService.totalPrice(cart));
		return "redirect:"+request.getHeader("Referer");
	}
	
}
