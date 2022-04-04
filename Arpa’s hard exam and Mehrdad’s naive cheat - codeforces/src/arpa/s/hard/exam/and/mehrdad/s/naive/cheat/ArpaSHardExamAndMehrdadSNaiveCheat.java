package arpa.s.hard.exam.and.mehrdad.s.naive.cheat;

import java.util.Scanner;

public class ArpaSHardExamAndMehrdadSNaiveCheat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long sum = 1;
        for(int i=0 ; i<n ; i++){
            sum *= 1378; 
        }
        System.out.println(sum%10);
    }
    
}
