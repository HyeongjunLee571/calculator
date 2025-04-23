package calculator.lave3;
import java.util.ArrayList;
import java.util.List;

enum calculatingmachine
{
    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/");//하나의 클래스로 생각해서 활용

    private String operator;

    private calculatingmachine(String operator)
    {
        this.operator = operator;
    }

    public String getOperator()
    {
       return operator;
    }
}

public class Calculators
{
    //int sum;
    static calculatingmachine ADDITION = calculatingmachine.ADDITION;
    static calculatingmachine SUBTRACTION = calculatingmachine.SUBTRACTION;
    static calculatingmachine MULTIPLICATION = calculatingmachine.MULTIPLICATION;
    static calculatingmachine DIVISION = calculatingmachine.DIVISION;

    static String addition = ADDITION.getOperator();
    static String subtraction = SUBTRACTION.getOperator();
    static String multiplication = MULTIPLICATION.getOperator();
    static String division = DIVISION.getOperator();

    private int sum;
    private Number sum2;
    private double firstNumber;
    private double secondNumber;
    private List<Number> Calculator = new ArrayList<>();
    double CalculatorSize = Calculator.size();
    public Object[] doubles = Calculator.toArray();//

    public List<Number> getCalculator() {
        System.out.println(Calculator);
        return Calculator;
    }
   public void setCalculator(Number sum) {
        this.sum2 = sum;
        Calculator.add(sum);
    }

    public <T extends Number> double calculate(T firstNumber, String calculation, T secondNumber)
    {
        double result = 0;
        double value1 = firstNumber.doubleValue();
        double value2 = secondNumber.doubleValue();
        this.firstNumber = firstNumber.doubleValue();
        this.secondNumber = secondNumber.doubleValue();
        String calculation2 = calculation;

        if(addition.equals(calculation2)) {
            result = value1+value2;
        } else if (subtraction.equals(calculation2)) {
            result  = value1-value2;
        } else if(multiplication.equals(calculation2)) {
            result = value1*value2;
        }else if(division.equals(calculation2)) {
            result = value1/value2;
        }else{
            System.out.print("사칙연산 값이 아닌것을 입력하였습니다."+'\n');
        }
        return result;
    }

    public void removeResult()
    {
        Calculator.remove(Calculator.get(0));
    }

    public void setSum2() {
        List<Number> comparisonvalue = Calculator.stream()
                .filter(Value -> Value.doubleValue() > firstNumber && Value.doubleValue() > secondNumber)
                .toList(); // 복습 //필터링된 스트림을 리스트 형식으로 변환
        List<Number> minimumvalue = Calculator.stream()
                .filter(Value -> Value.doubleValue() < firstNumber && Value.doubleValue() < secondNumber)
                .toList(); // 복습 // 필터링된 스트림을 리스트 형식으로 변환

        System.out.println("입력값보다 큰 값: "+comparisonvalue);
        System.out.print("입력값보다 작은 값: "+minimumvalue);//리스트로 받아서 출력

    }

}