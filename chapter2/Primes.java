package chapter2;


public class Primes {
    

    private static void printPrimes(int limits)
    {
        for (int i  = 0; i  < limits; i++) {
            if(isPrime(i))
                System.out.print(i);
        }
        System.out.println();
    }
    private static boolean isPrime(int x){
        if(x<=1)
            return false;
        else
            return !isDivisible(x, 2);
    }
    private static boolean isDivisible(int x,int k){
        int limit = (int) Math.round(Math.sqrt(x));
        for (int k1 = k; k1 <= limit; k1 += 1) {
            if (x % k1 == 0)
                return true;
        }
        return false;
    }
}