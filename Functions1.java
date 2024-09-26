//Product of 2 numbers
/* 
import java.util.*;
public class Functions1 {

    public static int multiply(int a, int b){
            int product = a*b;
            return product;
        }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int prod = multiply(3,5);
        System.out.println(prod);

    }
    
}*/

// FIND BINOMIAL COEFFICIENT: nCr = n!/ r!(n-r)!
import java.util.*;

public static int factorial(int n){
    int f=1;
    for(int i=1;i<=n;i++){
        f = f*i;
    }
    return f;
}
public class Functions1{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int binCoeff(int n , int r)
        {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int binCoeff= 
        }
    }
}
