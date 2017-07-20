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
	//creating queue to hold Nodes 
	static Queue q = new LinkedList();
    
    static void levelOrder(Node root){
     
    	// traversing Binary tree If it is not empty
      if( root != null)
      {
          q.add(root);
          //Process all nodes of tree
          while(q.isEmpty() != true){
              
        	  //removing Node from head of queue 
              Node t = (Node)q.remove();
              System.out.print(t.data+ " ");
              // queueing Left nodes first
              if(t.left!=null){
                 q.add(t.left);

              }
              //queueing right node
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