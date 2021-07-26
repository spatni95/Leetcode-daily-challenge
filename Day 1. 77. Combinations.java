class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        helper(n, k, 1, new ArrayList<Integer>(), result);
        return res;
    }
    
    public void helper(int n, int k, int index, List<Integer> list, List<List<Integer>> result){
        if(list.size() == k){
            result.add(new ArrayList<>(list));
            return;
        }
        
        for(int i = index; i <= n; i++){
            list.add(i);
            helper(n, k, i + 1, list, res);
            list.remove(list.size() - 1);
        }
    }
}
