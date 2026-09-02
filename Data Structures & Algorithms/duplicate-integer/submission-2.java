class Solution {
    public boolean hasDuplicate(int[] nums) {
        // var left = 0;
        // var right = nums.length - 1;
        // while(left < right){
        //     if(nums[left] == nums[right]){
        //         return true;
        //     } else if(right == left + 1){
        //         right = nums.length - 1;
        //         left++;
        //     }
        //     else if(left == nums.length - 2) return false;
        //      else{
        //         right--;
        //     }
        // }
        // return false;

        var set = new HashSet<Integer>();
        for(int a : nums)
            set.add(a);
        if(set.size() == nums.length) return false;
        return true;
    }
}