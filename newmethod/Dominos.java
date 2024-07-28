class Dominos
{
        static double price;
	public static double takeOrder(String foodname)
	{
		if(foodname=="Fiery Jalapeno & Paprika")
		{
			return 259.00;
		}
		if(foodname=="Achari Do Pyaza")
		{
			return 299.00;
		}if(foodname=="Blazing Onion & Paprika")
		{
			return 200.00;
		}
		if(foodname=="Double Cheese Margherita")
		{
			return 289.00;
		}
		if(foodname=="Cheese n Corn")
		{
			return 269.00;
		}if(foodname=="PizzaHut")
		{
			return 300.00;
		}if(foodname=="BurgerKing")
		{
			return 300.00;
		}if(foodname=="Fresh Veggie")
		{
			return 400.00;
		}if(foodname=="Mexican Green Wave")
		{
			return 399.00;
		}if(foodname=="Veggie Paradise")
		{
			return 349.00;
		}if(foodname=="Peppy Paneer")
		{
			return 399.00;
		}if(foodname=="Farmhouse")
		{
			return 385.00;
		}if(foodname=="Chicken Golden Delight")
		{
			return 445.00;
		}if(foodname=="BeijingBites")
		{
			return 229.00;
		}if(foodname=="Chicken Fiesta")
		{
			return 440.00;
		}
		else{
			System.out.println(foodname +"Not found");
		}return 0.0;
	}

       public static double takeOrder(String foodname,int quantity)
		{
		if(foodname == "Chicken Fiesta")
		{
		price = 440.00 * quantity;
		}return price;
	
		}
}
