class Solution {
    public int numDecodings(String s) {
        if(s.charAt(0) == '0' || s == null) return 0;
        if(s.length() == 1) return 1;
        
        int dp[] = new int[s.length() + 1];
        dp[0] = 1;
        
        for(int i = 1; i <= s.length(); i++){
            if(stringCheck(s.substring(i - 1, i))){
                dp[i] = dp[i] + dp[i - 1];
            }
            if(i >= 2 && stringCheck(s.substring(i - 2, i))){
                dp[i] = dp[i] + dp[i - 2];
            }
        }
        return dp[s.length()];
    }

    public boolean stringCheck(String s){
        if(s.length() == 1){
            if(s.charAt(0) != '0') return true;
        }
        if(s.length() == 2){
            if(s.charAt(0) != '0' && Integer.parseInt(s) <= 26){
                return true;
            }
        }
        return false;
    }
}
