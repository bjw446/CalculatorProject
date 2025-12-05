import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calculator = new Calculator();


        while (true) {
            int num1;
            try {
                System.out.println("첫 번째 숫자를 입력하세요 : ");
                num1 = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력 가능합니다.");
                sc.nextLine();
                continue;
            }
            System.out.println("사칙연산 기호를 입력하세요 : ");
            char operator = sc.next().charAt(0);
            sc.nextLine();
            int num2;
            try {
                System.out.println("두 번째 숫자를 입력하세요 : ");
                num2 = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력 가능합니다.");
                sc.nextLine();
                continue;
            }
            calculator.calculate(num1, num2, operator);

            System.out.println("계속 계산 하시겠습니까? (exit 입력 시 종료)");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("exit")) {
                break;
            }

        }
        sc.close();
    }
}
