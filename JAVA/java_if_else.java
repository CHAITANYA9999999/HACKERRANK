import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if(N%2!=0){
            System.out.println("Weird");
        }else{
            if(1<N<6){
                System.out.println("Not Weird");
            }else if(6<=N<=20){
                System.out.println("Weird");
            }else{
                System.out.println("Not Weird");
            }
        }
    }
}
