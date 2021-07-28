class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        if(nums.length == 1){
            return nums[0];
        }
        int result = 0;
        while(start <= end){
            if(nums[start] > nums[end]){
                start++;
            }else{
                result = nums[start];
                break;
            }
        }
        return result;
    }
}
