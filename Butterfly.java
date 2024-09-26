// TO PRINT BUTTERFLY PATTERN

import java.util.*;
public class Butterfly {
    public static void butterfly(int n){
        //1st half
        for(int  i=0;i<=n;i++){
            // to print stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // to print spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // to print stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
        }
        System.out.println();
    }

    //2nd half
    for(int i= n;i>=1;i--){
        // to print stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // to print spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // to print stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
    }
    }

    public static void main(String args[]){
        butterfly(9);
    }
}
