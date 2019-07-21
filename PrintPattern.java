import java.util.*;
import java.lang.*;

//A program that prints out a pattern given a numerical input
//Author: Saket Agashe
//Date: 15 July 2019
class PrintPattern{
  public static void main(String[] args){
    printPatternIter(5);
  }

  public static void printPatternIter(int n){
    int iterN = n;
    for(int i = n; i > 0; i--){
      while(iterN > 0){
        for(int j = 0; j < i; j++){
          System.out.print(iterN);
        }
        iterN--;
      }
      System.out.println();
      iterN = n;
    }
  }
}
