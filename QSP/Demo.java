import java.util.Scanner;
class Demo 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		//System.out.pritnln("Enter two number");
	//	int a=s1.nextInt();
		//int b=s1.nextInt();

		Calculator c =new Calculator();
		c.toAdd();
		c.toSub();
		c.toMult();
		c.toDiv();
	}
}
