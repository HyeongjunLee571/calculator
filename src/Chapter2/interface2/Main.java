package Chapter2.interface2;

public class Main
{
    public static void main(String[] args)
    {
        computer computer = new computer();
        conditioning conditioning = new conditioning();
        TV tv = new TV();


        //전자제품 오픈
        System.out.println("전자제품 전원을 켭니다.");
        tv.turnOn();
        computer.turnOn();
        conditioning.turnOn();

        System.out.println();

        //추가 기능
        System.out.println("전자제품 다른기능을 켭니다.");
        tv.reset();
        computer.reset();
        conditioning.reset();

        System.out.println();

        //전자제품 종료
        System.out.println("전자제품 전원을 끕니다.");
        tv.turnoff();
        computer.turnoff();
        conditioning.turnOn();
    }
}
