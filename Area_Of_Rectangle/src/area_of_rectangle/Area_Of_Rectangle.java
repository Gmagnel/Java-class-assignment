
package area_of_rectangle;
import java.util.Scanner;
public class Area_Of_Rectangle {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double l, b;
        System.out.print("Please enter the length of the rectangle:"+ "\n");
        l=input.nextDouble();
        System.out.print("Please enter the breadth of the rectangle:"+ "\n");
        b=input.nextDouble();
        Area ar=new Area(l,b);
        System.out.print("The area of the rectangle is:" + ar.getArea()+ "\n");
        
    }
    
}
