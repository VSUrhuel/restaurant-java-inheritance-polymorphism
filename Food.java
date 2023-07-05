public class Food
{
	public String name;
	public double price;

	public Food(String name, double price)
	{
		this.name = name;
		setPrice(price);
	}
	public void setPrice(double price)
	{
		this.price = (price < 0) ? 0 : price;
	}
	public double getPrice()
	{
		return this.price;
	}
	public String getName()
	{
		return this.name;
	}
	@Override
	public String toString()
	{
		return "Name: " + this.name + "\t Price: " + this.price + "\n";
	}
}