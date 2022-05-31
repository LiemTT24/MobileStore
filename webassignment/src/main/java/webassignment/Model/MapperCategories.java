package webassignment.Model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperCategories implements RowMapper<Categories> {

	public Categories mapRow(ResultSet rs, int rowNum) throws SQLException {
		Categories category = new Categories();
		category.setId(rs.getInt("id"));
		category.setName(rs.getString("name"));
		category.setDescription(rs.getString("description"));
		return category;
	}
}
