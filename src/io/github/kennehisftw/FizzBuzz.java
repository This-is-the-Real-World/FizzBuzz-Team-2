package io.github.kennehisftw;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Kenneth on 6/4/2014.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        final FizzBuzz fizzbuzz = new FizzBuzz();
        System.out.println("Fancy");
        fizzbuzz.fancy();
        System.out.println("\nSimple");
        fizzbuzz.simple();
        System.out.println("\nAnother way");
        fizzbuzz.anotherWay();
    }

    public void simple() {
        for (int i = 0; i <= 1000; i++) {
            if (i % 15 == 0) {
                System.out.println(i + " FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    public void anotherWay() {
        final Map<Integer, Type> fizzMap = new LinkedHashMap<>();
        for(int i = 0; i <= 1000; i++) {
            fizzMap.put(i, i % 15 == 0 ? Type.FIZZBUZZ : i % 5 == 0 ? Type.BUZZ : i % 3 ==  0 ? Type.FIZZ : Type.NAN);
        }
        for(int i : fizzMap.keySet()) {
            final Type type = fizzMap.get(i);
            System.out.println(i + " " + (type != Type.NAN ? type : ""));
        }
    }

    public void fancy() {
        for(int i = 0; i <= 1000; i++) {
            System.out.println(i % 15 == 0 ? (i + " FizzBuzz") : i % 5 == 0 ? (i + " Buzz") : i % 3 == 0 ? (i + " Fizz") : i);
        }
    }

    private enum Type {
        FIZZ, BUZZ, FIZZBUZZ, NAN;

        @Override
        public String toString() {
            return name().charAt(0) + name().substring(1).toLowerCase();
        }
    }

}
