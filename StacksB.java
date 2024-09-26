import java.util.*;
import java.util.Arraylist;

public class StackB{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static stack{
        static Node head = null;
        public static booleanisEmpty(){
            return head == null;
        }

        public static voud push(int data){
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
}

public static void main(String [] args){
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);

    while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
    }
}

