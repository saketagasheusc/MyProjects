import java.util.*;
import java.io.*;
import java.lang.*;

//A program that tests where two linked lists intersect (by node, not by value).
//Runs in O(N) time where N is the length of the first linked list
//Author: Saket Agashe
//Date: 15 July 2019
class IntersectionLL{
  //Driver Function
  public static void main(String[] args){
    LinkedList l1 = new LinkedList();
    LinkedList l2 = new LinkedList();

    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);

    l1.insertNode(n1);
    l1.insertNode(n2);
    l1.insertNode(n3);

    l2.insertNode(n4);
    l2.insertNode(n5);
    l2.insertNode(n3);

    l1.printList();
    l2.printList();

    System.out.println("L1 and L2 intersect at: " + intersects(l1, l2) + " with the value " + intersects(l1, l2).value);
    System.out.println(l1.contains(n3));
  }
  //Functoin to test if one Linked List contains any node present in another Linked
  //List
  //Runs in O(N)
  public static Node intersects(LinkedList l1, LinkedList l2){
    Node newIter = l1.head;
    while(newIter != null){
      if (l2.contains(newIter)){
        return newIter;
      } else{
        newIter = newIter.next;
      }
    }
    return null;
  }
}

class LinkedList{
  public Node head;

  public void insert(int n){
    Node newNode = new Node(n);

    if(this.head == null){
      this.head = newNode;
    }
    else{
      Node nextNode = this.head;
      while(nextNode.next != null){
        nextNode = nextNode.next;
      }

      nextNode.next = newNode;
    }
  }

  public void insertNode(Node n){
    if(this.head == null){
      this.head = n;
    }
    else{
      Node nextNode = this.head;
      while(nextNode.next != null){
        nextNode = nextNode.next;
      }

      nextNode.next = n;
    }
  }

  public Node at(int index){
    Node newIter = this.head;
    int i = 0;
    while(i != index && newIter.next != null){
      newIter = newIter.next;
      i++;
    }
    return newIter;
  }

  public Boolean contains(Node n){
    Node newIter = this.head;
    while(newIter.next != null && newIter != n){
      newIter = newIter.next;
    }

    if(newIter == n){
      return true;
    } else{
      return false;
    }
  }

  public void printList(){
    Node curr = this.head;
    System.out.print("Linked List: ");
    while(curr != null){
      System.out.print(curr.value + " ");
      curr = curr.next;
    }
    System.out.println();
  }
}

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
