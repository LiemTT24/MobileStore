package webassignment.Dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import webassignment.DTO.CartDto;
import webassignment.DTO.ProductsDto;
@Repository
public class CartDao extends BaseDao {
	@Autowired
	ProductsDao dao = new ProductsDao();
	
	public HashMap<Long, CartDto> AddToCart(long id, HashMap<Long, CartDto> cart) {
		CartDto itemCard = new CartDto();
		ProductsDto product = dao.findProductBy(id);
		if(product != null && cart.containsKey(id)) {
			itemCard = cart.get(id);
			itemCard.setQuantity(itemCard.getQuantity() + 1);
			itemCard.setTotalPrice(itemCard.getQuantity() * itemCard.getProduct().getPrice());
		}else {
			itemCard.setProduct(product);
			itemCard.setQuantity(1);
			itemCard.setTotalPrice(product.getPrice());
		}
		cart.put(id, itemCard);
		return cart;
	}
	
	public HashMap<Long, CartDto> EditToCart(long id, int quantity, HashMap<Long, CartDto> cart) {
		if(cart == null) {
			return cart;
		}
		CartDto itemCard = new CartDto();
		if(cart.containsKey(id)) {
			itemCard = cart.get(id);
			itemCard.setQuantity(quantity);
			itemCard.setTotalPrice(quantity * itemCard.getProduct().getPrice());
		}
		cart.put(id, itemCard);
		return cart;
	}
	
	public HashMap<Long, CartDto> DeleteToCard(long id, HashMap<Long, CartDto> cart) {
		if(cart == null) {
			return cart;
		}
		if(cart.containsKey(id)) {
			cart.remove(id);
		}
		return cart;
	}
	
	public int totalQuantity(HashMap<Long, CartDto> cart) {
		int totalQuantity = 0;
		for(Map.Entry<Long, CartDto> itemCard : cart.entrySet()) {
			totalQuantity += itemCard.getValue().getQuantity();
		}
		return totalQuantity;
	}
	
	public int totalPrice(HashMap<Long, CartDto> cart) {
		int totalPrice= 0;
		for(Map.Entry<Long, CartDto> itemCard : cart.entrySet()) {
			totalPrice += itemCard.getValue().getTotalPrice();
		}
		return totalPrice;
	}
	
}
