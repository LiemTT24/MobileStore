package webassignment.DTO;

public class CartDto {
	private int quantity;
	private int totalPrice;
	private ProductsDto product;

	public CartDto() {
		super();
	}
	

	public CartDto(int quantity, int totalPrice, ProductsDto product) {
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.product = product;
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public ProductsDto getProduct() {
		return product;
	}

	public void setProduct(ProductsDto product) {
		this.product = product;
	}

}
