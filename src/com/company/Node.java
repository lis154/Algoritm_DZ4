package com.company;

/**
 * Created by i.lapshinov on 30.05.2018.
 */
public class Node {


    private String name;
    private int age;
    Node next; // ссылка на следующий элемент
    Node previous;

    public Node(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("(Name: %s, age: %d)", name, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        if (age != node.age) return false;
        return name != null ? name.equals(node.name) : node.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
