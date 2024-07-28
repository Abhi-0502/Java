class PanCard
{
	static String surNm;
	static String firstNm;
	static String lastNm;
	static String doB;
	static String emailId;
	static long mobileNm;
	public static int panRegister(String surName, String firstName, String lastName, String dob, String emailid, long mobileNumber)
	{
		surNm=surName;
		firstNm=firstName;
		lastNm=lastName;
		doB=dob;
		emailId=emailid;
		mobileNm=mobileNumber;
		/*System.out.println("The surname of the user is:"+surName);
		System.out.println("The firstName of the user is: "+firstName);
		System.out.println("The lastName of the user is: "+lastName);
		System.out.println("The birthday of teh user is: "+dob);
		System.out.println("The emailid of the user is: "+emailid);
		System.out.println("The mobileNumber of the user is: "+mobileNumber);*/
		return 0;
	}
	public static void register()
	{
	System.out.println("The surname of the user is:"+surNm);
	System.out.println("The firstName of the user is: "+firstNm);
	System.out.println("The lastName of the user is: "+lastNm);
	System.out.println("The birthday of teh user is: "+doB);
	System.out.println("The emailid of the user is: "+emailId);
	System.out.println("The mobileNumber of the user is: "+mobileNm);
	return ;
	}	
}