/***********************************
* EECS2011 - Assignment 3
* File name: AnotherListMain.java
* Author: U. T. Nguyen 
************************************/

public class AnotherListMain {

    public static void main(String[] args) {
	AnotherListDeque q = new AnotherListDeque();
	q.insertLast(1);
	q.insertLast(2);
	q.insertLast(3);
	q.insertFirst(10);
//	q.insertFirst(20);
//	q.insertFirst(30);
//	q.removeFirst();
//	q.removeFirst();
	q.printDeque();
	
	q.removeFirst();
	q.removeFirst();
	q.printDeque();
//	System.out.println("size "+q.size());
//	q.insertFirst(120);
//	q.insertFirst(15);
//	q.printDeque();
//	System.out.println("first=" + q.getFirst());
//	System.out.println("last=" + q.getLast());
//	q.insertLast(401);
//	q.printDeque();
//	q.insertLast(65);
//	q.insertLast(37);
//	q.printDeque();
//	System.out.println("first=" + q.getFirst());
//	System.out.println("last=" + q.getLast());
//	System.out.println("remove first=" + q.removeFirst());
//	q.printDeque();
//	System.out.println("remove last=" + q.removeLast());
//	System.out.println("remove last=" + q.removeLast());
//	q.printDeque();
    }
}