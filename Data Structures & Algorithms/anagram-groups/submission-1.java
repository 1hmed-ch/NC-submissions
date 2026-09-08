class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return List.of(List.of(strs));
        if(strs.length == 1) return List.of(List.of(strs[0]));
        int left = 0;
        int right = 1;
        List<String> str = Arrays.asList(strs);
        Map<String, List<String>> result = new HashMap<>();
        List<List<String>> rs = new ArrayList<>();

        for(String s : str){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sortedS = new String(c);
            if(!result.containsKey(sortedS)){
                result.put(sortedS, new ArrayList<>());
                result.get(sortedS).add(s);
            } else {
                result.get(sortedS).add(s);
            }
        }
        for(List<String> list : result.values()){
            rs.add(list);
        }

        return rs;
    }
}
