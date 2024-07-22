class NewsPaper
{
    String companyName;
	int noOfPages;
	String language;
	double price;
	
	
	NewsPaper(String companyName,int noOfPages,String language,double price)
	{
	this.companyName=companyName;
	this.noOfPages=noOfPages;
	this.language=language;
	this.price=price;
	}
	
	public void getDetails(){
	System.out.println("the companyName is"+ companyName);
	System.out.println("the noOfPages is"+ noOfPages);
	System.out.println("the language is"+ language);
	System.out.println("the price is"+ price);
	}
		
  public void currentAffairs(){
  System.out.println("To know about currentAffairs ");
  }
  }















