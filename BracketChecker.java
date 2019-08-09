import java.util.Scanner;
import java.util.Stack;
class demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            Stack<Character> s = new Stack<>();
            String str = input.nextLine();
            char ch[] = str.toCharArray();
            for(char c : ch) {
                if(c == '{' || c == '(' || c == '[') {
                    s.push(c);
                    continue;
                }
                if(c == '}' && !s.isEmpty() && s.peek() == '{') {
                    s.pop();
                    continue;
                }
                if(c == ']' && !s.isEmpty() && s.peek() == '[') {
                    s.pop();
                    continue;
                }
                if(c == ')' && !s.isEmpty() && s.peek() == '(') {
                    s.pop();
                    continue;
                }
                if(c == '}' || c == ')' || c == ']') {
                    s.push(c);
                    break;
                }
            }
            System.out.println(s);
            System.out.println(s.isEmpty());
        }
    }
}