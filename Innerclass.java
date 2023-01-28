
package com.mycompany.innerclass;
class Nonstatic{
    void text(){
        A ob =new A();
        System.out.println( "return Value : "+ob.show(10));
    }
   public class A{       
         int show(int x){
            return x*x;
        }
    }
}
class  Static{

    void text2(){
        System.out.println("X + Y = "+B.display(10,20));
    }
   public  static class B{
     static   int display(int x,int y){
            return x + y;
        }
    }
 
 }

public class Innerclass {

    public static void main(String[] args){
        Nonstatic sc = new Nonstatic();
        Static sc1 = new Static();
        sc.text();
        sc1.text2();   
    }
}
