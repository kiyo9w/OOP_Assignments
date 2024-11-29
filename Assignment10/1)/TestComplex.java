public class TestComplex {
    public static void main(String[] args) {
       
        Complex c1 = new Complex(2.0, 3.0);
        Complex c2 = new Complex(1.0, 4.0);
        Complex c3 = c1.addReturnNew(c2);
        c1.print();
        c2.print();
        c3.print();
        
       
        c1.addInto(c2);
        c1.print();
    }
}
