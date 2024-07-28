class Zepto
{
		static double price;
	public static double takeOrder(String foodname)
	{
		if(foodname=="Banana Elaichi")
		{
			return 79.00;
		}
		if(foodname=="Potato")
		{
			return 53.00;
		}if(foodname=="Carrot Local")
		{
			return 50.00;
		}
		if(foodname=="Cucumber Green")
		{
			return 99.00;
		}
		if(foodname=="Tender Coconut")
		{
			return 69.00;
		}if(foodname=="Sweet Corn")
		{
			return 63.00;
		}if(foodname=="Apple Royal Gala")
		{
			return 250.00;
		}if(foodname=="Coriander Leaves")
		{
			return 17.00;
		}if(foodname=="MuttonBiriyani")
		{
			return 299.00;
		}if(foodname=="Relish Lemon Pepper Chicken Tikka")
		{
			return 139.00;
		}if(foodname=="Relish Tandoori Chicken Tikka")
		{
			return 199.00;
		}if(foodname=="RedVelvetChocolate")
		{
			return 185.00;
		}if(foodname=="Parota")
		{
			return 25.00;
		}if(foodname=="Alf Farms Chicken Chilli Salami")
		{
			return 129.00;
		}if(foodname=="VegBiriyani")
		{
			return 66.00;
		}
		else{
			System.out.println(foodname +"Not found");
		}return 0.0;
	}
		
		public static double takeOrder(String foodname,int quantity)
		{
		if(foodname == "Banana Elaichi")
		{
		price = 79.00 * quantity;
		}return price;
	
		}
}
