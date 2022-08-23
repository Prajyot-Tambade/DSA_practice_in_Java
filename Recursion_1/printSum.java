//Printing sum of first n natural numbers

import java.util.*;

public class printSum {

    public static void print(int i, int n, int sum) {

        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;

        print(i + 1, n, sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = sc.nextInt();
        int sum = 0;

        print(i, n, sum);
    }
}
