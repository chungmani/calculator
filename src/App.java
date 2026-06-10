import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // 계산 후 exit 입력되면 반복 종료
        while (true) {

            // 숫자 초기화
            int num1 = 0;
            int num2 = 0;

            // 숫자, 사칙연산 기호 입력받기
            System.out.print("첫번째 숫자를 입력하세요: ");
            num1 = sc.nextInt();
            sc.nextLine();
            System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
            String cal = sc.nextLine();
            System.out.print("두번째 숫자를 입력하세요: ");
            num2 = sc.nextInt();
            sc.nextLine();

            // 계산하기
            calculator.calculate(num1, cal, num2);

            System.out.print("계속하시겠습니까? (exit 입력시 종료): ");
            String exit = sc.next();
            if (exit.equals("exit")) {
                break;
            }
        }

    }


}
