/***********************************
* EECS2011 - Assignment 3
* File name: ListDeque.java
* Author: Nguyen, Jeremy
* Email: jkvnguyen@hotmail.com
* CSE number: nguye688
************************************/


public class ListDeque 
{

   protected DNode header, trailer;  // dummy nodes

   protected int size;    // number of elements

   public ListDeque()     // constructor: initialize an empty deque
   {
      header = new DNode( 0, null, null );
      trailer = new DNode( 0, null, null );
      header.setNext(trailer);  // make header point to trailer
      trailer.setPrev(header);  // make trailer point to header
      size = 0;
   }


    /**
     * Display the content of the deque
     *
     */
    public void printDeque( )
    {
	for ( DNode p = header.getNext(); p != trailer; p = p.getNext() )
	    System.out.print( p.getElement() + " " );
	System.out.println();
    }



   // ***************************************
   // DO NOT MODIFY THE CODE ABOVE THIS LINE.
   // ADD YOUR CODE BELOW THIS LINE.
   //
   // ***************************************

   /**
     * Returns the number of items in this collection.
     * @return the number of items in this collection.
     */
    public int size( )
    {

      return size;   
      
    }


    /**
     * Returns true if this collection is empty.
     * @return true if this collection is empty.
     */ 
    public boolean isEmpty( )
    {
    	
    	if(size() <= 0){
    		return true;
    	} else {
    		return false;
    	}
    	
    }


    /**
     * Returns the first element of the deque
     * 
     */
    public int getFirst( ) throws EmptyDequeException
    {
    	
    	if(isEmpty()){
    		throw new EmptyDequeException("Empty Deque");
    	}

    	return header.getNext().getElement();
    }


    /**
     * Returns the last element of the deque
     * 
     */
    public int getLast( ) throws EmptyDequeException
    {
    	
    	if(isEmpty()){
    		throw new EmptyDequeException("Empty Deque");
    	}

    	return trailer.getPrev().getElement();     
    }


    /**
     * Inserts e at the beginning (as the first element) of the deque
     * 
     */
    public void insertFirst( int e )
    {
    	
    	if(isEmpty()){
    		DNode first = new DNode(e, header, trailer);
    		header.setNext(first);
    		trailer.setPrev(first);
    		size++;
    	} else {
    		DNode first = new DNode(e, header, header.getNext());
    		header.setNext(first);
    		header.getNext().setPrev(first);
    		size++;
    	}
    	
    }


    /**
     * Inserts e at the end (as the last element) of the deque
     * 
     */
    public void insertLast( int e )
    {
    	
    	if(isEmpty()){
    		DNode last = new DNode(e, header, trailer);
    		header.setNext(last);
    		trailer.setPrev(last);
    		size++;
    	} else {
    		DNode last = new DNode(e, trailer.getPrev(), trailer);
    		trailer.getPrev().setNext(last);
    		trailer.setPrev(last);
    		size++;
    	}
    	
    }


    /**
     * Removes and returns the first element of the deque
     * 
     */
    public int removeFirst( ) throws EmptyDequeException
    {
    	
    	if(isEmpty()){
    		throw new EmptyDequeException("Empty Deque");
    	}
    	
    	int temp = header.getNext().getElement();
    	header.setNext(header.getNext().getNext());
    	header.getNext().setPrev(header);
    	size--;
    	
    	return temp;
    	
    }


    /**
     * Removes and returns the last element of the deque
     * 
     */
    public int removeLast( ) throws EmptyDequeException
    {
    	
    	if(isEmpty()){
    		throw new EmptyDequeException("Empty Deque");
    	}
    	
    	int temp = trailer.getPrev().getElement();
    	trailer.setPrev(trailer.getPrev().getPrev());
    	trailer.getPrev().setNext(trailer);
    	size--;
    	
    	return temp;
      
    }


} // end class
