/* This file contains implementations of sorting algorithms.
 * You are NOT allowed to modify any of the given method headers.
 */

public class SortingAlgorithms {

    /*
     * You may define additional helper functions here if you need to.
     * Make sure the helper functions have the private access modifier, as
     * they will only be used in this class.
     */

    public void insertionSort(Record[] arr, int n) {
    	for (int i = 1 ; i < n ; i++)
    	{
    		Record key = arr[i];
    		int j = i - 1;
    		while (j >= 0 && ( arr[j].getIdNumber() > key.getIdNumber()))
    		{
    			arr[j+1]=arr[j];
    			j = j-1;
    		}
    		arr[j+1] = key;
    	}
    }

    public void selectionSort(Record[] arr, int n) {
    	for(int i = 0; i < n - 1 ;  i++) {
    		int min = i;
    		for(int j = i + 1 ; j < n ; j++){
    			if(arr[j].getIdNumber() < arr[min].getIdNumber()){
    				min = j;
    			}
    		}
    		if(min != i){
    			Record temp = arr[i];
    			arr[i]=arr[min];
    			arr[min]=temp;
    		}
    	}
    }

    public void mergeSort(Record[] arr, int p, int r) {
    	if (p < r)
    	{
            int mid = p + (r - p) / 2; 
            mergeSort(arr,p,mid);
            mergeSort(arr,mid+1,r);
            sort(arr,p,mid,r);
    	}
    }
    
    private void sort(Record[] arr, int p , int m, int r)
    {
    	int leftLength = m - p + 1;
    	int rightLength = r - m;
    	
    	Record[] tempLeft = new Record[leftLength];
    	Record[] tempRight = new Record[rightLength];

    	
    	for (int i = 0; i < leftLength; i++)
    	{
    		tempLeft[i] = arr[p + i];
    	}
    	
    	for (int i = 0 ; i < rightLength; i++)
    	{
    		tempRight[i] = arr[ m + 1 + i ];
    	}
  
    	
    	for (int i = 0 , j = 0, k = p; k <= r; k++)
    	{
    		if((i < leftLength) && ( j >= rightLength || tempLeft[i].getIdNumber() <= tempRight[j].getIdNumber() ))
			{
    			arr[k] = tempLeft[i];
    			i++;
			}
    		else
    		{
    			arr[k] = tempRight[j];
    			j++;
    		}
    	}
    }
    

    /*
     * Define AT LEAST ONE more sorting algorithm here, apart from the
     * ones given above. Make sure that the method accepts an array of
     * records
     */

    
    
    public void countingSort(Record arr[], int n) {

    	
    	// define
    	Record[] output = new Record[n + 1];
    	
    	
    	// get max
    	int max = arr[0].getIdNumber();
    	
    	for(int i = 0 ; i < n - 1 ; i++)
    	{
    		if (max < arr[i+1].getIdNumber())
    		{
    			max = arr[i+1].getIdNumber();
    		}
    	}
  
    	
    	// define count
    	int size = max + 1;
    	int[] count = new int[size];
    	
    	// initialize
    	for(int i = 0; i < size ; i++)
    	{
    		count[i] = 0;
    	}
    	
    	// set counts
    	for(int i = 0 ; i < n ; i++)
    	{
    		int ID = arr[i].getIdNumber();
    		count[ID] = count[ID] + 1;
    		
    	}
    	
    	// incremement
    	for ( int i = 1 ; i < size ; i++)
    	{
    		count[i] = count[i] + count[i-1];
    	}
    
    	// shift
    	
    	for ( int i = size - 1 ; i >= 1 ; i --)
    	{

    		count[i] = count[i-1];
    	}
    	count[0] = 0;
    	
    	// reference
    	for ( int i = 0; i < n ; i++)
    	{
    		output[count[arr[i].getIdNumber()]] = arr[i];
    		count[arr[i].getIdNumber()]++;
    	}
    	
    	// transfer
    	for ( int i = 0 ; i < n ; i++)
    	{
    		arr[i] = output[i];
    	}
    	
    }
}