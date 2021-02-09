package DinamicProgramming;

public class Knapsack {
    private int numOfItems;
    private int capacityOfKnapsack;
    private int[][] knapsackTable;
    private int totalBenefit;
    private int[] weight;
    private int[] value;

    public Knapsack(int numOfItems, int capacityOfKnapsack, int[] weight, int[] value) {
        this.numOfItems = numOfItems;
        this.capacityOfKnapsack = capacityOfKnapsack;
        this.weight = weight;
        this.value = value;
        this.knapsackTable = new int[numOfItems+1][capacityOfKnapsack+1];
    }

    public void solve() {
        for (int i = 1; i < numOfItems+1; i++) {
            for (int w = 1; w < capacityOfKnapsack+1; w++){
                int notTakingItem = knapsackTable[i-1][w]; //not taking item
                int takingItem = 0;

                if (weight[i] <= w){
                    takingItem = value[i] +knapsackTable[i-1][w-weight[i]];
                }
                knapsackTable[i][w] = Math.max(notTakingItem, takingItem);
            }
        }
        totalBenefit = knapsackTable[numOfItems][capacityOfKnapsack];
    }
    public void showResults(){
        System.out.println("total benefit "+totalBenefit);
        for (int n = numOfItems, w = capacityOfKnapsack; n>0; n--) {
            if (knapsackTable[n][w] != 0 && knapsackTable[n][w] != knapsackTable[n-1][w]){
                System.out.println("we take item: #"+n);
                w = w - weight[n];
            }
        }
    }
}
