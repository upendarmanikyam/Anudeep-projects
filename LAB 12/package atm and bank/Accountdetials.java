package bank;
public class Accountdetials {
    private String bankname;
    private int accountnumber;
    protected int ifsccode;

    public Accountdetials(String bankname, int accountnumber, int ifsccode) {
        this.bankname = bankname;
        this.accountnumber = accountnumber;
        this.ifsccode = ifsccode;
    }

    public void Bankname() {
        System.out.println("Bank Name: " + bankname);
    }

    public void Accountnumber() {
        System.out.println("Account Number: " + accountnumber);
    }
    
    public void Ifsccode() {
        System.out.println("IFSC Code: " + ifsccode);
    }
}

