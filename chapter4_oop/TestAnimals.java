package chapter4_oop;

public class TestAnimals {
    public static void main(String[] args) {
        Animal a = new Animal("pluto", 18);
        Cat c = new Cat("Garfield", 5);
        Dog d = new Dog("fido",5);
        a.greet();
        c.greet();
        d.greet();

    }
    
}