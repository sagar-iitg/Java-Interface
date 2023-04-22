package com.sk.interfcae.ambiguity1;



interface X{

    void m1();

    default public  void m2(){

        System.out.println("default implementation of m2");

    }


}
public class Test implements  X{


    public void hello(){
        new Test().m2();
        X.super.m2();


    }
    @Override
    public void m1() {
        System.out.println("inside Test class m1 method");
    }

    public static void main(String[] args) {
        new Test().hello();
    }


}
