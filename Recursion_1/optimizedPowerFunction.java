public class optimizedPowerFunction {

    public static int calPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        if (n % 2 == 0) { // if n is even
            return calPower(x, n / 2) * calPower(x, n / 2);
        } else { // if n is odd
            return calPower(x, n / 2) * calPower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int x = 2, n = 5;

        int xPower = calPower(x, n);

        System.err.println(xPower);
    }
}
