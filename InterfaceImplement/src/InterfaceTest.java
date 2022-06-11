import java.util.Scanner;

public class InterfaceTest {

    public static void main(String[] args) {

        AmericaCook americaCook = new AmericaCook();
        ChinaCook chinaCook = new ChinaCook();

        Customer customer = new Customer(chinaCook);
        customer.getFoodMenu().xiHongShiChaoJiDan();
        customer.getFoodMenu().yuXiangRouSi();

        System.out.println("--------------------------");

        Customer customer1 = new Customer(americaCook);
        customer1.getFoodMenu().xiHongShiChaoJiDan();
        customer1.getFoodMenu().yuXiangRouSi();

        System.out.println("---------------------------");

//        Customer customer2 = new Customer();
//        customer2.getFoodMenu().xiHongShiChaoJiDan();
//        customer2.getFoodMenu().yuXiangRouSi();

//        Scanner scanner = new Scanner(System.in);
//        scanner.nextInt();

    }
}
