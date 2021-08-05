class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String result = "1";
        for(int i = 2; i <= n; i++){
            result = count(result);
        }
        return result;
    }
    
    public String count(String s){
        StringBuilder sb = new StringBuilder();
        int index = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                index++;
            }else{
                sb.append(index);
                sb.append(s.charAt(i - 1));
                index = 1;
            }
        }
        sb.append(index);
        sb.append(s.charAt(s.length() - 1));
        return sb.toString();
    }
}
