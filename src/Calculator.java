import java.util.ArrayList;
import java.util.List;

public class Calculator {
    // 외부에서 접근 막기
    private List<Double> results = new ArrayList<>();
    OperatorType op;

    public double calculate(int num1, String cal, int num2) {
        double result = 0;

        // enum 값이랑 비교
        for (OperatorType value : OperatorType.values()) {
            if (value.getOperator().equals(cal)) {
                op = value;
                break;
            }
        }

        switch (op) {
            case ADD:
                result = num1 + num2;
                break;

            case SUBTRACT:
                result = num1 - num2;
                break;

            case MULTIPLY:
                result = num1 * num2;
                break;

            case DIVIDE:
                if (num2 != 0) {
                    result = (double) num1 / num2;
                    break;
                } else {
                    System.out.println("나눗셈에서는 분모가 0이 올 수 없습니다.");
                    return 0;
                }

            default:
                System.out.println("올바른 사칙연산을 기입하세요.");
                return 0;
        }
        System.out.println("결과: " + result);
        results.add(result);
        return result;
    }

    // 오래된 연산결과부터 삭제하는 기능
    public void removeResult() {
        results.remove(0);
    }

    // 게터로만 접근
    public List<Double> getResults() {
        return results;
    }
}
