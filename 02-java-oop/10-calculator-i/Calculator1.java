public class Calculator1 {
    private double input1;
    private double input2;
    private double result;
    private char operator;

    public void Calculator() {

    }
    public void Calculator(double input1,char operator, double input2) {
		this.input1 = input1;
		this.input2 = input2;
        this.operator = operator;
    }
    public void setOperandOne(double num1) {
        this.input1 = num1;
    }
    public double getInput1() {
        return this.input1;
    }
    public void setOperation(char operator ) {
        this.operator = operator;
    }
    public char getOperator() {
        return this.operator;
    }
    public void setOperandTwo(double num2) {
        this.input2 = num2;
    }
    public double getInput2() {
        return this.input2;
    }
    public void performOperation() {
        if(this.operator == '+') {
			this.result = this.getInput1() + this.getInput2();
		}
		else if(this.operator == '-') {
			this.result = this.getInput1() - this.getInput2();
		}
		else {
			System.out.println("Error: Only accepts + or - as operators.");
		}
    }
    public void getResults(){
        System.out.println("Result: " + this.result);
    }
}