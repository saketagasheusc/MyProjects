import java.util.*;
import java.lang.*;
import java.io.*;

class RemoveDuplicatesLL{
  public static void main(String[] args){
    LinkedList<String> object = new LinkedList<String>();
    object.add("A");
    object.add("B");
    object.add("B");
    object.add("C");
    object.add("C");
    object.add("A");
    object.add("A");
    System.out.println("Linked list: " + object);
    removeDuplicatesMap(object);
    System.out.println("Linked list after  removal: " + object);
  }

@SuppressWarnings("unchecked")
  public static void removeDuplicatesSort(LinkedList l){
    Collections.sort((List<String>) l);
    for(int i = 0; i < l.size() - 1; i++){
      if(l.get(i) == l.get(i + 1)){
        l.remove(i+1);
        i--;
      }
    }
  }

@SuppressWarnings("unchecked")
  public static void removeDuplicatesMap(LinkedList l){
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    for(int i = 0; i < l.size(); i++){
      if(map.containsKey(l.get(i))){
        l.remove(i);
        i--;
      } else{
        map.put((String)l.get(i), 1);
      }
    }
  }
}
