package com.company;

public class Main {

    public static void main(String[] args) {
	    AbstractNode first = new EqvNode(
	            new ImplNode(new SimpleNode(true), new SimpleNode(false)),
                new ImplNode(new SimpleNode(false), new SimpleNode(true))
        );

	    AbstractNode second = new ImplNode(
	            new SimpleNode(true),
                new EqvNode(new SimpleNode(false), new SimpleNode(true))
        );

	    System.out.println("first:  " + first + "\tValue: " + first.calculate());
        System.out.println("second: " + second + "\t\t\t\tValue: " + second.calculate());

    }
}
