package chapter2;

/**
 * Reverse Linked List II
 * 
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 * 
 * For example: Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 * 
 * return 1->4->3->2->5->NULL.
 * 
 * Note: Given m, n satisfy the following condition: 1 ≤ m ≤ n ≤ length of list.
 * 
 * @author LinyuDong
 * 
 */

public class ReverseLinkedListII {
	public ListNode reverseNodes(ListNode head, int m, int n) {
		if (m == n) {
			return head;
		} else {
			ListNode dummy = new ListNode(0);
			dummy.next = head;
			// point to the first node before reversal
			ListNode beforeReversal = dummy;
			for (int i = 1; i < m; i++) {
				beforeReversal = beforeReversal.next;
			}
			ListNode firstReversed = beforeReversal.next; // firstReversed point
															// to the M node
															// before reversal
			ListNode current = firstReversed;
			ListNode previous = null;

			// System.out.print(current.data+" ");

			for (int i = m; i <= n; i++) {
				ListNode next = current.next;
				System.out.print(current.val + " ");
				current.next = previous;
				previous = current;
				current = next;

			}

			// System.out.print(previous.data+" ");
			// System.out.print(current.data+" ");
			beforeReversal.next = previous;
			firstReversed.next = current;

			return dummy.next;
		}

	}
}
