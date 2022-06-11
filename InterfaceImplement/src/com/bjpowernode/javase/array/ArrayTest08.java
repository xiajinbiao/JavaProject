package com.bjpowernode.javase.array;

public class ArrayTest08 {
    public static void main(String[] args) {

        StackStructure ss = new StackStructure(5, new Object[5], 4);

        Project p1 = new Project();
        Project p2 = new Project();
        Project p3 = new Project();
        Project p4 = new Project();
        ss.push(p1);
        ss.push(p2);

        User u1 = new User();
        User u2 = new User();
        User u3 = new User();
//        ss.push(u1);
//        ss.push(u2);
//        ss.push(u3);

        System.out.println("============================================");
        for (int i = 0; i < ss.getStack().length; i++) {
            System.out.println("栈中第" + i + "个元素为" + ss.getStack()[i]);
        }

        System.out.println("============================================");
        Object object = ss.pop();
        System.out.println("弹出元素为————>" + object);
        Object object2 = ss.pop();
        System.out.println("弹出元素为————>" + object2);
        Object object3 = ss.pop();
        System.out.println("弹出元素为————>" + object3);
        Object object4 = ss.pop();
        System.out.println("弹出元素为————>" + object4);
        Object object5 = ss.pop();
        System.out.println("弹出元素为————>" + object5);

        System.out.println("============================================");
        System.out.println("弹栈以后的结果");
        for (int i = 0; i < ss.getStack().length; i++) {
            System.out.println("栈中第" + i + "个元素为" + ss.getStack()[i]);
        }


    }
}

class StackStructure {
    private int stackLength;
    private Object[] stack;
    private int station;

    // 构造方法
    public StackStructure(int stackLength, Object[] stack, int station) {
        this.stackLength = stackLength;
        this.stack = stack;
        this.station = station;
        if (station != stackLength - 1 || stackLength != stack.length) {
            System.out.println("您输入的信息有误，创建栈失败");
            System.exit(0);
        }
        System.out.println("创建栈成功！！");
        System.out.println("============================================");
    }

    public StackStructure() {
        this(5, new Object[5], 4);
    }

    // getter and setter
    public int getStackLength() {
        return stackLength;
    }

    public void setStackLength(int stackLength) {
        this.stackLength = stackLength;
    }

    public Object[] getStack() {
        return stack;
    }

    public void setStack(Object[] stack) {
        this.stack = stack;
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        this.station = station;
    }

    public void push(Object object) {
        if (station < 0) {
            System.out.println("栈已满，无法压栈");
            System.out.println("当前栈帧在-->" + this.station);
            return;
        }
        this.stack[this.station] = object;
        System.out.print("当前栈帧在-->" + this.station + "  入栈元素为" + object);
        System.out.println("\t" + "-->入栈后栈帧在-->" + (this.station - 1));
        this.station--;
    }

    public Object pop() {
        this.station++;
        if (this.station >= this.stack.length || this.station < 0) {
            System.out.println("栈已空或栈帧有误！！！");
            return null;
        }
        Object returnVlaue = stack[this.station];
        stack[this.station] = null;
        return returnVlaue;


    }
}

class Project {

}

class User {

}