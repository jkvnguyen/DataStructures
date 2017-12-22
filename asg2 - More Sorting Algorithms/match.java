/***********************************
* CSE2011 - Assignment 2
* File name: match.java
* Author: Last name, first name
* Email: Your email address
* CSE number: Your cse number
************************************/


public class match {

/*
 * EXHAUSTIVE ALGORITHM
 * Returns index i if array A contains an element A[i] such that A[i] = i.
 * If there exist many of such elements, return the index of any one of them.
 * Returns -1 if there exists no element A[i] such that A[i] == i.
 * n is the number of elements A contains.
 *
 * The running time of your algorithm is O( N ).
 * You may add a brief explanation here if you wish.
 */


public static int match_exh( int[] A, int n ) 
{

   // COMPLETE THIS METHOD.

   // You may define local variables inside this method.

   // You may add your own methods/subroutines to this file.
	return match_exh_helper(A, n, 0);


} // end match_exh
	private static int match_exh_helper(int[] A, int n, int index){
		if(A[index] == index){
			return index;
		} else if(index < n){
			return match_exh_helper(A, n, index + 1);
		} else {
			return -1;
		}
	}



/*
 * DIVIDE-AND-CONQUER ALGORITHM
 * Returns index i if array A contains an element A[i] such that A[i] = i.
 * If there exist many of such elements, return the index of any one of them.
 * Returns -1 if there exists no element A[i] such that A[i] == i.
 * n is the number of elements A contains.
 *
 * The running time of your algorithm is O( logN ).
 * You may add a brief explanation here if you wish.
 */

public static int match_dac( int[] A, int n )
{

   // COMPLETE THIS METHOD.

   // You may define local variables inside this method.

   // You may add your own methods/subroutines to this file.
	return match_dac_helper(A, n, 0, n-1);
}  // end match_dac

	private static int match_dac_helper(int[] A, int n, int left, int right){
		//A[i] = i => A[i] - i = 0;
	
//	int center = (left+right)/2;
//	
//	if(A[center] == center){
//		return center;
//	}
//		
//	if(A[left] == left){
//		return left;
//	}
//		
//	if (A[right] == right) {
//		return right;
//	}
//
//	if(left < right){
//		left = match_dac_helper(A, n, left, center);
//		right = match_dac_helper(A, n, center + 1, right);
//	}  
//	
//	return -1;
	
	//if there is only one element left (left < right) doesn't execute
	int center = (left+right)/2;
	if(A[center] == center){
		return center;
	}
		
	if(left < right){
		//if center greater than num, then its impossible for numbers on the left to be greater than things from the center to the right.
		if(A[center] < center){
			return match_dac_helper(A, n, center + 1, right);
		} else {
			return match_dac_helper(A, n, left, center);
		}
		
	} else {
		return -1;
	}
	
	
	
	}

} // end class
