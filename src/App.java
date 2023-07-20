

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class App {
    public static void main(String[] args) {
        iCalculable calculator = new Calculator();

        iCalculable newCalcLog = new CalcDecorator(calculator, new Logger());
        
        ViewCalculator view = new ViewCalculator(newCalcLog);
        view.run();
    }
}