package com.company;

import javax.security.sasl.RealmCallback;

/**
 * Created by i.lapshinov on 30.05.2018.
 */
public class RelatedList {

    private Node head;


    public RelatedList()
    {
        head = null;
    }



    public boolean isEmpty() // пусой ли список
    {
        return head == null;
    }


    public void push(String name, int age){
        Node n = new Node (name, age);
        n.next= head;
        head = n;
    }

    public Node pop()
    {
        if (isEmpty()) return null;
        Node temp = head;
        head = head.next;
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
