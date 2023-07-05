import java.util.*;
public class Menu
{
	private ArrayList<Appetizer> appetizers;
	private ArrayList<Dessert> desserts;
	private ArrayList<MainCourse> maincourse;

	public Menu()
	{
		this.appetizers = new ArrayList<>();
		this.desserts = new ArrayList<>();
		this.maincourse = new ArrayList<>();
	}
	public void add(Appetizer a)
	{
		this.appetizers.add(a);
	}
	public void remove(Appetizer a)
	{
		this.appetizers.remove(a);
	}
	public ArrayList<Appetizer> getAppetizers()
	{
		return this.appetizers;
	}
	public void add(Dessert a)
	{
		this.desserts.add(a);
	}
	public void remove(Dessert a)
	{
		this.desserts.remove(a);
	}
	public ArrayList<Dessert> getDesserts()
	{
		return this.desserts;
	}
	public void add(MainCourse a)
	{
		this.maincourse.add(a);
	}
	public void remove(MainCourse a)
	{
		this.maincourse.remove(a);
	}
	public ArrayList<MainCourse> getMainCourse()
	{
		return this.maincourse;
	}
	@Override
	public String toString()
	{
		String s = "";
		s += "Available Main Course: \n";
		for(MainCourse m : maincourse)
			s += m.toString();
		s += "Available Desserts: \n";
		for(Dessert d : desserts)
			s += d.toString();
		s += "Available Appetizers: \n";
		for(Appetizer a : appetizers)
			s += a.toString();
		return s;
	}
}