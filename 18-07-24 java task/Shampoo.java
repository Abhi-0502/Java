class Shampoo
{
  String brandName;
  String color;
  int shampooid;
  double isshampooprice;
  String shampoomgfDate;
  String shampooexpDate;
   
     public   boolean    createShampoo(String brandName, String color , int shampooid  , 
				   double isshampooprice , String shampoomgfDate ,String shampooexpDate ){
      		
			   boolean isShampooCreated = false;
			   if(shampooid > 0 &&  shampoomgfDate != null && shampooexpDate != null){
			   this.brandName = brandName;
			   this.color = color;
			    this.shampooid= shampooid;
				this.shampoomgfDate = shampoomgfDate;
				this.shampooexpDate = shampooexpDate;
				this.isshampooprice = isshampooprice;
				isShampooCreated = true ; 
			   }
			   		
		return isShampooCreated; 
	 }
	 
	 
	 public void displayShampooInfo(){
	 System.out.println("The  brandName is "+ this.brandName);
	 System.out.println("The  color is "+ this.color);
	 System.out.println("The shampoo Id is "+ this.shampooid);
		  System.out.println("The shampoo mgf Date is "+ this.shampoomgfDate);
		  System.out.println("The shampoo exp Date is "+ this.shampooexpDate);
		  System.out.println("Is shampoo price "+ this.isshampooprice);
		  
	 }
}