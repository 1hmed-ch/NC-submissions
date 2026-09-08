class Solution {
    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        String sortedStr1 = new String(char1);
        String sortedStr2 = new String(char2);
        return sortedStr1.equals(sortedStr2);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return List.of(List.of(strs));
        if(strs.length == 1) return List.of(List.of(strs[0]));
        int left = 0;
        int right = 1;
        List<String> str = Arrays.asList(strs);
        Map<String, List<String>> result = new HashMap<>();
        List<List<String>> rs = new ArrayList<>();
        List<String> temp = new ArrayList<>();

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
