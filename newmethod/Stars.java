class Stars{
public static void main(String[] args)
{
int num=5;

for(int i=0;i<num;i++)//i=0
{
	for(int k=i;k<num;k++){
		System.out.print("  ");
	}
   for(int j=0;j<=i;j++){//j=0,1
	 System.out.print(" *");
   }
   for(int j=0;j<i;j++){//j=0,1
	 System.out.print(" *");
   }
 System.out.println();

}

}
}