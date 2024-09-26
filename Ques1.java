import java.util.*;

public class Ques1 {
    static class Node{
        int data;
        Node left;
        Node right;
        //constructor
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

       static int idx = -1;
       public static Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
       }
       // PREORDER TRAVERSAL
       public static void preorder(Node root){

        //base case
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
       }

       //INORDER TRAVERSAL
       public static void inorder(Node root){
        //base case
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
       }

       //POST ORDER 
       public static void postorder(Node root){
        //base case
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
       }

       //LEVEL ORDER
       public static void leveloder(Node root){
        if(root == null){
            return;
        }

        Queue<Node> q = nw LinkedLis<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.println(currNode.data);
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.rigth != null){
                    q.add(currNode.right);
                }
            }
        }
       }

    public static void main(String args[]){
        int nodes[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        tree.preorder(root);
        tree.inorder(root);
        tree.postorder(root);
    }
}
