package calculator.Calc;

import calculator.Log.Loggable;

/**
 * CalculatorLogger
 */
public class CalculatorLogger implements Calculable {

    private Calculable jornal;
    private Loggable logger;

    public CalculatorLogger(Calculable jornal, Loggable logger) {
        this.jornal = jornal;
        this.logger = logger;
        logger.saveToJornal("Первый аргумент " + jornal.getResult());
        
    }

    @Override
    public Calculable sum(int arg) {
        logger.saveToJornal("Суммируем " + arg);
        return jornal.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logger.saveToJornal("Уменожаем на" + arg);
        return jornal.multi(arg);
    }

    @Override
    public int getResult() {
        logger.saveToJornal("Результат - " + jornal.getResult());
        return jornal.getResult();
     }

    
}