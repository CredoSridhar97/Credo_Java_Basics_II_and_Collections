public class Recursion {
    public static void main(String[] agrs)
    {
        natprint(10);
    }
    public static void natprint(int n)
    {
        //Base Case 
        if(n==1){
            System.out.println(1);
        }
        // Recursion Case 
        else
        {
            System.out.println(n);
            natprint(n-1);
        }
    }
    
}
