package com.company;

public class Main {

    public static void main(String[] args) {

        RelatedList rl = new RelatedList();
        rl.push("Ivan1", 10);
        rl.push("Ivan2", 20);
        rl.push("Ivan3", 30);
        rl.push("Ivan4", 40);
        rl.push("Ivan5", 50);

        System.out.println(rl.toString());
        System.out.println(rl.find("Ivan1", 40));
        System.out.println(rl.delete("Ivan3", 30));
        System.out.println(rl.toString());
    }
}
