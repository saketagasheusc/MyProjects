import java.util.*;
import java.lang.*;
import java.io.*;

class SumList{
  public static void main(String[] args){
    LinkedList<Integer> l1 = new LinkedList<Integer>();
    LinkedList<Integer> l2 = new LinkedList<Integer>();

    int a = 617;
    int b = 295;

    addBackward(l1, a);
    addBackward(l2, b);

    System.out.println("First linked list reverse: " + l1);
    System.out.println("Second linked list reverse: " + l2);

    System.out.println("Reverse Sum: " + backwardsSum(l1, l2));

    l1.clear();
    l2.clear();
    addForward(l1, a);
    addForward(l2, b);

    System.out.println("First linked list forward: " + l1);
    System.out.println("Second linked list forward: " + l2);

    System.out.println("Forward Sum: " + forwardsSum(l1, l2));

  }

  public static void addForward(LinkedList<Integer> l, int a){
    addBackward(l, a);
    Collections.reverse(l);
  }

  public static void addBackward(LinkedList<Integer> l, int a){
    while(a != 0){
      l.add(a%10);
      a /= 10;
    }
  }

  public static LinkedList<Integer> backwardsSum(LinkedList<Integer> l1,
  LinkedList<Integer> l2){
    LinkedList<Integer> result = new LinkedList<Integer>();
    int remainder = 0;
    int currDigitSum = 0;

    int index1 = 0;
    int index2 = 0;
    while(index1 < l1.size() && index2 < l2.size()){
      currDigitSum = l1.get(index1) + l2.get(index2) + remainder;
      remainder = 0;
      if(currDigitSum >= 10){
        int temp = currDigitSum;
        remainder = temp/10;
        currDigitSum = currDigitSum%10;
      }
      if(index1 + 1 <= l1.size()){
        index1++;
      }
      if(index2 + 1 <= l2.size()){
        index2++;
      }
      result.add(currDigitSum);
    }
    return result;
  }

  public static LinkedList<Integer> forwardsSum(LinkedList<Integer> l1,
  LinkedList<Integer> l2){
    LinkedList<Integer> result = new LinkedList<Integer>();
    int remainder = 0;
    int currDigitSum = 0;

    int index1 = l1.size() - 1;
    int index2 = l2.size() - 1;
    while(index1 >= 0 && index2 >= 0){
      currDigitSum = l1.get(index1) + l2.get(index2) + remainder;
      remainder = 0;
      if(currDigitSum >= 10){
        int temp = currDigitSum;
        remainder = temp/10;
        currDigitSum = currDigitSum%10;
      }
      if(index1 + 1 <= l1.size()){
        index1--;
      }
      if(index2 + 1 <= l2.size()){
        index2--;
      }
      result.addFirst(currDigitSum);
    }
    return result;
  }
}
