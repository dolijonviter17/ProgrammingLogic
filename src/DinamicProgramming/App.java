package DinamicProgramming;

public class App {
    public static void main(String[] args) {

//        FibonacciProblem fibonacciProblem = new FibonacciProblem();
//        System.out.println(fibonacciProblem.fibonacciDP(1000));

        //knapsack
        int numOfItems = 3;
        int kapacityOfKnapsack = 5;
        int[] weightsOfItems = new int[numOfItems + 1];
        weightsOfItems[1] = 4;
        weightsOfItems[2] = 2;
        weightsOfItems[3] = 3;

        int[] profitOfItems = new int[numOfItems + 1];
        profitOfItems[1] = 10;
        profitOfItems[2] = 4;
        profitOfItems[3] = 7;

        Knapsack knapsack =  new Knapsack(numOfItems, kapacityOfKnapsack, weightsOfItems, profitOfItems);
        knapsack.solve();
        knapsack.showResults();
    }

}
