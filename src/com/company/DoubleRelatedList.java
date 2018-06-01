package com.company;

/**
 * Created by i.lapshinov on 30.05.2018.
 */
public class DoubleRelatedList {

    private Node head;
    private Node tail;


    public DoubleRelatedList()
    {

        head = null;
        tail = null;
    }
    public boolean isEmpty() // пусой ли список
    {
        return head == null;
    }
    public void push(String name, int age){
        Node n = new Node (name, age);
        n.next= head;
        if (head == null){
            tail = n;
        }
        else{
            head.previous = n;
        }

        head = n;
    }
    public Node pop()
    {
        if (isEmpty()) return null;
        Node temp = tail;
        tail.previous.next = null;
        tail = tail.previous;
        return temp;
    }

    @Override
    public String toString() {
        Node current = head;
        StringBuilder sb = new StringBuilder("[ ");
        while (current != null) {
            sb.append(current);
            current = current.next;
            sb.append((current == null) ? " ]" : ", ");
        }
        return sb.toString();
    }

    public boolean find( String name, int age) // поиск
    {
        Node n = new Node (name, age);
        Node current = head;
        while (!current.equals(n))
        {
            if (current.next == null)
                return false;
            else
                current = current.next;
        }
        // meta info
        return true;
    }

    public Node delete(String name, int age)
    {
        Node n = new Node (name, age);
        Node current = head;
        Node previous = head;
        while (!current.equals(n)) {
            if (current.next == null)
                return null;
            else
                previous  = current;
                current = current.next;
        }
        if (current == head){
            head = head.next;
        }
        else{
            previous.next = current.next;
        }
        return current;
    }
}
