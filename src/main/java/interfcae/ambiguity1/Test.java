package interfcae.ambiguity1;


interface X{

    void m1();

    default public  void m2(){

        System.out.println("default implementation of m2");

    }


}
public class Test implements  X{


    public void hello(){

        X.super.m2();

        new Test().m2();




    }

    public  void m2(){

        System.out.println(" implementation of m2 in Test class");

    }
    @Override
    public void m1() {
        System.out.println("inside Test class m1 method");
    }

    public static void main(String[] args) {

        new Test().hello();

    }





}
