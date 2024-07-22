class SunGlassRunner
{
public static void main(String[] sunGlass){

//ClassName ref= new className();

SunGlass styling=new SunGlass("Reebock","wearing",1,250.00);

System.out.println("--------------------------------------");

System.out.println(styling.name+styling.type+styling.id+styling.price);

System.out.println("---------------------------------------------");

SunGlass styling1=new SunGlass("RayBan","wearing",2,1500.00);

System.out.println("---------------------------------------------");
System.out.println(styling1.name+styling1.type+styling1.id+styling1.price);

System.out.println("---------------------------------------------");

SunGlass styling2=new SunGlass("marc Jacobas","marc Jacobas",3,1200.00);

System.out.println("-------------------------------------------------");
System.out.println(styling2.name+styling2.type+styling2.id+styling2.price);
System.out.println("---------------------------------------------");


SunGlass styling3=new SunGlass("Gucci","wearing",4,1600.00);

System.out.println("-----------------------------------------------");
System.out.println(styling3.name+styling3.type+styling3.id+styling3.price);
System.out.println("---------------------------------------------");


SunGlass styling4=new SunGlass("Voyage","wearing",5,500.00);

System.out.println("-----------------------------------------------");
System.out.println(styling4.name+styling4.type+styling4.id+styling4.price);
System.out.println("---------------------------------------------");


SunGlass styling5=new SunGlass("Sheomy","wearing",6,2500.00);
styling5.name="Sheomy";
styling5.type="wearing";
styling5.id=6;
styling5.price=2500.00;
System.out.println("-------------------------------------------------");
System.out.println(styling5.name+styling5.type+styling5.id+styling5.price);
System.out.println("---------------------------------------------");

}
}
