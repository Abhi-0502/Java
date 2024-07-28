class ZeptoRunner
{
	public static void main(String zepto[])
	{
		double foodName=Zepto.takeOrder("Banana Elaichi");
		System.out.println("The of Banana Elaichi is:"+foodName);
		foodName=Zepto.takeOrder("Banana Elaichi",3);
		System.out.println("The of Banana Elaichi is:"+foodName);
	}

}