
public class App {
    public static void main(String[] args) {
        iCalculable calculator = new Calculator();//первый калькулятор

        iCalculable newCalcLog = new CalcDecorator(calculator, new Logger());//новый калькулятор с добавлением логирования
        
        ViewCalculator view = new ViewCalculator(newCalcLog);
        view.run();
    }
}