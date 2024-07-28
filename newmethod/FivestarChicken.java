class FivestarChicken
{
     static double price;
	public static double takeOrder(String foodname)
	{
		if(foodname=="Thai Crispy")
		{
			return 159.00;
		}
		if(foodname=="Chilli Burst")
		{
			return 299.00;
		}if(foodname=="Crunchy Masala")
		{
			return 359.00;
		}
		if(foodname=="Hot Crispy Burger")
		{
			return 99.00;
		}
		if(foodname=="Tandoori Burger")
		{
			return 169.00;
		}if(foodname=="Chicken Cheese Burger")
		{
			return 200.00;
		}if(foodname=="Star Burger")
		{
			return 89.00;
		}if(foodname=="Hungry Bird Burger")
		{
			return 99.00;
		}if(foodname=="Tandoori Roll")
		{
			return 299.00;
		}if(foodname=="Sheek Roll")
		{
			return 49.00;
		}if(foodname=="Chicken Roll")
		{
			return 199.00;
		}if(foodname=="Crunchy Masala")
		{
			return 185.00;
		}if(foodname=="Chilli Burst")
		{
			return 25.00;
		}if(foodname=="Thai Crispy")
		{
			return 129.00;
		}if(foodname=="Chicken Nuggets")
		{
			return 66.00;
		}
		else{
			System.out.println(foodname +"Not found");
		}return 0.0;
	}
       public static double takeOrder(String foodname,int quantity)
		{
		if(foodname == "Chilli Burst")
		{
		price = 66.00 * quantity;
		}return price;
	
		}
}

