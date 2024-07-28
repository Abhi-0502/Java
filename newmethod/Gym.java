import java.util.Arrays;

class Gym
{
	static String GymQuipment[]={null, null, null, null, null, null};
	static double Gymprices[]={0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
	static int Gymindex;
	static int priceindex;
	public static boolean createGymQuipment(String gymQuipment)
	{
		boolean isGymQuipmentcreated=false;
		if(GymQuipment != null)
		{
			GymQuipment[Gymindex] =gymQuipment;
			Gymindex++;
			isGymQuipmentcreated=true;
		}
			else System.out.println("Only Provide a added gymQuipment");
			return isGymQuipmentcreated;
			
	}
	
	
	public static boolean createprice(double gymQuipment)
	{
		boolean isGymQuipmentpricecreated=false;
		if(Gymprice > 0.0)
		{
			
			Gymprices[priceindex] =Gymprice;
			priceindex++;
			isGymQuipmentpricecreated=true;
		}
			else System.out.println("Only Provide a valid price");
			return isGymQuipmentpricecreated;
	}
	public static void getGym()
	{
		System.out.println("--------------------------------------------------------------");
		for(String GymQuipment : gymQuipments)
		{
			System.out.println("The available Gym Quipment are: "+gymQuipment);
		}
	}
	public static void getGymprice()
	{
		System.out.println("----------------------------------------------------------------");
		for(double Gymprice : Gymprices)
		{
			System.out.println("The available Gym Quipment are: "+Gymprice);
		}
	}
	public static boolean update gymQuipment(String oldGymQuipment, String newgymQuipment)
	{
		boolean isGymQuipmentUpdated=false;
		for(int index=0; index < GymQuipment.length ; index++)
		{
			if(oldGymQuipment == gymQuipments[index])
			{
				gymQuipments[index] = newgymQuipment;
isGymQuipmentUpdated=true;
			}
		}
		if(isGymQuipmentUpdated == false)
		{
			System.out.println(oldGymQuipment + "Not added");
		}return isGymQuipmentUpdated;
	}
	public static boolean deleteGymQuipment(String GymQuipmentDeleted)
	{
		System.out.println("Deleting GymQuipment started");
		boolean isGymQuipmentDeleted = false;
		int newIndex,oldIndex;
		for(newIndex=0,oldIndex=0;oldIndex<GymQuipment.length;oldIndex++){
		if(GymQuipment[oldIndex]!= GymQuipmentDeleted)
		{ 
		 GymQuipment[newIndex]=GymQuipment[oldIndex];
		  newIndex++;
		 }
		}
		 GymQuipment=Arrays.copyOf(GymQuipment,newIndex);
		  if(GymQuipmentDeleted!= null){
			isGymQuipmentDeleted = true;
		  }
		  if(isGymQuipmentDeleted = false){
		  System.out.println(GymQuipmentDeleted + "not found");
		  }
		  System.out.println("deleteGymQuipment ended");
		 return isGymQuipmentDeleted;
		 }
		
}
   
