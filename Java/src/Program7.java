// import java.util.Scanner;
// import java.util.ArrayList;

public class Program7 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student();
        s1.setName("Aditya");
        s1.setRoll(38);
        s1.setScore(5.6);

        System.out.println("Name: "+ s1.getName());
        System.out.println("Roll: " + s1.getRoll());
        System.out.println("Score: " + s1.getScore());

        Student s2 = new Student();

        s1.copy(s2);
        System.out.println("\nName: "+ s2.getName());
        System.out.println("Roll: " + s2.getRoll());
        System.out.println("Score: " + s2.getScore());

        if(s1==s2) {
            System.out.println("This is not deep copy");
        } else {
            System.out.println("This is deep copy");
        }

    }    
}

class Student {
    private int roll;
    private String name;
    private double score;

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = new String(name);
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getRoll() {
        return this.roll;
    }

    public String getName() {
        return this.name;
    }

    public double getScore() {
        return this.score;
    }

    public void copy(Student std) {
        std.name =  new String(this.name);
        std.roll = this.roll;
        std.score = this.score;
    }
 } 
