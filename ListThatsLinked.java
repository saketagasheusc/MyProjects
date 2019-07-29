import java.util.*;
import java.io.*;
import java.lang.*;

//My own implementation of a linked list
//Stores int values
//Insertion is O(N)
//Deletion is O(N);
//Access is O(N);
//Author: Saket Agashe
//Date: 25 July 2019
class ListThatsLinked{
  //Node Class for elements of list
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

  //Constructor
  public ListThatsLinked(){
    this.head = null;
    this.size = 0;
  }

  //function to insert new values
  //takes O(N) time
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

  //Function to print out the ListThatsLinked
  //Takes O(N) time
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
