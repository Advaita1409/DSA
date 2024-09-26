// to check and print if number is pallindrome or not
import java.util.*;
public class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();

        if(isPalindrome(palindrome)){
            System.out.println("Number is:" +palindrome +"is a palindrome");    
        }
        else{
            System.out.println("Number is:" +palindrome +"is a palindrome");
        }
    }
public static boolean isPalindrome(int number){
    int palindrome = number;
    int reverse =0;

    while(palindrome !=0){
        int remainder = palindrome % 10;
        reverse = reverse * 10 + remainder;
        palindrome = palindrome / 10;
    }
    if (number == reverse){
        return true;
    }
    return false;
}
}

