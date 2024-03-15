class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // inherited from Animal
        dog.bark(); // specific to Dog

        Cat cat = new Cat();
        cat.eat(); // inherited from Animal
        cat.meow(); // specific to Cat
    }
}