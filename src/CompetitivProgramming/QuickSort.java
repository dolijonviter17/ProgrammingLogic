package CompetitivProgramming;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public void quickSort(int [] a){
        quickSort(a, 0, a.length-1);
    }
    private void quickSort(int[] a, int low, int high){
        if (low < high+1){
            int p = partition(a, low, high);
            quickSort(a, low, p-1);
            quickSort(a, p+1, high);
        }
    }

    private void swap(int[] a, int index1, int index2){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
    private int getPivot(int low, int high){
        Random r = new Random();
        return r.nextInt((high-low)+1)+low;
    }
    private int partition(int[] a, int low, int high){
        swap(a, low, getPivot(low,high));
        int border = low+1;
        for (int i = border; i<=high; i++){
            if (a[i] < a[low]){
                swap(a, i, border++);
            }
        }
        swap(a, low, border-1);
        return border-1;
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] a = {9,0,8,7,5,9,8,6,1,2,4,3};
        System.out.println(Arrays.toString(a));
        qs.quickSort(a);
        System.out.println(Arrays.toString(a));


    }
}
