package interfcae.ambiguity.method;


interface A{


    void m1();


}


interface B{


    void m1();

}
public class Client implements A, B{


    public static void main(String[] args) {

        new Client().m1();

    }

    @Override
    public void m1() {


        System.out.println("inside m1 of Client");
    }
}
