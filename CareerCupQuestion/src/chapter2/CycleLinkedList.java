package chapter2;

public class CycleLinkedList {
	public boolean hasCycle(ListNode head) {
		// IMPORTANT: Please reset any member data you declared, as
		// the same Solution instance will be reused for each test case.
		if (head == null || head.next == null || head.next.next == null) {
			return false;
		}
		ListNode counter = head.next;
		ListNode runner = head.next.next;
		while (runner != counter) {
			if (runner.next == null || runner.next.next == null) {
				return false;
			}
			counter = counter.next;
			runner = runner.next.next;
		}
		return true;
	}
}
