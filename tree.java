class Node{
    int data;
    Node left,right;

    Node(int value){
        data=value;
    }
}

public class tree {
    static int max=Integer.MIN_VALUE;
    public static void disp_preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        disp_preorder(root.left);
        disp_preorder(root.right);
    }
    public static void disp_inorder(Node root){
        if(root==null){
            return;
        }
        disp_inorder(root.left);
        System.out.print(root.data+" ");
        disp_inorder(root.right);
    }
    public static void disp_postorder(Node root){
        if(root==null){
            return;
        }
        disp_postorder(root.left);
        disp_postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void nthlevel(Node root,int n){
        if(root==null){
            return;
        }
        if(n==1)System.out.print(root.data+" ");
        nthlevel(root.left,n-1);
        nthlevel(root.right,n-1);
    }

    public static int size(Node root){
        if(root==null){
            return 0;
        }
        return 1+size(root.left)+size(root.right);
    }

    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        return root.data+sum(root.left)+sum(root.right);
    }

    public static void max(Node root){
        if(root==null){
            return ;
        }
        if(root.data>max){
            max=root.data;
        }
        max(root.left);
        max(root.right);
    }
    
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);
        root.left=a;
        root.right=b;
        b.left=e;
        a.left=c;
        a.right=d;
        disp_inorder(root);
        System.out.println();
        disp_postorder(root);
        disp_inorder(root);
        // nthlevel(root,3);
    }
}






























'''
A Binary Tree is a non-linear hierarchical data structure in which each node has at most two
children — referred to as the left and right child. It is a special case of a tree data structure and is
widely used in many real-world applications like parsing expressions, search operations, and
memory management.
There are several types of tree traversal techniques, among which the most commonly used are:
● Inorder Traversal (Left → Root → Right):
Typically used to retrieve data from a Binary Search Tree in sorted order.
● Preorder Traversal (Root → Left → Right):
Used to make a copy of the tree or for prefix expression notation.
● Postorder Traversal (Left → Right → Root):
Useful for deleting nodes or evaluating postfix expressions.

Inorder Traversal: 10 20 30 100 150 200 300
Preorder Traversal: 100 20 10 30 200 150 300
Postorder Traversal: 10 30 20 150 300 200 100
Tree traversals are most commonly implemented using recursion due to the naturally recursive
structure of trees.
 '''