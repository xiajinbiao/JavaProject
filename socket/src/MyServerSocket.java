/**
 * 基于TCP的Socket的编程    服务端
 */
public class MyServerSocket {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("========================");
        System.out.print("=");
        System.out.print("正在启动服务器......");
        System.out.println("     =");
        System.out.println("========================");
        ServerThread sThread = new ServerThread(3333);
        sThread.start();
        System.out.println("服务器已启动！！！");
    }
}