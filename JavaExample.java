import java.util.Scanner;
public class JavaExample
{
 public static void main(String[] args)
{
 int count;

 String temp;

 Scanner scan= new Scanner(System.in);

 System.out.print("Enter th number of Strings you would like to enter:");

 count=scan.nextInt();

 String str[]=new String[count];

 Scanner scan2=new Scanner(System.in);

    System.out.println("Enter the strings one by one:");
 
  for(int i=0;i<count;i++)
  {
   str[i]=scan2.nextLine();
  }

   scan.close();
   scan2.close();

  for (int i = 0; i < count; i++) 
  {
  
   for(int j=i+1;j<count;j++)
   {
   if(str[i].compareTo(str[j])>0)
   {
   
   temp=str[i];
   str[i]=str[j];
   str[j]=temp;
  }
 }
}

  System.out.print("Strings in Sorted Order:");
 
  for(int i=0;i<=count;i++)
  {
   System.out.print(str[i] + ",");
  }
 }
}

  





  
 
 
 
 

