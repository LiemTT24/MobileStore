package webassignment.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webassignment.DTO.ProductsDto;
import webassignment.Dao.ProductsDao;

@Service
public class ProductsServiceImpl implements IProductsService {
	@Autowired
	ProductsDao productDao = new ProductsDao();

	public ProductsDto getProductBy(long id) {
		List<ProductsDto> list = productDao.getProductBy(id);
		return list.get(0);
	}

}
