package leetCode;


public class TestSets {
	public static void main(String[] args) {
    	//int n = Solution.reverse(1000000);
		
		
		/*int[] array = {1,2,3,4};
		for (int i=0;i<array.length;++i)	
    	 System.out.println(i+","+array[i]);
		Stack<Integer> s = new Stack<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();
		Queue<String> que = new LinkedList<String>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		a.clear();
		
		a.addAll(b);
		a.add(1);
		q.add(array[2]);
		s.push(array[2]);
		int i = s.pop();
		//if(s.isEmpty()) i = 0;
		System.out.println(q.poll());
		System.out.println(array.length);*/
		/*TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		Test test = new Test();
		ArrayList<ArrayList<Integer>> re = test.levelOrder(root);
		System.out.print(re.get(0));
		System.out.print(re.get(1));
		System.out.print(re.get(2));*/
		
		int[] a = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[0] = a[2];
		a[1] = a[2];
		System.out.println(a.length);
 		
		ListNode head = new ListNode(2);
		head.next = new ListNode(1);
		head.next.next=new ListNode(0);
		head.next.next.next = new ListNode(4);
		SwapPairs s = new SwapPairs();
		ListNode n = s.swapPairs(head);
		System.out.print(n.val +" ");
		System.out.print(n.next.val+" ");
		System.out.print(n.next.next.val);
		System.out.print(n.next.next.next.val);
		
    }
}
