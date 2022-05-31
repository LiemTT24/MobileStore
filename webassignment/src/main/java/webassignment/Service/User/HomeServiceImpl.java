package webassignment.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webassignment.DTO.ProductsDto;
import webassignment.Dao.CategoriesDao;
import webassignment.Dao.MenuDao;
import webassignment.Dao.ProductsDao;
import webassignment.Dao.ImgDao;
import webassignment.Model.Categories;
import webassignment.Model.Menu;
import webassignment.Model.Image;

@Service
public class HomeServiceImpl implements IHomeService {
	@Autowired
	private ImgDao imgDao;
	@Autowired
	private CategoriesDao categoryDao;
	@Autowired
	private MenuDao menuDao;
	@Autowired
	private ProductsDao productDao;
	
	public List<Image> getAllImg() {
		return imgDao.getAllImg();
	}
	public List<Categories> getDataCategory() {
		return categoryDao.getAllCategory();
	}
	
	public List<Menu> getDataMenu() {
		return menuDao.getMenu();
	}
	public List<ProductsDto> getDataProducts() {
		List<ProductsDto> listProducts = productDao.getDataProducts();
		return listProducts;
	}

}
