class Shampoo
{
  String brandName;
  int id;
   String color;
  double price;
  String mgfDate;
  String expDate;
  
  Shampoo(String brandName,int id, String color,double price,String mgfDate,String expDate)
  {
    this.brandName=brandName;
	this.id=id;
	this.color=color;
	this.price=price;
	this.mgfDate=mgfDate;
	this.expDate=expDate;
	}
	public void getDetails(){
	System.out.println("the brandName is"+brandName);
	System.out.println("the id is"+id);
	System.out.println("the color is"+color);
	System.out.println("the price is"+price);
	System.out.println("the mgfDate is"+mgfDate);
	System.out.println("the expDate is"+expDate);
	}
	
	public void washCars(){
  System.out.println("shampoo used in washCars");
  }
  }






