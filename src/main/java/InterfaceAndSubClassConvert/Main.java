package InterfaceAndSubClassConvert;

public class Main {
    public static void main(String[] args) {
        Interface1 i1 = new ConstrateClass1();
        Interface1 i11 = new ConstrateClass11();

        ConstrateClass1 c1 = (ConstrateClass1)i11;
        c1.inter();

        ConstrateClass11 c11 = (ConstrateClass11)i11;
        c11.inter11();
    }
}
