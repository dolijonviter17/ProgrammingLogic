package CompetitivProgramming;

public class MergeSort {

    public static void main(String[] args) {
        int arrLarge[] = {1,5,3,6,3,67,76,3,6,332};
        MergeSort mg = new MergeSort();


    }
    public static void solution(int[] arr){
        solution(arr, new int[arr.length], 0, arr.length-1);
    }

    public static void solution(int[] arr, int[] temp, int left, int right) {
        if (left >= right){
            return;
        }

        int middle = (left + right) / 2;
        solution(arr, temp, left, middle);
        solution(arr, temp, middle+1, right);
        solution(arr, temp, left, right);
    }

    public static void mergeSolve(int[] arr, int[] temp, int leftStart, int rightEnd){
        int leftEnd = (leftStart + rightEnd) /2;
        int rightStart = leftEnd+1;
        int size = leftStart - rightEnd+1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd){
            if (arr[left] <= arr[right]){
                temp[index] = arr[left];
                left++;
            }else{
                temp[index] = arr[right];
                right++;
            }
            index++;
        }
        System.arraycopy(arr, left, temp, index, leftEnd-left+1);
        System.arraycopy(arr, right, temp, index, rightEnd-right+1);
        System.arraycopy(temp, leftStart, arr, leftStart, size);


    }

}
