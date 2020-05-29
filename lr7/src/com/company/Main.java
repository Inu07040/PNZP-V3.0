package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        AbstractNode first = new XorNode(Arrays.<AbstractNode>asList(
                new SimpleNode(true),
                new NoNode(new SimpleNode(false)),
                new NoNode(new SimpleNode(true))));

        AbstractNode second = new NoNode(
                new XorNode(Arrays.<AbstractNode>asList(new NoNode(new SimpleNode(true)),
                new NoNode(new SimpleNode(false)))));

        System.out.println("first: " + first + "\tValue: " + first.calculate());
        System.out.println("second: " + second + "\tValue: " + second.calculate());
    }
}
