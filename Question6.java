//push at bottom of the stack 
/* 
import java.util.*;
public class Qu1{
public static void pushAtBottom(Stack<Integer> s, int data){
    if(s.isEmpty()){
        s.push(data);
        return;
    }
    int top = s.pop();
    pushAtBottom(s, data);
    s.push(top);
}

    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s, 4);
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
*/

/* 
//reverse a string using stack 
import java.util.*;
public class Qu2{
    public static String reverseString(String str){
        Stack<Integer> s = new Stack<>();
        int idx= 0;
        while(idx< str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    public static void main(String [] args){
        String str="abc";
        String result = reverseString(str);
        System.out.println(result);
    }
}
*/
/* 
//reverse a stack
import java.util.*;
public class Q3{
    //push at bottom function
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    //to reverse stack function
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }
    //to print stack function
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main (String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        printStack(s);
    }
}
*/

/* 
//stock span problem
import java.util.*;
public class Span{
    public static void  stockSpan(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=0;i<stocks.length;i++){
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice> stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String args[]){
        int stocks[] ={100,80,60,70,60,85,100};
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);

        for(int i=0;i<span.length;i++){
            System.out.println(span[i]+"");
        }
    }
}

/* 
//Next greater element
import java.util.*;
public class Question5{
    public static void main(String[] args){
        int arr[] = {6,8,0,1,3};
        Stack <Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0;i--){
            //1. while loop
            while(!s.isEmpty() && arr[s.peek()] <=arr[i]){
                s.pop();
            }
            //2.if empty else
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            }else{
                nxtGreater[i] = arr[s.peek()];
            }
            //3. push in s
            s.push(i);
        }

        for(int i=0; i<nxtGreater.length;i++){
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();
    }
}
*/
/*
1. next greater than right: above code
2. next greater than right : normal loop from o to arr.length-1
3. next smaller than right : arr[s.peek()] >= arr[i])
4. next small than left: both [ loop normal and "]
 */

/* 
 //Valid paranthesis
import java.util.*;
public class Question6{
    public static boolean isValid(String str){
        Stack<Character> s= new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            //opening
            if(ch == '('|| ch =='{'|| ch=='['){
                s.push(ch);
            }else{
                //closing
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek() =='(' && ch ==')')||
                (s.peek() =='{' && ch =='}')||
                (s.peek() =='[' && ch ==']')){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String [] args){
        String str ="({[]}())"; //true
        System.out.println(isValid(str));
    }
}
*/  

import java.util.*;

public class Question7{
    public static void maxArea(int arr){
        int maxArea =0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //next smaller right
        Stack<Integer> s = new Stack<>();
        int nsr[] = new int[arr.length];

        for(int i=arr.length-1; i>=0;i--){
            //1. while loop
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            //2.if empty else
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = arr[s.peek()];
            }
            //3. push in s
            s.push(i);
        }
    }
    public static void main(String args[]){
        int arr[] = { 2,1,5,6,2,3};// heights on histogram
    }
}