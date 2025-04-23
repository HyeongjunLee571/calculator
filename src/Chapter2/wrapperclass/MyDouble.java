package Chapter2.wrapperclass;

public class MyDouble
{
    private final double value;

    public MyDouble(double value)
    {
        this.value = value;
    }

    public double getValue()
    {
        return value;
    }

    public MyDouble add(MyDouble other)//메소드로 객체 생성 예시
    {
        return new MyDouble(this.value+other.value);// 생성한 객체 리턴하는 방법 //객체끼리는 연산이 불가 > 단 객체의 값들은 가능
    }

    @Override
    public  String toString()
    {
        return String.valueOf(value);
    }
}
