class Zomato
{
      static double price;
	public static double takeOrder(String foodname)
	{
		if(foodname=="chowman")
		{
			return 100.00;
		}
		if(foodname=="FarziCafe")
		{
			return 199.00;
		}if(foodname=="EmpireJuice")
		{
			return 100.00;
		}
		if(foodname=="chickenrole")
		{
			return 99.00;
		}
		if(foodname=="onionDosa")
		{
			return 69.00;
		}if(foodname=="PizzaHut")
		{
			return 300.00;
		}if(foodname=="BurgerKing")
		{
			return 300.00;
		}if(foodname=="McDonald's")
		{
			return 400.00;
		}if(foodname=="ShariefBhai")
		{
			return 299.00;
		}if(foodname=="IceCream")
		{
			return 49.00;
		}if(foodname=="CupCake")
		{
			return 199.00;
		}if(foodname=="RedVelvetChocolate")
		{
			return 185.00;
		}if(foodname=="Parota")
		{
			return 25.00;
		}if(foodname=="BeijingBites")
		{
			return 229.00;
		}if(foodname=="Bakingo")
		{
			return 200.00;
		}
		else{
			System.out.println(foodname +"Not found");
		}return 0.0;
	}
    public static double takeOrder(String foodname,double quantity)
		{
		if(foodname == "FarziCafe")
		{
		price = 440.00 * quantity;
		}return price;
	
		}
}
