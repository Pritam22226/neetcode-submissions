class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while(start <= end){
            int med = start +(end-start) /2;
            if(nums[med] == target){
                return med;
            }
            if(target > nums[med]){
                start = med+1;
            }
            else{
                end = med-1;
            }
        }
        return -1;
    }
}
