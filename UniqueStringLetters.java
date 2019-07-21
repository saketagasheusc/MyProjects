import java.util.*;
import java.lang.*;

//A program that tests whether or not a string contains all unique letters
//not including strings.
//Author: Saket Agashe
//Date: 15 July 2019

class UniqueStringLetters{
  public static void main(String[] args){
    System.out.print("Enter a word to check if the characters are all unique: ");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    //Strips whitespace in string
    str = str.replaceAll("\\s+","").toLowerCase();
    if(bruteCheck(str) && arrayCheck(str) && sortCheck(str)){
      System.out.println("The word " + str + " has all unique characters.");
    }
    else {
      System.out.println("The word " + str + " does not have all unique characters.");
    }
  }

  //Brute force function that checks each character against every other character
  //ahead of it.
  //Runtime: O(n^2)
  public static Boolean bruteCheck(String str){
    if(!lengthCheck(str)){
      return false;
    }
    for(int i = 0; i < str.length(); i++){
      for(int j = i + 1; j < str.length(); j++){
        if(str.charAt(i) == str.charAt(j)){
          return false;
        }
      }
    }
    return true;
  }

  //Uses the standard library sort function on string after converting to
  //a character array. Then, each character is compared only to its right
  //neighbor.
  //Runtime: O(nlogn)
  public static Boolean sortCheck(String str){
    if(!lengthCheck(str)){
      return false;
    }
    char[] strSort = str.toCharArray();
    Arrays.sort(strSort);
    for(int i = 0; i < str.length() - 1; i++){
      if(strSort[i] == strSort[i + 1]){
        return false;
      }
    }
    return true;
  }

  //Stores each instance of a character in an array to track each instance of a
  //character in the array. Once the array has value > 0 at any index, no more
  //characters should have that value.
  //Runtime: O(n)
  public static Boolean arrayCheck(String str){
    if(!lengthCheck(str)){
      return false;
    }
    int[] alphabet = new int[26];
    for(int i = 0; i < str.length(); i++){
      int alphaNum = str.charAt(i) - 'a' + 1;
      if(alphabet[alphaNum] > 0){
        return false;
      }
      else{
        alphabet[alphaNum] += 1;
      }
    }
    return true;
  }

  //Checks length of the string, if string length > 26 must have at least one
  //repeating character
  //Runtime: O(1)
  public static Boolean lengthCheck(String str){
    if(str.length() > 26){
      return false;
    }
    return true;
  }
}
