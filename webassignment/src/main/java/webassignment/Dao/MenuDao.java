package webassignment.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import webassignment.Model.MapperMenu;
import webassignment.Model.Menu;
@Repository
public class MenuDao extends BaseDao {
	public List<Menu> getMenu(){
		List<Menu> list = new ArrayList<Menu>();
		String sql = "Select * from menu";
		list = jdbc.query(sql, new MapperMenu());
		return list;
	}
}
