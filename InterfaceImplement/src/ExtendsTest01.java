import javax.swing.*;

public class ExtendsTest01 {
}

class AccountTest01{

    private String actno;
    private double balcnce;

    public AccountTest01(){}
    public AccountTest01(String actno, double balcnce){
        this.actno = actno;
        this.balcnce = balcnce;
    }

    public void setActno(String actno){
        this.actno = actno;
    }
    public String getActno(){
        return this.actno;
    }
    public void setBalcnce(double balcnce){
        this.balcnce = balcnce;
    }
    public double getBalcnce(){
        return this.balcnce;
    }

    @Override
    public String toString() {
        return "AccountTest01{" +
                "actno='" + actno + '\'' +
                ", balcnce=" + balcnce +
                '}';
    }
    
}

class CreditAccount{

    private String actno;
    private double balance;
    private double credit;

    public CreditAccount(){}
    public CreditAccount(String actno, double balance, double credit){
        this.actno = actno;
        this.balance = balance;
        this.credit = credit;
    }

    public void setActno(String actno){
        this.actno = actno;
    }
    public String getActno(){
        return this.actno;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setCredit(double credit){
        this.credit = credit;
    }
    public double getCredit(){
        return this.credit;
    }

    @Override
    public String toString() {
        return "CreditAccount{" +
                "actno='" + actno + '\'' +
                ", balance=" + balance +
                ", credit=" + credit +
                '}';
    }
}