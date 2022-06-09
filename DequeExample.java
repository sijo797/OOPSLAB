import java.util.*;

 public class DequeExample
{
  public static void main(String args[])
  {
    Deque <String>deque=new LinkedList<String>();

    deque.add("Element 1(Tail)");
    
    deque.addFirst("Element 2(head)");
    
    deque.addLast("Element 3(Tail)");

    deque.push("element 4(Head(");
   
    deque.offer("Element 5(Tail)");

    deque.offerFirst("Element 6 (Head)");
   
    System.out.println(deque+"\n");
    
    deque.removeFirst();

    deque.removeLast();    

      System.out.println("Deque after removing" + "First and Last:" + deque);

}
}



    