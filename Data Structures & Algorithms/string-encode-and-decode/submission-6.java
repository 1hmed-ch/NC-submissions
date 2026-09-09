class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "ArrayListIsEmpty";
        String rs = "";
        for(String s : strs){
            rs += s.length() + "#" + s;
        }
        return rs;
    }

    public List<String> decode(String str) {
        if(str.equals("ArrayListIsEmpty")) return List.of();
        List<String> rs = new ArrayList<>();
        char[] charArray = str.toCharArray();
        String temp = "";
        int i = 0;
        while(i < str.length()){
            int hashIndex = str.indexOf("#", i);
            int number = Integer.parseInt(str.substring(i, hashIndex));
            temp = str.substring(hashIndex+1, hashIndex + number+1);
            rs.add(temp);
            i = hashIndex + number + 1;
        }

        return rs;
    }
}
