public class Program9 {
    public static void main(String[] args) {
        BankAcct b1 = new BankAcct(01, 12000);
        System.out.println("Account no: " + b1.getAccNo() + "\t" + "Balance: " + b1.getBal());
        System.out.println("Interest rate: " + BankAcct.getIntr() + "\t" + "Interest: " + b1.calIterest());
        BankAcct.setIntr(3.6);
        System.out.println("\nAccount no: " + b1.getAccNo() + "\t" + "Balance: " + b1.getBal());
        System.out.println("Interest rate: " + BankAcct.getIntr() + "\t" +"Interest: " + b1.calIterest());
        
    }
}

class BankAcct {
    private static double intRate=5;
    private int accNo;
    private double bal=0;
    
    public BankAcct(int accNo,double bal) {
        this.accNo = accNo;
        this.bal = bal;
    }

    public int getAccNo() {
        return this.accNo;
    }
    public double getBal() {
        return this.bal;
    }

    public double calIterest() {
        return this.bal * intRate/100;
    }

    public static void setIntr(double intr) {
        intRate = intr;
    }

    public static double getIntr() {
        return intRate;
    }

}
