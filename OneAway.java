import java.util.*;
import java.lang.*;
import java.io.*;

class OneAway{
  public static void main(String[] args){
    System.out.println(oneEdit("apple","aple"));
  }

  public static boolean oneEdit(String s1, String s2){
    if(s1.length() == s2.length()){
      return oneReplace(s1, s2);
    } else if (Math.abs(s1.length() - s2.length()) == 1){
      if(s1.length() > s2.length()){
        return oneInsert(s1, s2);
      } else{
        return oneInsert(s2, s1);
      }
    } else{
      return false;
    }
  }

  public static boolean oneInsert(String s1, String s2){
    int index1 = 0;
    int index2 = 0;
    while(index2 < s2.length() && index1 < s1.length()){
      if(s1.charAt(index1) != s2.charAt(index2)){
        if(index1 != index2){
          return false;
        }
        index2++;
      } else{
        index1++;
        index2++;
      }
    }
    return true;
  }

  public static boolean oneReplace(String s1, String s2){
    int diff = 0;
    for(int i = 0; i < s1.length(); i++){
      if(s1.charAt(i) != s2.charAt(i)){
        diff++;
        if(diff > 1){
          return false;
        }
      }
    }
    return true;
  }
}
