public class Main
{
	public static void main(String[] args) {
		Customer rhuel = new Customer("Rhuel", 50000);
		Food [] foods = new Food[4];

		foods[0] = new MainCourse("Beef Steak", 300.56);
		foods[1] = new MainCourse("Pancit", 250);
		foods[2] = new Dessert("Ice Cream", 130);
		foods[3] = new Appetizer("Salad", 400);

		Menu m = new Menu();
		for(Food f : foods)
		{
			if(f instanceof MainCourse)
				m.add((MainCourse)f);
			if(f instanceof Dessert)
				m.add((Dessert)f);
			if(f instanceof Appetizer)
				m.add((Appetizer)f); 
		}
		System.out.println(m);

		Order o = new Order(m);
		for(int i=0; i<(foods.length); i++)
		{
			if(foods[i] instanceof MainCourse)
				o.addOrder((MainCourse)foods[i]);
			if(foods[i] instanceof Dessert)
				o.addOrder((Dessert)foods[i]);
			if(foods[i] instanceof Appetizer)
				o.addOrder((Appetizer)foods[i]); 
		}
		System.out.println(o);
		PaymentReceipt p = new PaymentReceipt(o, rhuel);
		System.out.println(p);

	}
}