 import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Integer> values = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == ' ')
                continue;

            if (Character.isDigit(ch)) {

                int num = 0;

                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    num = num * 10 + (str.charAt(i) - '0');
                    i++;
                }

                values.push(num);
                i--;
            }
            else if (ch == '(') {
                ops.push(ch);
            }
            else if (ch == ')') {

                while (ops.peek() != '(') {

                    int b = values.pop();
                    int a = values.pop();
                    char op = ops.pop();
                    int ans = 0;

                    if (op == '+')
                        ans = a + b;
                    else if (op == '-')
                        ans = a - b;
                    else if (op == '*')
                        ans = a * b;
                    else if (op == '/')
                        ans = a / b;

                    values.push(ans);
                }

                ops.pop();
            }
            else {

                while (!ops.isEmpty()) {

                    char top = ops.peek();

                    int p1 = 0, p2 = 0;

                    if (top == '+' || top == '-')
                        p1 = 1;
                    else if (top == '*' || top == '/')
                        p1 = 2;

                    if (ch == '+' || ch == '-')
                        p2 = 1;
                    else if (ch == '*' || ch == '/')
                        p2 = 2;

                    if (top == '(' || p1 < p2)
                        break;

                    int b = values.pop();
                    int a = values.pop();
                    char op = ops.pop();
                    int ans = 0;

                    if (op == '+')
                        ans = a + b;
                    else if (op == '-')
                        ans = a - b;
                    else if (op == '*')
                        ans = a * b;
                    else if (op == '/')
                        ans = a / b;

                    values.push(ans);
                }

                ops.push(ch);
            }
        }

        while (!ops.isEmpty()) {

            int b = values.pop();
            int a = values.pop();
            char op = ops.pop();
            int ans = 0;

            if (op == '+')
                ans = a + b;
            else if (op == '-')
                ans = a - b;
            else if (op == '*')
                ans = a * b;
            else if (op == '/')
                ans = a / b;

            values.push(ans);
        }

        System.out.println(values.pop());
    }
}