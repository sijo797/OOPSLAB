class sum
{
 int a,b,c;

 void add()
 {
  a=16;
  b=20;
  c=a+b;
 }
} 
 
 class sum1 extends sum
{
 void print()
{
 System.out.println("sum=" +c);
}
  public static void main(String args[])
 { 
  sum1 s=new sum1();
  s.add();
  s.print();
 }
}