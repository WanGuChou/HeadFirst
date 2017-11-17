package com.ac.decorator;

/**
 * 装饰抽象类
 */
public  abstract class AbstractDecorator implements Component {

    private  Component component;

    public AbstractDecorator(Component component) {
        this.component = component;
    }

    /**
     * 将操作委派给具体的实现类
     */
    @Override
    public void sampleOperation() {
        component.sampleOperation();
    }
}
