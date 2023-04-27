import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short a,b;
        System.out.print("Enter the first number: ");
        a = sc.nextShort();
        System.out.print("Enter the second number:");
        b = sc.nextShort();
        System.out.println("The sum is: " + (a+b));
        sc.close();
    }
}