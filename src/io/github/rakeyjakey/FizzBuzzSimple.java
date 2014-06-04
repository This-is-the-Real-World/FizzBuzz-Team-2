package io.github.rakeyjakey;

/**
 * Created by Jake on 6/4/14.
 */
public class FizzBuzzSimple {

    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {

            /**
             * This is true if the number is divisible by 3.
             */
            boolean fizz = i % 3 == 0;

            /**
             * This is true if the number is divisible by 5.
             */
            boolean buzz = i % 5 == 0;

            /**
             * This is true if the number is divisible by 3 and 5.
             */
            boolean fizzbuzz = i % 3 == 0 && i % 5 == 0;

            /*
             * If the number is divisible by 3 then "[Fizz]: " is printed.
             * If the number is divisible by 5 then "[Buzz]: " is printed.
             * If the number is divisible by 3 and 5 then "[FizzBuzz]: " is printed.
             * The number is then printed after.
             */

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
