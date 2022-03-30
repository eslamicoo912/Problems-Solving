package brain.s.photos;

import java.util.Scanner;

public class BrainSPhotos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt() , m = in.nextInt();
        boolean flag = true;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                String x = in.next();
                if(x.equals("C") || x.equals("M") || x.equals("Y"))
                    flag = false;
            }
        }
        
        if(!flag)
            System.out.println("#Color");
        else
            System.out.println("#Black&White");
        
    }
    
}
