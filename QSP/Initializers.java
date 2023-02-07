class Initializers
{
 static int a=45;
static
{
System.out.println("Hello from mlsi");
}
public static void main(String[] args)
{
System.out.println("Main Start");
int a=22;
int c=test(45,5);
System.out.println(Initializers.a);
System.out.println(c);
System.out.println("Main End");
}
public static int test(int a, int b)
{
int c=a+b;
System.out.println(c);
return c;

}
static int b;
static double d=23;
static
{
int d=57;
test(3,6);
System.out.println("d");
}
}