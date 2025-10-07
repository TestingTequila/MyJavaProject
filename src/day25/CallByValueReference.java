package day25;

public class CallByValueReference {
    public void addition(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    private int a;//10000
    private int b;//20000

    public CallByValueReference(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void updateObject(CallByValueReference cbvr, int a, int b) {
        cbvr.a = a;
        cbvr.b = b;
    }
}
