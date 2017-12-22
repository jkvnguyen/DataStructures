/***********************************
* EECS2011 - Assignment 3
* File name: ArrayDeque.java
* Author: Nguyen, Jeremy
* Email: jkvnguyen@hotmail.com
* CSE number: nguye688
************************************/


public class ArrayDeque
{
   public static final int INIT_CAPACITY = 8;	// initial array capacity
   protected int capacity;  // current capacity of the array
   protected int front;     // index of the front element
   protected int rear;      // index of the rear element
   protected int[] A;	    // array deque

   public ArrayDeque( )      // constructor method
   {
      A = new int[ INIT_CAPACITY ];
      capacity = INIT_CAPACITY;
      front = rear = 0;
   }


    /**
     * Display the content of the deque
     * 
     */
    public void printDeque( )
    {
      for ( int i = front; i != rear; i = (i+1) % capacity )
	System.out.print( A[i] + " " );
      System.out.println();
    }


    /**
     * Display the content of the whole array
     *
     */
    public void printArray( )
    {
	for ( int i = 0; i < capacity; i++ )
	   System.out.print( A[i] + " " );
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
        // COMPLETE THIS METHOD

        // Hint: size can be computed from capacity, front and rear. 			
    
    		return ((rear-front) + (capacity)) % (capacity);

    }
    
    public int front(){
    	return front;
    }
    
    public int rear(){
    	return rear;
    }
    
    public int capacity(){
    	return capacity;
    }
    
    /**
     * Returns true if this collection is empty.
     * @return true if this collection is empty.
     */ 
    public boolean isEmpty( )
    {
    	return rear == front;
      
    }


    /**
     * Returns the first element of the deque
     * 
     */
    public int getFirst() throws EmptyDequeException
    {    
    	if(this.isEmpty()){
    		throw new EmptyDequeException("Empty Deque");
    	}
      return A[front % capacity];
    }


    /**
     * Returns the last element of the deque
     * 
     */
    public int getLast( ) throws EmptyDequeException
    {
    	if(this.isEmpty()){
    		throw new EmptyDequeException("Empty Deque");
    	}

      return A[(rear-1 + capacity) % capacity];
      
    }


    /**
     * Inserts e at the beginning (as the first element) of the deque
     * 
     */
    public void insertFirst( int e )
    {	
  	
    	if(this.size() == (capacity - 1)){
    		int rearCount = 1;
    		capacity = capacity * 2;
    		int[] tempArray = new int[capacity];
    		for(int i = front; i != rear; i = (i+1) % (capacity/2)){
    			tempArray[rearCount++] = A[i];
    		}
    		A = tempArray;
    		front = 0;
    		rear = rearCount;
    		A[front] = e;
    		
    	} else {
    		front = (front - 1 + capacity) % capacity;	
    		A[front] = e;
    	}
	
    }


    /**
     * Inserts e at the end (as the last element) of the deque
     * 
     */
    public void insertLast( int e )
    {
    	if(this.size() == capacity-1){
    		int rearCount = 0;
    		capacity = capacity * 2;
    		int[] tempArray = new int[capacity];
    		for(int i = front; i != rear; i = (i+1) % (capacity/2)){
    			tempArray[rearCount++] = A[i];
    		}
    		A = tempArray;
    		front = 0;
    		rear = rearCount;
    		A[rear] = e;
    		rear = (rear + 1) % capacity;
    		
    	}  else {
    		A[rear] = e;
        	rear = (rear + 1) % capacity;
    	}
    	
  
    }


    /**
     * Removes and returns the first element of the deque
     * 
     */
    public int removeFirst( ) throws EmptyDequeException
    {
    	
    	if(this.isEmpty()){
    		throw new EmptyDequeException("Empty Deque");
    	}
    	
    	if(this.size() <= (capacity/4) && INIT_CAPACITY != capacity){
    		int rearCount = 0;
    		int test = capacity;
    		test = (test / 2);
    		int[] tempArray = new int[test];
    		for(int i = front % capacity; i != rear; i = (i+1) % capacity){
    			tempArray[rearCount++] = A[i];
    		}
    		A = tempArray;
    		front = 0;
    		rear = rearCount;
    		capacity = test;
    	}
    	
    	int temp = getFirst();
    	A[front % capacity] = 0;
    	front = (front + 1) % capacity;
    	
    	
    	return temp;
    }
    
   

    /**
     * Removes and returns the last element of the deque
     * 
     */
    public int removeLast( ) throws EmptyDequeException
    {
	
    	if(this.isEmpty()){
    		throw new EmptyDequeException("Empty Deque");
    	}
    	
    	
    	int temp = getLast();
    	A[(rear - 1 + capacity) % capacity] = 0;
    	rear = (rear - 1 + capacity) % capacity;
    	
    	if(this.size() <= (capacity/4) && INIT_CAPACITY != capacity){
    		int rearCount = 0;
    		capacity = (capacity / 2);
    		int[] tempArray = new int[capacity];
    		for(int i = front % capacity; i != rear; i = (i+1) % capacity){
    			tempArray[rearCount++] = A[i];
    		}
    		A = tempArray;
    		front = 0;
    		rear = rearCount;
    	}
    	
    	return temp;
    }

}  // end class
