import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        int arr[][] = new int[x][3];
        for(int i=0; i<x ; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int[] m:arr){
            int a = m[0];
            int b = m[1];
            int n = m[2];
            for(int i=0;i<n;i++){
                double sum=a;
                for(int j=0;j<=i;j++){
                    sum += Math.pow(2,j) * b;
                }
                System.out.print((int)sum + " ");
            }
            System.out.print("\n");
        }
        
    }
}
