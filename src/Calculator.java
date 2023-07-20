import java.util.ArrayList;
import java.util.List;

public final class Calculator implements iCalculable {

  public Calculator() {

  }

  // методы суммирования, деления, умножения комплексных чисел. принимают на вход
  // 4 аргумента
  @Override
  public List<Integer> sum(int arg1, int arg2, int arg3, int arg4) {
    List<Integer> res = new ArrayList<Integer>();
    res.add(arg1 + arg3);
    res.add(arg2 + arg4);
    return res;
  }

  @Override
  public List<Integer> multi(int arg1, int arg2, int arg3, int arg4) {
    List<Integer> res = new ArrayList<Integer>();
    res.add(arg1 * arg3 - arg2 * arg4);
    res.add(arg1 * arg4 + arg2 * arg3);
    return res;
  }

  @Override
  public List<Integer> divide(int arg1, int arg2, int arg3, int arg4) {
    List<Integer> res = new ArrayList<Integer>();
    res.add((arg1 * arg3 + arg2 * arg4) / ((int) Math.pow(arg3, 2) + (int) Math.pow(arg4, 2)));
    res.add((arg2 * arg3 + arg1 * arg4) / ((int) Math.pow(arg3, 2) + (int) Math.pow(arg4, 2)));
    return res;
  }

}