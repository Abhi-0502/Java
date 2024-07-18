class SimCard
{
   String name;
  int simcardid;
  String plan;
  double issimcardprice;
int noOfCards;

      public  boolean  createSimCard(String name, int simcardid , String plan ,int noOfCards ,
				  double issimcardprice){
      		
			   boolean isSimCardCreated = false;
			   if(simcardid > 0 &&  plan != null && noOfCards >0 ){
			    this.name = name;
			    this.simcardid = simcardid;
				this.plan = plan;
				this.issimcardprice = issimcardprice;
                this.noOfCards = noOfCards;
				isSimCardCreated = true ; 
			   }
			   			
		return isSimCardCreated;			
		
	 }
	 
	 public void displaySimCardInfo(){
	 System.out.println("The name is "+ this.name);
		 System.out.println("The simcard id  is "+ this.simcardid);
		  System.out.println("The plan is "+ this.plan);
		  System.out.println("Is simcard price "+ this.issimcardprice);
          System.out.println("The noOfCards are used "+ this.noOfCards);
	 }

}