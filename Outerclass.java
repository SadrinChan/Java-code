class outer {

private double i =10.5;

private static String str ="hello";

class inner {

    int j;

   public void display(){

       j =5;

       System.out.println("j = "+j);

       System.out.println("i = "+i);

       System.out.println("str = "+str);

    }

  }

}

public class Outerclass {

    public static void main(String[] args){

         outer outobj =new outer();

         outer.inner innobj = outobj.new inner();

         innobj.display();

    }

}