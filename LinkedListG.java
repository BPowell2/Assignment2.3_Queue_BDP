//Benjamin Powell 9/19/22 last updated since cs131
public class LinkedListG<T> { 

  

protected int count;// varible for keeping track of how many elements are in the list 

  

protected LinearNode<T> head, tail; // node for head and tail of the list 

 /**
  * the constructor setting up the linked list  
  */

public LinkedListG() { 

  

 count = 0; 

  

head = null; 

  

tail = head; 

  

}// constructor 

  /**
   * this is a method to check if it is empty 
   * @return boolean
   */

public boolean isEmpty() { 

  

if (head == null) { 

  

return true; 

  

} // end of if statement 

  

else 

  

return false; 

  

}// end of isEmpty Method 

  

public LinearNode<T> getList() { 

  

return head; 

  

}// end of get list method 

/**
 *this is used to add a node 
 * @param aNode
 */

public void addNode(LinearNode<T> aNode) { 

  

if (isEmpty()) { 

  

head = aNode; 

  

tail = head; 

  

return; 

  

} // end of if statement 

  

tail.nextLinearNode = aNode; 

  

tail = tail.getNext(); 

  

tail.nextLinearNode = null; 

  

count++; 

  

}// end of addNode method 

  

} 

  

// end of class 
