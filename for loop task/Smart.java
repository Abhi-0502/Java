class Smart
{
static String chocolates[] = {"kit kat", "dairy milk", "Snickers", "Milky bar" };
public static void main( String[] newcollection )
{
	
System.out.println( "The available chocolates are :"+ chocolates.length );
for ( int index = 0; index < chocolates.length-1;  index++){
System.out.println( chocolates[index] );
}
//for each Loop
for( String chocolates : chocolates ){
System.out.println(chocolates);
}
}
}


class Smart
{
static String chocolates[] = {"kit kat", "dairy milk", "Snickers", "Milky bar" };
public static void main( String[] newcollection )
{
	System.out.println( "The available chocolates are :" );
//for each Loop
for( String chocolates : chocolates ){
System.out.println(chocolates);
}
}
}