package com.sk.interfcae.ambiguity.variable;

interface  T1{

    public static  int value=10;

}

interface  T2 {

    int value=20;


}
public class Main implements T1,T2{


    public static void main(String[] args) {

        System.out.println(T1.value);
        System.out.println(T2.value);


    }
}
