
public class drawTriangle {
    
    public static void drawTriangle1(int x){
        for (int i = 0; i < x; i++) {
           for ( int j = 0; j <=i; j++) {
               System.out.print("x");
           }
           System.out.println();
        }
    }
    public static void main(String[] args) {
        drawTriangle1(10);
    }
}