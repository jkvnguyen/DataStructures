/***********************************
* EECS2011 - Assignment 4
* File name: AVLTree.java
* Author: Nguyen, Jeremy
* Email: jkvnguyen@hotmail.com
* CSE number: nguye688
************************************/


/**  Implementation of an AVL tree. */
public class AVLTree extends BinarySearchTree implements Dictionary {

  public AVLTree(Comparator c)  { super(c); }

  public AVLTree() { super(); }

  /** Nested class for the nodes of an AVL tree. */ 
  protected static class AVLNode extends BTNode {

    protected int height;  // we add a height field to a BTNode

    /** Preferred constructor */
    AVLNode(Object element, BTPosition parent,
	    BTPosition left, BTPosition right) {
      super(element, parent, left, right);
      height = 0;
      if (left != null) 
        height = Math.max(height, 1 + ((AVLNode) left).getHeight());
      if (right != null) 
        height = Math.max(height, 1 + ((AVLNode) right).getHeight());
    } // we assume that the parent will revise its height if needed

    public void setHeight(int h) { height = h; }

    public int getHeight() { return height; }
  }


  /**
    * Print the content of the tree root.
    */
  public void printRoot() {
     System.out.println("printRoot: " + value(left(root())).toString() + " "
        +  value(root()).toString() + " " + value(right(root())).toString());
  }


  /**
    * Print the the tree using preorder traversal.
    */
  public void preorderPrint(Position v) {
      if (isInternal(v))
         System.out.print( value(v).toString() + " " );
      if (hasLeft(v)) preorderPrint(left(v));
      if (hasRight(v)) preorderPrint(right(v));
  }


  /** Creates a new binary search tree node (overrides super's version). */
  protected BTPosition createNode(Object element, BTPosition parent,
              BTPosition left, BTPosition right) {
    return new AVLNode(element,parent,left,right);  // now use AVL nodes
  }


  /** Returns the height of a node (call back to an AVLNode). */
  protected int height(Position p)  {
    return ((AVLNode) p).getHeight();
  }


  /** Sets the height of an internal node (call back to an AVLNode). */
  protected void setHeight(Position p)  { // called only if p is internal
    ((AVLNode) p).setHeight(1+Math.max(height(left(p)), height(right(p))));
  }


  /** Returns whether a node has balance factor between -1 and 1. */
  protected boolean isBalanced(Position p)  {
    int bf = height(left(p)) - height(right(p));
    return ((-1 <= bf) &&  (bf <= 1));
  }


  /** Returns a child of p with height no smaller than that of the other child 
    */
  protected Position tallerChild(Position p)  {
    if (height(left(p)) > height(right(p))) return left(p);
    else if (height(left(p)) < height(right(p))) return right(p);
    // equal height children - break tie using parent's type
    if (isRoot(p)) return left(p);
    if (p == left(parent(p))) return left(p);
    else return right(p);
  }


  /**
    * Insert a new element into the AVL tree.
    */
  public Entry insert(Object k, Object v) throws InvalidKeyException  {
    Entry toReturn = super.insert(k, v); // calls our new createNode method from BinarySearchTree
    rebalance(actionPos); // rebalance up from the insertion position
    return toReturn;
  }


  /**
    * Remove an element from the AVL tree.
    */
  public Entry remove(Entry ent) throws InvalidEntryException {
    Entry toReturn = super.remove(ent);
    if (toReturn != null)   // we actually removed something
      rebalance(actionPos);  // rebalance up the tree
    return toReturn;
  }


  /**  
    * Rebalance method called by insert and remove.  Traverses the path from 
    * zPos to the root. For each node encountered, we recompute its height 
    * and perform a trinode restructuring if it's unbalanced.
    */
  protected void rebalance(Position zPos) {
    if(isInternal(zPos))
       setHeight(zPos);
    while (!isRoot(zPos)) {  // traverse up the tree towards the root
      zPos = parent(zPos);
      setHeight(zPos);
      if (!isBalanced(zPos)) { 
	// Perform a trinode restructuring starting from zPos's tallest grandchild
        Position xPos =  tallerChild(tallerChild(zPos));
        zPos = restructure(xPos); // tri-node restructure 
        setHeight(left(zPos));  // recompute heights
        setHeight(right(zPos));
        setHeight(zPos);
      }
    }
  } 





   // ***************************************
   // DO NOT MODIFY THE CODE ABOVE THIS LINE.
   // ADD YOUR CODE BELOW THIS LINE.
   //
   // ***************************************


  /** 
   * Perform a trinode restructuring starting from x, z's tallest grandchild.
   * Input: xPos, position of (pointer to) x
   * Output: position of (pointer to) the new root of the subtree that was restructured.
   */
  protected Position restructure( Position xPos ) {

	// COMPLETE THIS METHOD


		//a = z, b = y, x = c

		AVLNode x = (AVLNode) xPos;
		AVLNode y = (AVLNode) parent(x);
		AVLNode z = (AVLNode) parent(y);
		
		AVLNode zParent;
		
		if(x == right(y) && y == right(z)){
			
			AVLNode T1 = (AVLNode)left(z);
			AVLNode T2 = (AVLNode)left(y);
			AVLNode T3 = (AVLNode)left(x);
			AVLNode T4 = (AVLNode)right(x);
			
			//stops at z
			if(isRoot(z)){
				root = y;
			} else {
				zParent = (AVLNode) parent(z);
				
				if((int)key(zParent) < (int)key(x)){
					zParent.setRight(y);
				} else {
					zParent.setLeft(y);
				}
			
				
				y.setParent(zParent);
			}
			
			//set z to y
			y.setLeft(z);
			z.setParent(y);
			
			//set x to y
			y.setRight(x);
			x.setParent(y);
			
			z.setLeft(T1);
			T1.setParent(z);
			
			z.setRight(T2);
			T2.setParent(z);

			x.setLeft(T3);
			T3.setParent(x);
			
			x.setRight(T4);
			T4.setParent(x);
			
		} else if(x == left(y) && y == left(z)){
			
			AVLNode T1 = (AVLNode)left(x);
			AVLNode T2 = (AVLNode)right(x);
			AVLNode T3 = (AVLNode)right(y);
			AVLNode T4 = (AVLNode)right(z);
			
			if(isRoot(z)){
				root = y;
			} else {
				zParent = (AVLNode) parent(z);
				
				if((int)key(zParent) < (int)key(x)){
					zParent.setRight(y);
				} else {
					zParent.setLeft(y);
				}
			
				y.setParent(zParent);
			}
			
			x.setLeft(T1);
			T1.setParent(x);
			
			x.setRight(T2);
			T2.setParent(x);
			
			y.setLeft(x);
			x.setParent(y);
			
			y.setRight(z);
			z.setParent(y);
			
			z.setLeft(T3);
			T3.setParent(z);
			
			z.setRight(T4);
			T4.setParent(z);
					
		} else if (x == left(y) && y == right(z)){
			
			//stops at z
			if(isRoot(z)){
				root = x;
			} else {
				zParent = (AVLNode) parent(z);
				
				if((int)key(zParent) < (int)key(x)){
					zParent.setRight(x);
				} else {
					zParent.setLeft(x);
				}
				
				x.setParent(zParent);
			}
			
			AVLNode T1 = (AVLNode)left(z);
			AVLNode T2 = (AVLNode)left(x);
			AVLNode T3 = (AVLNode)right(x);
			AVLNode T4 = (AVLNode)right(y);
			
			z.setLeft(T1);
			T1.setParent(z);
			
			z.setRight(T2);
			T2.setParent(z);
			
			x.setLeft(z);
			z.setParent(x);
			
			x.setRight(y);
			y.setParent(x);
			
			y.setLeft(T3);
			T3.setParent(y);
			
			y.setRight(T4);
			T4.setParent(y);
			
			return x;
			
		} else if (x == right(y) && y == left(z)){
			
			if(isRoot(z)){
				root = x;
			} else {
				zParent = (AVLNode) parent(z);
				
				if((int)key(zParent) < (int)key(x)){
					zParent.setRight(x);
				} else {
					zParent.setLeft(x);
				}
				
				x.setParent(zParent);
			}
			
			AVLNode T1 = (AVLNode)left(y);
			AVLNode T2 = (AVLNode)left(x);
			AVLNode T3 = (AVLNode)right(x);
			AVLNode T4 = (AVLNode)right(z);
			
			y.setLeft(T1);
			T1.setParent(y);
			
			y.setRight(T2);
			T2.setParent(y);
			
			x.setLeft(y);
			y.setParent(x);
			
			x.setRight(z);
			z.setParent(x);
			
			z.setLeft(T3);
			T3.setParent(z);
			
			z.setRight(T4);
			T4.setParent(z);
			
			return x;
		}

		return y;
  } // restructure
  
} // end AVLTree class