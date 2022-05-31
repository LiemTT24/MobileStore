package webassignment.Model;

public class Image {
	private int id;
	private String img;
	private String description;


	public Image() {
	}

	public Image(int id, String img, String description) {
		super();
		this.id = id;
		this.img = img;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
