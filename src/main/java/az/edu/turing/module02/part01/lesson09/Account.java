package az.edu.turing.module02.part01.lesson09;

public class Account {

    private String iban;
    private AccountStatus status;

    public Account(String iban, AccountStatus status) {
        this.iban = iban;
        this.status = status;
    }
}
