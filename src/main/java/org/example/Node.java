package org.example;

public class Node<E> {

    private Node<E> next = null;
    private E value = null;

    public  Node(E e){
        this.value = e;
    }

    public E getValue(){
        return value;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> n){
        this.next = n;
    }
}
