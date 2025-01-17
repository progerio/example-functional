import java.util.function.Function;
import java.util.function.UnaryOperator;

public class LazySample {

	public static void main(String[] args) {
		UnaryOperator<Integer> add = t -> {
			System.out.println("executing add");
			return t + t;
		};
		UnaryOperator<Integer> multiply = t -> {
			System.out.println("executing multiply");
			return t * t;
		};
		System.out.println(addOrMultiply(true, add, multiply, 4));
		System.out.println(addOrMultiply(false, add, multiply, 4));
	}

	static <T, R> R addOrMultiply(boolean add, Function<T, R> onAdd, Function<T, R> onMultiply, T t) {
		return (add ? onAdd.apply(t) : onMultiply.apply(t));
	}
}
