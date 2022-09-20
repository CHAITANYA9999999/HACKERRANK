import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                int len = s1.length();
                String s=s1;
                for(int j=0;j<15-len;j++){
                        s=s+" ";
                    }
                if(x/100>=1){
                    
                    System.out.print(s+x);
                }else if(x/10>=1){
                    
                    System.out.print(s+"0"+x);
                }else{
                    System.out.print(s+"00"+x);
                }
                System.out.print("\n");
                
            }
            System.out.println("================================");

    }
}



