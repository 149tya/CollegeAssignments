import java.util.Scanner;
public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ip;
        System.out.println("Enter distance in mile: ");
        ip = sc.nextDouble();
        System.out.println("KM: " + Metric.toKm(ip));
        
        System.out.println("\nEnter distance in kilometer: ");
        ip = sc.nextDouble();
        System.out.println("Mile: " + Metric.toMile(ip));
        sc.close();
    }
}

class Metric {
    public static double toKm(double mile) {
        return mile*1.5;
    }

    public static double toMile(double km) {
        return km/1.5;
    }
}