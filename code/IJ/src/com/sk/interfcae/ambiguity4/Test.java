package com.sk.interfcae.ambiguity4;



interface X{



    default public  void m2(){

        System.out.println(" m2  method of X interface");

    }


}

class Y{


     public  void m2(){

        System.out.println(" m2  method of Y class");

    }


}



public class Test extends Y implements  X {


    public static void main(String[] args) {
        Test t=new Test();
        t.m2();

    }

}
