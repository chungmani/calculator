import java.util.ArrayList;
import java.util.List;

public class Calculator<T extends Number> {
    // 외부에서 접근 막기
    private List<Double> results = new ArrayList<>();

    public double calculate(T num1, String cal, T num2) {
        double result = 0;
        OperatorType op = OperatorType.findValue(cal);

        if (op == null) {
            System.out.println("올바른 사칙연산을 기입하세요");
            return 0;
        }

        switch (op) {
            case ADD:
                result = num1.doubleValue() + num2.doubleValue();
                break;

            case SUBTRACT:
                result = num1.doubleValue() - num2.doubleValue();
                break;

            case MULTIPLY:
                result = num1.doubleValue() * num2.doubleValue();
                break;

            case DIVIDE:
                if (num2.doubleValue() != 0) {
                    result = num1.doubleValue() / num2.doubleValue();
                    break;
                } else {
                    System.out.println("나눗셈에서는 분모가 0이 올 수 없습니다.");
                    return 0;
                }
        }
        System.out.println("결과: " + result);
        results.add(result);
        return result;
    }

    // 오래된 연산결과부터 삭제하는 기능
    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }

    // 게터로만 접근
    public List<Double> getResults() {
        return results;
    }
}
