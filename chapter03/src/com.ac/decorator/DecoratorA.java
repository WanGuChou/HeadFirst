package com.ac.decorator;

public class DecoratorA  extends AbstractDecorator{
    public DecoratorA(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        super.sampleOperation();
        System.out.println("A 来修饰一番");
    }

    public void operationA(){
        System.out.println("A 特有的操作");
    }
}
