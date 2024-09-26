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

//reverse a stack
import java.util.*;
public class Qu3{
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

        printStack(s);
        reverseStack(s);
        printStack(s);
    }
}