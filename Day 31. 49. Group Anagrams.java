class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            List<String> list = new ArrayList<>();
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            if(map.containsKey(String.valueOf(c))){
                list = map.get(String.valueOf(c));
                list.add(strs[i]);
                map.put(String.valueOf(c), list);
            }else{
                list.add(strs[i]);
                map.put(String.valueOf(c), list);
            }
        }
        return new ArrayList<List<String>>(map.values());
    }
}
