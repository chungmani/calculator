import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator<Double> calculator = new Calculator<>();

        // 계산 후 exit 입력되면 반복 종료
        while (true) {

            // 예외처리로 인해 밖에서 변수 선언
            double num1 = 0;
            double num2 = 0;

            String cal = "";

            // 숫자, 사칙연산 기호 입력받기
            try {
                num1 = input(sc,"첫번째 숫자를 입력하세요: ");
                System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
                cal = sc.nextLine();
                num2 = input(sc,"두번째 숫자를 입력하세요: ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc.nextLine(); // 잘못된 입력값 비워주기
                continue;
            }

            // 계산하기
            calculator.calculate(num1, cal, num2);

            System.out.print("[exit: 종료] [history: 연산결과들 보기] [standard: 기준값보다 높은 결과들 보기] [remove: 첫 연산결과 제거] 계속하려면 아무키나 누르세요 : ");
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break; // 반복문 빠져나오기
            } else if (input.equals("history")) {
                List<Double> showResults = calculator.getResults();
                System.out.println("HISTORY: " + showResults);
            } else if (input.equals("remove")) {
                calculator.removeResult();
                List<Double> showResults = calculator.getResults();
                System.out.println("HISTORY: " + showResults);
            } else if (input.equals("standard")) {
                calculator.filterResult(sc);
            }
        }
        sc.close();
    }

    // 중복되는 코드 메서드로 만들기
    static double input(Scanner sc, String notice) {
        System.out.print(notice);
        double num = sc.nextDouble();
        sc.nextLine();
        if (num < 0) {
            throw new ArithmeticException("0 이상의 정수만 입력해주세요.");
        }
        return num;
    }
}
