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
      this.next = NULL;
    }
  }
}
