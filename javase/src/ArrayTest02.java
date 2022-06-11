public class ArrayTest02 {
    public static void main(String[] args) {
        byte[] bytes = {97, 98 , 99, 100, 101 , 102, 103};
        String s = new String(bytes);
        System.out.println(s);
        String s2 = new String(bytes, 2, 4);
        System.out.println(s2);
        System.out.println("abc".compareTo("acb"));
        System.out.println("abc".concat("def"));
        System.out.println("abc".contains("bac"));
        System.out.println("abc".endsWith("c"));
        System.out.println("abc".endsWith("d"));
    }
}
