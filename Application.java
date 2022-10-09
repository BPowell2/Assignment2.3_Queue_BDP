/* This is the main method using the newly implemented queue and generic linked list from 131 
 * 9/29/22
 * @author Benjamin Powell
 * @version 1.0
 * @since 2022-10-08
 */
public class Application {
	public static void main(String[]args) {
		
		Queue<String> firstQueue = new Queue<String>(); 
		
		
		firstQueue.enqueue("Bill");
		firstQueue.Printer();
		firstQueue.enqueue("Alice");
		firstQueue.Printer();
		firstQueue.enqueue("Bob");
		firstQueue.Printer();
		firstQueue.dequeue();
		firstQueue.enqueue("Jane");
		firstQueue.Printer();
		firstQueue.enqueue("Hamad");
		firstQueue.Printer();
		firstQueue.dequeue();
		firstQueue.dequeue();
		firstQueue.Printer();
		firstQueue.enqueue("Jim");
		firstQueue.Printer();
		firstQueue.dequeue();
		firstQueue.Printer();
		firstQueue.dequeue();
		firstQueue.Printer();
		
		
	

		
	}//end of main

}//end of Application class
