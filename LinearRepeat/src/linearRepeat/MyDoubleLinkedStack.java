package linearRepeat;


public class MyDoubleLinkedStack implements IMyStack {
	
	private MyDoubleLinkedNode head;
	private MyDoubleLinkedNode tail;
	
	public MyDoubleLinkedStack()
	{
		// to be completed
		this.head=null;
		this.tail=null;
	}
	
	public void pushTop(IMyStackElement element) 
	{
		// to be completed
		
		//creating our new node
		MyDoubleLinkedNode newNode = new MyDoubleLinkedNode(element, null, null);
		
		//assigning the next node to be the head to "push" it at the top
		newNode.setNext(head);
		
		if(head != null) {
			head.setPrevious(newNode);			
		}
		
		head = newNode;
		
	}

	public void pushBottom(IMyStackElement element) 
	{
		// to be completed
		MyDoubleLinkedNode lastNode = head;
		MyDoubleLinkedNode newNode = new MyDoubleLinkedNode(element, null, null);
		
		if(head==null) {
			head = newNode;
			return;
		}
		//finding the last node in the list
		while(lastNode.getNext()!=null) {
			lastNode=lastNode.getNext();
		}
		//setting the next node to be the newNode pushed at the bottom
		lastNode.setNext(newNode);
		//assigning the last node to be the tail
		tail=newNode;
		//setting the previous of the tail to be the previously last node
		tail.setPrevious(lastNode);
		
	}

	public IMyStackElement popTop() 
	{
		// to be completed
		
		//creating the new head
		MyDoubleLinkedNode newHead = head.getNext();
		
		//setting the node after head to be the new node
		head=newHead;
		head.setPrevious(null);
		
		return null;
	}

	public IMyStackElement popBottom() 
	{
		// to be completed
		
		MyDoubleLinkedNode newTail = head;
		
		//finding the node before the tail as this will be our new tail
		while(newTail.getNext()!=tail) {
			newTail=newTail.getNext();
		}
		
		tail=newTail;
		
		//removing reference to the old tail as the next node for the new tail
		tail.setNext(null);
		
		return null;
	}	

	public IMyStackElement peekTop(int number) {
		// to be completed
		
		int index=number;
		//initialising the node that is to be printed to reference the head so that we can iterate to find our desired node
		MyDoubleLinkedNode nodeToPrint=head;
		
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
		MyDoubleLinkedNode nodeToPrint=head;
		
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
		if (head==null&&tail==null) {
			return 0;
		}
		
		MyDoubleLinkedNode countNode = head;
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
		MyDoubleLinkedNode nodeToPrint = head;
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
		
		MyDoubleLinkedNode runnerNode = head;
		int numOfNodes=1;
		
		if(head==null&&tail==null) {
			return 0;
		}
		
		while(runnerNode.getNext()!=null) {	
			numOfNodes++;
			runnerNode=runnerNode.getNext();
		}
		return numOfNodes;
		 
		/*To facilitate	sorting a criterion needs to be chosen. Implement the method int getValue() to return
		the value to be used as sorting criterion as the number of elements currently contained in the stack.*/
		
	}
}
