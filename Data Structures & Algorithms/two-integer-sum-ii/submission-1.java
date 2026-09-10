class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int left = 0;
        int right = 1;
        int missing = 0;
        int bs = 0;
        while(left < numbers.length){
            missing = target - numbers[left];
            if(missing == numbers[left]) return new int[]{left+1, left+2};
            if((bs = Arrays.binarySearch(numbers, missing)) >= 0){
                res[0] = left+1;
                res[1] = bs+1;
                return res;
            } else {
                left++;
            }
        }
        return res;
    }
}
