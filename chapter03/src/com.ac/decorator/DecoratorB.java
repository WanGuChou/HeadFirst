package com.ac.decorator;

public class DecoratorB extends AbstractDecorator{
    public DecoratorB(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        super.sampleOperation();
        System.out.println("B 来修饰一番");
    }
}
