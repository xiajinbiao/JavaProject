package com.harbeu.queue;

import java.util.Scanner;

public class ArrayQueueTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入队列长度：");
        int queueMaxSize = s.nextInt();
        ArrayQueue arrayQueue = new ArrayQueue(queueMaxSize);

        char key;
        boolean loop = true;
        while (loop) {
            System.out.println("s(show): 显示队列");
            System.out.println("a(add): 向队列添加元素");
            System.out.println("g(get): 从队列取出元素");
            System.out.println("p(peak): 显示队列首元素");
            System.out.println("e(exit): 退出程序");
            key = s.next().charAt(0);
            switch (key) {
                case 's':
                    arrayQueue.showQueue();
                    break;
                case 'a':
                    System.out.print("请输入数据：");
                    int value = s.nextInt();
                    arrayQueue.addQueue(value);
                    break;
                case 'g':
                    try {
                        int returnVal = arrayQueue.getQueue();
                        System.out.printf("取出的数据是：%d\n", returnVal);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'p':
                    try {
                        arrayQueue.peek();
                    } catch (Exception e) {
                        e.getMessage();
                    }
                    break;
                case 'e':
                    s.close();
                    loop = false;
                    break;
                default:
                    System.out.println("请输入关键字");
            }
        }
        System.out.println("程序退出");
    }
}
