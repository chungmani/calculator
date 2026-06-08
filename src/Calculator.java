import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
        num2 =- sc.nextInt();
        sc.nextLine();
    }


}
