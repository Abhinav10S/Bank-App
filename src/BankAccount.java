public interface BankAccount {
    // withdraw money
    // check balance
    //get money
    //get totalInterest
    Boolean withdrawMoney (int money);
    Boolean addMoney(int money) ;
    int checkBalance () ;
    int getROI ();

    int geTotalIntrest(int principle , int timeInYears ) ;
}
