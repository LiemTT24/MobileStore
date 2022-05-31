package webassignment.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import webassignment.DTO.ProductsDto;
@Service
public interface ICategoryService {
	public List<ProductsDto> getAllProductsById(int id);
	public List<ProductsDto> getDataProductsPaginate(int id, int start, int totalPages);
}
