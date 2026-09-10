class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        Arrays.sort(nums);
        int count = 1;
        List<Integer> counts = new ArrayList<>();
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i+1] - nums[i] == 0) continue;
            else if(nums[i+1] - nums[i] == 1){
                count++;
            } else {
                counts.add(count);
                count = 1;
            }
        }
        counts.add(count);
        var rs = Collections.max(counts);
        System.out.println(counts);
        System.out.println(rs);
        return rs;
    }
}
