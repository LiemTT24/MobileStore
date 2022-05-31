package webassignment.Model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperSlides implements RowMapper<Image> {

	public Image mapRow(ResultSet rs, int rowNum) throws SQLException {
		Image img = new Image();
		img.setId(rs.getInt("id"));
		img.setImg(rs.getString("image"));
		img.setDescription(rs.getString("description"));
		return img;
	}
	
}
