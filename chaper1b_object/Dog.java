package chaper1b_object;

public class Dog {
    public int weightInPounds;

    public Dog(int n)
    {
        weightInPounds = n;
    }
    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yipyipyip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark. bark.");
        } else {
            System.out.println("woof!");
        }
    }    
}