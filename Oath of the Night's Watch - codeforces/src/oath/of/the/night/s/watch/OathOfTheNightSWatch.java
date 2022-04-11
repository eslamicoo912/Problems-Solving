package oath.of.the.night.s.watch;

import java.util.Arrays;
import java.util.Scanner;

public class OathOfTheNightSWatch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++)
            arr[i] = in.nextInt();
        
        Arrays.sort(arr);
        
        if(n<3)
            System.out.println(0);
        else{
            int count = 0;
            for(int i=1 ; i<n-1 ; i++){
                if(arr[i]>arr[0] && arr[i]<arr[arr.length-1])
                    count++;
            }
            System.out.println(count);
        }        
    }
    
}
