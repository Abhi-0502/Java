class Swiggy
{
	public static double takeOrder(String[] foodname)
	{
	   double price = 0.0;
		if(foodname == "pizza")
		{
		  price = 159.00;
			return price;
		}
		if(foodname == "Burger")
		{
		  price = 199.00;
			return price;
		}
		if(foodname == "Eggrole")
		{
		    price = 59.00;
			return price;
		}
		if(foodname == "chickenrole")
		{
		  price = 99.00;
			return price;
		}
		if(foodname == "onionDosa")
		{
		   price = 69.00;
			return price;
		}
		else
			System.out.println(foodname +"Not found");
		return price;
		public static double takeOrder(String[] foodname int quantity){
		double price = 0.0;
		if(foodname == "pizza"){
		price = 159.00 * quantity;
		return price;
	}
	if(foodname == "Burger"){
		price = 199.00 * quantity;
		return price;
	}
	if(foodname == "Eggrole"){
		price = 59.00 * quantity;
		return price;
	}
	if(foodname == "chickenrole"){
		price = 99.00 * quantity;
		return price;
	}
	if(foodname == "onionDosa"){
		price = 69.00 * quantity;
		return price;
	}
}
	}
}