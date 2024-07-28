class ZomatoRunner
{
	public static void main(String zepto[])
	{
		double foodName=Zomato.takeOrder("FarziCafe");
		System.out.println("The of FarziCafe is:"+foodName);
		foodName=Zomato.takeOrder("FarziCafe",3);
		System.out.println("The of FarziCafe is:"+foodName);
	}

}