/***********************************
* EECS2011 - Assignment 3
* File name: ArrayMain.java
* Author: U. T. Nguyen
************************************/

public class ArrayMain {

   public static void main(String[] args) {
	ArrayDeque q = new ArrayDeque();
	
	q.insertFirst(1);
	//System.out.println("front " +q.front());
	System.out.println("front"+q.front());
	System.out.println("rear"+q.rear());
	q.removeFirst();
	//q.removeLast();
	System.out.println("front"+q.front());
	q.printDeque();
//	q.insertFirst(3);
//	q.insertFirst(4);
//	q.insertFirst(5);
//	q.insertFirst(6);
//	q.insertFirst(7);
//	q.insertFirst(8);
//	q.insertLast(9);
//	q.insertFirst(10);
//	q.insertFirst(11);
//	q.insertFirst(12);
//	q.insertFirst(13);
//	q.insertFirst(14);
//	q.insertFirst(15);
//	q.insertFirst(16);
//	
//	q.insertFirst(50);
//	System.out.println("front " +q.front());
//	//q.insertLast(1);
//	//q.insertLast(2);
//	//q.insertLast(3);
//	//q.insertLast(4);
//	//q.insertLast(5);
//	//q.insertLast(6);
//	//q.insertLast(7);
//	System.out.println("remove last=" + q.removeLast());
//	q.removeFirst();
//	q.removeFirst();
//	q.removeFirst();
//	q.removeFirst();
//	q.removeFirst();
//	q.removeFirst();
//	q.removeFirst();
//	q.removeFirst();
//	q.removeFirst();
//	q.removeFirst();
//	q.removeFirst();
//	
//	//q.removeFirst();
//	//q.insertLast(8);
//	
//	
//	q.printDeque();
//	System.out.println("size "+ q.size());
//	System.out.println("front " +q.front());
//	System.out.println("rear " + q.rear());
//	System.out.println("capacity " + q.capacity());
//	System.out.println("first=" + q.getFirst());
//	System.out.println("last=" + q.getLast());
	
//	q.insertFirst(120);
//	//1
//	System.out.println("size "+ q.size());
//	System.out.println("front " +q.front());
//	System.out.println("rear " + q.rear());
//	
//	q.insertFirst(15);
//	//2
//	System.out.println("size "+ q.size());
//	System.out.println("front " +q.front());
//	System.out.println("rear " + q.rear());
//	//System.out.println(q.size());
//	
//	q.insertFirst(155);
//	//3
//	System.out.println("size "+ q.size());
//	System.out.println("front " +q.front());
//	System.out.println("rear " + q.rear());
//	q.printDeque();
//
//
//	System.out.println("first=" + q.getFirst());
//	System.out.println("last=" + q.getLast());
//	
//	q.insertLast(401);
//	//4
//	System.out.println("size "+ q.size());
//	System.out.println("front " +q.front());
//	System.out.println("rear " + q.rear());
//	
//	
//	q.printDeque();
//	
//	q.insertLast(65);
//	//5
//	System.out.println("size "+ q.size());
//	System.out.println("front " +q.front());
//	System.out.println("rear " + q.rear());
//	
//	//System.out.println("size " +q.size());
//	
//	q.insertLast(37);
//	q.printDeque();
//	
//	//6
//	System.out.println("size" +q.size());
//	
//	q.insertFirst(150);
//	//7
//	System.out.println("size" +q.size());
//	q.insertLast(2);
//	//System.out.println("size" +q.size());
//	
//	System.out.println("front " +q.front());
//	System.out.println("rear " + q.rear());
//	//8
//	System.out.println("size" +q.size());
//	
//	q.printDeque();
//	System.out.println("first=" + q.getFirst());
//	System.out.println("last=" + q.getLast());
//	System.out.println("remove first=" + q.removeFirst());
//	q.printDeque();
//	System.out.println("remove last=" + q.removeLast());
//	System.out.println("remove last=" + q.removeLast());
//	q.printDeque();
//        System.out.println("remove first=" + q.removeFirst());
//        System.out.println("remove first=" + q.removeFirst());
//	// q is now empty.
//       
//        System.out.println("capacity " + q.capacity());
        
// 	int i, k;
//	for( i = 1; i <= 100; i ++ )
//	   q.insertLast(i);
//	   q.printDeque();  // 100 elements in q
//
//	for( i = 1; i <= 99; i++ ){
//	   k = q.removeFirst();
//	   q.printDeque();  // one element left
//	}
//	System.out.println("capacity " + q.capacity());
   }
}
