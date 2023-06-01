//filename: Main.java
public class OOPS11 {
  int modelYear;
  String modelName;

  public OOPS11(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    OOPS11 myCar = new OOPS11(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}
