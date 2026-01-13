
public class memoryvisualization {

    public static void checkOdd(int x) {
        int a = 4;
        int b = 46;
        int c = 34;
        int d = 41;
        if (x % 2 != 0) {

            System.out.println("true");
        }
    }

    public static void printing(int x) {
        System.out.println(x);
    }

    public static void checkEven(int x) {
        if (x % 2 == 0) {
            System.out.println("yes");
        }
    }

    public static void main(String[] args) {
        int x = 10;
        checkOdd(x);
        printing(x);
        checkEven(x);
    }

}
