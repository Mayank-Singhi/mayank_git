import java.io.*;
class a
{
public void method1()
{
System.out.println("1");
}
public int method1(int a)
{
System.out.println("2");
return a;
}
}
class b extends a
{
public String method1(String str)
{
System.out.println("3");
return str;
}
}
public class ab
{
public static void main(String args[])
{
a A=new b();
int a=(int)A.method1(8);
}
}
