class Sum
{
 int a,b,c;

 void add()
 {
  a=16;
  b=20;
  c=a+b;
 }
} 
 
 class Sum1 extends Sum
{
 void print()
{
 System.out.println("sum="+c);
}
  public static void main(String []args)
 { 
  Sum1 s=new Sum1();
  s.add();
  s.print();
 }
}