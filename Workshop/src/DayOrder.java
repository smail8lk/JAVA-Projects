import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DayOrder {
	private Date date;
    private ConcurrentLinkedQueue<Order> orders;

    public DayOrder(Date date) {
        this.date = date;
        this.orders = new ConcurrentLinkedQueue<>();
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ConcurrentLinkedQueue<Order> getOrders() {
		return orders;
	}

	public void setOrders(ConcurrentLinkedQueue<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "DayOrder [date=" + date + ", orders=" + orders + "]";
	}
	
	public void addOrder(Order order) {
		orders.offer(order);
	}
	
	public Order getOrder() {
		return orders.poll();
	}
	
	public Order showOrder() {
        return orders.peek();
    }
	
	public void cancelOrder(Order order) {
        orders.remove(order);
    }
	
	public String detailOrders() {
        StringBuilder details = new StringBuilder("Orders for " + date + ":\n");

        for (Order order : orders) {
            details.append(order.orderDetail()).append("\n");
        }

        return details.toString();
    }
	
	public void ordersDetail() {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyy");
        String dayOrderDate = dateFormat.format(date);
		
		System.out.println("The orders of today: " + dayOrderDate);
		
		for (Order order : orders) {
			
			System.out.println("Order ID:"+ order.getId());
			
			order.detailOrder();
			return;
		}
		
		
	}
	
	public double price() {
        double totalPrice = 0.0;

        for (Order order : orders) {
            totalPrice += order.price();
        }

        return totalPrice;
    }
	
	public void show() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyy");
        String dayOrderDate = dateFormat.format(date);
        
        System.out.println("Orders for " + dayOrderDate + ":" + "\n");
        for (Order order : orders) {
            System.out.println(order.orderDetail());
        }

        double totalPrice = price();
        String formattedTotalPrice = String.format("%.2f", totalPrice);
        System.out.println("Total Price for the Day: $" + formattedTotalPrice);
    }

}
