import java.util.*;
import java.lang.*;

//A program that tests whether or not a string is a permutation/anagram of a
//second string disregarding spaces and special characters
//Author: Saket Agashe
//Date: 15 July 2019
class PermutationString{
  private static int ALPHA_CHARS = 26;
  
  public static void main(String[] args){
    System.out.print("Enter two words to check if one is a permutation of " +
    "the other: ");
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();

    if(arrayPerm(str1, str2) && sortPerm(str1, str2)){
      System.out.println("The words " + str1 + " and " + str2 + " are " +
      "permutations of one another");
    }
    else{
      System.out.println("The words " + str1 + " and " + str2 + " are not " +
      "permutations of one another");
    }
  }

  //Function that checks to see if both strings contain exactly the same
  //characters by converting strings to character arrays and using the
  //standard library sort function
  //Runtime: O(nlogn)
  public static Boolean sortPerm(String str1, String str2){
    if(str1.equals(str2)){
      return false;
    }
    str1 = stripString(str1);
    str2 = stripString(str2);

    char[] str1Sort = str1.toCharArray();
    char[] str2Sort = str2.toCharArray();
    Arrays.sort(str1Sort);
    Arrays.sort(str2Sort);

    return Arrays.equals(str1Sort, str2Sort);
  }

  //Function that checks to see if both strings contain exactly the same
  //characters by tracking the occurence of each character in a string
  //and storing the occurence in an array
  //Runtime: O(n)
  public static Boolean arrayPerm(String str1, String str2){
    if(str1.equals(str2)){
      return false;
    }

    str1 = stripString(str1);
    str2 = stripString(str2);

    if(str1.length() != str2.length()){
      return false;
    }
    int[] alphabet = new int[ALPHA_CHARS];
    for(int i = 0; i < str1.length() ; i++){
      int alphaNum1 = str1.charAt(i) - 'a' + 1;
      int alphaNum2 = str2.charAt(i) - 'a' + 1;
      alphabet[alphaNum1] += 1;
      alphabet[alphaNum2] -= 1;
    }

    for(int i = 0; i < ALPHA_CHARS; i++){
      if(alphabet[i] != 0){
        return false;
      }
    }
    return true;
  }

  //Strips away spaces in string and converts string to lowercase
  public static String stripString(String str){
    return str.replaceAll("\\s+","").toLowerCase();
  }
}
