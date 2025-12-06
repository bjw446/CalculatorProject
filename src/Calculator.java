import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> list = new ArrayList<>();




    public int calculate(int num1, int num2, OperatorType operator) {

        int result = 0;
        switch (operator) {
            case PLUS :
                result = num1 + num2;
                System.out.println("결과는 : " + result + " 입니다.");
                break;
            case MINUS :
                result = num1 - num2;
                System.out.println("결과는 : " + result + " 입니다.");
                break;
            case MULTIPLY :
                result = num1 * num2;
                System.out.println("결과는 : " + result + " 입니다.");
                break;
            case DIVIDE :
                try {
                     result = num1 / num2;
                     System.out.println("결과는 : " + result + " 입니다.");
                     break;
                } catch (ArithmeticException e) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    break;
                }
                default:
                    System.out.println("잘못된 연산자 입니다.");
        }

        list.add(result);
        return result;

    }
    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public void removeResult() {
        try {
            Integer firstRemove = list.remove(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("저장된 결과가 없습니다.");
        }

    }

    public void clearList() {
        list.clear();
    }

}