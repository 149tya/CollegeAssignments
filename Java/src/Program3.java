import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        int cm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length in cm: ");
        cm = sc.nextInt();
        double inches = (double) cm/2.54;
        double foot = inches/12;
        inches = inches%12;
        System.out.println("Feet: "+ foot);
        System.out.println("Inches : " + inches);
        sc.close();
    }
}
