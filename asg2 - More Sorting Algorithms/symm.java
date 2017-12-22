/***********************************
* CSE2011 - Assignment 2 
* File name: symm.java
* Author: Last name, first name
* Email: Your email address
* CSE number: Your cse number
************************************/

public class symm
{


/* 
 * Returns true if array A is symmetric.
 * Returns false otherwise.
 * n is the number of elements A contains.
 *
 * The running time of your algorithm is O( N ).
 * You may add a brief explanation here if you wish.
 */

public static boolean symmetric( int[] A, int n )
{
   // COMPLETE THIS METHOD.
	
   // You may define local variables inside this method.

   // You may add your own methods/subroutines to this file.
	
	return symmetric_helper(A, n, 0);



}  // end symmetric

	private static boolean symmetric_helper(int[] A, int n, int index){
		
		
		if(index > n/2){
			return true;
		} else if (A[index] != A[n-1-index]){
			return false;
		} else {
			return symmetric_helper(A, n, index+1);
		}

	}

}  // end class

