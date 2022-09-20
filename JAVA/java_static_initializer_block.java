import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag=false;
        int H = sc.nextInt();
        int B = sc.nextInt();
        if(H>0 && B>0){
            flag=true;
        }
        if(flag){
            System.out.println(H*B);
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
