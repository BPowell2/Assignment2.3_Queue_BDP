/* THis is a implementation of a Queue using the generic linked list i made during cs 131
 * 
 * 9/29/22
 * @author Benjamin Powell
 * @version 1.0
 * @since 2022-10-08
 */
public class Queue<T>  {
	private int count;
	private LinearNode<T> head;
	private LinearNode<T> tail;
	
	/*
	 * This is just the default constructor 
	 */
	public Queue() {
		count = 0;
		head  = null;
		tail = null;
	
	}//end of Queue
	
	
	/*this is the method to enqueue a entry into the linked list
	 * @Param Entry to enqueue
	 * 
	 */
	public void enqueue (T Entry) {
		
		LinearNode<T>  newNode = new LinearNode<T>();
		
		newNode.setLinearData(Entry);

		if(isEmpty()) {
			head = newNode;
			tail = head;
		}//end of if statement
			else {
				if (count==1) {
					//head.setNextNode(newNode);
				}
					
				newNode.setNextNode(tail);
				
					tail = newNode;
		}//end of else
		System.out.println(Entry+" has arrived");
		count++;
	}//end of enqueue method
	//lastNode.setNextNode(newNode); remember this when it comes to making it a queue Ben 


	/* this is a method to test if the linked list is empty or not
	 * @return boolean
	 */
	public boolean isEmpty() { 

		return(head==null)&&(tail==null);

		  

		}// end of isEmpty Method 
	/*
	 * this is a method to return the front of the queue
	 * @return LinearNode
	 */
	public T getFront() {
		return head.getLinearData();
	/*
	 * this is a method to return the end of the queue
	 * @return LinearNode
	 */		 
	}//end of getFront
	public T getLast() {
		return tail.getLinearData();
			 
	}//end of getLast
	/*
	 * this is the method to dequeue the first node inside the linked and move everything to the left
	 */
	public void dequeue() {
		LinearNode<T> selected = tail;
		while (selected.getNext() != head) {
		
		    selected = selected.getNext();
		}
		head = selected;
		selected.setNextNode(null);
		count--;
		System.out.println("a customer has been served");
		
	}//end of dequeue
	
	/*
	 * this is the printer method that uses a while loop to print out of the data of each node 1 by 1
	 */
	public void Printer() {
		
		LinearNode<T> selected = tail;
		while(selected.getNext() != null) {
			System.out.println(selected.getLinearData());
			selected = selected.getNext();
		}//end of while
			
	System.out.println(selected.getLinearData());
	}//end of printer method

}//end of main
