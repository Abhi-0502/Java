class Instagram
{
   static String UserNm;
   static String emailid;
   static int Phn;
	static String pwd;
	 static String dob1;

public static bollean InstagramNewRegister(String UserName,String emailId,int Phonenumber,String password,String dob)
{
    System.out.println("instagram registration started....");
	
    bollean isInstagramNewRegister = false;
	{
	 
	 
	  bollean isInstagramDataCreated = false;
	  bollean isUserName = false;
	  bollean isemailId = false;
	  bollean isPhonenumber = false;
	  bollean ispassword = false;
	  bollean isdob = false;
	  }
        
     if(UserName != null){
	 UserNm = UserName;
	 isUserNameValid = true;
	 } else {
	   System.out.println("please provide valid UserName....");
	   }
	   if(emailid ! = emailId){
	    emailid = emailId;
		isemailIdValid  = true;
		} else {
		System.out.println("please provide valid emailId.....");
		}
	           if(Phn ! = Phonenumber){
			   Phn = Phonenumber;
			   isPhonenumberValid = true;
		} else {
		  System.out.println("please provide valid Phonenumber....");
		  }
		    if(pwd != null){
			 pwd = password;
			 ispassword = true;
			 } else {
			  System.out.println("please provide valid password....");
			  }
			    if(dob1 != true){
				 dob1 = dob;
				 isdobValid = true;
				 } else {
				  System.out.println("please provide valid dob....");
				  }
	 
	 System.out.println("please provide a valid UserName/emailId/Phonenumber/password/dob");{
	   }
	   System.out.println("Account Creation ended.....");{
	   isInstagramDataCreated;
	   }
	    public static void getInstagramDetails(){
		 System.out.println("The userName is :"+ UserName);
		 System.out.println("The emailId is :"+ emailId);
		 System.out.println("The phonenumber is :"+ Phonenumber);
		 System.out.println("The password is :"+ password);
		 System.out.println("The dob is :"+ dob);
		 }
}