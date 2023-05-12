import java.util.UUID;

public class HDFCBankAccount implements BankAccount {
    private  String accountNumber ;

    private int balance;
    private int roi; // 5%

    public HDFCBankAccount(int balance) {
        this.balance = balance;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.roi = 5 ;
    }

    public HDFCBankAccount(int balance, int roi) {
        this.balance = balance;
        this.roi = roi;
        this.accountNumber = String.valueOf(UUID.randomUUID());
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getRoi() {
        return roi;
    }

    public void setRoi(int roi) {
        this.roi = roi;
    }

    public int getBalance(int balance) {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    @Override
    public Boolean withdrawMoney(int money) {
        if (this.balance >= money) {
            this.balance = this.balance - money;
            return true;
        }
        return false;
    }

    @Override
    public Boolean addMoney(int money) {
       this.balance = this.balance + money ;
       return true ;
    }

    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public int getROI() {
        return this.roi;
    }

    @Override
    public int geTotalIntrest(int principle, int timeInYears) {
        return principle*timeInYears*roi/100;
    }
}
