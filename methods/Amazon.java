class Amazon
{
    static String giveName1;
	static String address1;
	static int phn1;
	static String dob1;
	static String pwd1;
	
	public static boolean NewaccountCreated(String givename,String address,int phonenumber, String dob,String password)
	{
		boolean isNewaccountCreated = false;
		
		giveName1 = givename;
		address1 = address;
		phn1 = phonenumber;
		dob1 = dob;
		pwd1 = password;
		
		 return isNewaccountCreated;
	}
	public static void getNewaccountDetails(){
	System.out.println("The giveName is :"+ giveName1);
	System.out.println("The Address is :"+ address1);
	System.out.println("The phonenumber is :"+ phn1);
	System.out.println("The date of birth is :"+ dob1);
	System.out.println("The password is :"+ pwd1);
	}
	}
	