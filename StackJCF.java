//implementing stacks using JAVA COLLECTION FRAMEWORKS

import java.util.*;
public class StackJCF{
    public static void main(String [] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()){
            System.oyt.println(s.peek());
            s.pop();
        }
    }
}