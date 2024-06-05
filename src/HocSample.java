import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HocSample {

  public static void main(String[] args) {
     var list = Arrays.asList("Orange", "Apple", "Banana", "Grape");
        // we are passing an array and an anonymous inner class instance of FnFactory as arguments to mapForEach method.
        var out = mapForEach(list, new FnFactory<String, Object>() {
            @Override
            public Object execute(final String it) {
                return it.length();
            }
        });
        System.out.println(out);
  }
    static <T, S> ArrayList<S> mapForEach(List<T> arr, FnFactory<T, S> fn) {
        var newArray = new ArrayList<S>();
        // We are executing the method from the FnFactory instance
        arr.forEach(t -> newArray.add(fn.execute(t)));
        return newArray;
    }
    @FunctionalInterface // this doesn't do anything it is just informative.
    public interface FnFactory<T, S> {
        // The interface defines the contract for the anonymous class
        S execute(T it);
    }
}
