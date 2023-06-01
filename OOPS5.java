public class OOPS5 {
  int x = 5;

  public static void main(String[] args) {
    OOPS5 myObj1 = new OOPS5();
    OOPS5 myObj2 = new OOPS5();
    myObj2.x = 25;
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}
