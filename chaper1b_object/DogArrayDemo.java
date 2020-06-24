package chaper1b_object;

public class DogArrayDemo {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog(6);
        dogs[1] = new Dog(201);
        dogs[0].makeNoise();
    }
}