import java.util.Arrays;

//bubble sort
public class BubbleSort {
    public static void bubbleSort(int[] ar){
        for(int i=ar.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(ar[j] > ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1]= temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] ar = {2,1,22,11,32,12,45};
        System.out.println(Arrays.toString(ar));
        bubbleSort(ar);
        System.out.println(Arrays.toString(ar));
    }

}
