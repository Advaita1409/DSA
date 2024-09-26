//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.*;

public class AllBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this .right = null;
        }
    }
    /* 
//CALC HEIGHT OF THE TREE
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) +1;
    }
//COUNT THE NUMBER OF NODES
    public static int Count(Node root){
        //base case 
        if(root == null){
            return 0;
        }

        int lcount = Count(root.left);
        int rcount = Count(root.right);
        return lcount + rcount +1;
    }
// SUM OF NODES OF TREE
public static int SumNodes(Node root){
    //base case
    if(root == null){
        return 0;
    }

    int leftsum = SumNodes(root.left);
    int rightsum = SumNodes(root.right);

    return leftsum+rightsum+root.data;
}

public static int diameter(Node root){
    if(root == null){
        return 0;
    }

    int leftDiam = diameter(root.left);
    int rightDiam = diameter(root.right);
    int lh =height(root.left);
    int rh = height(root.right);
    int selfDiam = lh +rh +1;
    return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
}
*/

/* 
//TOP VIEW OF BINARY TREE
static class Info{
    Node node;
    int hd;
    public Info(Node node, int hd){
        this.node = node;
        this.hd = hd;
    }
}
public static void topView(Node root){
    //level order
    Queue<Info> q = new LinkedList<>();
    HashMap<Integer, Node> map = new HashMap<>();
    int min =0, max =0;
    q.add(new Info(root, 0));
    q.add(null);
    while(!q.isEmpty()){
        Info curr = q.remove();
        if(curr == null){
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }
        }else{
            if(map.containsKey(curr.hd)){// first timehorizontal distance
                map.put(curr.hd, curr.node);
            }
    
            if(curr.node.left !=null){
                q.add(new Info(curr.node.left, curr.hd-1));
                min = Math.min(min, curr.hd-1);
            }
            if(curr.node.right != null){
                q.add(new Info(curr.node.right, curr.hd+1));
                max = Math.max(max, curr.hd+1);
            }
        }
    }

    for(int i=min;i<=max;i++){
        System.out.print(map.get(i).data+" ");
    }
    System.out.println();

}
/* 
public static boolean isIdentical(Node node,Node subRoot){
    if(node == null && subRoot == null){
        return true;
    }else if(node == null || subRoot == null  || node.data != subRoot.data){
        return false;
    }

    if(!isIdentical(node.left, subRoot.left)){
        return false;
    }
    if(isIdentical(node.right, subRoot.right)){
        return false;
    }
    return true;
}

public static boolean isSubtree(Node root, Node subRoot){
    if(root.data == subRoot.data){
        if(isIdentical(root, subRoot)){
            return true;
        }
    }

    boolean leftAns = isSubtree(root.left, subRoot);
    boolean rightAns = isSubtree(root.right, subRoot);
    return leftAns || rightAns;
}
*/
/* 
public static void Klevel(Node root, int level, int k){
    if(root == null){
        return;
    }
    if(level == k){
        System.out.print(root.data+" ");
        return;
    }
        Klevel(root.left, level+1, k);
        Klevel(root.right, level+1, k);

}
*/

/* 
//TO FIND KTH ANCESTOR OF A GIVEN NODE
public static int Kancestor(Node root, int n,int k){
    if(root == null){
        return -1;
    }
    if(root.data == n){
        return 0;
    }

    int leftDist = Kancestor(root.left,n,k);
    int rightDist =Kancestor(root.right, n, k);

    if(leftDist==-1 && rightDist ==-1){
        return -1;
    }

    int max = Math.max(leftDist,rightDist);
    if(max+1==k){
        System.out.println(root.data);
    }
    return max+1;
}

*/

//TO CONSTRUCT TRANSFORM TO SUM TREE
public static int transform(Node root)
{
    if(root == null){
        return 0;
    }
    int leftChild = transform(root.left);
    int rightChild = transform(root.right);

    int data = root.data;
    int newLeft = root.left == null ? 0 :root.left.data;
    int newRight = root.right == null ? 0 :root.right.data;
    root.data = newLeft + leftChild + newRight + rightChild;
    return data;
}
public static void preorder(Node root){
    if(root == null){
        return;
    }
    System.out.println(root.data+" ");
    preorder(root.left);
    preorder(root.right);
}

    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //Node subroot = new Node(2);
        //subroot.left = new Node(4);
        //subroot.right = new Node(5);
        //System.out.println(height(root));
        //System.out.println(Count(root));
        //System.out.println(SumNodes(root));
        // System.out.print(diameter(root));
        //System.out.println(isSubtree(root,subroot));
        // topView(root);
        //Klevel(root,0,3);
        //Kancestor(root,5,2);
        transform(root);
        preorder(root);
    }
}
