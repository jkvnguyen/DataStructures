/***********************************
* CSE2011 - Assignment 2
* File name: sum.java
* Author: Last name, first name
* Email: Your email address
* CSE number: Your cse number
************************************/


public class sum {


/*
 * EXHAUSTIVE ALGORITHM
 * Returns true if array A contains two elements whose sum is k.
 * Returns false otherwise.
 * n is the number of elements A contains.
 *
 * The running time of your algorithm is O( N^2 ).
 * You may add a brief explanation here if you wish.
 */

public static boolean sum_exh( int[] A, int n, int k )
{
   // COMPLETE THIS METHOD.

   // You may define local variables inside this method.

   // You may add your own methods/subroutines to this file.
	
	/** Loop Algorithm
	for(int indices: A){
		for(int indices2: A){
			if(indices != indices2 && indices + indices2 == k){
				return true;
			} 
			}
		}
	
	return false;
	 */
	
	//recursive algorithm
	return sum_exh_helper(A, n, k, 0, 0);
	
}  // end sum_exh

	private static boolean sum_exh_helper( int[] A, int n, int k, int index, int index2){
		if ((A[index] + A[index2]) == k && A[index] != A[index2]){
			return true;
		} else if(index2 == (n-1)){
			index2 = 0;
			return sum_exh_helper(A, n, k, index + 1, index2);
		} else if (index < (n-1)){
			return sum_exh_helper(A, n, k, index, index2 + 1);
		} else {
			return false;
		}
	}

/*
 * RECURSIVE ALGORITHM
 * Returns true if array A contains two elements whose sum is k.
 * Returns false otherwise.
 * n is the number of elements A contains.
 *
 * The running time of your algorithm is O( N ).
 * 
 * Worst case, the algorithm checks every indices until the leftIndex > rightIndex, which is N
 * 
 * You may add a brief explanation here if you wish.
 */

public static boolean sum_rec( int[] A, int n, int k )
{
   // COMPLETE THIS METHOD.

   // You may define local variables inside this method.

   // You may add your own methods/subroutines to this file.

	return sum_rec_helper(A, n, k, 0, n-1);
	
	
}  // end sum_rec
	private static boolean sum_rec_helper(int[] A, int n, int k, int leftIndex, int rightIndex){
		
		if(leftIndex > rightIndex){
			return false;
		} else if(A[leftIndex] + A[rightIndex] == k && A[leftIndex] != A[rightIndex]){
			return true;
		} else if(A[leftIndex] + A[rightIndex] > k){
			return sum_rec_helper(A, n, k, leftIndex, rightIndex - 1);
		} else {
			return sum_rec_helper(A, n, k, leftIndex + 1, rightIndex);
		}
	}

/**
 * 10 
5 10 15 20 25 30 35 40 45 50 
50 60 30 90 95 23 53 63 3 100
-1
 */

} // end class
