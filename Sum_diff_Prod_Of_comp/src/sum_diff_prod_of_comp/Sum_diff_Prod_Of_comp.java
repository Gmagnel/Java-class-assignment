
package sum_diff_prod_of_comp;

import java.util.Scanner;
public class Sum_diff_Prod_Of_comp {

    
    public static void main(String[] args) {
      int a, b,c,d;
      Scanner input=new Scanner(System.in);
      System.out.println("Please enter the first real number here:"+ "\n");
      a=input.nextInt();
      System.out.println("Please enter the second real number here:"+ "\n");
      b=input.nextInt();
      System.out.println("Please enter first imaginary number here:"+ "\n");
      c=input.nextInt();
      System.out.println("Please enter the second imaginary number here:"+ "\n");
      d=input.nextInt();
      System.out.print("================================="+ "\n");
 
      Complex rel= new Complex(a,b);
      Complex ima=new Complex(c,d);
      Complex sm=Complex.sum(rel, ima);
      Complex di=Complex.diff(rel, ima);
      Complex pr=Complex.prod(rel, ima);
       System.out.println("sum"+ "\n");sm.printComplex();
       System.out.println("difference"+ "\n");di.printComplex();
       System.out.println("product"+ "\n");pr.printComplex();
      
    }
    
}
