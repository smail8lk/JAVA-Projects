import java.util.Date;

public class Test {
	public static void main(String[] args) {
		
		Component component1 = new Component(1, "Starter", 5.5, MealType.Starter);
		Component component2 = new Component(2, "Maindish", 8, MealType.MainDish);
		Component component3 = new Component(3, "Drink", 2.99, MealType.Drink);
		Component component4 = new Component(4, "Dessert", 4, MealType.Dessert);
		
		Order order1= new Order(1, new Date());
		Order order2= new Order(2, new Date());

		
		order1.addComponent(component2, 2);
		order1.addComponent(component1, 2);
		order2.addComponent(component1, 3);
		order2.addComponent(component3, 4);
		order2.addComponent(component2, 2);
		order2.addComponent(component4, 3);
		
		
		DayOrder dayOrder1= new DayOrder(new Date());
		
		dayOrder1.addOrder(order1);
		dayOrder1.addOrder(order2);
		dayOrder1.price();
		dayOrder1.ordersDetail();
		
	}

}
