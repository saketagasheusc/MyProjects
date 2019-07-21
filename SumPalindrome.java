import java.util.*;
import java.lang.*;
import java.io.*;

class SumPalindrome{
  public static void main(String[] args){
    System.out.println(iterPal(9999999999993));
  }

  public static Boolean iterPal(int n){
    int sumDigits = 0;
    int count = 0;
    while(n > 0){
      sumDigits += n%10;
      n /= 10;
      count++;
    }
    if(count == 1){
      return true;
    }

    List<Integer> digits = new ArrayList<>();
    while(sumDigits > 0){
      digits.add(sumDigits%10);
      sumDigits /= 10;
    }

    for(int i = 0; i < digits.size()/2; i++){
      if(digits.get(i) != digits.get(digits.size() - i - 1)){
        return false;
      }
    }
    return true;
  }
}
