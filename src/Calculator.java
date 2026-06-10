import java.util.ArrayList;

public class Calculator {
    ArrayList<Integer> results = new ArrayList<>();

    public int calculate(int num1, String cal, int num2) {
        int result = 0;

        switch (cal) {
            case "+":
                int add = num1 + num2;
                System.out.println("결과: " + add);
                results.add(add);
                return result = add;

            case "-":
                int sub = num1 - num2;
                System.out.println("결과: " + sub);
                results.add(sub);
                return result = sub;

            case "*":
                int multiply = num1 * num2;
                System.out.println("결과: " + multiply);
                results.add(multiply);
                return result = multiply;

            case "/":
                if (num2 != 0) {
                    int divide = num1 / num2;
                    System.out.println("결과: " + divide);
                    results.add(divide);
                    return result = divide;
                } else {
                    System.out.println("나눗셈에서는 분모가 0이 올 수 없습니다.");
                    break;
                }

            default:
                System.out.println("올바른 사칙연산을 기입하세요.");
        }
        return result;
    }
}
