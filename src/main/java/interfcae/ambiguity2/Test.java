package interfcae.ambiguity2;



interface X{

    void m1();

    default public  void m2(){

        System.out.println("default implementation of m2");

    }


}
public class Test implements  X{


    public static void hello(){

        Test t=new Test();
        t.m2();
        new Test().m2();
        //X.super.m2(); //this won't work


    }
    @Override
    public void m1() {
        System.out.println("inside Test class m1 method");
    }

    public static void main(String[] args) {

        new Test().hello();
        hello();
    }


}
