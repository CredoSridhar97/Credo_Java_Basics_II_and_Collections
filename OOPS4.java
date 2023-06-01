public class OOPS4 {
  final int x = 10;

  public static void main(String[] args) {
    OOPS4 myObj = new OOPS4();
    myObj.x = 25; // will generate an error
    System.out.println(myObj.x); 
  }
}
