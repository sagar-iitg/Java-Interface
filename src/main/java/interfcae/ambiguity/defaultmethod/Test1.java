package interfcae.ambiguity.defaultmethod;

interface X{

    void m1();

    default public  String m2(){

        System.out.println("default implementation of m2");
        return "m2 method";
    }
}


class Test1 implements X{



    @Override
    public String m2(){
        System.out.println("inside Test1 class m2 method");
        return "inside Test1 class m2 method ";

    }

    @Override
    public void m1() {

        System.out.println("inside Test1 class m1 method");
    }

    public static void main(String[] args) {
        new Test1().m2();

    }
}


class Demo implements X{


    //if we want , we can override default methods
    @Override
    public void m1() {
        System.out.println("inside Demo class m1 method");
    }
}
