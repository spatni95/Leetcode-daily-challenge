class Solution {
    public int findPeakElement(int[] nums) {
        if(nums == null || nums.length <= 1){
            return 0;
        }
        
        int left = 0;
        int right = 1;
        
        while(right <= (nums.length - 1)){
            if(nums[left] < nums[right]){
                left += 1;
                right += 1;
            } else {
                return left;
            }
        }
        return left;
    }
}
