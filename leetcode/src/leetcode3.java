public class leetcode3 {
    public static void main(String[] args) {

        int length = length("asjklfg");
        System.out.println(length);

    }

    public  static int length (String s) {

        int end = s.length() - 1;
        String substring = s.substring(0, end);
        String target = s.substring(end, end + 1);
        while (end > 0) {
            if (!substring.contains(target)){
                return end+1;
            }
            end--;
            substring = s.substring(0, end);
            target = s.substring(end, end + 1);
        }
        return 1;


    }
}
