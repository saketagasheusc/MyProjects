import java.util.*;
import java.io.*;
import java.lang.*;


class LoopDetectionLL{
  public static void main(String[] args){
    LinkedList l1 = new LinkedList();

    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);

    l1.insertNode(n1);
    l1.insertNode(n2);
    l1.insertNode(n3);
    l1.insertNode(n4);
    l1.insertNode(n5);
    l1.insertNode(n3);

    System.out.println("Loop exists starting at : " + startLoop(l1).value);
  }

  public static Node startLoop(LinkedList l){
    HashSet<Node> s = new HashSet<Node>();
    Node h = l.head;
    while(h!= null){
      if(s.contains(h)){
        return h;
      }

      s.add(h);
      h = h.next;
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
