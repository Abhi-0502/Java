class Battery
{
  String name;
    int id;
    String weight;
	
	Battery(String name,int id, String weight)
	{
	 this.name=name;
	 this.id=id;
	 this.weight=weight;
	 }
	 
	 public void getDetails(String name,int id,String weight)
	 {
	 System.out.println("the name is"+ name);
	 System.out.println("the id is"+ id);
	 System.out.println("the weight is"+ weight);
	 }
	 public void charge(){
      System.out.println("the use of battery is to charge");
}
}