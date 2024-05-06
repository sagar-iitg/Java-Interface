package interfcae.diamondexample;


interface Interface1 {
    void method1();
}

interface Interface2 {
    void method1();
}

class Check{
    void method1(){
        System.out.println("inside check class");
    }
}
public class MyClass extends Check implements  Interface1,Interface2{

    @Override
    public void method1() {
        System.out.println("inside Myclass");

    }

    public static void main(String[] args) {
        MyClass obj=new MyClass();
        obj.method1();
        Check obj1=new Check();
        obj1.method1();

    }
}
