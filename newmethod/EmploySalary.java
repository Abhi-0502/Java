class EmploySalary
{
	static int salary = 25000;
    public static double employSalary(int age)
{
   System.out.println("The  salary is started");
 if(age>19 && age<=25){
	return salary;
}else if(age>25 && age<=45){
	return salary+3500;
}else if(age>55){
	return salary+6000;
}
return 0;
	
}
}
