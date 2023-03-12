package calculator;

import calculator.Factory.CalculableFactory;
import calculator.Factory.CalculatorLoggerFactory;
import calculator.Factory.ICalculableFactory;
import calculator.Log.FileLogger;
import calculator.View.ViewCalculator;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableFactory();
        ICalculableFactory calculableFactoryV2 = new CalculatorLoggerFactory(calculableFactory, new FileLogger("calclogger.txt"));
        ViewCalculator view = new ViewCalculator(calculableFactoryV2);
        view.run();
    }
}
