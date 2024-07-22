class Spotity
{
   int userId;
   String userName;
   String email;
   String gender;
   String dob;
   String countryName;
   
    // parameterized constructor
public  Spotity(int userId,String userName,String email,String gender, String dob,String countryName)
  {
   this.userId=userId;
   this.userName=userName;
   this.email=email;
   this.gender=gender;
   this.dob=dob;
   this.countryName=countryName;
   }
    public void getUserProfile(){
	 System.out.println("the userId is"+ userId);
	 System.out.println("the userName is"+ userName);
	 System.out.println("the email is"+ email);
	 System.out.println("the gender is"+ gender);
	 System.out.println("the dob is"+ dob);
	 System.out.println("the countryName is"+ countryName);
	}
}
  