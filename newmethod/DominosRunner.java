class DominosRunner
{
	public static void main(String zepto[])
	{
		double foodName=Dominos.takeOrder("Chicken Fiesta");
		System.out.println("The of Chicken Fiesta is:"+foodName);
		foodName=Dominos.takeOrder("Chilli Burst",3);
		System.out.println("The of Chicken Fiesta is:"+foodName);
	}

}