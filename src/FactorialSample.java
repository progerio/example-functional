public class FactorialSample {

  static long factorial(long num){
    long result = 1;
    for(; num > 0; num--){
      result *= num;
    }
    return result;
  }

  static long factorialRec(long num) {
    return num == 1 ? 1 : num * factorialRec(num - 1);
}


  public static void main(String[] args) {
    System.out.println(factorialRec(20));
  }
}
