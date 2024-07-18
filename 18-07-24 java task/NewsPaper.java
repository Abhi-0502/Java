class NewsPaper
{
    String companyName;
	String newspaperid;
	int noOfPages;
	String language;
	double isNewsPaperprice;
	
	
   public   boolean    createNewsPaper(String companyName , int noOfPages , String newspaperid ,
				  String language , double isNewsPaperprice ){
      		
			   boolean isNewsPaperCreated = false;
			   if(newspaperid != null && language != null && noOfPages > 0){
			   this.companyName = companyName;
			    this.newspaperid = newspaperid;
				this.isNewsPaperprice = isNewsPaperprice;
				this.noOfPages = noOfPages;
				this.language = language;
				isNewsPaperCreated = true ; 
			   }
			   
					return isNewsPaperCreated; 
	 }
	 
	 
	 public void displayNewsPaperInfo(){
	 System.out.println("The companyName id is "+ this.companyName);
		 System.out.println("The news paper id is "+ this.newspaperid);
		  System.out.println("The News Paper price Date is "+ this.isNewsPaperprice);
		  System.out.println("The noOfPages is "+ this.noOfPages);
		  System.out.println("Is language "+ this.language);
		  
	 }
	 }