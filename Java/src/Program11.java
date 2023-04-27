public class Program11 {
    public static void main(String[] args) {
        Textbook tb = new Textbook("ABC","PQR","XYZ");
        Instructor ins = new Instructor("KELELE","45565464");
        Course c1 = new Course("Course 1",tb,ins);

        System.out.println("Course Name: " + c1.getName());
        System.out.println("Instructor: " + c1.getIns().getName());
        System.out.println("Instructor phone: " + c1.getIns().getPhone());
        System.out.println("Textbook title: " + c1.getTb().getTitle());
        System.out.println("Textbook author: " + c1.getTb().getAuthor());
        System.out.println("Textbook publisher: " + c1.getTb().getPublisher());
    }
}

class Instructor {
    private String name;
    private String phone;
    public Instructor(String name,String phone) {
        this.name = new String(name);
        this.phone = new String(phone);
    }
    public void setPhone(String phone) {
        this.phone = new String(phone);
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }
}

class Textbook {
    private String author,title,publisher;
    public Textbook(String author,String title,String publisher) {
        this.title = new String(title);
        this.author = new String(author);
        this.publisher = new String(publisher);
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

class Course {
    private String name;
    private Instructor ins;
    private Textbook tb;

    public Course(String name,Textbook tb,Instructor ins) {
        this.name = new String(name);
        this.tb = tb;
        this.ins = ins;
    }

    public Instructor getIns() {
        return ins;
    }

    public String getName() {
        return name;
    }

    public Textbook getTb() {
        return tb;
    }

    public void setIns(Instructor ins) {
        this.ins = ins;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTb(Textbook tb) {
        this.tb = tb;
    }
}
