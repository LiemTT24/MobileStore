package webassignment.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import webassignment.DTO.ProductsDto;
import webassignment.DTO.ProductsDtoMapper;

@Repository
public class ProductsDao extends BaseDao {
	
	private final boolean YES = true;
	private final boolean NO = false;
	
	private StringBuffer sqlString() {
		StringBuffer sql = new StringBuffer();
		sql.append("select ");
		sql.append("p.id as product_id ");
		sql.append(", p.product_name ");
		sql.append(", p.product_info ");
		sql.append(", p.product_code ");
		sql.append(", p.category_id ");
		sql.append(", p.price ");
		sql.append(", p.sale ");
		sql.append(", p.highlight ");
		sql.append(", p.product_new ");
		sql.append(", c.id as id_color ");
		sql.append(", c.name as name_color ");
		sql.append(", c.code as code_color ");
		sql.append(", c.image ");
		sql.append(", p.created_at ");
		sql.append(", p.updated_at ");
		sql.append("from ");
		sql.append("products as p ");
		sql.append("inner join ");
		sql.append("colors as c ");
		sql.append("on p.id = c.product_id ");
		return sql;
	}

	public String sqlProducts(boolean newProduct, boolean highLight) {
		StringBuffer sql = sqlString();
		sql.append("where 1 = 1 ");
		if (highLight) {
			sql.append("and p.highlight = true ");
		}
		if (newProduct) {
			sql.append("and p.product_new = true ");
		}
		sql.append("group by p.id, c.product_id ");
		sql.append("order by RAND() ");
		if (newProduct) {
			sql.append("limit 8 ");
		}
		if (highLight) {
			sql.append("limit 6 ");
		}
		return sql.toString();
	}
	
	public StringBuffer sqlProductById(int id) {
		StringBuffer sql = sqlString();
		sql.append("where 1 = 1 ");
		sql.append("and category_id = " + id + " ");
		return sql;
	}
	
	public String sqlProductPaginate(int id, int start, int totalPages) {
		StringBuffer sql = sqlProductById(id);
		sql.append("limit " + start +", " + totalPages);
		return sql.toString();
	}

	public List<ProductsDto> getDataProducts() {
		String sql = sqlProducts(NO, YES);
		List<ProductsDto> listProducts = jdbc.query(sql, new ProductsDtoMapper());
		return listProducts;
	}
	
	public List<ProductsDto> getAllProductsById(int id) {
		String sql = sqlProductById(id).toString();
		List<ProductsDto> listProducts = jdbc.query(sql, new ProductsDtoMapper());
		return listProducts;
	}
	
	public List<ProductsDto> getDataProductsPaginate(int id, int start, int totalPages) {
		StringBuffer sqlGetDataById = sqlProductById(id);
		List<ProductsDto> listProductsById = jdbc.query(sqlGetDataById.toString(), new ProductsDtoMapper());
		List<ProductsDto> listProducts = new ArrayList<ProductsDto>();
		if(listProductsById.size() > 0) {
			String sql = sqlProductPaginate(id, start, totalPages);
			listProducts = jdbc.query(sql, new ProductsDtoMapper());
		}
		return listProducts;
	}
	
	public String sqlProductBy(long id) {
		StringBuffer sql = sqlString();
		sql.append("where 1 = 1 ");
		sql.append("and p.id = " + id + " ");
		sql.append("limit 1 ");
		return sql.toString();
	}

	public List<ProductsDto> getProductBy(long id) {
		String sql = sqlProductBy(id);
		List<ProductsDto> listProduct = jdbc.query(sql, new ProductsDtoMapper());
		return listProduct;
	}
	
	public ProductsDto findProductBy(long id) {
		String sql = sqlProductBy(id);
		ProductsDto product = jdbc.queryForObject(sql, new ProductsDtoMapper());
		return product;
	}
}
