public class LogicalBitwise
{
public void display(int a,float b,double c)
{
System.out.println(a>b&&a<c);
System.out.println(a<b&a>b);
}
public static void main(String[]args)
{
LogicalBitwise lavs = new LogicalBitwise();
lavs.display(10,20.5f,30);
}
}
