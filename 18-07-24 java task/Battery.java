class Battery
{
  String name;
    int batteryid;
    String weight;
      
      public  boolean  createBattery(String name, int batteryid , String weight){
      		
			   boolean isBatteryCreated = false;
			   if(batteryid > 0 &&  weight != null ){
			    this.name = name;
			    this.batteryid = batteryid;
				this.weight = weight;
				isBatteryCreated = true ; 
			   }
			   				   			
		return isBatteryCreated;		   			
				
		
	 }
	 
	 public void displayBatteryInfo(){
	 System.out.println("The name is "+ this.name);
		 System.out.println("The battery id  is "+ this.batteryid);
		  System.out.println("The weight is "+ this.weight);
		 
	 }

}