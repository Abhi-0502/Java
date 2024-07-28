class GymRunner
{
	public static void main(String [] gym)
	{
		boolean name=Gym.createGymQuipment("weight");
		System.out.println(name);
		boolean price=Gym.createprice(20.0);
		System.out.println(price);
		
		name=Gym.createGymQuipment("tradmill");
		System.out.println(name);
		price=Gym.createprice(40.0);
		System.out.println(price);

		name=Gym.createGymQuipment("Cycling");
		System.out.println(name);
		price=Gym.createprice(25.0);
		System.out.println(price);

		name=Gym.createGymQuipment("power rack");
		System.out.println(name);
		price=Gym.createprice(80.0);
		System.out.println(price);

		name=Gym.createGymQuipment("weight plate");
		System.out.println(name);
		price=Gym.createprice(40.0);
		System.out.println(price);
		
		name=Gym.createGymQuipment("bench press");
		System.out.println(name);
		price=Gym.createprice(40.0);
		System.out.println(price);
		
		Gym.getGym();
		Gym.getGymprice();
		
		boolean updateGymQuipment=Gym.updateGymQuipment("cycling", "bench press");
		Gym.getGym();
		
	     Gym.deleteGymQuipment("tradmill");
		 Gym.getGym();
		 
		

	}
}