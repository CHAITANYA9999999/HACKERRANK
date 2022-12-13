/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        Stack st = new Stack();
        for(int i=0; i<A.length(); i++){
            String sub = A.substring(i,i+1);
            st.push(sub);
        }
        
        String str = "";
        for(int i=0; i<A.length(); i++){
            str+=st.pop();
        }
        
        if(str.equals(A)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
