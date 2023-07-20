import java.util.ArrayList;
import java.util.List;

public class CalcDecorator implements iCalculable {

  private iCalculable oldCalc;
  private Logger logger;

  public CalcDecorator(iCalculable oldCalc, Logger logger) {
    this.oldCalc = oldCalc;
    this.logger = logger;
  }

  @Override
  public List<Integer> sum(int arg1, int arg2, int arg3, int arg4) {
    List<Integer> res = new ArrayList<Integer>();
    logger.log(String.format("Получены значения аргументов:%d,%d,%d,%d", arg1, arg2, arg3, arg4));
    logger.log(String.format("Запущен метод суммирования комплексных чисел"));
    res.add(arg1 + arg3);
    res.add(arg2 + arg4);
    logger.log("Получен результат");
    return res;

  }

  @Override
  public List<Integer> multi(int arg1, int arg2, int arg3, int arg4) {
    List<Integer> res = new ArrayList<Integer>();
    logger.log(String.format("Получены значения аргументов:%d,%d,%d,%d", arg1, arg2, arg3, arg4));
    logger.log(String.format("Запущен метод умножения комплексных чисел"));
    res.add(arg1 * arg3 - arg2 * arg4);
    res.add(arg1 * arg4 + arg2 * arg3);
    logger.log("Получен результат");
    return res;

  }

  @Override
  public List<Integer> divide(int arg1, int arg2, int arg3, int arg4) {
    List<Integer> res = new ArrayList<Integer>();
    logger.log(String.format("Получены значения аргументов:%d,%d,%d,%d", arg1, arg2, arg3, arg4));
    logger.log(String.format("Запущен метод деления комплексных чисел"));
    res.add((arg1 * arg3 + arg2 * arg4) / ((int) Math.pow(arg3, 2) + (int) Math.pow(arg4, 2)));
    res.add((arg2 * arg3 + arg1 * arg4) / ((int) Math.pow(arg3, 2) + (int) Math.pow(arg4, 2)));
    logger.log("Получен результат");
    return res;

  }

}