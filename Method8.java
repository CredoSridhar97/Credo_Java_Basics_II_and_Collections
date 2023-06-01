// Method Overloading
// With method overloading, multiple methods can have the same name with different parameters:
// Note: Multiple methods can have the same name as long as the number and/or type of parameters are different.

public class Method8 {
    static int plusMethodInt(int x, int y) {
      return x + y;
    }
    
    static double plusMethodDouble(double x, double y) {
      return x + y;
    }
    
    public static void main(String[] args) {
      int myNum1 = plusMethodInt(8, 5);
      double myNum2 = plusMethodDouble(4.3, 6.26);
      System.out.println("int: " + myNum1);
      System.out.println("double: " + myNum2);
    }
  }
  