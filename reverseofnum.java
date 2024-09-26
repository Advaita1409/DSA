import java.util.*;
public class reverseofnum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 10899;
        while(n>0){
            int lastDigit = n%10;
            System.out.println(lastDigit);
            n = n/10;
        }
        System.out.println();
    }
}

// TO PRINT THE REVERSE OF GIVEN NUMBER
// 1. last digit of num = num%10
// 2. remove last digit num/10

// REVERSE THE GIVEN NUMBER
// REV = (REV*10) + Lastdigit
/* 
rev =0
rev = (0*0) +9 =0
rev = (9*10) +9 = 99
rev = (99 * 10) +8 = 998
rev = (998 *10 ) +0= 9980
rev = (9980 *10) + 1= 99801
*/
/* 
code:
int rev =0;
while(n>0){
    lastDigitrev = rev *10 + lastDigit;
    n update;
}print(rev)
*/