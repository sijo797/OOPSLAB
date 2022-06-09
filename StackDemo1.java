import java.util.*;
  
public class StackDemo1 {
    public static void main(String args [])
    {
  
        // Creating an empty Stack
        Stack<Integer> stack = new Stack<Integer>();
  
        // Use add() method to add elements in the Stack
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);
  
        // Output the Stack
        System.out.println("Stack: "+ stack);
  
        // Remove the element using remove()
        int rem_ele = stack.remove(0);
  
        // Print the removed element
        System.out.println("Removed element: "
                           + rem_ele);
  
        // Print the final Stack
        System.out.println("Final Stack: "
                           + stack);
    }
}
