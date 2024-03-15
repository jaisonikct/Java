interface Parent1 {
    void method1();
}

interface Parent2 {
    void method2();
}

class Child implements Parent1, Parent2 {
    public void method1() {
        System.out.println("Method 1 implementation");
    }

    public void method2() {
        System.out.println("Method 2 implementation");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.method1();
        obj.method2();
    }
}