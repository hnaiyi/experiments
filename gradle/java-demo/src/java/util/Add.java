package util;

public class Add {
  
  private static int result;

  public Add(int a, int b) {
    result = a + b;
  }

  @Override
  public String toString() {
    return Integer.toString(result);
  }
}
