class Bank
{
	static String Account;
	static String Opration;
	static boolean cheque;
	static boolean ATM;
	static String nm;
	public static int createAccount(String typeOfAccount, String modeOfOpration, boolean chequeRequired, boolean ATMRequired, String name)
	{
		Account=typeOfAccount;
		Opration=modeOfOpration;
		cheque=chequeRequired;
		ATM=ATMRequired;
		nm=name;
		/*System.out.println("The typeOfAccount is: "+typeOfAccount);
		System.out.println("The modeOfOpration is: "+modeOfOpration);
		System.out.println("Is user need a cheque book:"+ chequeRequired);
		System.out.println("Is user need ATM: "+ATMRequired);
		System.out.println("The name of the account holder is: "+name);*/
		return 0;
	}
	public static void newAccount()
	{
		System.out.println("The typeOfAccount is: "+Account);
		System.out.println("The modeOfOpration is: "+Opration);
		System.out.println("Is user need a cheque book:"+ cheque);
		System.out.println("Is user need ATM: "+ATM);
		System.out.println("The name of the account holder is: "+nm);
	}
}