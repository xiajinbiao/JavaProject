public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("zhangsan", 12345.0, 0.003);
        System.out.println(account);
        account.withdraw(100);
        account.deposit(10);

    }
}
