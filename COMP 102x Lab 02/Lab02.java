import comp102x.IO;

public class Lab02
{
    
    public static void multiply()
    {
        // Please write your code after this line
        System.out.print("Enter an integer, x: ");
        int x = IO.inputInteger();
        System.out.print("Enter an integer, y: ");
        int y = IO.inputInteger();
        int answer = x*y;
        System.out.print("Answer = " + answer);
        
        
        
        
    }
    
    public static void calculateTriangleArea()
    {
        // Please write your code after this line
        System.out.print("Enter the width of the triangle: ");
        float width = IO.inputInteger();
        System.out.print("Enter the height of the triangle: ");
        float height = IO.inputInteger();
        float area = width*height/2;
        System.out.print("The triangle area = " + area);
        
        
        
        
    }
    
    public static void solveQuadraticEquation()
    {
        // Please write your code after this line
        System.out.print("Enter a: ");
        float a = IO.inputFloat();
        System.out.print("Enter b: ");
        float b = IO.inputFloat();
        System.out.print("Enter c: ");
        float c = IO.inputFloat();
        double x1 = ((b*(-1)) + Math.sqrt(b*b-4*a*c))/(2*a);
        double x2 = ((b*(-1)) - Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("First solution of x = " + x1);
        System.out.print("Second solution of x = " + x2);
        
        
        
        
        
    }
}
