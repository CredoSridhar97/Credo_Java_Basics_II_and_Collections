import java.util.Scanner;

class ScannernextInt {
  public static void main(String[] args) {

    // creates a Scanner object
    Scanner input = new Scanner(System.in);
System.out.println("Enter the Number");
    int num=input.nextInt();
    if (num%2==0)
    {
      System.out.println("Even Number");
    }
    else
    {
      System.out.println("Odd Number");
    }

    // System.out.println("Enter an integer: ");

    // // reads an int value
    // int data1 = input.nextInt();

    // System.out.println("Using nextInt(): " + data1);



    input.close();
  }
}