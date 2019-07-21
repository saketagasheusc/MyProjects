import java.util.*;
import java.lang.*;
import java.io.*;

class PalindromeLL{
  public static void main(String[] args){
    LinkedList<Integer> l1 = new LinkedList<Integer>();
    l1.add(1);
    l1.add(2);
    l1.add(5);
    l1.add(2);
    l1.add(1);

    LinkedList<Integer> l2 = new LinkedList<Integer>();
    l2.add(1);
    l2.add(2);
    l2.add(2);
    l2.add(1);

    System.out.println("Linked list l1 is a palindrome: " + isPal(l1));
    System.out.println("Linked list l2 is a palindrome: " + isPal(l2));
  }

  public static Boolean isPal(LinkedList<Integer> l){
    int frontIndex = 0;
    int backIndex = l.size() - 1;

    while(frontIndex <= backIndex){
      if(!(l.get(frontIndex) == l.get(backIndex))){
        return false;
      }
      frontIndex++;
      backIndex--;
    }
    return true;
  }
}
