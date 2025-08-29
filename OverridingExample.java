class Animal {
    void sound() {
        System.out.println("Animals make sounds.");
    }
}

class Dog extends Animal {
    @Override   // annotation, not compulsory but good practice
    void sound() {
        System.out.println("Dog barks.");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.sound();   // Parent method

        Animal a2 = new Dog(); // reference of parent, object of child
        a2.sound();   // Child method (runtime polymorphism)
    }
}