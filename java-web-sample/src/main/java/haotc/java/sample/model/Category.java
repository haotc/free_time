package haotc.java.sample.model;

public class Category extends BaseModel {
	private static final long serialVersionUID = 1L;
	private String name;
	private int parentCategoryId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getParentCategoryId() {
		return parentCategoryId;
	}

	public void setParentCategoryId(int parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
	}

}
