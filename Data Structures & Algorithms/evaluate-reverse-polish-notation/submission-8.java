class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int parsedInt = 0;
        for(int i = 0; i < tokens.length; i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")){
                parsedInt = Integer.parseInt(tokens[i]);
                stack.push(parsedInt);
            } else {
                if(tokens[i].equals("+")){
                    if(!stack.isEmpty()){
                        int a = stack.pop();
                        int b = stack.pop();
                        stack.push(a + b);
                    }
                } else if(tokens[i].equals("-")){
                    if(!stack.isEmpty()){
                        int a = stack.pop();
                        int b = stack.pop();
                        stack.push(b - a);
                    }
                } else if(tokens[i].equals("*")){
                    if(!stack.isEmpty()){
                        int a = stack.pop();
                        int b = stack.pop();
                        stack.push(a * b);
                    }
                } else if(tokens[i].equals("/")){
                    if(!stack.isEmpty()){
                        if(stack.peek()!= 0){
                            int a = stack.pop();
                            int b = stack.pop();
                            stack.push(b/a);
                        }
                    }
                }
            }
        }

        return stack.pop();
    }
}
