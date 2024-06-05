public class FactorialSample {

  static long factorial(long num){
    long result = 1;
    for(; num > 0; num--){
      result *= num;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(factorial(20));
  }
}
