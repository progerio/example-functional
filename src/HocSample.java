import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class HocSample {

  public static void main(String[] args) {
    var list = Arrays.asList("Orange", "Apple", "Banana", "Grape");

    Collections.sort(list, (String a, String b) -> {
      return a.compareTo(b);
    });
    System.out.println(list);
    var out = mapForEach(list, it -> it.length());
    System.out.println(out);
  }

  static <T, S> ArrayList<S> mapForEach(List<T> arr, Function<T, S> fn) {
    var newArray = new ArrayList<S>();
    arr.forEach(t -> newArray.add(fn.apply(t)));
    return newArray;
  }

  @FunctionalInterface
  public interface FnFactory<T, S> {
    S execute(T it);
  }

  public static int sum(int a, int b) {
    return a + b;
  }
}
