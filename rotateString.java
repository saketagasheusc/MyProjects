import java.lang.*;
import java.util.*;
import java.io.*;


class rotateJava{
  public static void main(String[] args){

  }

  public static void rotateMatrix(int N, int mat[][]){
        for (int x = 0; x < N / 2; x++)
        {
            for (int y = x; y < N-x-1; y++)
            {
                int temp = mat[x][y];
                mat[x][y] = mat[y][N-1-x];
                mat[y][N-1-x] = mat[N-1-x][N-1-y];
                mat[N-1-x][N-1-y] = mat[N-1-y][x];
                mat[N-1-y][x] = temp;
            }
        }
    }

    public static void displayMatrix(int N, int mat[][]) { 
       for (int i = 0; i < N; i++)
       {
           for (int j = 0; j < N; j++)
               System.out.print(" " + mat[i][j]);

           System.out.print("\n");
       }
       System.out.print("\n");
   }


}
