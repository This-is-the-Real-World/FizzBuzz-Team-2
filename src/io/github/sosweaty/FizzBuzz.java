package io.github.sosweaty;

/**
 * Created by Jamie on 06/06/2014.
 */

public class FizzBuzz {

    public static void main(String[] args) {

        //targets set i to 0 if i is less than 1000 than add 1 to i
        for (int i = 0; i <= 1000; i++)
            //if i is a multiple of 3 & 5 print fizzbuzz + i
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz :" + i);

                //else if i is a multiple of 3 print fizz + i
            else if (i % 3 == 0)
                System.out.println("Fizz :" + i);

                //else if i is a multiple of 5 print buzz + i
            else if (i % 5 == 0)
                System.out.println("Buzz :" + i);
                //else if i is not a multiple of 5 and 3 print i
            else
                System.out.println(i);

    }
}

