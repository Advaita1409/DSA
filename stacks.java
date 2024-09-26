import java.util.*;
import java.util.Arraylist;
public class stacks{
    static class stack{
   
        static Arraylist <Integer> list = new ArrayList<>();
    public static boolean isEmpty(){
        return list.size()==0;
    }
    public static void push(int data){
        list.add(data);
    }
    public static void pop{
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    public static void peek(){
        return list.get(list.size()-1);
    }

    public static void main(String[] args){
        Stack s = new stacks();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
}