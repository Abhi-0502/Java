class FivestarchickenRunner
{
	public static void main(String zepto[])
	{
		double foodName=FivestarChicken.takeOrder("Chilli Burst");
		System.out.println("The of Chilli Burst is:"+foodName);
		foodName=FivestarChicken.takeOrder("Chilli Burst",3);
		System.out.println("The of Chilli Burst is:"+foodName);
	}

}