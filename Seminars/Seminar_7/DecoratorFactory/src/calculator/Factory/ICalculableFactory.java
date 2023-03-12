package calculator.Factory;

import calculator.Calc.Calculable;

public interface ICalculableFactory {
    Calculable create(int primaryArg);
}
