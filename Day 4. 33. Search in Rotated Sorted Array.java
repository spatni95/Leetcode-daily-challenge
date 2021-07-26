class Solution {
    public int search(int[] nums, int target) {
         if (nums == null || nums.length == 0)
            return -1;
        
        return find(nums, 0, nums.length-1, target);
    }    
    public int find(int nums[], int left, int right, int target){
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left)/2;
        if(nums[mid] == target){
            return mid;
        }else if(nums[mid] > target){
            if (nums[mid] > nums[right] && target <= nums[right]) {
                return find(nums, mid+1, right, target);
            } else {
                return find(nums, left, mid-1, target);
            }
        }else{
            if (nums[mid] < nums[left] && target >= nums[left]) {
                return find(nums, left, mid-1, target);
            } else {
                return find(nums, mid+1, right, target);
            }
        }
    }
}


