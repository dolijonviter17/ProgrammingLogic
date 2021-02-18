package DynamicProgramming;

public class MakingChange {

    public static void main(String[] args) {
        MakingChange mc = new MakingChange();
        int bil = 49;
        System.out.println(mc.makeChange(bil));

    }
    private int[] coins = new int[]{25, 5, 10, 1};

    public int makeChange(int c) {
        if (c == 0) return 0;
        int minCoins = Integer.MAX_VALUE;
        for (int coin : coins){
            // skip coins if values is greater than amount remaining
            if (c - coin >= 0){
                int currentMinCoin = makeChange(c-coin);
                if (currentMinCoin < minCoins)
                    minCoins = currentMinCoin;

            }
        }
        return minCoins + 1;

    }
}
