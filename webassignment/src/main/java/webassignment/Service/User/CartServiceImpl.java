package webassignment.Service.User;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webassignment.DTO.CartDto;
import webassignment.Dao.CartDao;

@Service
public class CartServiceImpl implements ICartService{
	@Autowired
	private CartDao cartDao = new CartDao();

	public HashMap<Long, CartDto> AddToCard(long id, HashMap<Long, CartDto> cart) {
		return cartDao.AddToCart(id, cart);
	}

	public HashMap<Long, CartDto> EditToCard(long id, int quantity, HashMap<Long, CartDto> cart) {
		return cartDao.EditToCart(id, quantity, cart);
	}

	public HashMap<Long, CartDto> DeleteToCard(long id, HashMap<Long, CartDto> cart) {
		return cartDao.DeleteToCard(id, cart);
	}

	public int totalQuantity(HashMap<Long, CartDto> cart) {
		return cartDao.totalQuantity(cart);
	}

	public int totalPrice(HashMap<Long, CartDto> cart) {
		return cartDao.totalPrice(cart);
	}
}
