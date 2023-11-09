package lk.ijse.design_pattern.Behavioral.Startegy_Design;

public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1*num2;
    }
}
