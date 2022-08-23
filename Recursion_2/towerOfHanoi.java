public class towerOfHanoi {

    public static void outTowerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        outTowerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        outTowerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;

        outTowerOfHanoi(n, "S", "H", "D");
    }
}
