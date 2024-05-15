package com.jobsheet11.praktikum01;
public class LinkedList {
    Node head;
    public boolean isEmpty() {
        return (head == null);
    }
    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi linked list : ");
            Node currentNode = head;
            while (currentNode != null) {
                System.out.print((currentNode.data) + "\t");
                currentNode = currentNode.next;
            }
            System.out.println("");
        }else {
            System.out.println("Linked list kosong");
        }
    }
    public void addFirst(int input) {
        Node newNode = new Node(input, null);
        if (isEmpty()) {
            head = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void addLast(int input) {
        Node newNode = new Node(input, null);
        if (isEmpty()) {
            head = newNode;
        }else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }
    public void insertAfter(int key, int input) {
        Node newNode = new Node(input, null);
        if (!isEmpty()) {
            Node currentNode = head;
            do {
                if (currentNode.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            }while (currentNode != null);
        }else {
            System.out.println("Linked list kosong");
        }
    }
}