/***********************************
* CSE2011 - Assignment 2
* File name: kthsmallest.java
* Author: Last name, first name
* Email: Your email address
* CSE number: Your cse number
************************************/


public class kthsmallest {

public static final int MaxSize = 500;

/*
 * Return the value of the kth smallest element of array A.
 * n is the number of elements A contains, and k <= n.
 * The running time of your algorithm must be O(n).
 *
 */

public static int find_kth_smallest( int[] A, int n, int k )
{

   // COMPLETE THIS METHOD.

   // You may define local variables inside this method.

   // You may add your own methods/subroutines to this file.


   /* Note 1:
    * During the partitioning process, array elements may be swapped and moved around.
    * DO NOT modify the content of array A.  Copy it to a temporary array B and work on B instead.
    */

   /* Note 2:
    * DO NOT SORT THE WHOLE ARRAY and then return B[k-1].  That would take O(nlogn) time.
    * If you do that, your program will get zero point.
    */


}  // end find_kth_smallest
	private static int find_kth_smallest_helper(int[] A, int n, int k, int left, int right){
		int pivot = median3(A, left, right)[n-1];
		
		if(A[left] < pivot){
			return find_kth_smallest_helper(A, n, k, left + 1, right);
		} else if (A[right] > pivot){
			return find_kth_smallest_helper(A, n, k, left, right - 1);
		}
		
	}
	
	private static int[] median3(int[] A, int left, int right){
		int[] B;
		B = A.clone();
		
		int center = (left + right) / 2;
		if(B[center] < B[left]){
			int temp;
			temp = B[left];
			B[left] = B[center];
			B[center] = temp;
		}
		if(B[right] < B[left]){
			int temp;
			temp = B[left];
			B[left] = B[right];
			B[right] = temp;
		}
		if(B[right] < B[center]){
			int temp;
			temp = B[center];
			B[center] = B[right];
			B[right] = temp;
		}
		
		int temp = B[right-1];
		B[right-1] = B[center];
		B[center] = temp;
		return B;
	}

} // end class
