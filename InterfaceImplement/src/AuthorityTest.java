public class AuthorityTest {
    public static void main(String[] args) {

        String name = "zhangsan";
        AccessControlAuthority accessControlAuthority = new AccessControlAuthority(1, 1, 1, name);
        System.out.println(accessControlAuthority.getAge());


    }
}
