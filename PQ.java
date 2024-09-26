/* 
//IMPLEMENTING PRIORITY QUEUE IN JCF
import java.util.Comparator;
import java.util.PriorityQueue;
public class PQ{

    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String args[]){
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D",12));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + "-" + pq.peek().rank);
            pq.remove();
        }
    }
}
*/
/* 

//INSERT IN A HEAP

import java.util.ArrayList;

public class PQ{
    static class Heap{
        ArrayList<Integer> heaparr = new ArrayList<>();
        public void add (int data){
            //add at last index
            heaparr.add(data);
            int x = heaparr.size()-1; // x is child index
            int par = (x-1)/2;

            while(heaparr.get(x) < heaparr.get(par)){
                //swap
                int temp = heaparr.get(x);
                heaparr.set(x, heaparr.get(par));
                heaparr.set(par, temp);
            }
        }
//TO GET MINIMUM ELEMENT FROM HEAP
        public int peek(){
            return heaparr.get(0);
        }


//TO DELETE FROM HEAP
        private void heapify(int i){
            int left= 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left<heaparr.size() &&  heaparr.get(minIdx)>heaparr.get(right)){
                minIdx = left;
            }
            if(right<heaparr.size() && heaparr.get(minIdx)>heaparr.get(left)) {
                minIdx = right;
            }

            if(minIdx !=i){
                int temp = heaparr.get(i);
                heaparr.set(i,heaparr.get(minIdx));
                heaparr.set(minIdx, temp);
                heapify(minIdx);
            }
        }

        public int remove(){
            int data = heaparr.get(0);

            //step 1 swap 1st and last node
            int temp = heaparr.get(0);
            heaparr.set(0, heaparr.size()-1);
            heaparr.set(heaparr.size()-1, temp);


            //step 2 
            heaparr.remove(heaparr.size()-1);
            //step 3
            heapify(0);
            return data;
        }

        public static void main(String args[]){
            Heap h = new Heap();
            h.add(3);
            h.add(4);
            h.add(5);
            h.add(1);

            while(!h.isEmpty()){
                System.out.print(h.peek());
                h.remove();
            }

        }
    }
}

*/

/* 
//NEAREST K CARS / NEAREST K POINTS TO THE ORIGIN
import java.util.*;
public class PQ{
    static class Point implements Comaparable<Point>{
        int x;
        int y;
        int distSq;
        int idx;

        public Point(int x,int y,int distSq, int idx){
            this.x=x;
            this.y = y;
            this.distSq = distSq;
            this.idx=idx;
        }

    @Override
    public int compareTo(Point p2){
        return this.distSq - p2.distSq;
        }
    }

    public static void main(String args[]){
        int pts[][] = {{3,3},{5,-1},{-2,4}};
        int k=2;

        PriorityQueue<Point> pq= new PriorityQueue<>();
        for(int i =0; i<pts.length;i++){
            int distSq = pts[i][0]*pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new Point(pts[i][0],pts[i][1],distSq,i));
        }

        //for nearest k cars
        {
            for(int i =0;i<k;i++){
                System.out.println("CAR"+ pq.remove());
            }
        }
    }

}


*/


import java.util.*;
public class PQ{
    public static void main(String args[]){
        int ropes[]= {2,3,4,6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }

        int cost =0;
        while(pq.size()>1){
            int min = pq.remove();
            int min2 = pq.remove();
            cost +=min+min2;
            pq.add(min+min2);
        }
        System.out.println("Cost of connecting n ropes ="+cost);
    }
}