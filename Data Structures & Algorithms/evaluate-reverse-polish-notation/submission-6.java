class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        //int res = 0;
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
                    //System.out.println(res);
                } else if(tokens[i].equals("-")){
                    if(!stack.isEmpty()){
                        int a = stack.pop();
                        int b = stack.pop();
                        stack.push(b - a);
                    }
                    //System.out.println(res);
                } else if(tokens[i].equals("*")){
                    if(!stack.isEmpty()){
                        int a = stack.pop();
                        int b = stack.pop();
                        stack.push(a * b);
                    }
                    //System.out.println(res);
                } else if(tokens[i].equals("/")){
                    if(!stack.isEmpty()){
                        if(stack.peek()!= 0){
                            int a = stack.pop();
                            int b = stack.pop();
                            stack.push(b/a);
                        }
                    }
                    //System.out.println(res);
                }
            }
        }

        return stack.pop();
    }
}
