public class Fac{
    public static void main(String[] args) {
        int n = 4;
        int m = 1;
        for(int i = n; i>0; i--)
        {
            m = m*i; 
        }
        System.out.println("Factorial of two numbers " +n+" is "+m);
    }
}