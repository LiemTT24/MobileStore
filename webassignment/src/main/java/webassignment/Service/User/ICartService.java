package webassignment.Service.User;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import webassignment.DTO.CartDto;

@Service
public interface ICartService {
	public HashMap<Long, CartDto> AddToCard(long id, HashMap<Long, CartDto> cart);
	public HashMap<Long, CartDto> EditToCard(long id, int quantity, HashMap<Long, CartDto> cart);
	public HashMap<Long, CartDto> DeleteToCard(long id, HashMap<Long, CartDto> cart);
	public int totalQuantity(HashMap<Long, CartDto> cart);
	public int totalPrice(HashMap<Long, CartDto> cart);
}
