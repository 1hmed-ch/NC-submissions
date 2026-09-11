class Solution {
    public boolean isValid(String s) {
        char c[] = s.toCharArray();
        var stack = new ArrayDeque<Character>();
        for(int i = 0; i < c.length ; i++){
            if(c[i] == '(' || c[i] == '{' || c[i] == '['){
                stack.push(c[i]);
            } else {
                if(c[i] == ')'){
                    if(stack.isEmpty() || stack.pop() != '(') return false;
                }
                else if(c[i] == '}'){
                    if(stack.isEmpty() || stack.pop() != '{') return false;
                }
                else if(c[i] == ']'){
                    if(stack.isEmpty() || stack.pop() != '[') return false;
                }
            }
        }
        return stack.isEmpty() ? true : false;
    }
}
