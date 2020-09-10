package linearRepeat;


public class MyAlgorithms {
	
	public static void sortStacksInStack(IMyStack stackOfStacks)
	{
		for (int i=0; i<stackOfStacks.size(); i++)
		{
			IMyStack stack = (IMyStack)stackOfStacks.peekTop(i);			
			quickSort(stack);
		}
	}
		
	public static void quickSort(IMyStack stack)
	{
		// to be completed
		int stackElemArr[];
		
		//if statements to determine the type of stack so that relative sorting operations can be carried out
		
		//Static stack
		if(stack instanceof MyStaticStack) {
			
			//acquiring the length of the stack so that we can use this to create a new array to sort
			int arrSize=stack.getValue();
			
			//creating the array for the elements to be stored in
			int newArr[] = new int[arrSize];
			
			for (int i = 0; i < arrSize; i++) {
				int elem = stack.peekTop(i).getValue();
				newArr[i]=elem;
			}
			stackElemArr=newArr;
			qSort(stackElemArr, 0, stackElemArr.length-1);
			
		}
		
		//Dynamic stack with singley linked nodes
		if(stack instanceof MyDynamicStack) {
			
			//acquiring the length of the stack so that we can use this to create a new array to sort
			int arrSize=stack.getValue();
			
			//creating the array for the elements to be stored in
			int newArr[] = new int[arrSize];
			
			for (int i = 0; i < arrSize; i++) {
				int elem = stack.peekTop(i).getValue();
				newArr[i]=elem;
			}
			stackElemArr=newArr;
			qSort(stackElemArr, 0, stackElemArr.length-1);
			
		}
		
		//Dynamic stack with doubley linked nodes
		if (stack instanceof MyDoubleLinkedStack) {
			
			//acquiring the length of the stack so that we can use this to create a new array to sort
			int arrSize=stack.getValue();
			
			//creating the array for the elements to be stored in
			int newArr[] = new int[arrSize];
			
			for (int i = 0; i < arrSize; i++) {
				int elem = stack.peekTop(i).getValue();
				newArr[i]=elem;
			}
			stackElemArr=newArr;
			qSort(stackElemArr, 0, stackElemArr.length-1);
			
		}	
		
    }
	
	public static void qSort(int[] arr, int start, int end){
		 
        int partition = partition(arr, start, end);
 
        if(partition-1>start) {
            qSort(arr, start, partition - 1);
        }
        if(partition+1<end) {
            qSort(arr, partition + 1, end);
        }
    }
 
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
 
        for(int i=start; i<end; i++){
            if(arr[i]<pivot){
                int temp= arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
            }
        }
 
        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;
 
        return start;
		/*Implement the quick-sort algorithm inside the method void quickSort(IMyStack stack) to
		sort the elements within the stack passed as input parameter. Remember, that each
		element in the stack implements the interface IMyStackElement which contains the
		method int getValue(). Use the value returned by this function as sorting criterion.*/
	}	
	
	
	public static void bubbleSort(IMyStack stack)
	{
		
		 /* This code is commented out as with it it caused a null pointer exception
		  
		  
		// to be completed
		
		//Static stack
		int stackElemArr[];
		if(stack instanceof MyStaticStack) {
					
		//acquiring the length of the stack so that we can use this to create a new array to sort
		int arrSize=stack.getValue();
					
		//creating the array for the elements to be stored in
		int newArr[] = new int[arrSize];
					
		for (int i = 0; i < arrSize; i++) {
			int elem = stack.peekTop(i).getValue();
				newArr[i]=elem;
			}
			stackElemArr=newArr;
			bSort(stackElemArr, stackElemArr.length);
			
		}
		
		//Dynamic stack with singley linked nodes
		if(stack instanceof MyDynamicStack) {
			
			//acquiring the length of the stack so that we can use this to create a new array to sort
			int arrSize=stack.getValue();
			
			//creating the array for the elements to be stored in
			int newArr[] = new int[arrSize];
			
			for (int i = 0; i < arrSize; i++) {
				int elem = stack.peekTop(i).getValue();
				newArr[i]=elem;
			}
			stackElemArr=newArr;
			bSort(stackElemArr, stackElemArr.length);
			
		}
		
		//Dynamic stack with doubley linked nodes
		if (stack instanceof MyDoubleLinkedStack) {
			
			//acquiring the length of the stack so that we can use this to create a new array to sort
			int arrSize=stack.getValue();
			
			//creating the array for the elements to be stored in
			int newArr[] = new int[arrSize];
			
			for (int i = 0; i < arrSize; i++) {
				int elem = stack.peekTop(i).getValue();
				newArr[i]=elem;
			}
			stackElemArr=newArr;
			bSort(stackElemArr, stackElemArr.length);
			
		}*/
	}
	
	public static void bSort(int arr[], int n) 
    { 
        int i, j, temp; 
        boolean swapped; 
        for (i = 0; i < n - 1; i++)  
        { 
            swapped = false; 
            for (j = 0; j < n - i - 1; j++)  
            { 
                if (arr[j] > arr[j + 1])  
                { 
                    // swap arr[j] and arr[j+1] 
                    temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                    swapped = true; 
                } 
            } 
  
            // IF no two elements were  
            // swapped by inner loop, then break 
            if (swapped == false) {
                break; 
            } 
        }
    }
        
		
	public static IMyStack getStacksWithSumOfMaxBelow(IMyStack stackOfStacks, int totalSumofMax)
	{
		// to be completed
		return null;
	}
	
}
