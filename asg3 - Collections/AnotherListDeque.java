/***********************************
* EECS2011 - Assignment 3
* File name: AnotherListDeque.java
* Author: Nguyen, Jeremy
* Email: jkvnguyen@hotmail.com
* CSE number: nguye688
************************************/


public class AnotherListDeque 
{

   protected DNode head, tail;  // head and tail contain actual data (int)

   protected int size;    // number of elements

   public AnotherListDeque()     // constructor: initialize an empty deque
   {
       head = tail = null;
       size = 0;
   }


    /**
     * Display the content of the deque
     *
     */
    public void printDeque( )
    {

	for ( DNode p = head; p != null; p = p.getNext() )
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
	    if(size <= 0){
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

    	return head.getElement();
    	
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

    	return tail.getElement();
             
    }


    /**
     * Inserts e at the beginning (as the first element) of the deque
     * 
     */
    public void insertFirst( int e )
    {
    	
    	if(isEmpty()){
    		   		
    		head = new DNode(e, null, tail);
    		tail = head;
    		tail.setPrev(head);
    		tail.setNext(null);
    		size++;
    		
    	} else {
    		
    		DNode first = new DNode(e, null, head);
    		head.setPrev(first);
    		
 
    		head = head.getPrev();
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
    	
    		head = new DNode(e, null, tail);
    		tail = head;
    		tail.setPrev(head);
    		tail.setNext(null);

    		size++;
    		
    	}  else {
    		//tail = new DNode();
    		DNode last = new DNode(e, tail, null);
    		
    		tail.setNext(last);
    		tail = last;
    		size++;
    	}
    }


    /**
     * Removes and returns the first element of the deque
     * 
     */
    public int removeFirst( ) throws EmptyDequeException
    {
    	int temp = getFirst();
    	
    	head = head.getNext();
    	head.setPrev(null);
    	size--;

    	return temp;	
    }


    /**
     * Removes and returns the last element of the deque
     * 
     */
    public int removeLast( ) throws EmptyDequeException
    {
    	int temp = getLast();
    	
    	
    	tail = tail.getPrev();
    	tail.setNext(null);
    	size--;

    	return temp; 
    }


} // end class