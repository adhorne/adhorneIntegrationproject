package adhorneIntegration;

public class Java8Tester {

  public static void main(String[] args) {
    // Lambda expression syntax should be (parameter -> expression body)
    Java8Tester tester = new Java8Tester();
    // Using the build in MathOperations to add to numbers together.
    // Written in the lambda syntax which is a different way to code the same
    // program.
    MathOperation addition = (int a, int b) -> a + b;
    System.out.println("10 + 5 = " + tester.operate(10, 5, addition));

  }

  interface MathOperation {
    int operation(int a, int b);
  }

  private int operate(int a, int b, MathOperation mathOperation) {
    return mathOperation.operation(a, b);
  }
}
