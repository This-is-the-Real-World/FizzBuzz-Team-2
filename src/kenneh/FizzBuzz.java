package kenneh;

/**
 * Created by Kenneth on 6/4/2014.
 */
public class FizzBuzz {

    public FizzBuzz() {
        System.out.println("Simple answer");
        simple();
        System.out.println("\nFancy answer");
        fancy();
    }

    public void simple() {
        for(int i = 0; i <= 1000; i++) {
            if(i % 15 == 0) {
                System.out.println(i + " FizzBuzz");
            } else if(i % 5 == 0) {
                System.out.println(i + " Buzz");
            } else if(i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    public void fancy() {
        for(int i = 0; i <= 1000; i++) {
            System.out.println(i % 15 == 0 ? (i + " FizzBuzz") : i % 5 == 0 ? (i + " Buzz") : i % 3 == 0 ? (i + " Fizz") : i);
        }
    }

    public static void main(String[] args) {
        new FizzBuzz();
    }

}
