class BankAccountRunner
{
public static void main( String[] bank )
{
    BankAccount.debit(1000.0);
	BankAccount.credit(2000.0);
	double totalamount = BankAccount.getbalance();
	System.out.println("Balance is :"+ totalamount );
}
}