public class Program2 {
    public static void main(String[] args) {
        for(String param: args) {
            System.out.println(param);
        }
        System.out.println("Total number of parameters : " + args.length);
    }
}
