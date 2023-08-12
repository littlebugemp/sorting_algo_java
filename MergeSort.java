import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        //sorted array
        int[] a = {1,2,3,4};
        int[] b = {3,5,6,7};
        System.out.println(Arrays.toString(merge(a,b)));

        int[] c = {2,3,1,4};
        System.out.println(Arrays.toString(c)); // original array
        System.out.println(Arrays.toString(mergeSort(c))); //
    }

    //method for merge sort
    public static int[] mergeSort(int[] array){
        if(array.length == 1) return array;
        int mid = array.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(array,0,mid));
        int[] right= mergeSort(Arrays.copyOfRange(array,mid,array.length));
        return merge(left,right);
    }

    //ar1 and ar2 must be sorted array
    public static int[] merge(int[] ar1, int[] ar2){
        int[] combined = new int[ar1.length + ar2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while(i<ar1.length && j<ar2.length){
            if(ar1[i]<ar2[j]){
                combined[index] = ar1[i];
                index++;
                i++;
            }else{
                combined[index] = ar2[j];
                index++;
                j++;
            }
        }
        while(i<ar1.length){
            combined[index] = ar1[i];
            index++;
            i++;
        }
        while(j<ar2.length){
            combined[index] = ar2[j];
            index++;
            j++;
        }
        return combined;
    }
}
