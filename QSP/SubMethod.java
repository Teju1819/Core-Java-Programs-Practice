class SubMethod 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		int res=sub();
		System.out.println("From main method "+res);
		System.out.println("Main End");

	}
	public static int sub()
	{
		int a=30;
		int b=15;
		int c=a-b;
		System.out.println("From sub method "+c);
		return c;
	}

}
