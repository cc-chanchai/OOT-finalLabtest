package oot;

public class Sample {
    public static void main(String[] args) {
        String[]s = {"2:2","3:3:3","12:1","6:0","9:99"};
        Foo a = new Foo("foo");
        Foo b = new Boo("boo");
        a.printMin(31254);
        b.printMin(31254);
        b.printMin(521);
        printMul((Boo)b,s);
    }
    public static void printMul(Sout x, String[]str){
        x.multiply(str);
    }
}
