
package area_and_perimeter_of_rectangle;


public class Rectangle {
    int len;
    int bre;
    public Rectangle(int le,int br){
        len=le;
        bre=br;
    }
    public int getAreaOfRectangle(){
    return len*bre;
    }
    
    public int getPerimeterOfRectangle(){
    return 2*(len*bre);
    }
    
}
