public class Program6 {
    static void show(int a) {
        System.out.println("This is an Integer");
        System.out.println("Value: " + a);
    }
    static void show(double a) {
        System.out.println("This is a double");
        System.out.println("Value: " + a);
    }
    public static void main(String[] args) {
        show(45);
        show(9.99);
        show((short)5);
    }
}
