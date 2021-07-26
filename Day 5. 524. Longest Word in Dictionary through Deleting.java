class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String max = "";
        for(String str : dictionary){
            if(isPresent(s, str)){
                if(str.length() > max.length() || (str.length() == max.length() && str.compareTo(max) < 0)){
                    max = str;
                }
            }
        }
        return max;
    }
    
    public boolean isPresent(String s, String str){
        int i = 0;
        for(int j = 0; j < s.length() && i < str.length(); j++){
            if(s.charAt(j) == str.charAt(i)){
                i++;
            }
        }
        return i == str.length();
    }
}
