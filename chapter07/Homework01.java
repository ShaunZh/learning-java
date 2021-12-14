
public class Homework01{
  public static void main(String[] args) {
    double[] arr= {1.0, 120.3, 0.12, 3, 4, 90.2, 120.4, 120.4};
    A01 a01 = new A01();
    double maxValue = a01.max(arr);
    System.out.println("max value " + maxValue);
  }
}

class A01 {
  public double max(double[] arr) {
    int index = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > arr[index]) {
        index = i;
      }
    }
    return arr[index];
  }
}