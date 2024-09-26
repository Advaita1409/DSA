import java.util.*;
import java.util.scanner;
public class reverseDll{
public void reverse(){
    Node curr = head;
    Node prev = null;
    Node next;
    while (curr!=null){
        next = curr.next;
        curr.next= prev;
        curr.prev= next;
        prev = curr;
        curr = next;
    }
}

public static void main (String[] args){
    Double dll = new DoubleLL();
    dll.addFirst(3);
    dll.addFirst(2);
    dll.addFirst(1);
    dll.print();
    dll.reverse();
    dll.print();
}
}