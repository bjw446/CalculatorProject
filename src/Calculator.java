import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static Object charAt;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        String operator;
        int result = 0;
        boolean calculate = true;

        while (calculate) {
            try {
                System.out.println("첫 번째 숫자를 입력하세요 : ");
                num1 = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력 가능합니다.");
                sc.nextLine();
                continue;
            }
            System.out.println("사칙연산 기호를 입력하세요 : ");
            operator = sc.next();
            sc.nextLine();
            try {
                System.out.println("두 번째 숫자를 입력하세요 : ");
                num2 = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력 가능합니다.");
                sc.nextLine();
                continue;
            }

            char saveoperator = operator.charAt(0);

            switch (saveoperator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    try {
                        result = num1 / num2;
                        break;
                    } catch (ArithmeticException e) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        continue;
                    }
                default:
                    System.out.println("잘 못 입력하셨습니다, 프로그램을 종료 합니다.");
            }
            System.out.println("결과는 : " + result + " 입니다.");
            System.out.println("계속 계산 하시겠습니까? (exit 입력 시 종료)");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("exit")) {
                 calculate = false;
            }
        }
    }
}