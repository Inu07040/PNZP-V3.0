package com.company;

public class NoNode implements AbstractNode {
    private final AbstractNode list;

    public NoNode(AbstractNode list) {
        this.list = list;
    }

    @Override
    public boolean calculate() {
        return !(list.calculate());
    }

    @Override
    public String toString() {
        return "!(" + list + ")";
    }
}