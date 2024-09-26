import java.util.*;

public class Javabasics1{
    public static void main(String argd[]){
        Scanner sc = new scanner(System.in)
        System.out.print("Enter three numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int avg = (num1+num2+num3)/3;
        System.out.println(avg);
    }
}