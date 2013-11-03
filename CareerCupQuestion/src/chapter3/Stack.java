package chapter3;

class Node{
	int val;
	Node next;
	public Node(int data){
		this.val = data;
		next = null;
	}
}
public class Stack {
     Node top;
     Node pop(){
    	 if(top!=null){
    		 Node item = top;
    		 top = top.next;
    		 return item; 
    	 }
    	 return null;
     }
     void push(Node item){
    	 Node t = item;
    	 t.next = top;
    	 top = t;
     }
}
