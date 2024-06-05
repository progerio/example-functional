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
     System.out.println(list); // [Apple, Banana, Grape, Orange]
         // we are passing the array and a lambda expression as arguments to mapForEach method.
         var out = mapForEach(list, it -> it.length());
         // This can be further simplified to "mapForEach(list, String::length);", I'm writing the expanded version for readability
         System.out.println(out); // [6, 5, 6, 5]
  }
     static <T, S> ArrayList<S> mapForEach(List<T> arr, Function<T, S> fn) {
        var newArray = new ArrayList<S>();
        // We are executing the method from the Function instance
        arr.forEach(t -> newArray.add(fn.apply(t)));
        return newArray;
    }
    @FunctionalInterface // this doesn't do anything it is just informative.
    public interface FnFactory<T, S> {
        // The interface defines the contract for the anonymous class
        S execute(T it);
    }
}
