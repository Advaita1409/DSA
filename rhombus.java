// to print a solid rhombus
import java.util.*;
public class rhombus {
    public static void solid(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        solid(5);
    }
}
