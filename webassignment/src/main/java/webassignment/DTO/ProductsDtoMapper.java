package webassignment.DTO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductsDtoMapper implements RowMapper<ProductsDto> {

	public ProductsDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductsDto products = new ProductsDto();
		products.setProduct_id(rs.getLong("product_id"));
		products.setProduct_name(rs.getString("product_name"));
		products.setProduct_info(rs.getString("product_info"));
		products.setProduct_code(rs.getString("product_code"));
		products.setCategory_id(rs.getInt("category_id"));
		products.setPrice(rs.getInt("price"));
		products.setSale(rs.getInt("sale"));
		products.setHighlight(rs.getBoolean("highlight"));
		products.setProduct_new(rs.getBoolean("product_new"));
		products.setId_color(rs.getInt("id_color"));
		products.setName_color(rs.getString("name_color"));
		products.setCode_color(rs.getString("code_color"));
		products.setImage(rs.getString("image"));
		products.setCreated_at(rs.getDate("created_at"));
		products.setUpdated_at(rs.getDate("updated_at"));
		return products;
	}
}
