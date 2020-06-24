package chapter4_oop;

public class Dog  extends Animal{

    Dog(String name, int age) {
        super(name, age);
        // TODO Auto-generated constructor stub
        noise = "Woof!";
    }

    @Override
    public void greet() {
        // TODO Auto-generated method stub
        //super.greet();
        System.out.println("Dog "+ name + " says: "+makeNoise());
    }

    public void playFetch(){
        System.out.println("Fetch, "+ name + "!");
    }
    
}