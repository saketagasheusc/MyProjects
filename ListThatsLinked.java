import java.util.*;
import java.io.*;
import java.lang.*;

class ListThatsLinked{
  public static class Node{
    int value;
    Node next;

    Node(int value, Node next){
      this.value = value;
      this.next = next;
    }
    Node(int value){
      this.value = value;
      this.next = null;
    }
  }

  public static Node head;
  public static int size;

  public ListThatsLinked(){
    this.head = null;
    this.size = 0;
  }

  public static void insert(int n){
    Node newNode = new Node(n);
    if(head == null){
      head = newNode;
    }
    else{
      Node nextNode = head;
      while(nextNode.next != null){
        nextNode = nextNode.next;
      }

      nextNode.next = newNode;
    }
    size++;
  }

  public static void printList(){
    Node curr = head;
    int numNodes = 1;
    System.out.print("Linked List: ");
    while(curr != null){
      System.out.print(curr.value);
      if(numNodes < size){
        System.out.print(" -> ");
      }
      curr = curr.next;
      numNodes++;
    }
    System.out.println();
  }
}
