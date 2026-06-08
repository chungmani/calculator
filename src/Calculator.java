import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String exit = "no"; // 반복문을 위해 변수 선언
        // 계산 후 exit 입력되면 반복 종료
        while (!exit.equals("exit")) {

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
            switch (cal) {
                case "+":
                    int plus = num1 + num2;
                    System.out.println("결과: " + plus);
                    break;

                case "-":
                    int minus = num1 - num2;
                    System.out.println("결과: " + minus);
                    break;

                case "*":
                    int multiply = num1 * num2;
                    System.out.println("결과: " + multiply);
                    break;

                case "/":
                    if (num2 != 0) {
                        int devide = num1 / num2;
                        System.out.println("결과: " + devide);
                        break;
                    } else {
                        System.out.println("나눗셈에서는 분모가 0이 올 수 없습니다.");
                        break;
                    }

                default:
                    System.out.println("정확한 사칙연산 기호를 입력하세요 (+, - , * , /)");
            }
            System.out.print("계속하시겠습니까? (exit 입력시 종료): ");
            exit = sc.nextLine();
        }

    }


}
