package Chapter2.interface2;

public class computer implements electronics
{

    @Override
    public void turnOn() {
        System.out.println("컴퓨터전원을 컵니다.");
    }

    @Override
    public void turnoff() {
        System.out.println("컴퓨터전원을 끕니다.");
    }

    @Override
    public int sum(int sum2, int sum3) {
        return 0;
    }

    public void reset()
    {
        System.out.println("컴퓨터를 초기화합니다.");
    }
}
