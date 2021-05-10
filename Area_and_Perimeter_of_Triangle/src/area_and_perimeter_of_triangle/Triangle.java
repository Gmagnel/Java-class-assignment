
//a class for triangle
package area_and_perimeter_of_triangle;

public class Triangle {
    int a, b, c;
    public double getArea(){
    
    double sum=(a+b+c)/2.0;
    return Math.pow((sum*(sum-a)*(sum-b)*(sum-c)),.5);
    }
    
    public double getPerimeter(){
    return (a+b+c);
    }
}
