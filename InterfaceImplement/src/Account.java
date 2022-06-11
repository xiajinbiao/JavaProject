public class Account {
    private String id;
    private double balance;
    private double annualInterestRate;

    public Account(){

    }
    public Account(String id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }

    public void withdraw(double money){

        if (money <= 0){
            System.out.println("您输入的取款金额有误！！！");
        }else if (this.balance < money){
            System.out.println("余额不足！！！");
        }else {
//            this.balance -= money;
            this.setBalance(this.getBalance() - money);
            System.out.println("您的当前余额为：" + this.balance);
        }

    }

    public void deposit(double money){
        if (money <= 0.0){
            System.out.println("您输入的存款金额有误！！！");
        }else {
//            this.balance += money;
            this.setBalance(this.getBalance() + money);
            System.out.println("您的当前余额为：" + this.balance);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                '}';
    }
}
