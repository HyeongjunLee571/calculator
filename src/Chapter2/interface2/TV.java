package Chapter2.interface2;

public class TV implements electronics
{

    @Override
    public void turnOn() {
        System.out.println("Tv전원을 컵니다.");
    }

    @Override
    public void turnoff() {
        System.out.println("Tv전원을 끕니다.");
    }// 기능 구현때는 void > 다른 자료형은 계산 및 숫자

    @Override
    public int sum(int sum2, int sum3) {
        return sum2+sum3;
    }

    public void reset()
    {
        System.out.println("TV를 초기화 시킵니다.");
    }
}
