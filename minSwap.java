import java.util.*;
import java.lang.*;
import java.io.*;

class minSwap{
  public static void main(String[] args){
    int n = 10010010;
    System.out.println("Minimum swaps required: " + binMinSwap(10001, 11000));
  }

  public static int binMinSwap(int a, int b){
    int diff = 0;
    if(a > b){
      diff = decToBin(binToDec(a) - binToDec(b));
    } else{
      diff = decToBin(binToDec(b) - binToDec(a));
    }
    int countOne = 0;
    int len = String.valueOf(diff).length();
    for(int i = 0; i <= len; i++){
      if(diff%10 == 1){
        countOne++;
      }
      diff /= 10;
    }
    return countOne;
  }

  public static int binToDec(int  a){
    int decResult = 0;
    int length = String.valueOf(a).length();
    for(int i = 0; i < length; i++){
      decResult += a%10 * Math.pow(2, i);
      a /= 10;
    }
    return decResult;
  }

  public static int decToBin(int a){
    int binResult = 0;
    double aDub = a;
    List<Integer> binNum = new ArrayList<Integer>();
    while(aDub != 0){
      int binDigit = (int) aDub%2;
      binNum.add(binDigit);
      aDub = Math.floor(aDub/2.0);
    }
    for(int i = 0; i < binNum.size(); i++){
      binResult += binNum.get(i) * Math.pow(10, i);
    }
    return binResult;
  }
}
