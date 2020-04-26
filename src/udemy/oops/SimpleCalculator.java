package udemy.oops;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;
    public void setFirstNumber(double firstNumber)
    {
        this.firstNumber=firstNumber;
    }
    public double getFirstNumber()
    {
        return  this.firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult() {
        return getFirstNumber()+getSecondNumber();
    }
    public double getSubtractionResult() {
        return getFirstNumber()-getSecondNumber();
    }
    public double getMultiplicationResult() {
        return getFirstNumber()*getSecondNumber();
    }
    public double getDivisionResult() {
        if(getFirstNumber()==0||getSecondNumber()==0)
            return 0.0;
        else
            return getSecondNumber()/getFirstNumber();
    }
}
