// package stack;
import java.util.*;;

public class InfixToPostFix {
    

    public static int priority(char c) {
        if (c == '-' || c == '+') {
            return 1;
        } else if (c == '*' || c == '/') {
            return 2;
        } else if (c == '^') {
            return 3;
        } else {
            return -1;
        }
    }

    public static String infixToPostFix(String s) {
        String ans = "";
        Stack<Character> st = new Stack<>();
        int i = 0;
        
        while (i < s.length()) {
            char c = s.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                ans += c;

            } else if (c == '(') {
                st.push(c);

            } else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans += st.pop();
                }
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                }
            } else {
                while (!st.isEmpty() && priority(st.peek()) >= priority(c)) {
                    ans += st.pop();
                }
                st.push(c);
            }
            
            i++; 
        }

        while (!st.isEmpty()) {
            ans += st.pop();
        }

        return ans;
    }

    public static void main(String[] args) {
        String infix = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostFix(infix));
    }
}

