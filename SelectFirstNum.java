package Streams.Example;

import java.util.Arrays;

public class SelectFirstNum {
    SelectFirstNum(int[] tabInt) {
    int[] resultArray = Arrays.stream(tabInt).filter(this::isPrime).toArray();
        for (int n : resultArray) {
            System.out.println("n: "+n);
        }
    }
    boolean isPrime(int num ){
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;

    };

    public static void main(String[] args) {
      int[] tabInt = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,67,81,181,151,101,101,203,141,541,231 };
      new SelectFirstNum(tabInt);
//      result:
//        n: 0
//        n: 1
//        n: 2
//        n: 3
//        n: 4
//        n: 5
//        n: 7
//        n: 9
//        n: 11
//        n: 13
//        n: 67
//        n: 181
//        n: 151
//        n: 101
//        n: 101
//        n: 541
      int[] res = Arrays.stream(tabInt).filter(x -> {
          for (int i = 2; i < Math.sqrt(x); i++) if (x % i == 0) return false;
          return true;
      }).toArray();

        for (int n : res)   System.out.println("n: "+n);
//        n: 0
//        n: 1
//        n: 2
//        n: 3
//        n: 4
//        n: 5
//        n: 7
//        n: 9
//        n: 11
//        n: 13
//        n: 67
//        n: 181
//        n: 151
//        n: 101
//        n: 101
//        n: 541
    }
}
