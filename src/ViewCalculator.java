
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ViewCalculator {

  private iCalculable calculator;

  public ViewCalculator(iCalculable calculator) {
    this.calculator = calculator;
  }

  public void run() {

    String cmd = prompt("Введите операцию с компелксными числами (*, +, /) : ");
    int argA = promptInt("Введите аргумент a первого комплексного числа: ");
    int argB = promptInt("Введите аргумент b первого комплексного числа: ");
    int argC = promptInt("Введите аргумент c второго комплексного числа: ");
    int argD = promptInt("Введите аргумент d второго комплексного числа: ");

    List<Integer> res = new ArrayList<Integer>();
    switch (cmd) {

      case "*":
        res = calculator.multi(argA, argB, argC, argD);
        resultOutput(res);
        break;
      case "/":
        res = calculator.divide(argA, argB, argC, argD);
        resultOutput(res);
        break;
      case "+":
        res = calculator.sum(argA, argB, argC, argD);
        resultOutput(res);
        break;

    }
  }

  private String prompt(String message) {
    Scanner in = new Scanner(System.in);
    System.out.print(message);
    return in.nextLine();

  }

  private int promptInt(String message) {
    Scanner in = new Scanner(System.in);
    System.out.print(message);
    return Integer.parseInt(in.nextLine());
  }

  private void resultOutput(List<Integer> res) {
    System.out.println("Результат равен: " + res.get(0) + " + " + res.get(1) + "i");
  }
}