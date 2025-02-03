package reviewjdbc;

public class SubClass extends BaseClass {
    public static void main(String[] args) {
        BaseClass base = new SubClass();

        base.method1();  // Output: Sub method1
        base.method2();  // Output: Base method3
    }

    public void method1() {
        System.out.println("Sub method1");
    }

    public void method2() {
        System.out.println("Sub method2");
    }
}

class BaseClass {
    public void method1() {
        System.out.println("Base method1");
    }

    public void method2() {
        System.out.println("Base method3");
    }
}