public class Swap{
    public static void main(String[] args) {
        int a = 25;
        int b = 12;

        System.out.println("Before swapping: a = " + a + " , b = " + b);
        // Logic for Swapping
        a = a + b; // 25 + 12 = 37
        b = a - b; // 37-12 = 25
        a = a - b; // 37 - 25 = 12
        
        System.out.println("After Swapping : a =" + a + " , b="+b);
        }

        
    }
