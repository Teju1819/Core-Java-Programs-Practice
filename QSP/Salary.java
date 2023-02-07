import java.util.Scanner;
class  Salary
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first salary");
		double fsal=sc.nextDouble();
		System.out.println("Enter second salary");
		double ssal=sc.nextDouble();
		System.out.println("Enter third salary");
		double tsal=sc.nextDouble();
		double largest, smallest;
        
		largest = tsal> (fsal> ssal ? fsal: ssal) ? tsal : ((fsal> ssal) ? fsal : ssal);  
			System.out.println("Highest Salary is:"+largest);

			smallest=tsal<(fsal<ssal?fsal:ssal)?tsal:((fsal<ssal)?fsal:ssal);
				System.out.println("Lowest salary is:"+smallest);

				Double difference=largest-smallest;
				System.out.println("Difference between highest salaryand lowest salary:"+difference);

		
	}
		}



