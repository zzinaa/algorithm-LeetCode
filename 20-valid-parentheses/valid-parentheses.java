class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        if(s.length() % 2 == 1 || s.charAt(0) == ')' || s.charAt(0) == ']' || 
        s.charAt(0) == '}') return false;

        for(int i = 0; i < s.length(); i ++) {
            char cur = s.charAt(i);
            if(cur == '(' || cur == '[' || cur == '{')
                stack.add(cur);
            else if(!stack.isEmpty()) {
                char top = stack.peek();
                if((cur == ')' && top == '(') ||
                (cur == ']' && top == '[') ||
                (cur == '}' && top == '{')) {
                    stack.pop();
                } else return false;
            } else if(s.charAt(i) == ')' || s.charAt(i) == ']' || 
                s.charAt(i) == '}') return false;
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}