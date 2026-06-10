import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // 계산 후 exit 입력되면 반복 종료
        while (true) {

            // 숫자, 사칙연산 기호 입력받기
            System.out.print("첫번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            sc.nextLine();
            System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
            String cal = sc.nextLine();
            System.out.print("두번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            sc.nextLine();

            // 계산하기
            calculator.calculate(num1, cal, num2);

            System.out.print("[exit: 종료] [history: 연산결과들 보기] [remove: 첫 연산결과 제거] 계속하려면 아무키나 누르세요 : ");
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break; // 반복문 빠져나오기
            } else if (input.equals("history")) {
                ArrayList<Integer> showResults = calculator.getResults();
                System.out.println("HISTORY: " + showResults);
            } else if (input.equals("remove")) {
                calculator.removeResult();
                ArrayList<Integer> showResults = calculator.getResults();
                System.out.println("HISTORY: " + showResults);
            }
        }

    }


}
