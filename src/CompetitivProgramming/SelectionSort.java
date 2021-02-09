package CompetitivProgramming;

public class SelectionSort {

    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }

    void sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            int minIndex = i;
            for(int j = i+1; j<n; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }

            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
    }
    void printArray(int[] arr){
        int  n = arr.length;
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
