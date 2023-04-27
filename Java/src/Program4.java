import java.util.Scanner;
public class Program4 {
    public static void main(String[] args) {
        final double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r = sc.nextDouble();
        double area = pi*r*r;
        System.out.println("Area: "+ area);
        sc.close();
    }
}
