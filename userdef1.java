import java.lang.Exception;
import java.lang.*;
import java.io.DataInputStream;
 class MyException extends Exception

 { 
    MyException(String message)
 {
   super(message);
 }
}
 
   class userdef1
 {
    public static void main(String a[]) 
  {
   int age;
  DataInputStream ds=new DataInputStream(System.in);
  try
  { 
    System.out.println("Enter the age(above 15 and below 25):");
   age=parseInt(ds.readLine());
  
   if(age>25)
  {
    throw new MyException("Number not in range");
  }
   System.out.println("The number is : " +age);
}

catch(M