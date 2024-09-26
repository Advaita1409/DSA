import java.util.*;
/* 
public class Bitmanipulation {
    public static void OddorEven(int n){
        int bitMask =1;
        if(( n & bitMask) == 0) {
            //even number
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
*/
     public static int ithBit(int n, int i){
        int bitMask =1<<i;
        if(( n & bitMask) == 0) {
            return 0;
        }else{
            return 1;
        }
    }
}
    public static void main (String args[]){
       // OddorEven(3);
        //OddorEven(11);
        //OddorEven(14);
        System.out.println(ithBit(10,2));
    }
}
