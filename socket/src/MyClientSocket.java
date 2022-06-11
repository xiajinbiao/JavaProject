public class MyClientSocket {
    public static void main(String[] args) {
        System.out.println("========================");
        System.out.print("=");
        System.out.print("正在启动客户端......");
        System.out.println("     =");
        System.out.println("========================");
        ClientThread cThread = new ClientThread("127.0.0.1", 3333);
        cThread.start();
        System.out.println("客户端已启动！！！");

    }
}