public class EagerSample {

	static int add(int x) {
		System.out.println("executing add");
		return x + x;
	}

	static int multiply(int x) {
		System.out.println("executing multiply");
		return x * x;
	}

	static int addOrMultiply(boolean add, int onAdd, int onMultiply) {
		return (add) ? onAdd : onMultiply;
	}

	public static void main(String[] args) {
		System.out.println(addOrMultiply(true, add(4), multiply(4)));
		System.out.println(addOrMultiply(false, add(4), multiply(4)));
	}
}
