// TO CONVERT ANY NUMBER FROM BINARY TO DECIMAL

import java.util.*;
public class binToDec{

    public static void functionforbintodec(int binNum){
        int pow =0;
        int decNum = 0;
        while(binNum>0){
            int lastDigit = binNum %10;
            decNum = decNum +lastDigit * (int)Math.pow(2, pow);
            pow ++;
            binNum = binNum/10;
        }
        System.out.println("Decimal of number" +binNum+" =" +
         decNum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        functionforbintodec(101);
    }
}
