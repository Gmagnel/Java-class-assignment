
package student_name_and_roll_no;


public class Student_Name_and_Roll_No {

   
    public static void main(String[] args) {
        //calling and initializing the student class
        Student stu=new Student();
        stu.name="John";
        stu.roll_no=2;
        System.out.print("The name of student is " + stu.name + " and the roll number is: " + stu.roll_no + "\n");
    }
    
}
