package valera.and.x;

import java.util.Scanner;

public class ValeraAndX {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        char matrix[][] = new char[n][n];
        for(int r=0 ; r<n ; r++){
            String s = in.next();
            for(int c=0 ; c<n ; c++){
                matrix[r][c] = s.charAt(c);
            }
        }
        
        char firstCh = matrix[0][0];
        char secondCh = matrix[0][1];
        
        boolean flag = true;
        
        for(int r=0 ; r<n ; r++){
            for(int c=0 ; c<n ; c++){
                if(r==c){           // first diagonal
                    if(matrix[r][c]!=firstCh)
                        flag = false;
                }
                else if(r==n-1-c){  // second diagonal
                    if(matrix[r][c]!=firstCh)
                        flag = false;
                }
                else{               // out of diagonals
                    if(matrix[r][c]!=secondCh || firstCh==matrix[r][c])
                        flag = false;
                }
                if(!flag)
                    break;
            }
        }
        if(flag) System.out.println("YES");
        else     System.out.println("NO");
    }    
}
