public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    //method for Adding element to the end of linked list
    public void addFirst(int data){
        Node newNode = new Node(data);
        // base case
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        //base case
        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ "->");
        }
        temp = temp.next;
    }

public static void main (String args[]){
    LinkedList ll = new LinkedList();
    ll.printList();
    ll.addFirst(1);
    ll.printList();
    ll.addFirst(2);
    ll.printList();
    ll.addLast(5);
    ll.printList();
  }
}
 