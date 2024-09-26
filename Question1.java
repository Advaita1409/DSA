import java.util.*;
public class Question1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a =sc.nextInt();
        if (a>=0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negative");
        }
    }

}