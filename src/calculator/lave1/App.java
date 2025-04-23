package calculator.lave1;
import java.util.Scanner;

public class App
{
    public static void main (String[] args)
    {
        int addition;
        int subtraction;
        int multiplication;
        int division;

        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ; i < 100 ; i++) {
            System.out.println('\n'+"첫번째 숫자를 입력하세요: ");
            int first = scanner.nextInt();
            System.out.println("사칙연산 기호를 입력하세요: ");
            String sign = scanner.next();
            char sigh = sign.charAt(0);
            System.out.println("두번째 숫자를 입력하세요: ");
            int second = scanner.nextInt();

            if (0 == second && "/".equals(sign)) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다."+'\n');
                continue;
            }

            if ("+".equals(sign)) {
                addition = first + second;
                System.out.println("결과는: " + addition+'\n');
            } else if ("-".equals(sign)) {
                subtraction = first - second;
                System.out.println("결과는: " + subtraction+'\n');
            } else if ("*".equals(sign)) {
                multiplication = first * second;
                System.out.println("결과는: " + multiplication+'\n');
            } else if ("/".equals(sign)) {
                division = first / second;
                System.out.println("결과는: " + division+'\n');
            }

            System.out.println("계속 계산하시겠습니까?");
            String end = scanner.next();

            if("exit".equals(end)) {
                System.out.println("계산기를 종료합니다 감사합니다."+'\n');
                break;
            }
        }
    }
}
