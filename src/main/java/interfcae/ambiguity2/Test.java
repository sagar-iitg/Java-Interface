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
       // X.super.m2(); //this won't work due to static method--- hello()



    }

    //default method
    @Override public  void m2(){

        System.out.println("inside Test Class implementation of m2");

    }
    @Override
    public void m1() {
        System.out.println("inside Test class m1 method");
    }

    public static void main(String[] args) {

        //new Test().hello();
        //m1();
        hello();
        new Test().hi();


    }

    public void hi(){
            X.super.m2();

    }


}

