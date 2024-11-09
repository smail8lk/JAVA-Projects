public class Component {
	private int id;
	private String description;
	private double price;
	private MealType type;
	
	public Component(int id, String description, double price, MealType type) {
		this.id= id;
		this.description= description;
		this.price= price;
		this.type= type;
	}
	
	public int getId () {
		return id;
	}
	
	public void setId (int id) {
		this.id= id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description= description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public MealType getType() {
		return type;
	}

	public void setType(MealType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Component [id=" + id + ", description=" + description + ", price=" + price + ", type=" + type + "]";
	}

	
}