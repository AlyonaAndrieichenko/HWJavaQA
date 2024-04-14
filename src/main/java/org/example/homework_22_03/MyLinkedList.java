package org.example.homework_22_03;

public class MyLinkedList {
    private Node head;

    public void removeFirst(){
        if (head != null) head = head.getNext();
    }

    public void removeLast(){
        if (head == null || head.getNext() == null){
            head = null;
            return;
        }
        Node current = head;
        Node previous = null;

        while (current.getNext() != null){
            previous = current;
            current = current.getNext();
        }
        previous.setNext(null);
    }

    public void addFirst(int data) {
        Node node = new Node(data, null);
        // если список пустой, то новый элемент станет его головой и первым элементом
        if (head == null) {
            head = node;
            return;
        }
        // если список НЕ пустой, то новый элемент будет ссылаться на старую голову и сам станет головой списка
        node.setNext(head);
        head = node;
    }

    public void addLast(int data) {
        Node node = new Node(data, null);
        if (head == null) {
            head = node;
            return;
        }
        Node last = head;
        while (last.getNext() != null){
            last = last.getNext();
        }
        last.setNext(node);
    }


    public void add(int data){
        addLast(data);
    }

    public void add(int index, int data){
        // если индекс 0, то вставляем элемент в начало
        if (index == 0){
            addFirst(data);
            return;
        }
        Node node = new Node(data, null);
        Node current = head;
        int currentIndex = 0;
        // ищем элемент до нужного индекса
        while (currentIndex < index-1){
            current = current.getNext();
            currentIndex++;
        }
        // переопределяем ссылки
        Node oldNextEl = current.getNext();
        // в новый элемент вставляется ссылка на элемент с нужного индекса
        node.setNext(oldNextEl);
        // элемент до нужного индекса ссылается на новый элемент
        current.setNext(node);
        // новый элемент теперь стоит на нужном индексе
    }


    private String print(){
        StringBuilder stringBuilder = new StringBuilder();
        Node current = head;
        while (current != null){
            stringBuilder.append(current.getData()).append(" ");
            current = current.getNext();
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return print();
    }
}