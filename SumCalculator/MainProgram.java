package SumCalculator;
public class MainProgram {

    public static void main(String args[]){
        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5);
        calculator.setSecondNumber(10);

        System.out.println("This is the addition result: " + calculator.getAdditionResult());

    }
}
