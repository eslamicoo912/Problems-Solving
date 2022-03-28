package square.string;

import java.util.Scanner;

public class SquareString {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int t = in.nextInt();
        while(t-->0){
            String s = in.next();
            if(s.length()==1)
                System.out.println("NO");
            else{
                if(s.length()%2!=0)
                    System.out.println("NO");
                else{
                    String s1 = s.substring(0,s.length()/2);
                    String s2 = s.substring(s.length()/2 , s.length());
                    if(s1.equals(s2))
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
            }
        }
    }
    
}
