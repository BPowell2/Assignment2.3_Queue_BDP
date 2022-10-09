//Benjamin Powell 9/19/22 last updated from cs 131
public class LinearNode<T> { 

public LinearNode<T> nextLinearNode; // Pointer to the next node will be used in linkedlist 

public T LinearData; // this object stores the data 
/*
 * this is the constructor for the nodes
 */

 public LinearNode() { 

nextLinearNode = null; 

LinearData = null; 

}// end of constructor for linear node storing 



public LinearNode(T data) { 

nextLinearNode = null; 

LinearData = data; 

} 

 /* 
  * this method is used to find the next node in the linked list 
  */

public LinearNode<T> getNext() { 

return nextLinearNode; 

}// end of getData 

  
/*
 * this is the getter for the data inside the node
 */
public T getLinearData() { 

return LinearData; 

}// end of getLinearData 

  
/*
 * this is the method to set the data inside the node
 */
public void setLinearData(T data) { 

LinearData = data; 

nextLinearNode = null; 

}


public void setNextNode(LinearNode<T> nextLinearNode) {
	this.nextLinearNode = nextLinearNode;
}





  

} 
