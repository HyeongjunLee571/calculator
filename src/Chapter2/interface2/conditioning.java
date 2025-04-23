package Chapter2.interface2;

public class conditioning implements electronics
{

    @Override
    public void turnOn() {
        System.out.println("에어컨전원을 컵니다.");
    }

    @Override
    public void turnoff() {
        System.out.println("에어컨전원을 컵니다.");
    }

    @Override
    public int sum(int sum2, int sum3) {
        return 0;
    }

    public void reset()
    {
        System.out.println("에어컨을 자체점검합니다.");
    }
}
