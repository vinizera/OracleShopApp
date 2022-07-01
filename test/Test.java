

public class Test {
    
    public static void main(String[] args) {
   
        int x =  5;
        int y = 2;
        int z = divide(x, y);
        
        System.out.println(z);

    }
    
    public static int divide(int x, int y) {
        
        try {
            int z = x / y;
            return z;
        } catch (ArithmeticException z) {
            System.out.println("Não divide por zero cabeção!");
        }
        
        return 0;
    }
    
    

}

