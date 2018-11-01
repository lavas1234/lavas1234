public class ArithmeticExample
{
public void display()
{
int x=10;
System.out.println(x++);
System.out.println(++x);
}
public static void display(String[]args)
{
ArithmeticExample sum = new ArithmeticExample();
sum .display();
}
}
