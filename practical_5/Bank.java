class BankDetail {
    String customer_name;
    int balance;
    char acc_type;

    // static
    static String b_name = "ICICI";

    BankDetail(String c_name, int bal, char ac_type) {
        this.customer_name = c_name;
        this.balance = bal;
        this.acc_type = ac_type;
    }

    public boolean withdraw_amt(int amt) {
        if (amt > this.balance) {
            return false; // insufficient balance
        } else {
            this.balance -= amt;
            return true;
        }
    }

    public boolean add_amt(int amt) {
        this.balance += amt;
        return true;
    }

    public void show_details() {
        System.out.println("Customer: " + customer_name);
        System.out.println("Account Type: " + acc_type);
        System.out.println("Balance = " + balance);
        System.out.println("--------------------");
    }
}

public class Bank {
    public static void main(String[] args) {
        BankDetail c1 = new BankDetail("xyz", 1000, 's');

        c1.show_details();

        c1.add_amt(900);
        c1.show_details();

        boolean b = c1.withdraw_amt(90);

        if (!b) {
            System.out.println("Not Sufficient Balance");
        } else {
            System.out.println("SUCCESS");
            c1.show_details();
        }
    }
}
