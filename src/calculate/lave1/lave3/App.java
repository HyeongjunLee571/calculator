package calculate.lave1.lave3;
import java.text.ParseException;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) throws ParseException {
        double result;

        Calculators cal = new Calculators();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < 100 ; i++) {
            System.out.println('\n'+"첫번째 숫자를 입력하세요: ");
            double first = scanner.nextDouble();
            System.out.println("사칙연산 기호를 입력하세요: ");
            String sigh = scanner.next();
            char sign = sigh.charAt(0); // 튜터님께 물어보기 꼭 사용해야하는지(?)
            System.out.println("두번째 숫자를 입력하세요: ");
            double second = scanner.nextDouble();

            if (0 == second && "/".equals(sigh)) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다."+'\n');
                continue;
            }

            if(first == (int)first) {
                result = cal.calculate((Number)first,sigh,(Number)second);
                int result2 = (int) result;
                System.out.println("결과는: " +result2+'\n');
                cal.setCalculator(result2);
            }else {
                result = cal.calculate((Number)first,sigh,(Number)second);
                System.out.println("결과는: " + result+'\n');
                cal.setCalculator(result);
            }

            System.out.println("계속 계산하시겠습니까?");
            String end = scanner.next();

            if ("exit".equals(end)) {
                cal.removeResult();//< 삭제 기능 가져오기
                System.out.print("첫번째 숫자를 삭제한 후 나머지 수: ");
                cal.getCalculator();// 배열 출력 방법
                System.out.println("계산기를 종료합니다 감사합니다."+'\n');
                cal.setSum2();
                break;
            }
        }

    }
}
