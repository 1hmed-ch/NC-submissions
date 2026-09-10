class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        if(s.length() == 1) return true;
        s = s.toLowerCase();
        s = s.replace(" ", "");
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = s.length() - 1;
        char[] c = s.toCharArray();
        while(left < right){
            if(c[left] == c[right]){
                left++;
                right--;
            } else return false;
        }
        return true;
    }
}
