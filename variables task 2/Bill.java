class Bill{
public static void main( String [] electricalBill )
{
int billid = 101;
String billissuedate = "12/06/24";
String billDuedate = "26/06/24";
boolean isBillPaid = false ;
boolean isLatestBill = true;
System.out.println( "******************" );
System.out.println( "The bill id is : " + billid );
System.out.println( "The bill is paid on : " + billDuedate );
System.out.println( "The bill is Issued on : " + billissuedate );
System.out.println( "The bill is due date is : " + billDuedate );
System.out.println( " In this ElectricalBill your Latest Bill : " + isLatestBill );
System.out.println( "*********************");
}
}