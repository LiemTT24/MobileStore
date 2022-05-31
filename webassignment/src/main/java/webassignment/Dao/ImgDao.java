package webassignment.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import webassignment.Model.MapperSlides;
import webassignment.Model.Image;

@Repository
public class ImgDao extends BaseDao{
	public List<Image> getAllImg(){
		List<Image> list = new ArrayList<Image>();
		String sql = "select * from img";
		list = jdbc.query(sql, new MapperSlides()); 
		return list;
	}
}
