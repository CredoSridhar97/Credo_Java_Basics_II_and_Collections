public class Method2 {
  static void myMethod(String fname) {
    System.out.println(fname + " Systemz");
    System.out.print(fname);
  }

  static void myMethod1(String fname, String lname, int age)
  {
    System.out.println(fname + " " + lname + " " + age);
  }

  public static void main(String[] args) {
    System.out.println("Frist Name  - Last Name  - Age");
    myMethod1("Credo","Systemz",20);
    
   
  }
}
