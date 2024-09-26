/*TO PRINT THE PATTERN SQUARE
 ****
 ****
 ****
 ****
 */

/* 
import java.util.*;
public class patternprint {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int line;
        for( line=1; line<=4; line++){
            System.out.println("****");
        }
    }
}*/
/*PRINT PATTERN
*
**
***
****
*/

/* 
import java.util.*;
public class patternprint{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       

        for(int line=1; line<=4; line++)
        {
            for(int star =1; star<= line; star++)
            {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}*/
/* to print 
1
12
123
1234

import java.util.*;
public class patternprint{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}*/
/* To print
 A
 BC
 DEF
 GHIJ
 */
import java.util.*;
public class patternprint{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char ch ='A';
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}