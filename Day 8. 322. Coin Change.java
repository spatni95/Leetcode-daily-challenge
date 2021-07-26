class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] change = new int[amount + 1];
        Arrays.fill(change, amount + 1);
        change[0] = 0;
        for(int c : coins){
            for(int i = c; i <= amount; i++){
                change[i] = Math.min(change[i], change[i - c] + 1);
            }
        }
        return change[amount] == amount + 1? -1 : change[amount];
    }
}
