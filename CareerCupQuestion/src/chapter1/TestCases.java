package chapter1;

public class TestCases {
	public static void main (String[] args){
		 char[] test = {'1','2','3','\0'};
		    ReverseString rev = new ReverseString();
		    rev.reverse(test);
		    test.toString();
		    //System.out.print(test);
		    
		    char[] s = {'(',')'};
		    String t = s.toString();
		    int[] a = {1,2};
		    SortedArrayReomoveDuplicates sort = new SortedArrayReomoveDuplicates();
		    int len = sort.removeDuplicates(a);
		    System.out.print(t.charAt(0));
		    System.out.print(len);
		    
	}
   
}
