public class Main {
    public static void main(String[] args) {
        printSomeNumbers();
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
        for (int i = 6; i < 24; i++) {
            result += i;
        }
        return result;
    }

}