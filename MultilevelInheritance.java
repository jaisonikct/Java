class Base {
    public void firstMethod() {
        System.out.println("first");
    }
}

class Sub extends Base {
    public void secondMethod() {
        System.out.println("second");
    }
}

class SubSub extends Sub {
    public void thirdMethod() {
        System.out.println("third");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        SubSub s = new SubSub();
        s.firstMethod();  // Method from Base class
        s.secondMethod(); // Method from Sub class
        s.thirdMethod();  // Method from SubSub class
    }
}