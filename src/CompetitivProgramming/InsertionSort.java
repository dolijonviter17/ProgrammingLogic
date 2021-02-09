package CompetitivProgramming;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] numbers = {7, 3, 5, 2, 3, 4, 6, 7};
        var sorter = new InsertionSort();
        sorter.sortArr(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static void sortArr(int[] arr){
        for(int i=1; i<arr.length; i++){
            var current = i;
            var j = i-1;
            while(j >= 0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }
}
