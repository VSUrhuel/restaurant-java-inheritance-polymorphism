import java.util.*;
public class PaymentReceipt
{
	private Order orders;
	private double totalPayment;
	private Customer c;

	public PaymentReceipt(Order orders, Customer c)
	{
		this.totalPayment = 0;
		this.orders = orders;
		this.c = c;
	}
	public double totalPaymentAppetizer()
	{
		double total = 0;
		for(Appetizer appetizer : orders.ordersForAppetizer())
		{
			total += appetizer.getPrice();
		}
		return total;
	}
	public double totalPaymentDesserts()
	{
		double total = 0;
		for(Dessert desserts : orders.ordersForDesserts())
		{
			total += desserts.getPrice();
		}
		return total;
	}
	public double totalPaymentMainCourse()
	{
		double total = 0;
		for(MainCourse mainCourse : orders.ordersForMainCourse())
		{
			total += mainCourse.getPrice();
		}
		return total;
	}
	public double totalPayable()
	{
		return this.totalPaymentDesserts() + this.totalPaymentMainCourse() + this.totalPaymentAppetizer();
	}
	@Override
	public String toString()
	{
		String s = "";
		s += "Name: " + c.getName() + "\t Money: " + c.getMoney() + "\n";
		s += "List of Ordered Food\n";
		s += orders.toString();
		s += "Total Payment: " + this.totalPayable() + "\n";
		s += "Remaninig Money: " + (c.getMoney() - this.totalPayable()) + "\n";
		return s;
	}
}