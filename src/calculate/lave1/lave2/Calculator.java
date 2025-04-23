package calculate.lave1.lave2;

//import java.io.BufferedOutputStream;

import java.util.ArrayList;
import java.util.List;

public class Calculator
{
    private Integer sum;
    private List<Integer> Calculator = new ArrayList<>();// 하나의 클래스 > 이게 ArrayList를 선언하는 올바른 방법
    //상위 리스트에서 하위 리스트를 받아 사용하기 위해 위와같이 선언
    //반대로 선언할 시 하위에서 > 상위로 되기때문에 하위에 있는 기능 사용이 어려움

    public List<Integer> getCalculator()
    {
       System.out.println(Calculator);
       return Calculator;
    } // 켈럭터 가져오는거 구현

    public void setCalculator(int sum)
    {
        this.sum = sum;
        Calculator.add(sum);
    }// 수정 구현

    public int calculate(int firstNumber, String calculation, int secondNumber)
    {
        if("+".equals(calculation))
        {
            sum = firstNumber + secondNumber;
        }
        else if("-".equals(calculation))
        {
            sum = firstNumber - secondNumber;
        }
        else if("*".equals(calculation))
        {
            sum = firstNumber * secondNumber;
        }
        else if("/".equals(calculation))
        {
            sum = firstNumber / secondNumber;
        }
        return sum;
    }

    public void removeResult()
    {
        Calculator.remove(Calculator.get(0));
    }
}
