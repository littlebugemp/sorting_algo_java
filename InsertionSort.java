import java.util.Arrays;

//insertion sort
public class InsertionSort {

    public static void insertionSort(int[] ar){
        for(int i=1; i< ar.length; i++){
            int temp = ar[i];
            int j = i-1;
            while (j>-1 && temp < ar[j]){
                ar[j+1] = ar[j];
                ar[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] ar = {2,1,22,11,32,12,45};
        System.out.println(Arrays.toString(ar));
        insertionSort(ar);
        System.out.println(Arrays.toString(ar));
    }
}
