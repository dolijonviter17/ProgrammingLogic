package CompetitivProgramming;

public class CountingSort {
    private static int range;

    private static int[] countSort(int[] arr){
        int[] values = new int[range+1];
        for(int i = 0; i <= range; i++)
            values[i] = 0;

        for (int i = 0; i < arr.length; i++){
            values[arr[i]]++;
        }
        int[] array = new int[arr.length];
        int k = 0;
        for(int i = 0; i <= range; i++){
            for (int j = 0; j < values[i]; j++){
                array[k++] = i;
            }

        }
        return array;

    }

    public static void main(String[] args) {
        range = 9;
        int[] a = new int[]{0,1,4,7,6,5,9,2,8,7,3,2,0,9,6,8};
        a = countSort(a);
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
    }


}
