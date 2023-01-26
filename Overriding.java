package com.mycompany.overriding;

class A {
    int a,b,c;
   A(int x,int y,int z){
     a=x;
     b=y;
     c=z;
   }
   void show(){
       System.out.println("A,B and C = "+a+" "+b+" "+c);
   }
}

class B extends  A {
    
    int m;
    B(int x,int y,int z,int k){
        super(x,y,z);
        m=k;    
    }
    @Override
    void show(){
        super.show();
        System.out.println("M ="+m);
    }
}
public class Overriding {

    public static void main(String[] args) {
      B ob = new B(10,20,30,40);
      ob.show();
}

}