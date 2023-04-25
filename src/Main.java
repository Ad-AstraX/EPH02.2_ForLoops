import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {

        starThing(5, 6);
    }
    public static void printSomeNumbers() {
        for (int i = 6; i < 24; i++) {
            System.out.println (i);
        }
    }
    public static void printNumbers(int start, int end) {
        for (int i = start; i < end+1; i++) {
            System.out.println (i);
        }
    }
    public static int sumUp(int start, int end) {
        int result = 0;
        for (int i = start; i < end+1; i++) {
            result += i;
        }
        return result;
    }
    public static int powerOfTwo(int p) {
        int power = 1;
        for (int i = 0; i < p; i++) {
            power *= 2;
        }
        return power;
    }
    public static int sumUpPowerOfTwo(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += powerOfTwo(i);
        }
        return sum;
    }
    public static void rectangleStars(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void rectangleStarsSave(int width, int height) {
        if (width > 0 && height > 0){
            rectangleStars(width, height);
        }
    }
    public static void triangleStars(int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width-i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printEvenNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static int sumUpThree(int von, int bis) {
        int sum = 0;
        for (int i = von; i <= bis; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void starThing(int width, int height) {
        for (int i = 0; i < height; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < width; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}