import java.util.function.Function;

public class ClosureSample {

  Function<Integer, Integer> add (final int x) {
    var partial = new Function<Integer,Integer>() {
      @Override
      public Integer apply(Integer y) {
        return x + y;
      }
    };
    return partial;
  }

  public static void main(String[] args) {
    ClosureSample sample = new ClosureSample();

    var add10 =  sample.add(10);
    var add20 = sample.add(20);
    var add30 = sample.add(30);

    System.out.println(add10.apply(5));
    System.out.println(add20.apply(5));
    System.out.println(add30.apply(5));
  }
}
