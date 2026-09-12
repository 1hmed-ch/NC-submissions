class Solution {
    public static boolean isValidK(int k, int h, int[] piles){
        long maxHours = 0;
        for(int i = 0; i < piles.length; i++){
            maxHours += Math.ceil((double)piles[i]/k);
        }
        if(maxHours <= h) return true;
        return false;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().orElse(0);
        //System.out.println(right);
        int mid = 0;
        int res = 0;
        while(left <= right){
            mid = left + ((right - left)/2);
            if(isValidK(mid, h, piles)){
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }
}
