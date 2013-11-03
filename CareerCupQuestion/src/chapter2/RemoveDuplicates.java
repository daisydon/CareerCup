package chapter2;

/**
 * Remove Duplicates from Sorted List II 
 * Given a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list.
 * 
 * For example, Given 1->2->3->3->4->4->5, return 1->2->5. Given 1->1->1->2->3,
 * return 2->3.
 * 
 * @author LinyuDong
 * 
 */

public class RemoveDuplicates {
	public ListNode deleteDuplicates(ListNode head) {
		// Note: The Solution object is instantiated only once and is reused by
		// each test case.
		if (head == null || head.next == null)
			return head;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode current = head;
		ListNode duplicate = head.next;
		while (duplicate != null) {
			if (current.val == duplicate.val) {
				if (duplicate.next != null) {
					if (duplicate.val == duplicate.next.val) {
						current.next = duplicate.next;
						duplicate = duplicate.next;
					} else {
						if (dummy.next == head) {
							head = duplicate.next;
							dummy.next = head;
							current = duplicate.next;
							if (duplicate.next.next == null)
								break;
							else
								duplicate = duplicate.next.next;
						} else {
							current = duplicate.next;
							dummy.next = current;
							if (duplicate.next.next == null)
								break;
							else
								duplicate = duplicate.next.next;
						}
					}
				} else {
					if (dummy.next == head) {
						head = null;
						dummy.next = head;
					} else {
						dummy.next = null;
						duplicate = null;
					}
				}
			} else {
				dummy = dummy.next;
				current = current.next;
				duplicate = duplicate.next;
			}
		}
		return head;
	}
}
