package question18Calculator;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);

        System.out.println("add= " + calculator.getAdditionResult()); // Output: add= 9.0
        System.out.println("subtract= " + calculator.getSubtractionResult()); // Output: subtract= 1.0

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);

        System.out.println("multiply= " + calculator.getMultiplicationResult()); // Output: multiply= 0.0
        System.out.println("divide= " + calculator.getDivisionResult()); // Output: divide= 0.0
    }

}
