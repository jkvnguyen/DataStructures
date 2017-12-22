/***********************************
*
* CSE2011 - Fundamentals of Data Structures
* File name: test18.java
*
************************************/


import java.io.*;       // to read/write files

public class test18 {

   public static void printOutput(AVLTree t){
        //System.out.print("Inorder  : ");
        //TreePrint.inorderPrint(t, t.root());
        //System.out.println();

        System.out.print("Preorder: ");
        TreePrint.preorderPrint(t, t.root());
        //System.out.println();

        //System.out.print("Postorder: ");
        //TreePrint.postorderPrint(t, t.root());
        //System.out.println();
        //System.out.println();
   }


   public static void main (String[] args) throws IOException{

        AVLTree t = new AVLTree();
        int numItems = 100;
        int temp = 0;
        for( int i = 37; i != 0; i = ( i + 37 ) % numItems )
        	t.insert( i, i );
//        	System.out.println(i);
//        	temp++;
//        	//at 25 messes up
//        	if (temp == 24){
//        		break;
//        	}
//        }
        
        
//	   t.insert(22, 22);
//	   t.insert(11, 11);
//	   t.insert(33, 33);
//	   t.insert(2, 2);
//	   t.insert(18, 18);
//	   t.insert(29, 29);
//	   
//	   t.insert(1, 1);
//	   t.insert(14, 14);
//	   
//	   t.insert(25, 25);
//	   System.out.println(t.key(t.actionPos));
      
        
        printOutput(t);


	//System.out.print( "Input: " );
    //    for( int i = 37; i != 0; i = ( i + 37 ) % numItems )
	//   System.out.print( i + " " );
	//System.out.println();

   }  // end main


}  // end class
