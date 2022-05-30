import java.util.*;
class sum2
{
 int a,b,c;
 System.out.println("Enter no:s");
 Scanners s=new Scanners(System.in);
 a=s.nextInt();
 b=s.nextInt();
 
 void add()
 {
  c=a+b;
 System.out.println(c);
}
 void add(int p)
 { 
  c=p*10;
 System.out.println(c);
}
}
 
class sum1 extends sum2
{
 void add(int m, int n)
{
 c=m*n;
System.out.println(c);
}

 void add()
{
 System.out.println("a=" + "b=" +a " " +b);
}
 
public static void main(String args[])
 {
  sum2 s=new sum2();
  s.add();
  sum1 s= new sum2();
  s.add();
  s.add(10);
  s.add(20,30);
 }
}   
 