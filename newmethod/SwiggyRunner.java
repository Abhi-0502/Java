class SwiggyRunner
{
	// Method declaration
	public static void main(String[] dilveryApps)
	{
		double foodprice = Swiggy.takeOrder("pizza");
		System.out.println("The Pizza price is "+ foodprice);
		
		double foodprice = Swiggy.takeOrder("Burger");
		System.out.println("The Burger price is "+ foodprice);
		
		double foodprice = Swiggy.takeOrder("chickenrole");
		System.out.println("The chickenrole price is "+ foodprice);
		
		double foodprice = Swiggy.takeOrder("Eggrole");
		System.out.println("The Eggrole price is "+ foodprice);
		
		double foodpricewithquantity = Swiggy.takeOrder("onionDosa" , 5);
		System.out.println("The onionDosa with 5 quantity price is"+ foodprice);
		
	}
}
		