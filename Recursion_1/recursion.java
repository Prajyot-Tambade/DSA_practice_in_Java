//Recurtion --> a function that call itself

//Stack Overflow --> if a recurtion funvtion runs infinitely at some point stack memory will be full and after that there will be no memory for any other function so it will give an error this condition is known as stack overflow.
public class recursion {

    public static void printNum(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNum(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;

        printNum(n);
    }

}
