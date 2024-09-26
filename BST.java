/* 
import java.util.*;
public class BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    //BUILDING A BST
    public static Node insert(Node root, int val){
        //addedd first element to value of root
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            //left subtree
            root.left = insert(root.left, val);
        }else{
            //right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
/* 
    //SEARCH IN A BST
    public static boolean Search(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }
        
        if(root.data>key){
            return Search(root.left, key);
        }

        if(root.data<key){
            return Search(root.right, key);
    }
        return false;
}
*/
/* 
    public static Node delete(Node root, int val){
        if(root.data< val){
            root.right = delete(root.right, val);
        }else if(root.data>val){
            root.left = delete(root.left, val);
        }else{
            //CASE 1: NO CHILD
            if(root.left==null && root.right==null){
                return null;
            }
            //CASE 2: HAS ONE CHILD
            if(root.right==null){
                return root.right;
            }else if(root.left == null){
                return root.left;
            }
            //CASE 3:HAS BOTH CHILDREN
            Node IS = findinorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node findinorderSuccessor(Node root){
        while(root.left!=null){
            root = root.left;
        } 
        return root;
    }
*/
/* 
    //PRINT IN GIVEN RANGE K1=5, K2 =12
    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left,k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }else if(root.data <k1){
            printInRange(root.left, k1, k2);
        }else {
            printInRange(root.right, k1, k2);   
        }
    }
    */
/* 
//TO PRINT ALL ROOT TO LEAF PATHS
public static void printpath(ArrayList<Integer> path){
    for(int i=0;i<=path.size();i++){
        System.out.print(path.get(i)+"->");
    }
    System.out.println();
}
public static void print2path(Node root, ArrayList<Integer> path){
    if(root == null){
        return;
    }
    path.add(root.data);
    if(root.left == null && root.right==null){
        printpath(path);
    }
    print2path(root.left, path);
    print2path(root.right, path);
    path.remove(path.size()-1);

}


public static boolean isValidBST(Node root, Node min, Node max){
    if(root == null){
        return true;
    }
    if(min!=null && root.data<=min.data){
        return false;
    }
    if(max!=null && root.data>=max.data){
        return false;
    }
    return isValidBST(root.left, min, root) && isValidBST(root.right,root, max);
}
    public static void main(String args[]){
        int values[] = {8,5,3,6,10,11,14};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }
        /* 
        inorder(root);
        if(Search(root, 1)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }*/
/* 
    //delete(root, 1);
    //System.out.println();
    //inorder(root);
    //System.out.println();
    //printInRange(root, 5, 12);
    //print2path(root, new ArrayList<>());
    if(isValidBST(root, null, null)){
        System.out.print("Valid");
    }else{
        System.out.print("Not Valid");
    }
    }
}
*/
/* 
public class BST{
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left = null;
            this.right = null;
        }
    }
/* 
//TO CREATE MIRROR OF A TREE
    public static Node createMirror(Node root){
        if(root == null){
            return null;
        }
        Node leftSubtree = createMirror(root.left);
        Node rightSubtree = createMirror(root.right);

        root.left = rightSubtree;
        root.right = leftSubtree;
        return root;
    }
    */
    /* 
    //SORTING ARRAY INTO BALANCED BST
    public static Node createBST(int arr[], int st, int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr,mid+1, end);
        return root;
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

public static void main(String args[]){
    int arr[] = {3,5,6,8,10,11,12};
    Node root = createBST(arr, 0, arr.length-1);
/* 
    Node root = new Node(8);
    root.left = new Node(5);
    root.right = new Node(10);
    root.left.left = new Node(3);
    root.left.right = new Node(6);
    root.right.left = new Node(11);
    //root = createMirror(root);
*/
/* 
    preOrder(root);
    }
}
*/

//MERGE TEO BST TO MAKE A BST
import java.util.ArrayList;

public class BST{
        public static class Node{
            int data;
            Node left;
            Node right;
    
            Node(int data){
                this.data=data;
                this.left = null;
                this.right = null;
            }
        }

        public static void getInorder(Node root, ArrayList<Integer> arr){
            if(root == null){
                return;
            }
            getInorder(root.left, arr);
            arr.add(root.data);
            getInorder(root.right, arr);
        }

        public static Node mergeBST(Node root1, Node root2){
            ArrayList<Integer> arr1 = new ArrayList<>();
            getInorder(root1, arr1);
            ArrayList<Integer> arr2 = new ArrayList<>();
            getInorder(root2,arr2);

            int i=0, j=0;
            ArrayList<Integer> finalArr = new ArrayList<>();
            while(i<arr1.size() && j<arr2.size()){
                if(arr1.get(i) <= arr2.get(j)){
                    finalArr.add(arr1.get(i));
                    i++;
                }else{
                    finalArr.add(arr2.get(j));
                    j++;
                }
            }
            while(i<arr1.size()){
                finalArr.add(arr1.get(i));
                i++;
            }

            while(j<arr2.size()){
                finalArr.add(arr2.get(j));
                j++;
        }
    }

    public static Node createBST(ArrayList<Integer> arr, int st, int end{
        int mid = (st+end)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }


        public static void main(String[] args){
            Node root1 = new Node(2);
            root1.left = new Node(1);
            root1.right = new Node(4);


            Node root2 = new Node(9);
            root2.left = new Node(3);
            root2.right = new Node(12);
        }

}
