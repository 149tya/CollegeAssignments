public class Program8 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(25,"Abbs",3.25);
        Student s3 = new Student(12);
        Student s4 = new Student(s2);

        System.out.println("Name: "+ s1.getName());
        System.out.println("Roll: " + s1.getRoll());
        System.out.println("Score: " + s1.getScore());

        System.out.println("\nName: "+ s2.getName());
        System.out.println("Roll: " + s2.getRoll());
        System.out.println("Score: " + s2.getScore());

        System.out.println("\nName: "+ s3.getName());
        System.out.println("Roll: " + s3.getRoll());
        System.out.println("Score: " + s3.getScore());

        System.out.println("\nName: "+ s4.getName());
        System.out.println("Roll: " + s4.getRoll());
        System.out.println("Score: " + s4.getScore());

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

    public Student(int roll) {
        this.name = null;
        this.roll = roll;
        this.score = 0;
    }

    public Student(int roll,String name) {
        this.name = new String(name);
        this.roll = roll;
        this.score = 0;
    }

    public Student(int roll,String name,double score) {
        this.name = new String(name);
        this.roll = roll;
        this.score = score;
    }

    public Student() {
        this.name = null;
        this.roll = -1;
        this.score = 0;
    }

    public Student(Student std) {
        this.name = new String(std.name);
        this.roll = std.roll;
        this.score = std.score;
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
    
 } 
