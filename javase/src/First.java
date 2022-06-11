public class First {
    public static void main(String[] args) {
//  输出1~100所有素数的和
        int num = 0;
        int sum = 0;
        for (int i=2; i<=100; i++){
            for (int j=1; j<= i; j++){
                if (i % j == 0){
                    num += 1;
                }
            }
            if (num < 3){
                System.out.println(i);
                sum += i;
            }
            num = 0;
        }
        System.out.println(sum);
    }
}
