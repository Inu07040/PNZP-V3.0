package com.company;

public class SimpleNode implements AbstractNode {
    private final boolean value;

    public SimpleNode(boolean value){
        this.value = value;
    }

    @Override
    public boolean calculate(){
        return value;
    }

    public String toString()
    {
        return String.valueOf(value);
    }
}
