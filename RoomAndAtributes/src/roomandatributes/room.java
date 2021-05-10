
package roomandatributes;

public class room {
    int roomno;
   String roomType;
float roomArea;
boolean acMachine;

void setData(int rno, String rt, float area, boolean ac){
roomno = rno;
roomType = rt;
roomArea = area;
acMachine = ac;
}
void displayData(){
System.out.println("The room is:" + roomno);
System.out.println("The room type is:" + roomType);
System.out.println("The room area is:" + roomArea);
String ac=(acMachine)? "yes" : "no";

System.out.println("The A/C Machine needed :" + ac);

}

    void setData(int i, String deluxe, double d, String yes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
