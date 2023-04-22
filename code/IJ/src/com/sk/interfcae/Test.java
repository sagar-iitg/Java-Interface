package com.sk.interfcae;


abstract class Test1{

    public abstract void m1();


}


abstract class Test2{

    public abstract void m1();

}


public class Test extends Test1{


    public static void main(String[] args) {
        new Test().m1();
    }

    @Override
    public void m1() {
        System.out.println("Test1 m1 method");
    }
}
