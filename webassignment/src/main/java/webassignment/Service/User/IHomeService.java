package webassignment.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webassignment.DTO.ProductsDto;
import webassignment.Model.Categories;
import webassignment.Model.Menu;
import webassignment.Model.Image;

@Service
public interface IHomeService {
	@Autowired
	public List<Image> getAllImg();
	public List<Categories> getDataCategory();
	public List<Menu> getDataMenu();
	public List<ProductsDto> getDataProducts();
}
