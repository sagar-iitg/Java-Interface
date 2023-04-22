package com.sk.interfcae.diamond;

interface Test1{

    public abstract void m1();


}


interface Test2{

    public abstract void m2();

}


public class Test implements Test1,Test2 {


    public static void main(String[] args) {

        new Test().m1();
        new Test().m2();


    }

    @Override
    public void m1() {
        System.out.println("Test1 m1 method");
    }

    @Override
    public void m2() {
        System.out.println("Test2 m2 method");
    }
}

