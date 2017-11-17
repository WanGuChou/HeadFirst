package com.ac.decorator;

public class Main {
    public static void main(String[] args) {
        ConcreteComponent  component=new ConcreteComponent();
        Decorator  decoratorA=new DecoratorA(component);
        Decorator  decoratorB=new DecoratorB(decoratorA);
        decoratorB.sampleOperation();
        if(decoratorB instanceof DecoratorA){
            ((DecoratorA) decoratorB).operationA();
        }
    }
}
