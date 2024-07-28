class jobapplicationRegister
{
	static String fullNm;
	static long phoneNo;
	static String emailid;
	static String pwd;
	static String jobtype;
	public static int createAccount(String fullName, long phoneNumber, String email, String password, String typeOfJob)
	{
		fullNm=fullName;
		phoneNo=phoneNumber;
		emailid=email;
		pwd=password;
		jobtype=typeOfJob;
		/*System.out.println("The name of the person is: "+fullName);
		System.out.println("The contact details of the person is: "+phoneNumber);
		System.out.println("The email of the person is: "+email);
		System.out.println("The password of the email is: "+password);
		System.out.println("The type of the job person intrested in:"+typeOfJob);*/
		return 0;
	}
	public static void account()
	{
		System.out.println("The name of the person is: "+fullNm);
		System.out.println("The contact details of the person is: "+phoneNo);
		System.out.println("The email of the person is: "+emailid);
		System.out.println("The password of the email is: "+pwd);
		System.out.println("The type of the job person intrested in:"+jobtype);
	}
}