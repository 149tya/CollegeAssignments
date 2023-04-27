import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter the string: ");
        s1 = sc.nextLine();
        s2 = s1;
        if(s1==s2) {
            System.out.println("They are same object!!");
        }
        System.out.println("Enter the first string: ");
        s1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        s2 = sc.nextLine();
        if(s1.equals(s2)) {
            System.out.println("The two string are equal!!");
        } else {
            System.out.println("The two strings are not equal!");
        }
        sc.close();
    }
}
