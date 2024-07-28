class BlinKit
{
static double price;
	public static double takeOrder(String foodname)
	{
		if(foodname=="Amul Masti Curd")
		{
			return 35.00;
		}
		if(foodname=="Quaker Rolled Oats")
		{
			return 164.00;
		}if(foodname=="Round Gourd Tinda")
		{
			return 20.00;
		}
		if(foodname=="Litchi")
		{
			return 199.00;
		}
		if(foodname=="Pear Beauty")
		{
			return 269.00;
		}if(foodname=="Mint Leaves")
		{
			return 50.00;
		}if(foodname=="Drumstick Cut")
		{
			return 300.00;
		}if(foodname=="Fortune Rice Bran Oil")
		{
			return 400.00;
		}if(foodname=="Whole Farm Grocery Makhana")
		{
			return 134.00;
		}if(foodname=="Veggie Paradise")
		{
			return 349.00;
		}if(foodname=="Anveshan A2 Gir Ghee")
		{
			return 399.00;
		}if(foodname=="Chukde Green Cardamom Powder")
		{
			return 385.00;
		}if(foodname=="Snapin Cardamom Powder")
		{
			return 445.00;
		}if(foodname=="Whole Farm Premium Green Cardamom Whole")
		{
			return 229.00;
		}if(foodname=="Whole Farm Premium Green Cardamom Whole")
		{
			return 440.00;
		}
		else{
			System.out.println(foodname +"Not found");
		}return 0.0;
	}
  public static double takeOrder(String foodname,int quantity)
		{
		if(foodname == "Mint Leaves")
		{
		price = 440.00 * quantity;
		}return price;
	
		}
}
