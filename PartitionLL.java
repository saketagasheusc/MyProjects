import java.util.*;
import java.lang.*;
import java.io.*;

class PartitionLL{
  public static void main(String[] args){
    LinkedList<Integer> object = new LinkedList<Integer>();
    object.add(3);
    object.add(5);
    object.add(8);
    object.add(5);
    object.add(10);
    object.add(2);
    object.add(1);
    System.out.println("Linked list: " + object);
    PartitionLL(object, 5);
    System.out.println("Paritioned Linked List: " + object);
  }

  public static void PartitionLL(LinkedList<Integer> ll, int partition){
    LinkedList<Integer> PartitionList = new LinkedList<Integer>();
    for(int i = 0; i < ll.size(); i++){
      if(ll.get(i) != partition){
        int toAdd = (Integer) ll.get(i);
        ll.remove(i);
        i--;
        PartitionList.add(toAdd);
      }
    }
    System.out.println("PartitionList: " + PartitionList);
    for(int i = 0; i < PartitionList.size(); i++){
      int toAdd = (Integer) PartitionList.get(i);
      if(toAdd > partition){
        ll.addLast((Integer) toAdd);
      } else{
        ll.addFirst((Integer) toAdd);
      }
    }
  }
}
