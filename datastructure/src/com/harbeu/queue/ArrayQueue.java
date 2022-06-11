package com.harbeu.queue;

import java.util.Arrays;

public class ArrayQueue {

    private int[] Queue = null;
    private int front = -1;
    private int rear = -1;
    private int maxSize;

    public ArrayQueue(int size) {
        maxSize = size;
        Queue = new int[size];
    }

    public boolean addQueue(int num) {
        boolean flag = false;
        if (isFull()) {
            System.out.println("队列已满，不能加入数据。" + "元素 " + num + " 添加失败");
            return flag;
        }
        this.rear++;
        this.Queue[rear] = num;
        System.out.println("成功添加元素：" + num);
        return flag;
    }

    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，没有数据。");
        }
        return Queue[++front];
    }

    public boolean isFull() {
        return this.rear == this.maxSize - 1;
    }

    public boolean isEmpty() {
        return this.rear == this.front;
    }

    public void showQueue() {
        System.out.println(Arrays.toString(this.Queue));
    }

    public void peek() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        System.out.println(this.Queue[this.front + 1]);
    }
}
