package MXDX02;

public class Customer {
    private String firstname;
    private String lastname;
    Account account = new Account(2000);
    public Customer(String firstname,String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
