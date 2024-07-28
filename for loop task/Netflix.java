class Netflix
{
static String top10Movies[] = { "Hit Man", "Four Brothers", "Mission: Impossible - Dead Reckoning", "Mysteries of the Terracotta Warriors", "Wonder", "Home", "	Safe House", "Ultraman: Rising", "How to Rob a Bank", "Atlas" };
static String KannadaMovies[] = { "Kantara", "U Turn", "Govinda Govinda", "Ayana", "The Trader", "Mundina Nildana", "My Happy Family", "Kavacham", "Nathicharami", "Bodyguard", "Doctor", "KGF", "Charlie", "KGF Chapter 2", "Vikrant Rona", "James", "Gaalipata 2", "Old Monk", "Avatara Purusha", "Ek Love Ya" };
static String EnglishMovies[] = { "Rebel Moon", "Damsel", "Beverly Hills Cop", "The Old Guard", "The Electric State", "Society of the Snow", "Orion and the Dark", "Spaceman", "The Piano Lesson", "Havoc", "Ultraman", "Lift", "Saving Bikini Bottom", "Shirley", "Spellbound", "Back in Action", "His Three Daughters", "The Platform 2", "Good Grief", "Unfrosted" };
static String HindiMovies[] = { "Maidaan", "Rakta Charitra", "Veerappan", "Dhoomam", "Lantrani", "Gangaajal", "One Night Stand", "Saat Uchakkey", "yaara Silly Silly", "Gadera", "Raju Chacha", "Dushmani", "Jawan", "Mission Manju", "Adipurush", "Shehzada", "Major", "Naam Shabana", "Dunki", "OMG 2" };
static String KoreanSeries[] = { "Queen of Tears", "Goodbye Earth", "Frankly Speaking", "The Atypical Family", "Parasyte", "A Clean Sweep", "Military Prosecutor Doberman", "Kaiju No8: Season 1", "3 Body Problem: Season 1", "Baby Reindeer" };
public static void main( String[] netflix )
{
System.out.println( "The available top10Movies are:" + top10Movies.length );
for ( int index = 0; index < top10Movies.length-1;  index++){
System.out.println( top10Movies[index] );
}
//for each Loop
for( String top10Movies : top10Movies ){
System.out.println(top10Movies);
}
System.out.println( "The available KannadaMovies are:" + KannadaMovies.length);
for ( int index = 0; index < KannadaMovies.length-1;  index++){
System.out.println( KannadaMovies[index] );
}
//for each Loop
for( String KannadaMovies : KannadaMovies ){
System.out.println(KannadaMovies);
} 
System.out.println( "The available EnglishMovies are:" + EnglishMovies.length ); 
for ( int index = 0; index < EnglishMovies.length-1;  index++){
System.out.println( EnglishMovies[index] );
}
//for each Loop
for( String EnglishMovies : EnglishMovies ){
System.out.println(EnglishMovies);
}
System.out.println( "The available HindiMovies are:" + HindiMovies.length );
for ( int index = 0; index < HindiMovies.length-1;  index++){
System.out.println( HindiMovies[index] );
}
//for each Loop
for( String HindiMovies : HindiMovies ){
System.out.println(HindiMovies);
} 
System.out.println( "The available KoreanSeries are:" + KoreanSeries[0]+ " "+ KoreanSeries.length ); 
for ( int index = 0; index < KoreanSeries.length-1;  index++){
System.out.println( KoreanSeries[index] );
}
//for each Loop
for( String KoreanSeries : KoreanSeries ){
System.out.println(KoreanSeries);
}
}
}