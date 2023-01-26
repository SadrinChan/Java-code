package ovverloading;

class Figure{
double d1;
double d2;
double d3;



Figure(double a, double b,double c)
{
    d1=a;
    d2=b;
    d3=c;
 
}
Figure(double a, double b){
    d1=a;
    d2=b;
}
Figure(Figure ob){
    
 d1=ob.d1;
 d2=ob.d2;
 d3=ob.d3;
}
void test(Figure sc){
  
   sc.d1*=2;
   sc.d2/=4;
   sc.d3+=10;
    
}
}
public class Ovverloading {

    
    public static void main(String[] args) {
        
       Figure ob1 = new Figure(10,20,30);
       Figure ob3 = new Figure(ob1);
      
     ob3.test(ob3);
     
        System.out.println("sc.d1* = "+ob3.d1+ "\nsc.d2 / = "+ob3.d2+ "\nsc.d3 + = "+ob3.d3);
       
    }
}