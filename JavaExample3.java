 import java.util.*;
 
 public class JavaExample3
 
 { 
   public static void main(String args[])
   {
    ArrayList<String>obj=new ArrayList<String>();
    
    obj.add("Ajeet");
    obj.add("Harry");
    obj.add("Chaitanya");
    obj.add("Steve");
    obj.add("Anuj");
    
    System.out.println("Original Array List");
    for(String str:obj)
    System.out.println(str);

    obj.add(0,"Rahul");
    obj.add(1,"justin");
   
    System.out.println("Array List After add operation");
    for(String str:obj)
      System.out.println(str);

    obj.remove("Chaithanya");
    obj.remove("Harry");
    System.out.println("Array list after remove operation:");
    
    obj.remove(1);

    System.out.println("Final Array List:");
    for(String str:obj)
     System.out.println(str);
}
}
    
    











    
     