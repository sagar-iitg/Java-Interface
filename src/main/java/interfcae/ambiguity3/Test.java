package interfcae.ambiguity3;



interface X{



    default public  void m2(){

        System.out.println("default implementation of m2 of X interfcae");

    }


}

interface Y{


    default public  void m2(){

        System.out.println("default implementation of m2 of Y of interface");

    }


}



public class Test implements  X,Y{


    public static void main(String[] args) {
        Test t=new Test();
        t.m2();
        //X.super.m2();
    }
    @Override
    public void m2() {
        //X.super.m2();
        System.out.println("In test class");
    }
}
