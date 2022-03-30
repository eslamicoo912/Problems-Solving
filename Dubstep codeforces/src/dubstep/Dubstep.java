package dubstep;

import java.util.Scanner;

public class Dubstep {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String arr[] = s.split("WUB");
        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

}
