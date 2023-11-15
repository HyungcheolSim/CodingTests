import java.util.Stack;
class Solution {
    boolean solution(String s) {
        Stack<Character> st=new Stack();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push('(');
            }else{
                if(!st.empty())
                    st.pop();
                else
                    return false;
            }
        }
        return st.empty();
    }
}