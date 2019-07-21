import java.util.*;
import java.lang.*;
import java.io.*;

class StringCompression{
  public static void main(String[] args){
    System.out.println(compressor("abc"));
  }

  public static String compressor(String s){
    String compressedString = "";
    int repCount = 0;
    for(int i = 0; i < s.length(); i++){
      repCount++;
        if(i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)){
          compressedString += "" + s.charAt(i) + repCount;
          repCount = 0;
        }
    }
      return compressedString.length() < s.length() ? compressedString : s;
  }
}
