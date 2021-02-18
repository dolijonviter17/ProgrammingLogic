package DynamicProgramming;

public class FibonacciNumber {

    public static void main(String[] args) {

        FibonacciNumber number = new FibonacciNumber();
        System.out.println(number.solve1(5));
        System.out.println(number.fib(5));
        System.out.println(number.fib2(5));
        System.out.println(number.fib3(5));
    }

    public int solve1(int n){
        if (n < 2) return n;

        int[] cache = new int[n+1];
        for (int i = 0; i < cache.length; i++){
            cache[i] = -1;
        }
        cache[0] = 0;
        cache[1] = 1;
        return solve1(n, cache);

    }

    private int solve1(int n, int[] cache){
        if (cache[n] >= 0) return cache[n];
        cache[n] = solve1(n-1, cache) + solve1(n-2, cache);
        return cache[n];
    }
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }
    public int fib2(int n){
        if (n == 0) return 0;

        int[] cache = new int[n+1];
        cache[1] = 1;

        for (int i = 2; i <= n; i++) {
            cache[i] = cache[i-1] + cache[i-2];
        }
        return cache[n];
    }
    public int fib3(int n){
        if (n < 2) return n;
        int n1 = 1;
        int n2 = 0;
        for (int i = 2; i < n; i++){
            int n0 = n1 + n2;
            n2 = n1;
            n1 = n0;
        }
        return n1 + n2;

    }
}
