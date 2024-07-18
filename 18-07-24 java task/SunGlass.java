
class SunGlass
{
  String name;
  int sunglassid;
  String sunglasstype;
  double issunglassprice;

   public  boolean  createSunGlass(String name , String sunglasstype , 
				  int sunglassid , double price ){
      		
			   boolean isSunGlassCreated = false;
			   if(sunglassid > 0 && sunglasstype != null ){
			    this.name = name;
			    this.sunglassid = sunglassid;
				this.sunglasstype = sunglasstype;
				this.issunglassprice = issunglassprice;
				isSunGlassCreated = true ; 
			   }
			   		
		return isSunGlassCreated ; 
	 }
	 
	 
	 public void displaySunGlassInfo(){
		  System.out.println("The name  is "+ this.name );
		  System.out.println("The sunglass id is "+ this.sunglassid);
		  System.out.println("The type Date is "+ this.sunglasstype);
		  System.out.println("Is issunglass price "+ this.issunglassprice);
	 }
	 }