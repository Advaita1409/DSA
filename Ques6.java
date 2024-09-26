//implementation of queue using arrays
/* 
import java.util.*;

public class QueueB{
    static class queue{
        static int arr[];
        static int size;
        static int rear;

        queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }
        public static void add(int data){
            if( rear == size -1){
                System.out.println("Queue is full");
                return;
            }

            rear = rear +1;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
        }
        return arr[0];
    }

    public static void main(String args[]){
        Queue q =new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
*/
/* 
// implementation of circular queue using arrays
import java.util.*;

public class Qq2{
    static class queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front == -1){
                front =0;
            }

            rear = rear +1;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }

            int result = arr[front];
            front = (front +1)%size;
            if(rear == front){
                rear = front = -1;
            }else{
                front =(front+1)%size;
            }
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
        }
        return arr[front];
    }

    public static void main(String[] args){
        Queue q =new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.print(q.remove());
        q.add(4);
        System.out.print(q.remove());
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
*/

/* 
//implementing queue using linkedlist
import java.util.*;

public class Qq3{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;
        public static boolean isEmpty(){
            return head ==null && tail == null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail= newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            if(tail == head){
                tail = head = null;
            }else{
                head = head.next;
            }
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
        }
        return arr[front];
}
public static void main(String[] args){
    Queue q =new Queue();
    q.add(1);
    q.add(2);
    q.add(3);

    System.out.print(q.remove());
    q.add(4);
    System.out.print(q.remove());
    q.add(5);
    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }
}
}

*/

/* 
//implementing queues using java collection framework
import java.util.*;
import java.util.LinkedList;

public class Ques4{
    public static void main(String args[]){
       // Queue q = new Queue();
       Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
*/
/* 
//implement queues using 2 stacks

import java.util.*;
public class Ques5{
    static queue
    {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void add(int data){
            while(!s.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){
            if(isEmpty()){
                System.out.print("queue empty");
                return -1;
            }
            return s1.peek();
        }
    }

    
    public static void main(String args[]){
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
    }
}
*/

//to print first non repeating letter in a stream of characters
import java.util.*;
import java.util.LinkedList;
public class Ques6{
    public static void printNonRepeating(String str){
        int freq[] = new int [26]; //'a' - 'z'
        Queue<Character> q = new LinkedList();
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch -'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]){
        String str = "aabccxb";
        printNonRepeating(str);
    }
}