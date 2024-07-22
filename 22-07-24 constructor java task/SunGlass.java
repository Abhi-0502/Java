class SunGlass
{
String name;
String type;
int id;
double price;

 SunGlass(String name,String type,int id,double price)
 {
   this.name=name;
   this.type=type;
   this.id=id;
   this.price=price;
   }
   
   public void getDetails(String name,String type,int id,double price)
{
  System.out.println("the name is "+ name);
  System.out.println("the type is "+ type);
  System.out.println("the id is "+ id);
  System.out.println("the price is "+ price);
  }
  public static void styling(String[] styling){
System.out.println("styling");



}
}