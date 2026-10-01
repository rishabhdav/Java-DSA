class Solution {
    public boolean isValid(String s) {
        
    
    Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else{

                if(stack.isEmpty()) return false;
                char st=stack.pop();
                if((s.charAt(i)==')'&&st=='(')||(s.charAt(i)==']'&&st=='[')||(s.charAt(i)=='}'&&st=='{')){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
        
    }
}