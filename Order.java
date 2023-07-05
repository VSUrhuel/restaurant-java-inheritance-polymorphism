import java.util.*;
public class Order{
	private Menu menu;
	private ArrayList<Appetizer> ordersForAppetizer;
	private ArrayList<Dessert> ordersForDesserts;
	private ArrayList<MainCourse> ordersForMainCourse;

	public Order(Menu menu){
		this.ordersForDesserts = new ArrayList<>();
		this.ordersForAppetizer = new ArrayList<>();
		this.ordersForMainCourse = new ArrayList<>();
	}
	public void addOrder(Dessert a){
		ordersForDesserts.add(a);
	}
	public void addOrder(Appetizer a){
		ordersForAppetizer.add(a);
	}
	public void addOrder(MainCourse a){
		ordersForMainCourse.add(a);
	}
	public void removeOrder(Dessert a){
		ordersForDesserts.remove(a);
	}
	public void removeOrder(Appetizer a){
		ordersForAppetizer.remove(a);
	}
	public void removeOrder(MainCourse a){
		ordersForMainCourse.remove(a);
	}
	public ArrayList<Appetizer> ordersForAppetizer(){
		return ordersForAppetizer;
	}
	public ArrayList<Dessert> ordersForDesserts(){
		return ordersForDesserts;
	}
	public ArrayList<MainCourse> ordersForMainCourse(){
		return ordersForMainCourse;
	}
	@Override 
	public String toString()
	{
		String s = "";
		s += "Orders for Main Course: \n";
		for(MainCourse m : ordersForMainCourse)
			s += m.toString();
		s += "Available Desserts: \n";
		for(Dessert d : ordersForDesserts)
			s += d.toString();
		s += "Available Appetizers: \n";
		for(Appetizer a : ordersForAppetizer)
			s += a.toString();
		return s;
	}
	
}