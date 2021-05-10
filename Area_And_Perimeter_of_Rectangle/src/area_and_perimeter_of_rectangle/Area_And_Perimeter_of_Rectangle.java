
package area_and_perimeter_of_rectangle;


public class Area_And_Perimeter_of_Rectangle {

   
    public static void main(String[] args) {
        //calling class rectangle and method for (4,5)
        Rectangle first_area_and_perimeter=new Rectangle(4,5);
        Rectangle second_area_and_perimeter=new Rectangle(5,8);
        //print the first numbers(4 and 5)to the screen
        System.out.print("The area of the rectangle(4, 5) is: " + first_area_and_perimeter.getAreaOfRectangle()
                +"\n" + "and the perimeter is: "+ first_area_and_perimeter.getPerimeterOfRectangle()+ "\n");
        //print the second numbers(5 and 8)to the screen
        System.out.print("The area of the rectangle(5, 8) is: " + second_area_and_perimeter.getAreaOfRectangle()
                +"\n" + "and the perimeter is: "+ second_area_and_perimeter.getPerimeterOfRectangle()+ "\n");
    }
    
}
