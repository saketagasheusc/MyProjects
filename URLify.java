import java.util.*;
import java.lang.*;

//A program that tests whether or not a string is a permutation/anagram of a
//second string disregarding spaces and special characters
//Author: Saket Agashe
//Date: 15 July 2019
class URLify{
  public static void main(String[] args){
    System.out.print("Enter a word to URLify: ");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(regexRep(str));
    System.out.println(codingRep("Mr John Smith", 13));
  }

  public static String regexRep(String str){
    return str.trim().replaceAll("\\s+","%20");
  }

  public static String codingRep(String str, int truLen){
    
  }
}
