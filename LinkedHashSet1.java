import java.util.*;

 class LinkedHashSet1
{ 
  public static void main(String args[])
 {
  LinkedHashSet<String>set = new LinkedHashSet();

  set.add("One");
  set.add("Two");
  set.add("Threee");
  set.add("Four");
  set.add("Five");
  
  Iterator<String>i=set.iterator();
  
 while(i.hasNext())
 {
   System.out.println(i.next());
 }
}
}  
   