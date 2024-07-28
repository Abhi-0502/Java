class BlinKitRunner
{
	public static void main(String zepto[])
	{
		double foodName=BlinKit.takeOrder("Mint Leaves");
		System.out.println("The of Mint Leaves is:"+foodName);
		foodName=BlinKit.takeOrder("Mint Leaves",3);
		System.out.println("The of Mint Leaves is:"+foodName);
	}

}