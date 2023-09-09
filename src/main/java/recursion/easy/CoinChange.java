package recursion.easy;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1, 5, 7};
        int amt = 18;
        System.out.println(getMin(coins, amt));
    }

    private static int getMin(int[] coins, int amt) {
        if (amt == 0) return 0;
        if (amt < 0) return -1;
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int result = getMin(coins, amt - coins[i]);
            if (result != -1) {
                answer = Math.min(answer, 1 +result);
            }
        }
        return answer;
    }
}