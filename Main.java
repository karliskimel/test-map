import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(multiply(4, 5));
        System.out.println(multiplyRecursive(5, 3));
        System.out.println(power(4, 3));
        System.out.println(powerRecursive(3,3));
    }

    public static int add(int a, int b) {
        int d = a + b;
        return d;
    }

    public static int multiply(int a, int b) {
        int d = a;
        for (int z = 1; z < b; z++) {
            d = add(d, a);
        }
        return d;
    }
    public static int multiplyRecursive(int a, int b){
        return multiplyRecursive(a, a, b);
    }

    public static int multiplyRecursive(int A, int a, int b) {
        int d = add(a, A);
        int B = b - 1;
        if (b == 1) {
            return a;
        } else {
            int mul = multiplyRecursive(A, d, B);
            return mul;
        }
    }
    public static int power(int a, int b){
        int d= a;
        for(int z = 1; z < b; z++){
            d = multiply(d, a);
        }
        return d;
    }
    public static int powerRecursive(int a, int b){
     int d = multiply(a, a);
     int N = b - 1;
        if (b == 2) {
            return a;
        } else {
            int reiz = powerRecursive(d, N);
            return reiz;
        }

    }
}


