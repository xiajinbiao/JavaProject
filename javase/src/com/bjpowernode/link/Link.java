package com.bjpowernode.link;

public class Link {

    Node header;
    private int size;

    public void add(Object element){

        if (null == header) {
            header = new Node(element, null);
        } else {
            Node currentLastNode = findLast(header);
            currentLastNode.setNext(new Node(element, null));
        }

        size++;
    }

    public int size (){
        return size;
    }


    private Node findLast(Node item) {
        if (item.getNext() == null) {
            return item;
        }
        return findLast(item.getNext());
    }


    public void remove(Object element) {

    }

    public void set (Object element) {

    }

    public Node find (int index) {

        if (index > size || index < 0) {
            System.out.println("索引越界");
            return null;
        }
        Node currentNode = header;
        for (int i = 0; i < index; i++) currentNode = currentNode.getNext();

        return currentNode;
    }

}
