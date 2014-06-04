package io.github.rakeyjakey;

/**
 * Created by Jake on 6/4/14.
 */
public class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            boolean fizz = i % 3 == 0;
            boolean buzz = i % 5 == 0;
            boolean fizzbuzz = i % 3 == 0 && i % 5 == 0;

            if (fizzbuzz)
                System.out.print("[FizzBuzz]: ");
            else if (fizz)
                System.out.print("[Fizz]: ");
            else if (buzz)
                System.out.print("[Buzz]: ");


            System.out.println(i);
        }
    }
}
