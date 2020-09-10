package linearRepeat;

import java.util.concurrent.CountDownLatch;


public class MyDynamicStack implements IMyStack {
	
	private MyNode head;
	private MyNode tail;
	private int numItems;
	//private boolean isTail=false;
	
	public MyDynamicStack()
	{
		// to be completed
		this.head=null;
		this.tail=null;
		this.numItems=numItems;
		//this.isTail=isTail;
	}
	
	public void pushTop(IMyStackElement element) 
	{
		// to be completed
		
		//creating new node and allocating data
		MyNode newNode = new MyNode(element, null);
		
		//assigning the old head as the next node of the new head
		newNode.setNext(head);
		
		//assigning the new head as the actual head
		head=newNode;		
		
	}

	public void pushBottom(IMyStackElement element) 
	{
		// to be completed
		
		//creating new nodes
		//assigning what will be the last node in our list to the head so we can use a known node to iterate to the end
		MyNode lastNode = head;
		//creating the new node to be inserted at the bottom
		MyNode newNode = new MyNode(element,null);
		
		//if the head is null we simply assign the new node to be the head
		if (head==null) {
			head = newNode;
			return;
		}
		//getting the last node in our linked list of nodes
		while(lastNode.getNext()!=null) {
			lastNode=lastNode.getNext();
		}
		//setting the new node to come after the previous tail
		lastNode.setNext(newNode);
		//reassigning the tail to be the last node which has since changed
		tail=newNode;
		return;
		
	}

	public IMyStackElement popTop() 
	{
		// to be completed 
		//setting the new head to be the node that is after the first head
		MyNode newHead = head.getNext();
		//reassigning the new head
		head=newHead;
		
		return null;
	}

	public IMyStackElement popBottom() 
	{
		// to be completed
		MyNode newTail = head;
		//finding the second last node
		while(newTail.getNext()!=tail) {
			newTail=newTail.getNext();
		}
		//assigning the second last node to be the tail
		tail=newTail;
		//assigning the next to be null so as to remove the link 
		tail.setNext(null);
		
		return null;
	}

	public IMyStackElement peekTop(int number) {
		// to be completed
		
		int index=number;
		//initialising the node that is to be printed to reference the head so that we can iterate to find our desired node
		MyNode nodeToPrint=head;
		
		//finding our node we would like to print by using the given number
		for(int j=0;j<index;j++) {
			nodeToPrint=nodeToPrint.getNext();			
		}
		//if the list is empty we simply return null
		if(head==null) {
			return null;
		}
		else {
			System.out.println(nodeToPrint.getValue());
		}
		return null;
	}

	public IMyStackElement peekBottom(int number) 
	{
		// to be completed
		int index=number;
		
		//initialising the node that is to be printed to reference the head so that we can iterate to find our desired node
		MyNode nodeToPrint=head;
		
		//finding our node we would like to print by using the given number
		for(int j=0;j<index;j++) {
			nodeToPrint=nodeToPrint.getNext();			
		}
		//if the list is empty we simply return null
		if(head==null) {
			return null;
		}
		else {
			System.out.println(nodeToPrint.getValue());
		}
		return null;
	}
	
	public int size() {
		// to be completed
		if (head==null && tail==null) {
			return 0;
		}
		
		MyNode countNode = head;
		//setting it to 1 as if head is not null then we already have 1 node
		int numOfNodes=1;
		
		//iterating through the nodes until we find a null ".next" reference to find how many there are
		while (countNode.getNext()!=null) {
			countNode=countNode.getNext();
			numOfNodes++;			
		}
		return numOfNodes;
	}

	public boolean isEmpty() {
		// to be completed
		
		//if both the head and tail are empty then we do have an empty list
		if(head==null && tail==null) {
			return true;
		}
		else {
			//if the head is at least not null then we return false as it is not empty
			return false;
		}		
	}

	public void print() {
		// to be completed
		
		//in the chance that there are no nodes we return "0 nodes"
		if(head==null&&tail==null) {
			System.out.println("0 Nodes");
		}
		MyNode nodeToPrint = head;
		//if the head isnt null we have at least 1 node so we set the counter to 1
		int counter=1;
		
		while(nodeToPrint.getNext()!=null) {
			System.out.println(nodeToPrint.getValue() + "value at position " + counter + "\n");
			nodeToPrint=nodeToPrint.getNext();
			counter++;
		}
	}
	
	public int getValue()
	{
		// to be completed
		
		MyNode runnerNode = head;
		int numOfNodes=1;
		
		if(head==null&&tail==null) {
			return 0;
		}
		
		while(runnerNode.getNext()!=null) {	
			numOfNodes++;
			runnerNode=runnerNode.getNext();
		}
		return numOfNodes;
		
	}
}
