//Student Name: Trina Dang
//LSU ID: 899459534

package algorithmsproject;

public class Algorithms {
    public static void bubbleSort(int[]array){
        for(int i = 0; i < array.length - 1; i++){ //each iteration of this loop results in the largest unsorted element being "bubbled up" to the last unsorted position in the array
            for(int j = 0; j < array.length - i - 1; j++) //this loop performs pair-wise comparisons of elements, swapping elements if the left is larger than the right
                if(array[j] > array[j + 1]){ //if left element larger than right, perform swap
                    int temp = array[j];
                    array[j] = array[j + 1]; 
                    array[j + 1]  = temp;
                }
        }
    }
    
    //Complete Bubble Sort - Short Circuit (15)
    public static void bubbleSortCS(int[]array){
        boolean swap;
        for(int i = 0; i < array.length - 1; i++){ //each iteration of this loop results in the largest unsorted element being "bubbled up" to the last unsorted position in the array
            swap = false;
            for(int j = 0; j < array.length - i - 1; j++){ //this loop performs pair-wise comparisons of elements, swapping elements if the left is larger than the right
                if(array[j] > array[j + 1]){ //if left element larger than right, perform swap
                    int temp = array[j];
                    array[j] = array[j + 1]; 
                    array[j + 1]  = temp;
                    swap = true;
                }
                //If there's no swaps, it's sorted. Exit the loop
            }
            if (!swap){
                break;
            }
        }
        
    }
        
        
    
    //Complete Selection Sort (15)
    public static void selectionSort(int[]array) {
        //First round finds the smallest number to place at the beginning of array
        for(int i = 0; i < array.length; i++){
            /*each round will move up one position of the array, compares it to
            the rest of the array right of the position to find the min, and then 
            swaps the two values
            */
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++){
                if (array[j] < array[i]){
                    minIndex = j;
                }
            }
            //swapping the two values
            int smallerValue = array[minIndex];
            array[minIndex] = array [i];
            array[i] = smallerValue;            
        }
    }
    
    //Complete Insertion Sort (15)
    public static void insertionSort(int array[]){
        int key, sortPosition;
        /*1st round: Takes the first element, takes the next element and compares it.
        A swap happens if second is less than the first. For the next rounds, the sort then goes
        to the element next to the already sorted potion of the array, compares it from rightmost
        sorted element and keeps going to the left until it finds a number less than the item.
        The other items it was compared to gets shifted to the right one position.
        */
        for(int i = 1; i < array.length; i++){
            key = array[i];
            sortPosition = i - 1;
            while(sortPosition >= 0 && array[sortPosition] > key){
                array[sortPosition + 1] = array[sortPosition];
                sortPosition --;                
            }
            array[sortPosition + 1] = key;
        }
    }
    
    //Complete Merge Sort (15)
    public static void mergeSort(int[] array) {
        //if array is less than 2, the array is divided enough
        if (array.length < 2){
            return;
        }
        
        //Splits the main array into 2
        int mid = array.length/2;
        int[] l = new int[mid];
        int[] r = new int[array.length - mid];
        
        //Moves the array elements onto the 2 arrays
        for(int i = 0; i < mid; i++){
            l[i] = array [i];
        }        
        for(int i = mid; i < array.length; i++){
            r[i -mid ] = array [i];
        }
        
        //recursively calls merge sort until there's only arrays of 1 element
        mergeSort(l);
        mergeSort(r);
        
        //calls the merge array to bring the 2 arrays together and sorts them
        merge(array, l, r, mid, array.length - mid);
    }
	
    private static void merge(int[] array, int[] l, int[] r, int left, int right) {
        int leftPos = 0;
        int rightPos = 0;
        int arrayPos = 0;
        
        //While both left and right array still have elements, keep sorting
        //Compares an element of the right and left array and then takes the smaller value to go to the main array
        while(leftPos < left && rightPos < right){
            if(l[leftPos] > r[rightPos]){
                array[arrayPos] = r[rightPos];
                rightPos ++;
            } else {
                array[arrayPos] = l[leftPos];
                leftPos++;
            }
            arrayPos ++;
        }
        
        //One of the arrays might have elements left over. If so, add them to the main array
        
        while(leftPos < left){
            array[arrayPos] = l[leftPos];
            leftPos ++;
            arrayPos ++; 
        }

        while(rightPos < right){
            array[arrayPos] = r[rightPos];
            rightPos ++;
            arrayPos ++;
        }
    }
    
    //Optionally complete Quicksort (+5 bonus)
    public static void quicksort(int[] array, int from, int to) {
        if (from >= to){ return; }
        int p = partition(array, from, to);
        quicksort(array, from, p);
        quicksort(array, p + 1, to);
    }
	
    private static int partition(int[] array, int from, int to){
        int pivot = array[from];
        //Sets the first element as the pivot
        int i = from - 1;
        int j = to + 1;
        while (i < j){
            i++;
            //Keep the left marker going to the right while the numbers are less than the pivot, 
            while (array[i] < pivot) {
                i++;
            }
            j--;
            
            //Keep the right marker going to the left while the numbers are more than the pivot
            while (array[j] > pivot) {
                j--;
            }
            
            //if the markers don't cross over, swap the elements
            if (i < j) {
                array[i] += array[j];
                array[j] = array[i] - array[j];
                array[i] -= array[j];
            }
        }
        return j;
    }
    
}