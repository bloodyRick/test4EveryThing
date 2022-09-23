package utilities;

public class Child extends Parent {
    @Override
    public void p(){
        System.out.println("child");
    }

    public static void main(String[] args) {
        Parent c = new Child();
        c.p();
    }
}
