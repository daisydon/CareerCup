package chapter2;

class ListNode {
	int val;
	ListNode next;

	public ListNode(int data) {
		this.val = data;
		this.next = null;
	}
}

public class ReverseLinkedList {

	public ListNode ReverseNode(ListNode head, int m, int n) {
		if (m == n) {
			return head;
		}
		else{
			ListNode dummy = new ListNode(0);
			dummy.next = head;
			
			ListNode pre = dummy;
			for(int i = 1; i < m ; i++){
				pre = pre.next;
			}
			ListNode cur = pre.next;
			for(int i = m+1; i < n; i++){
				cur = cur.next;
			}
			//cur points the n node before reversal 
			ListNode firstReversed = pre.next;
		    ListNode secondReversed = cur.next;
		    
		    pre.next = secondReversed;
		    cur.next = firstReversed;
		    
		    pre.next.next = firstReversed.next;
		    cur.next.next = secondReversed.next;
			return dummy.next;
			
		}
	}
}
