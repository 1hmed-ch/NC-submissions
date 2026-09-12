class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int mid = 0;
        if(nums[0] < nums[nums.length - 1]){
            int index = Arrays.binarySearch(nums, target);
            return index >= 0 ? index : -1;
        } else {
            while(l <= r){
                mid = l + (r - l)/2;
                if(nums[l] <= nums[mid]){
                    if(nums[mid] == target) return mid;
                    else if(nums[l] <= target && target <= nums[mid]){
                        r = mid - 1;
                    } else {
                        l = mid + 1;
                    }
                } else {
                    if(nums[mid] == target) return mid;
                    else if(nums[mid] <= target && target <= nums[r]){
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                    }
                }
            }
            return -1;
        }
    }
}
