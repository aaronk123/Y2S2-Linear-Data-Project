package linearRepeat;

import java.util.Arrays;

public class MyStaticStack implements IMyStack {
	
	protected static final int INITIAL_CAPACITY = 4;
	
	private IMyStackElement items[];
	private int stackSize;
	private int numItems;	
	private int size;
	
	public MyStaticStack()
	{
		// to be completed
		this.stackSize = INITIAL_CAPACITY;
		this.items = new IMyStackElement[stackSize];
		this.numItems=0;
		this.size=0;
	}
	
	public void pushTop(IMyStackElement element) 
	{
		
		items[this.size]=element;
		size++;
		// to be completed	
		
		 if(size==items.length) {
			 int newLen = 2*items.length;
				IMyStackElement[] arr = new IMyStackElement[stackSize*2];
				
				System.arraycopy(items, 0, arr, 0, items.length);
				items=arr;
				stackSize*=2;
		 
        }       
	}	

	public void pushBottom(IMyStackElement element) 
	{
		// to be completed
		items[items.length-1]=element;
		size++;
		// to be completed	
		
		 if(size==items.length) {
			 int newLen = 2*items.length;
				IMyStackElement[] arr = new IMyStackElement[stackSize*2];
				
				System.arraycopy(items, 0, arr, 0, items.length);
				items=arr;
				stackSize*=2;
		 
        }
		
	}

	public IMyStackElement popTop()  
	{
		// to be completed
		if (size==0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		//new array for the popped elements to be copied to from the items array
		IMyStackElement[] tempArr = new IMyStackElement[items.length-1];
			
		for(int i=0; i<items.length;i++) {
			//copying everything over except from the "popped" element
			tempArr[i]=items[i+1];
		}
		//assigning elements back to items
		this.items=tempArr;	
		size--;
		
		return null;
		
	}

	public IMyStackElement popBottom() 
	{
		// to be completed
		if (size==0) {
			throw new ArrayIndexOutOfBoundsException();
		}		
		//new array for the popped elements to be copied to from the items array
		IMyStackElement[] tempArr = new IMyStackElement[items.length-1];
		
		//using <items.length-1 so that we do not run the loop to capture the last element rather the 2nd last
		for(int i=0; i<items.length-1;i++) {
			//copying everything over except from the "popped" element
			tempArr[i]=items[i];
		}
		//assigning elements back to items
		this.items=tempArr;
		size--;
		
		return null;
	}

	public IMyStackElement peekTop(int number) {
		// to be completed
		//if there are no elements in the array
		if (size==0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		//if the index is null
		if(items[number]==null) {
			return null;
		}
		//grabbing the element to be peeked
		IMyStackElement peekedElement = items[number-1];		
		return peekedElement;
				
	}

	public IMyStackElement peekBottom(int number) 
	{
		// to be completed
		
		//if there are no elements in the array
		if (size==0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		//if the index is null
		if(items[number]==null) {
			return null;
		}
		//grabbing the element to be peeked
		IMyStackElement peekedElement = items[number-1];		
		return peekedElement;
		
	}
	
	public int size() {
		// to be completed
		
		//returning the size variable as we have been keeping track of it all along
		return size;
	}

	public boolean isEmpty() {
		// to be completed
		
		//value to iterate by 1 everytime an index is not null
		int isNotNull=0;
		
		//for loop to check every index
		for(int i=0;i<items.length;i++) {
			//iterating isNotNull when a non null index is found
			if (items[i]!=null) {
				isNotNull++;
			}
		}
		//if notNotNull is at least of value 1 the array is not empty therefore we return false
		if(isNotNull>0) {
			return false;
		}
		
		return true;
	}

	public void print() {
		// to be completed		
		
		System.out.println("printing elements\n");
		
		for(int i=0;i<items.length;i++){
			//printing the items at the index as we iterate through the array
			System.out.println(items[i].getValue()+ "\n");
		}
	}
	
	public int getValue()
	{
		// to be completed	
		
		//if there are no elements in the array we simply return 0
		if(size==0) {
			return 0;
		}
		//otherwise we return the size variable we have been using to keep track of the number of elements all along
		else {
			return size;
		}
			
	}
}
