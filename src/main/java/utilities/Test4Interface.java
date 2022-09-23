package utilities;

public class Test4Interface implements Ia,Ib {

    @Override
    public void hi() {
        Ia.super.hi();
    }

//    @Override
//    public void print() {
//        System.out.println(this.getClass().getName());
//    }
//    @Override
//    public String print(){
//        return null;
//    }
}
