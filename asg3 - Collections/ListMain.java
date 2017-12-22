/***********************************
* EECS2011 - Assignment 3
* File name: ListMain.java
* Author: U. T. Nguyen 
************************************/

public class ListMain {

    public static void main(String[] args) {
	ListDeque q = new ListDeque();
//	//System.out.println(q.isEmpty());
//	q.insertFirst(120);
//	//q.removeLast();
//	//System.out.println(q.trailer.getPrev().getElement());
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
	q.insertFirst(1);
	q.insertFirst(2);
	q.insertLast(3);
	q.insertLast(4);
	q.removeLast();
	q.removeFirst();
	q.printDeque();
    }
}