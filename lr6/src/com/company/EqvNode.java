package com.company;

public class EqvNode implements AbstractNode {
    private final AbstractNode left;
    private final AbstractNode right;

    public EqvNode(AbstractNode left, AbstractNode right){
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean calculate(){
        return left.calculate() == right.calculate();
    }

    @Override
    public String toString(){
        return "(" + left + ") == (" + right + ")";
    }
}
