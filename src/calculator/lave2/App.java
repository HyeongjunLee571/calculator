package calculator.lave2;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        int result;
        Calculator cal = new Calculator();
        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ; i < 100 ; i++) {
            System.out.println('\n'+"첫번째 숫자를 입력하세요: ");
            int first = scanner.nextInt();
            System.out.println("사칙연산 기호를 입력하세요: ");
            String sigh = scanner.next();
            char sign = sigh.charAt(0); // 튜터님께 물어보기 꼭 사용해야하는지(?)
            System.out.println("두번째 숫자를 입력하세요: ");
            int second = scanner.nextInt();

            //Calculator cal = new Calculator(first,sign,second);//직접 입력은 생성자로 활용이 어렵다.
            cal.calculate(first,sigh,second);

            if (0 == second && "/".equals(sigh)) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다."+'\n');
                continue; //해당 기능 사용해도 괜찮은지?
            }
            result = cal.calculate(first,sigh,second);
            System.out.println("결과는: " + result+'\n');
            cal.setCalculator(result);

            System.out.println("계속 계산하시겠습니까?");
            String end = scanner.next();

            if("exit".equals(end)) {
                cal.removeResult();//< 삭제 기능 가져오기
                System.out.print("첫번째 숫자를 삭제한 후 나머지 수: ");
                cal.getCalculator();// 배열 출력 방법
                System.out.println("계산기를 종료합니다 감사합니다."+'\n');
                break;
            }
        }

    }
}
