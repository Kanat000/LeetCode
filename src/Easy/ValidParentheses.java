package Easy;

import java.util.ArrayList;

public class ValidParentheses {
    public static boolean isValid(String s) {

        char[] charArr = s.toCharArray();
        ArrayList<Character> brackets = new ArrayList<>(2);
        int i=0;
        for(char bracket: charArr){
            switch (bracket) {
                case '(' -> {
                    brackets.add('(');
                    i++;
                }
                case ')' -> {
                    if (i!=0 && brackets.get(i-1) == '(') {
                        brackets.remove(i-1);
                        i--;
                    }else {
                        brackets.add(')');
                        i++;
                    }

                }
                case '{' -> {
                    brackets.add('{');
                    i++;
                }
                case '}' -> {
                    if (i!=0 && brackets.get(i-1) == '{') {
                        brackets.remove(i-1);
                        i--;
                    }
                    else {
                        brackets.add('}');
                        i++;
                    }
                }
                case '[' -> {
                    brackets.add('[');
                    i++;
                }
                case ']' -> {
                    if (i!=0 && brackets.get(i-1) == '[') {
                        brackets.remove(i-1);
                        i--;
                    }
                    else {
                        brackets.add(']');
                        i++;
                    }
                }
            }
        }

        return brackets.size() == 0;


    }

    public static void main(String[] args) {
        System.out.println(isValid("([{}])"));
    }
}
