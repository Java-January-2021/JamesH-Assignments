public class Calculator1Test {
    public static void main(String[] args) {
        Calculator1 calc = new Calculator1();
        calc.setOperandOne(10.5);
        calc.setOperation('+');
        calc.setOperandTwo(5.2);
        calc.performOperation();
        calc.getResults();
    }
}