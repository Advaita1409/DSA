
/*
//merge two sorted linked listed
import java.util.*;
import java.io.*;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}

class sdot{
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode d = new ListNode(0);
        ListNode current = d;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                current.next = l1;
                l1 = l1.next;
            }else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if(l1!= null){
            current.next = l1;
        }else{
            current.next = l2;
        }
        return d.next;
    }

    private static ListNode createLinkedList(int length){
        Scanner sc = new Scanner(System.in);
        ListNode d = new ListNode(0);
        ListNode current = d;
        for(int i =0; i<length;i++){
            int val = sc.nextInt();
            current.next = new ListNode(val);
            current = current.next;
        }
        return d.next;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ListNode l1 = createLinkedList(n);
        ListNode l2 = createLinkedList(m);
        ListNode merged = sdot.mergeTwoLists(l1, l2);

        while(merged != null){
            System.out.print(merged.val +" ");
            merged = merged.next;
        }
        sc.close();
    }
}

*/

/* 
//check if list is palindrome or not 

import java.util.LinkedList;
import java.util.*;
public class sdot{
    public boolean checkPalindrome(){
        public Node findMid(Node head){
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
        int num = sc.nextInt();
        while(num>0){
            ll.add(sc.nextInt());
            num--;
        }
        sc.close();
        System.out.println(ll);
    }
}
*/
//check for palindrome
import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main"
only if the class is public. */
class Main
{
 class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
 }
 }
 public int size;
 public Node head = null;
 public Node tail = null;

 public void addNode(int data){
 Node newNode = new Node(data);
    if(head==null){
        head=newNode;
        tail=newNode;
 }
    else{
        tail.next=newNode;
        tail=newNode;
 }
 size++;
 }

 public Node reverseList(Node temp){
    Node current = temp;
    Node prevNode = null,
    nextNode=null;
    while(current!=null){
    nextNode = current.next;
    current.next = prevNode;
    prevNode = current;
    current = nextNode;
    }
    return prevNode;
    }

    public void isPalindrome(){
    Node current = head;
    boolean flag = true;
    int mid =
   (size%2==0)?(size/2):((size+1)/2);
   for(int i=1; i<mid; i++){
    current=current.next;
    }
    Node revHead =
   reverseList(current.next);
    while(head!=null &&
   revHead!=null){
    if(head.data!=revHead.data){
    flag=false;
    break;
    }
    head = head.next;
    revHead = revHead.next;
    }if(flag)
    System.out.println("true");
    else
    System.out.println("false");
    }

    public static void main (String[]
args) throws java.lang.Exception
{
// your code goes here
 Main sList = new Main();
 Scanner sc  = new Scanner(System.in);
 String input = sc.nextLine();
 String[] numbersStr =
input.split("\\s+");
for (String numStr : numbersStr) {
    int num =
   Integer.parseInt(numStr);
    sList.addNode(num);
    }
    sList.isPalindrome();
   }
   }




import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main"
only if the class is public. */
class Main {
 static class ListNode {
 int val;
 ListNode next;
 ListNode(int val) {
 this.val = val;
 }
 }
 public ListNode head = null;
 public void addNode(int val) {
 ListNode newNode = new ListNode(val);
 if (head == null) {
 head = newNode;
 } else {
 ListNode temp = head;
 while (temp.next != null) {
 temp = temp.next;
 }
 temp.next = newNode;
 }
 }
 public static ListNode
reverseKGroup(ListNode head, int k) {
 if (head == null || k == 1)
 return head;
 ListNode dummy = new ListNode(0);
 dummy.next = head;
 ListNode start = dummy;
 ListNode end = head;
 int count = 0;
 while (end != null) {
    count++;
    if (count % k == 0) {
    start = reverse(start,end.next);
    end = start.next;
    } else {
    end = end.next;
    }
    }
    return dummy.next;
    }
    public static ListNode
   reverse(ListNode start, ListNode end) {
    ListNode prev = start;
    ListNode curr = start.next;
    ListNode first = curr;
    while (curr != end) {
    ListNode temp = curr.next;
    curr.next = prev;
    prev = curr;
    curr = temp;
    }
    start.next = prev;
    first.next = curr;
    return first;
    }
    public static void printList(ListNode
   node) {
    while (node != null) {
    System.out.print(node.val + " ");
    node = node.next;
    }
    System.out.println();
    }
    public static void main(String[]
   args) throws java.lang.Exception {
    Main sList = new Main();
    Scanner scn = new
   Scanner(System.in);
   String input = scn.nextLine();
 String[] numbersStr = input.split("\\s+");
 for (String numStr : numbersStr) {
 int num = Integer.parseInt(numStr);
 sList.addNode(num);
 }
 int k = scn.nextInt();
 ListNode result = reverseKGroup(sList.head, k);
 printList(result);
 }
}