package chapter2;

public class TestSets {
	public static void main(String[] args){
		ListNode head = new ListNode(3);
		head.next = new ListNode(2);
		//head.next.next = new ListNode(1);
		//head.next.next.next = new ListNode(1);
		
		
		/*RemoveDuplicates remove = new RemoveDuplicates();
		ListNode r = remove.deleteDuplicates(head);
		System.out.print(r.val+",");
		System.out.print(r.next.val);*/
		
		CycleLinkedList cycle = new CycleLinkedList();
		System.out.print(cycle.hasCycle(head));
	}
}
