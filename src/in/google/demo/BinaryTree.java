package in.google.demo;

public class BinaryTree {
    static class Node{
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
        }
    }
    static int countLeafNodes(Node node)
    {
        if(node==null)
        {
            return 0;
        }
        if(node.left== null && node.right==null)
        {
            return 1;
        }
        return countLeafNodes(node.left)+countLeafNodes(node.right);
    }

     static int HeightOfTree(Node root)
    {
        if(root==null){
            return -1;
        }
        return 1 + Math.max(HeightOfTree(root.left),HeightOfTree(root.right));
      
    }

    static int CountNodes(Node root)
    {
        int count=0;
        if(root==null)
            return 0;
        if(root!=null)
            count++;

//        if(root.left!=null )
//              count++;
//        if(root.right!=null )
//            count++;
//
        count=count+(CountNodes(root.left)+CountNodes(root.right));

        return count;
    }
//    static Node newNode(int data)
//    {
//        Node node=new Node();
//        node.data=data;
//        node.left=node.right=null;
//        return node;
//    }
    static void PostOrderTraversal(Node node)
    {
        if(node==null)
            return;
        PostOrderTraversal(node.left);
        PostOrderTraversal(node.right);
        System.out.print(node.data+" ");
    }
    static void PreOrderTraversal(Node node)
    {
        if(node==null)
            return;
        System.out.print(node.data+" ");
        PreOrderTraversal(node.left);
        PreOrderTraversal(node.right);

    }
    static void InOrderTraversal(Node node)
    {
        if(node==null)
            return;
        InOrderTraversal(node.left);
        System.out.print(node.data+" ");
        InOrderTraversal(node.right);

    }


    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
//        root.left.right=new Node(10);
        Node node1=root.right=new Node(5);
        Node node2=node1.left=new Node(8);
        Node node3=node1.right=new Node(4);
        node2.left=new Node(10);
        node2.right=new Node(2);
        node3.right=new Node(6);

        System.out.println("Height of Binary Tree is : "+HeightOfTree(root));
        System.out.println("Total numbers of nodes in the binary tree is : "+CountNodes(root));
        System.out.println("Leaf Nodes of the Tree is : "+countLeafNodes(root));

        System.out.println("PostOrder Traversal : ");
        PostOrderTraversal(root);
        System.out.println();
        System.out.println("PreOrder Traveral : ");
        PreOrderTraversal(root);
        System.out.println();
        System.out.println("InOrder Traversal : ");
        InOrderTraversal(root);

    }
}
