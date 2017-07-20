import java.io.*;
import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class BST{
	static Queue q = new LinkedList();
    
    static void levelOrder(Node root){
      //Write your code here
      if( root != null)
      {
          q.add(root);
          while(q.isEmpty() != true){
              
              Node t = (Node)q.remove();
              System.out.print(t.data+ " ");
              if(t.left!=null){
                 q.add(t.left);

              }
              if(t.right!=null){
                  q.add(t.right);

              }
              }
      }  
        
        
        
        
    }
	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}