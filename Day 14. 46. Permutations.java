
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums.length == 0 || nums == null){
            return res;
        }
        helper(nums, 0, new ArrayList<Integer>(), res);
        return res;
    }    
    
    public void helper(int[] nums, int index, List<Integer> permute, List<List<Integer>> res){
        if(index == nums.length){
            res.add(new ArrayList<>(permute));
            return;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(!permute.contains(nums[i])){
                permute.add(nums[i]);
                helper(nums, index + 1, permute, res);
                permute.remove(permute.size() - 1);
            }
        }
    }    
}
