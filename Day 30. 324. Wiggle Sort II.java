class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] result = new int[nums.length];
        int i = 1;
        int j = nums.length - 1;
        while(i < nums.length){
            result[i] = nums[j];
            i += 2;
            j--;
        }
        
        i = 0;
        while(j >= 0){
            result[i] = nums[j];
            j--;
            i += 2;
        }
        
        for(int a = 0; a < nums.length; a++){
            nums[a] = result[a];
        }
    }
}
