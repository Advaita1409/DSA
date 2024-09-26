/*TO PRINT A HOLLOW RECTANGLE
 *****
 *   *
 *   *
 *   *
 *****
 */


import java.util.*;
public class Patterns {
    public static void hollow_rect(int totalRows, int totCols){
        for(int i=1;i<totalRows;i++){
            for(int j=11;j<=totCols;j++){
                if(i==1|| i==totalRows|| j==1||j== totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        hollow_rect(4,5);
    }
}
