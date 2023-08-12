import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = {3,6,2,4,32,1};
//        int returnedIndex = pivot(a,0,a.length);
//        System.out.println(returnedIndex);
//        System.out.println(Arrays.toString(a));
        quickSort(a);
        System.out.println(Arrays.toString(a));

    }

    //method quickSort
    public static void quickSort(int[] array){
        quickSortHelper(array,0,array.length);
    }

    //helper method quickSort
    private static void quickSortHelper(int[] ar, int left, int right){
        if(left<right){
            int pivotIndex = pivot(ar,left,right);
            quickSortHelper(ar,left,pivotIndex-1);
            quickSortHelper(ar,pivotIndex+1, right);
        }
    }

    //helper method swap
    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    //helper method pivot
    private static int pivot(int[] array, int pivotIndex, int endIndex){
        int swapIndex = pivotIndex;
        for(int i=pivotIndex+1; i<endIndex; i++){
            if(array[i] < array[pivotIndex]){
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);
        return swapIndex;
    }
}
