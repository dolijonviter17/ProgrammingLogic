package DinamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class FibonacciProblem {

    private Map<Integer, Integer> memorizeTable;

    public FibonacciProblem() {
        this.memorizeTable = new HashMap<>();
        this.memorizeTable.put(0, 0);
        this.memorizeTable.put(1, 1);
    }

    public int fibonacciDP(int n){
        if (memorizeTable.containsKey(n)) return memorizeTable.get(n);

        memorizeTable.put(n-1, fibonacciDP(n-1));
        memorizeTable.put(n-2, fibonacciDP(n-2));

        int calculateNumber = memorizeTable.get(n-1) + memorizeTable.get(n-2);
        memorizeTable.put(n, calculateNumber);
        return calculateNumber;

    }

    public int naiveFibonacciFactor(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;

        return naiveFibonacciFactor(n-1) + naiveFibonacciFactor(n-2);

    }
}
