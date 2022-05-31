package webassignment.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import webassignment.Model.Categories;
import webassignment.Model.MapperCategories;
@Repository
public class CategoriesDao extends BaseDao{
	public List<Categories> getAllCategory(){
		List<Categories> list = new ArrayList<Categories>();
		String sql = "select * from categories";
		list = jdbc.query(sql, new MapperCategories()); 
		return list;
	}
}
