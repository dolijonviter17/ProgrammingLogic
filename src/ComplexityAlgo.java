import CompetitivProgramming.MaxValue;

public class ComplexityAlgo {

    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 5, -2};
        int n = arr.length;


        ComplexityAlgo ca = new ComplexityAlgo();
        System.out.println("ca3 "+ca.Tsn3(arr));
        System.out.println("ca2 "+ca.Tsn2(arr));
    }
    public int Tsn3(int[] arr) {
        //        O(n 3 rank) Time Solution

        int best = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++){
            for (int b = i; b < n; b++){
                int sum = 0;
                for (int c = i; c <= b; c++){
                    sum += arr[c];
                }
                best = Integer.max(best, sum);
            }
        }
        return best;
    }

    public int Tsn2(int arr[]){
        //        O(n rank 2 ) Time Solution

        int best = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += arr[j];
                best = Integer.max(best, sum);
            }
        }
        return best;
    }
}
