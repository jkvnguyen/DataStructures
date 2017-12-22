/***********************************
*
* CSE2011 - Fundamentals of Data Structures
* File name: test12.java
*
************************************/


import java.io.*;       // to read/write files

public class test12 {

   public static void printOutput(AVLTree t){
        //System.out.print("Preorder : ");
        //TreePrint.preorderPrint(t, t.root());
        //System.out.println();
        System.out.print("Postorder: ");
        TreePrint.postorderPrint(t, t.root());
        //System.out.println();
        //System.out.println();
   }


   public static void main (String[] args) throws IOException{


        AVLTree t2 = new AVLTree();


	  t2.insert(40, 40);
        t2.insert(30, 30);
        t2.insert(50, 50);


        t2.insert(45, 45);
        t2.insert(42, 42);
        printOutput(t2);

        //System.out.println("Input: 40, 30, 50, 45, 42");
        //System.out.println();

   }  // end main


}  // end class
