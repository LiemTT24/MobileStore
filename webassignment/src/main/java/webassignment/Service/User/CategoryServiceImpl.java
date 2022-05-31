package webassignment.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webassignment.DTO.ProductsDto;
import webassignment.Dao.ProductsDao;
@Service
public class CategoryServiceImpl implements ICategoryService {
	@Autowired
	private ProductsDao productsDao;
	
	public List<ProductsDto> getAllProductsById(int id) {
		return productsDao.getAllProductsById(id);
	}
	
	public List<ProductsDto> getDataProductsPaginate(int id, int start, int totalPages){
		return productsDao.getDataProductsPaginate(id, start, totalPages);
	}

	
}
