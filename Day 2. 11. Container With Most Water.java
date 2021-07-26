class Solution {
    public int maxArea(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int max = Integer.MIN_VALUE;
        while(start < end){
            int area = Math.min(arr[start], arr[end]) * (end - start);
            if(max < area){
                max = area;
            }
            if(arr[start] <= arr[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return max;
    }
}
