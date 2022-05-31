package webassignment.DTO;

import java.sql.Date;

public class ProductsDto {
	private long product_id;
	private String product_name;
	private String product_info;
	private String product_code;
	private int category_id;
	private int price;
	private int sale;
	private boolean highlight;
	private boolean product_new;
	private int id_color;
	private String name_color;
	private String code_color;
	private String image;
	private Date created_at;
	private Date updated_at;

	public ProductsDto() {
		super();
	}

	public long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(long product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_info() {
		return product_info;
	}

	public void setProduct_info(String product_info) {
		this.product_info = product_info;
	}

	public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}

	public boolean isHighlight() {
		return highlight;
	}

	public void setHighlight(boolean highlight) {
		this.highlight = highlight;
	}

	public boolean isProduct_new() {
		return product_new;
	}

	public void setProduct_new(boolean product_new) {
		this.product_new = product_new;
	}

	public int getId_color() {
		return id_color;
	}

	public void setId_color(int id_color) {
		this.id_color = id_color;
	}

	public String getName_color() {
		return name_color;
	}

	public void setName_color(String name_color) {
		this.name_color = name_color;
	}

	public String getCode_color() {
		return code_color;
	}

	public void setCode_color(String code_color) {
		this.code_color = code_color;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

}
