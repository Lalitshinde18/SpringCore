import java.util.Scanner;
// 4.) Java program to swap two numbers without
//using third variable
public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a =sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Before Swapping: a = "+ a +", b "+b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after Swapping: a ="+ a+ ", b ="+b);

    }
}
