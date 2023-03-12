package calculator.Factory;

import calculator.Calc.Calculable;
import calculator.Calc.CalculatorLogger;
import calculator.Log.Loggable;

public class CalculatorLoggerFactory implements ICalculableFactory{
    Loggable logger;
    private ICalculableFactory calcFactory;
    

    public CalculatorLoggerFactory(ICalculableFactory calcFactory, Loggable logger) {
        this.calcFactory = calcFactory;
        this.logger = logger;
    }


    @Override
    public Calculable create(int primaryArg) {
        return new CalculatorLogger(calcFactory.create(primaryArg), logger);
    }
    
}
