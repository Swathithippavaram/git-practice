
public class Demo076 {
    public static void main(String[] args) {
      int[] array = {10, 20, 30, 40, 50};
      int max = Integer.MIN_VALUE;
      int secondMax = Integer.MIN_VALUE;
      for (int i = 0; i < array.length; i++) {
        if (array[i] > max) {
          secondMax = max;
          max = array[i];
        } else if (array[i] > secondMax) {
          secondMax = array[i];
        }
      }
      System.out.println("2nd Max: " + secondMax);
    }
  }
  
