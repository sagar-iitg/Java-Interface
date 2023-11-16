package interfcae.test;



interface X{

    default void fun(){
        System.out.println("default fun method in in interface X");
    }
}
public class Main implements X{

    public void  fun(){
        System.out.println("fun method in class Main ");
    }


    public void hello(){
        X.super.fun();
    }
    public static void main(String[] args) {

        new Main().fun();
        new Main().hello();




    }
}
