import java.util.*;
import java.lang.*;
import java.io.*;

//Java Program to find the largest subarray (by sum) having only k unique numbers
//Author: Saket Agashe
//Date: 3 August 2019
class LargestSubarraySum{

  //Driver Function
  public static void main(String[] args){
    int arr[] = {-4, -2 ,1, -3};
    int k = 2;

    LSSum(arr, k);

    int arr2[] = {1, 1, 1, 1, 1, 1};
    k = 2;
    LSSum(arr2, k);
  }

  //Function that keeps track of current largest subarray indeces and sum
  public static void LSSum(int[] arr, int k){
    int maxSum = -1000000;
    int start = 0;
    int end = 0;

    for(int i = 0; i < arr.length; i++){
      int[] sumHelp = LSSumHelper(arr, k, i);

      if(maxSum < sumHelp[0]){
        maxSum = sumHelp[0];
        start = sumHelp[1];
        end = sumHelp[2];
      }
    }

    //Outputs subarray and sum
    System.out.println("Output : " + maxSum);
    System.out.print("The sub array is {");
    for(int i = start; i < end; i++){
      if(i != end - 1){
        System.out.print(arr[i] + ", ");
      } else{
        System.out.println(arr[i] + "}");
      }
    }
  }

  //Helper function that finds k-number subarrays and their sums
  //Returns the sum and indeces of the subarray in an array
  public static int[] LSSumHelper(int[] arr, int k, int start){
    HashSet<Integer> numSet = new HashSet<Integer>();
    int sum = 0;
    int i = 0;
    int[] toReturn = new int[3];

    for(i = start; i < arr.length; i++){
      if(numSet.size() < k){
        sum += arr[i];
        numSet.add(arr[i]);
      } else{
        toReturn[0] = sum;
        toReturn[1] = start;
        toReturn[2] = i;
        return toReturn;
      }
    }
    toReturn[0] = sum;
    toReturn[1] = start;
    toReturn[2] = i;
    return toReturn;
  }
}
