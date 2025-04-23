package Chapter2.wrapperclass;

public class Main
{
    public static void main(String[] args)
    {
        double sum = 10000000;

        long startTime1 = System.nanoTime();
        double sum1 = 0.0;
        for(double i = 0 ; i < sum ; i++)
        {
            sum1+=i*1.1;
        }
        long endTime1 = System.nanoTime();
        long primitiveTime = endTime1 - startTime1;

        long startTime2 = System.nanoTime();

        MyDouble sum3 = new MyDouble(0.0);
        for(double i = 0.0 ; i < sum ; i++)
        {
            sum3 = sum3.add(new MyDouble(i*1.1));// 새롭게 생성된 객체 변수의 담는방법
        }
        long endTime2 = System.nanoTime();
        long wrapperTime = endTime2 - startTime2;


        System.out.println("기본형(double) 연산 시간: " + primitiveTime + " ns");
        System.out.println("래퍼 클래스(Double) 연산 시간: " + wrapperTime + " ns");
        System.out.println("성능 차이 (배수): " + (double) wrapperTime / primitiveTime);
    }

}
