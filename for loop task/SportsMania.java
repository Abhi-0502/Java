class SportsMania
{
static String ipiTeamNames[] = { "RCB", "CSK", "GT", "KKR", "DELHI CAPITALS", "MI", "PUNJAB KINGS", "RR", "SRH" }; 
static String top10BatsMen[] = { "Sachin Tendulkar", "Brian Lara", "Ricky Ponting", "Sir Isaac Vivian Alexander Richards", "Virat Kohli", " Kumar Chokshanada Sangakkara", "Sir Donald George Bradman", " Walter Reginald Hammond", "Sir John Berry Hobbs", "Sunil Gavaskar" };
static String top10Bowlers[] = { "Yuzvendra Chahal", "Dwayne Bravo", "Piyush Chawla", " Amit Mishra", "Ravi Ashwin", "Lasith Malinga", " Bhuvneshwar Kumar", "Sunil Narine", "Ravindra Jadeja", "Harbhajan Singh" };
static String top10IccTeamNames[] = { "INDIA", "AUSTRALIA", "S.AFRICA", "NEW ZEALAND", "SRI LANKA", "ENGLAND", "PAKISTAN", "WEST INDIES", "BANGLADESH", "ZIMBAWBE", "AFGHANISTAN" };
public static void main( String[] SportsMania )
{
System.out.println( "The available ipiTeamNames are:" + ipiTeamNames.length );
for ( int index = 0; index < ipiTeamNames.length-1;  index++){
System.out.println( ipiTeamNames[index] );
}
//for each Loop
for( String ipiTeamNames : ipiTeamNames ){
System.out.println(ipiTeamNames);
}
System.out.println( "The available top10BatsMen are:" + top10BatsMen.length );
for ( int index = 0; index < top10BatsMen.length-1;  index++){
System.out.println( top10BatsMen[index] );
}
//for each Loop
for( String top10BatsMen : top10BatsMen ){
System.out.println(top10BatsMen);
}
System.out.println( "The available top10Bowlers are:" + top10Bowlers.length );
for ( int index = 0; index < top10Bowlers.length-1;  index++){
System.out.println( top10Bowlers[index] );
}
//for each Loop
for( String top10Bowlers : top10Bowlers ){
System.out.println(top10Bowlers);
}
System.out.println( "The available top10IccTeamNames are:" + top10IccTeamNames.length );
for ( int index = 0; index < top10IccTeamNames.length-1;  index++){
System.out.println( top10IccTeamNames[index] );
}
//for each Loop
for( String top10IccTeamNames : top10IccTeamNames ){
System.out.println(top10IccTeamNames);
}
}
}


