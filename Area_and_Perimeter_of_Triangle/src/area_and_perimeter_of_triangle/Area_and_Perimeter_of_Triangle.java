
package area_and_perimeter_of_triangle;

public class Area_and_Perimeter_of_Triangle {

   
    public static void main(String[] args) {
        //calling the class triangle
       Triangle tri = new Triangle();
       tri.a=3;
       tri.b=4;
       tri.c=5;
       System.out.print("The area of the triangle is: " + tri.getArea() + "\n");
       System.out.print("The perimeter of the triangle is: "+ tri.getPerimeter()+ "\n");
    }
    
}
