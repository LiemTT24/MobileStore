package webassignment.Service.User;

import org.springframework.stereotype.Service;

import webassignment.DTO.ProductsDto;

@Service
public interface IProductsService {
	public ProductsDto getProductBy(long id);
}
