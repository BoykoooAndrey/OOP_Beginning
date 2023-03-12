package calculator.Factory;

import calculator.Calc.Calculable;
import calculator.Calc.Calculator;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
