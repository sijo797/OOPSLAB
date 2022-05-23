import java.util.*;
public class GFG
{
static void checkSymmetric(int mat[][], int row, int col)
{
 int i,j,flag=1;
System.out.println("the matrix formed is:");

for(i=0;i<row;i++)
{
  for(j=0;j<col;j++)
  {
   System.out.print(mat[i][j] + "\t");
  }
  System.out.println("");
}
  
  int[][] transpose=new int[row][col];

   for(i=0;i<row;i++)
   {
    for(j=0;j<col;j++)
    {
     transpose[j][i]=mat[i][j];
    }
   } 

    //condition over Matrix 1 with Matrix 2

   if(row==col)
   {
    for(i=0;i<row;i++)
    {
     for(j=0;j<col;j++)
     {
       
     if(mat[i][j]!=transpose[i][j])
      {
        flag=0;
        break;

      }
    }
   
   if(flag==0)
   {
    System.out.println("\n The Matrix is not Symmetric");
    break;
   }
  }
    
    if(flag==1)
    { 
      System.out.println("The matrix is symmetric");
    }
 } 
  else
      {
        System.out.println("\n the Matrix is not Symmetric");
      }
  }

  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
     int i,j,row,col,flag=1;
      System.out.println("Enter the number of rows:");
     row=sc.nextInt();
     System.out.println("Enter the number of columns");
     col=sc.nextInt();

     int[][] mat=new int[row][col];
     System.out.println("Enter the matrix Elements:");
     for(i=0;i<row;i++)
     {
      for(j=0;j<col;j++)
      {
        mat[i][j]=sc.nextInt();
      }
    }  
 
    checkSymmetric(mat,row,col);
}
}



 
 
    
 
      
 









    
   
  