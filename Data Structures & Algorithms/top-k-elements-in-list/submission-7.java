class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 0) return nums;
        if(nums.length == 1) return nums;
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i : nums){
            if(!map.containsKey(i)){
                map.put(i, new ArrayList<>());
                map.get(i).add(i);
            } else {
                map.get(i).add(i);
            }
        }
        List<List<Integer>> rs = new ArrayList<>();
        for(List<Integer> list : map.values()){
            rs.add(list);
        }
        Collections.sort(rs, (list1, list2) -> Integer.compare(list2.size(), list1.size()));
        
        int[] result = new int[k];
        if(k <= rs.size()){
            for(int i = 0; i<k; i++){
                result[i] = rs.get(i).get(0);
            }
        }
        return result;
    }
}
