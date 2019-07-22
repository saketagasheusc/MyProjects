import java.util.*;
import java.io.*;
import java.lang.*;

class LinkedList{
  class Node{
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

  public Node head;

  public static void insert(int n){
    Node newNode = new Node(n);

    if(this.head == null){
      this.head == newNode;
    }
    else{
      Node nextNode = this.head;
      while(nextNode.next != null){
        nextNode = nextNode.next;
      }

      nextNode.next = new_node;
    }
  }

  public static void printList(){
    Node curr = this.head;
    System.out.print("Linked List: ");
    while(curr != null){
      System.out.print(currNode.value + " ");
      currNode = currNode.next;
    }
    System.out.println();
  }
}
