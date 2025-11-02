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
        