package com.rabbit;

public class RingLinkedList {

    private class Node{
        Node prev;
        int value;
        Node next;

        public Node(Node prev, int value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

    private Node head ;
    private Node tail;
    public RingLinkedList(){
        head = new Node(null, 666, null);
        tail = new Node(null, 888, null);
        head.next = tail;
        tail.prev = head;
    }

    private Node findNode(int index){
        int i = 1;
        for( Node point = head; point != tail; point = point.next, i++){
            if(i == index ){
                return point;
            }
        }
        return null;
    }

    public void insert(int index, int value){
        Node prev = findNode(index);
        if(prev == null){
            return;
        }
        Node next = prev.next;
        Node inserted = new Node(prev, value, next);
        prev.next = inserted;
        next.prev = inserted;
    }

    public void revise(int index){
        Node prev = findNode(index);
        if (prev != null) {
            prev.value = 0;
        }
    }

    public boolean isZero(int index){
        Node node = findNode(index);
        if(node == null){
            return false;
        }
        if(node.value == 0){
            return false;
        }
        return true;
    }

}
