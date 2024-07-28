class Meesho
{
	static String userNm;
	static String pwd;
	static long pNo;
	static String doB;
	static String emailId;
	public static boolean createaccount(String userName, String password, long phoneNumber, String dob, String emailid)
	{
		boolean isuserexist=true;
		userNm=userName;
		pwd=password;
		pNo=phoneNumber;
		doB=dob;
		emailId=emailid;
		/*System.out.println("The name of the use is: "+userName);
		System.out.println("The password of the user is: "+password);
		System.out.println("The contact details of the user is: "+phoneNumber);
		System.out.println("wish the user on: "+dob);
		System.out.println("The gmail of the user is: "+emailid);*/
		return isuserexist;
	}
	public static void getaccount()
	{
		System.out.println("The name of the useer is: "+userNm);
		System.out.println("The password of the user is: "+pwd);
		System.out.println("The contact details of the user is: "+pNo);
		System.out.println("wish the user on: "+doB);
		System.out.println("The gmail of the user is: "+emailId);
}
}
		