package chapter1;

/**
 * For example, Given sorted array A = [1,1,1,2,2,3],
 * Your function should return length = 5, and A is now [1,1,2,2,3].
 * 
 * @author LinyuDong
 * 
 */
public class SortedArrayReomoveDuplicates {
	public int removeDuplicates(int[] A) {
		// IMPORTANT: Please reset any member data you declared, as
		// the same Solution instance will be reused for each test case.

		if (A.length == 0)
			return 0;
		int j = 0;
		int counter = 0;
		for (int i = 1; i < A.length; i++) {
			if (A[j] != A[i]) {
				A[++j] = A[i];
				counter = 0;
			} else if (A[j] == A[i] && counter < 1) {
				A[++j] = A[i];
				counter++;
			}
		}

		return j + 1;
	}
}
