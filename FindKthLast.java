import java.util.*;
import java.lang.*;
import java.io.*;

//A program that returns the Kth last index in Java's STL
//linked list implementation
//A program that returns the Kth last index in my ListThatsLinked linked list
//implementation
//Runs in O(N)
//Runs in O(N)
//Author: Saket Agashe
//Date: 15 July 2019
class FindKthLast{
  public static void main(String[] args){
    LinkedList<String> stringList = new LinkedList<String>();
    int k = 2;
    stringList.add("A");
    stringList.add("B");
    stringList.add("B");
    stringList.add("C");
    stringList.add("C");
    stringList.add("A");
    stringList.add("A");
    System.out.println("Linked list: " + stringList);
    System.out.println(k + "th to last element: " + ReturnK(stringList, k));

    ListThatsLinked ll = new ListThatsLinked();
    ll.insert(1);
    ll.insert(2);
    ll.insert(3);
    ll.insert(4);
    ll.insert(5);
    ll.insert(6);
    ll.insert(7);

    System.out.print("List that's linked: ");
    ll.printList();
    System.out.println(k+ "th to last element: " + ReturnKLL(ll, k));

  }

  //Returns k to last element in Java's implementation of linked list
  public static String ReturnK(LinkedList l, int k){
    return (String) l.get(l.size() - k);
  }

  //Returns k to last element in my implementation of ListThatsLinked
  public static int ReturnKLL(ListThatsLinked l, int k){
    ListThatsLinked.Node n = l.head;
    for(int i = 0; i < l.size - k; i++){
      n = n.next;
    }
    return n.value;
  }
}
