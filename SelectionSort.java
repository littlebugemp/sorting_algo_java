import java.util.Arrays;
//selection sort
public class SelectionSort {
    public static void selectionSort(int[] ar){
        for(int i=0; i<ar.length; i++){
            int minIndex = i;
            for(int j=i+1; j< ar.length; j++){
                if(ar[j] < ar[minIndex]){
                    minIndex = j;
                }
            }
            if(i != minIndex){
                int temp = ar[i];
                ar[i] = ar[minIndex];
                ar[minIndex] = temp;
            }

        }
    }
    public static void main(String[] args) {
        int[] ar = {2,1,22,11,32,12,45};
        System.out.println(Arrays.toString(ar));
        selectionSort(ar);
        System.out.println(Arrays.toString(ar));
    }
}
