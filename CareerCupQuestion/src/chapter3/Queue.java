package chapter3;

public class Queue {
 Node first, last;
 void enqueue(Node item){
	 if(first==null){
		 last = item;
		 first = last;
	 }else{
		 last.next = item;
		 last = last.next;
	 }
 }
  Node dequeue(){
	 if(first!=null){
		 Node item = first;
		 first = first.next;
		 return item;
	 }
	 return null;
 }
}
