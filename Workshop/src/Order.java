import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.LinkedList;

public class Order {
	private int id;
	private Date date;
	private List<Component> components;
	
	public Order (int id, Date date) {
		this.id= id;
		this.date= date;
		this.components= new LinkedList<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Component> getComponents() {
		return components;
	}

	public void setComponents(List<Component> components) {
		this.components = components;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", components=" + components + "]";
	}
	
	public void addComponent(Component component) {
        components.add(component);
    }

    public void addComponent(Component component, int qty) {
        for (int i = 0; i < qty; i++) {
            components.add(component);
        }
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }
	
	public String orderDetail() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        String orderDate = dateFormat.format(date);
        StringBuilder details = new StringBuilder("Order ID: " + id + "\n");
        details.append("Order Date: " + orderDate + "\n");
        details.append("Components:\n");       

        for (Component component : components) {
            details.append(" - ").append(component.getDescription()).append(" ($").append(component.getPrice()).append(")\n");
        }

        return details.toString();
    }
	
	public void detailOrder() {
		
		System.out.println("The details of the order");
		System.out.println("Order ID:" + id);
		System.out.println("Order Date:" + date );
		System.out.println("Order Components:" + components);
		
		for (Component component : components) {
            System.out.println(" - " + component.getDescription() + " " + component.getPrice() + " $");
        }
	}
	
	public double price() {
        double totalPrice = 0.0;

        for (Component component : components) {
            totalPrice += component.getPrice();
        }

        return totalPrice;
    }
	
	public void show() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyy");
        String orderDate = dateFormat.format(date);

        System.out.println("Order ID: " + id);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Components:");

        for (Component component : components) {
            System.out.println(" - " + component.getDescription() + " ($" + component.getPrice() + ")");
        }

        double totalPrice = price();
        System.out.println("Total Price: $" + totalPrice);
    }

}
