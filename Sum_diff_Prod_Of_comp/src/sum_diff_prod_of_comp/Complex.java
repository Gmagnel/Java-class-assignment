
package sum_diff_prod_of_comp;


public class Complex {
    int r, i;
   public Complex(int R, int I){
   r=R;
   i=I;
   }
   
   public static Complex sum(Complex a,Complex b){
   return new Complex((a.r + b.r),(a.i-b.i));
   }
   public static Complex diff(Complex a, Complex b){
   return new Complex((a.r-b.r),(a.i-b.i));
   }
   
   public static Complex prod(Complex a, Complex b){
   return new Complex(((a.r*b.r)-(a.i*b.i)),((a.r*b.i)+(a.i*b.r)));
   }
   public void printComplex(){
   if(r==0 && i !=0){
   System.out.print(i + "i");
   
   }
   else if(i==0 && r !=0){
   System.out.print(r);
   
   }
  
   else {
   System.out.print(r + "+" + i + "i" + "\n");
   }
   }
}
