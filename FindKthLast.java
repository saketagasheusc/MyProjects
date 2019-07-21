import java.util.*;
import java.lang.*;
import java.io.*;

class FindKthLast{
  public static void main(String[] args){
    LinkedList<String> object = new LinkedList<String>();
    int k = 2;
    object.add("A");
    object.add("B");
    object.add("B");
    object.add("C");
    object.add("C");
    object.add("A");
    object.add("A");
    System.out.println("Linked list: " + object);
    System.out.println(k + "th to last element: " + ReturnK(object, k));

  }

  public static String ReturnK(LinkedList l, int k){
    return (String) l.get(l.size() - k);
  }
}
