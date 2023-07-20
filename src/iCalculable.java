import java.util.List;
//интерфейс для калькулятора
public interface iCalculable {
  List<Integer> sum(int arg1, int arg2, int arg3, int arg4);

  List<Integer> multi(int arg1, int arg2, int arg3, int arg4);

  List<Integer> divide(int arg1, int arg2, int arg3, int arg4);

}