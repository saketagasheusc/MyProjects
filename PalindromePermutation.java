import java.lang.*;
import java.util.*;

class PalindromePermutation{
  public static int NUM_LETTERS = 26;

  public static void main(String[] args){
    System.out.println(possiblePal("A nut for a jar of tuna"));
    System.out.println(possiblePal("A nut for a jar of tun"));
    System.out.println(possiblePal("Amore Roma"));
    System.out.println(possiblePal("This should return false"));
  }

  public static Boolean possiblePal(String str){
    str = str.replaceAll("\\s", "");
    int[] alphabet = new int[NUM_LETTERS];
    for(int i = 0; i < str.length(); i++){
      int index = Character.toLowerCase(str.charAt(i)) - 'a' + 1;
      alphabet[index]++;
    }
    int oddCount = 0;
    for(int i = 0; i < NUM_LETTERS; i++){
      if(alphabet[i]%2 != 0){
        oddCount++;
        if(oddCount > 1){
          return false;
        }
      }
    }
    if(str.length()%2 == 0){
      if(oddCount != 0){
        return false;
      }
    }
    else{
      if(oddCount != 1){
        return false;
      }
    }
    return true;
  }
}
