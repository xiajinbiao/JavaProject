package com.harbeu.queue;

public class CircleArrayQueue {
    private int[] Queue;
    private int front = 0;
    private int rear = 0;
    private int maxSize;

    public CircleArrayQueue(int size) {
        maxSize = size;
        Queue = new int[size];
    }

    public boolean addQueue(int num) {
        boolean flag = false;
        if (isFull()) {
            System.out.println("队列已满，不能加入数据。" + "元素 " + num + " 添加失败");
            return flag;
        }
        this.Queue[rear] = num;
        this.rear = (this.rear + 1) % maxSize;
        System.out.println("成功添加元素：" + num);
        return flag;
    }

    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，没有数据。");
        }
        int item = Queue[front];
        front = (front + 1) % maxSize;
        return item;
    }

    public boolean isFull() {
        return (this.rear + 1) % maxSize == this.front;
    }

    public boolean isEmpty() {
        return this.rear == this.front;
    }

    public void showQueue() {
        if (isEmpty()) {
            System.out.println("没有数据");
            return;
        }
        for (int i = front; i < front + (rear + maxSize - front) % maxSize; i++) {
            System.out.printf("arr[%d]=%d\n", (i % maxSize), this.Queue[(i % maxSize)]);
        }
    }

    public void peek() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        System.out.println(this.Queue[this.front]);
    }
}
