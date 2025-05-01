import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of thems");
        int number = sc.nextInt();

        int first = 0 ;
        int second = 1;
        int next ;

        System.out.println("Fibonacci series is : ");

        for(int i=0; i<=number; i++){
            System.out.println(first+"");

            next = first + second;
            first = second;
            second = next;
        }
        sc.close();


    }

}
