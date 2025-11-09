package org.example;

class RethrowException {
    public void method1 (int a , int b){
          try {
              System.out.println(a/b);

          }
          catch (ArithmeticException e){
              throw e;
          }
    }
    public void method2 (int a , int b){
        try {
            method1(a,b);

        }
        catch (ArithmeticException e){
            throw e;
        }
    }

    public void method3 (int a , int b){
        try {
            method2(a,b);

        }
        catch (ArithmeticException e){
            System.out.println("Exception thrown at method 3 " + e.getMessage());
            throw e;
        }
    }



}
public class Question13 {

    public static void m3(int a, int b){

            System.out.println(a/b);


    }

    public static void m2(int a , int b){
        m3(a,b);
    }
    public static void m1(int a, int b){
        try{
            m2(a,b);

        }
        catch (ArithmeticException e){
            System.out.println("Exception handled on m1 "+ e.getMessage());
        }
    }
    public static void main(String[] args) {
//                m1(4,0);
                RethrowException obj = new RethrowException();
                try {
                    obj.method3(2,0);

                }
                catch (ArithmeticException e){
                    System.out.println("Exception rethrown at main " + e.getMessage());
                }
    }
}
