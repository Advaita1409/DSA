import java.util.LinkedList;
import java.util.*;
public class sdot1{
    public static boolean isPalindrome(LinkedList<Integer>){
        class Node{
            int data;
            Node next;
            public Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        public Node forMid(Node head){
            Node slow = head;
            Node fast = head;
            while(fast !=null && fast.next!= null){
                slow = slow.next;//+1
                fast = fast.next.next;//+2
            }
            return slow;
        }

        public void reverse(){
            Node prev = null;
            Node curr = tail = head;
            Node next;
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }

        Node right = prev;
        Node left = head;
        while(right!= null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right= right.next;
        }
        return true;
    }

    public static void main (String[] args){
        LinkedList<Integer> ll= new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in ll");
        int num = sc.nextInt();
        while(num>0){
            ll.add(sc.nextInt());
            num--;
        }
        sc.close();
        System.out.println(" the given list is " + isPalindrome());
    }
}

