class Agarbathi
{
	String brandName;
	int id;
	String fragrance;
	double price;
	
	Agarbathi(String brandName,int id,String fragrance,double price)
	{
	 this.brandName=brandName;
	 this.id=id;
	 this.fragrance=fragrance;
	 this.price=price;
	 }
	 
	 public void getDetails(String brandName,int id,String fragrance,double price)
	 {
	  System.out.println("the brandName is"+this.brandName);
	  System.out.println("the id is"+ this.id);
	  System.out.println("the fragrance is"+ this.fragrance);
	  System.out.println("the price is"+ this.price);
	  }
	
	public void purpose()
	{
		System.out.println("--------------------------------------------------------");
		System.out.println("Used to pray the god");
	}
}