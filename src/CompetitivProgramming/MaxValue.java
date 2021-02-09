package CompetitivProgramming;

public class MaxValue {

    public static void main(String[] args) {

        int largeArr[] = {6,4,2,7,9,16,105,54,22};
        int smaller = largeArr[0];
        int largest = largeArr[0];

        for (int i = 0; i<largeArr.length; i++){
            if (largeArr[i] < smaller) smaller = largeArr[i];
            if (largeArr[i] > largest) largest = largeArr[i];
        }

        System.out.println("The smallest value in the array is: " + smaller);
        System.out.println("The largest value in the array is: " + largest);
    }
}
